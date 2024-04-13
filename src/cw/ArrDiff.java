package cw;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrDiff {
	
	public static int [] testA = {1, 2, 2, 2, 3};
	public static int [] testB = {2};
	
	
	public static int[] arrayDiff(int[] a, int[] b) {
		
		ArrayList<Integer> nonRepeatingAValues = new ArrayList<>();

        // Iterate through array a
        for (int i = 0; i < a.length; i++) {
            boolean foundInB = false;

            // Check if current element in a is present in array b
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    foundInB = true;
                    break; // Exit the inner loop once a match is found in array b. `Exit nested loop prematurely`.
                }
            }

            // If current element in a is not present in b, add it to nonRepeatingAValues
            if (!foundInB) {
                nonRepeatingAValues.add(a[i]);
            }
        }

        // Convert ArrayList to array --------------------------------------------------------------
        // Declare and initialize array with number of indices - Specify data type and number of elements. 
        // Assign a value to each index. 
        int[] result = new int[nonRepeatingAValues.size()];
        for (int i = 0; i < nonRepeatingAValues.size(); i++) {
            result[i] = nonRepeatingAValues.get(i);
        }

        return result;
	}

}

/** 
 * Nested Loop break statement: 
 * Without the `break` statement, the loop would continue iterating over the elements of array `b` even 
 * after finding a match, which would be unnecessary and less efficient.  The `break` statement helps 
 * optimize the search process by stopping it as soon as a match is found.
 * 
 * Remember, it is a nested loop.  It will break from the current index and iterate again 
 * */

/**
 * Arrays immutable in java: 
 * Immutable means we cannot modify it. If you have an immutable array in Java means refers to an array whose 
 * content and size cannot be changed after it has been initialized
 * Thus the `result` array. 
 *  */

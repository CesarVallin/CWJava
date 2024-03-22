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
                    break;
                }
            }

            // If current element in a is not present in b, add it to nonRepeatingAValues
            if (!foundInB) {
                nonRepeatingAValues.add(a[i]);
            }
        }

        // Convert ArrayList to array
        int[] result = new int[nonRepeatingAValues.size()];
        for (int i = 0; i < nonRepeatingAValues.size(); i++) {
            result[i] = nonRepeatingAValues.get(i);
        }

        return result;
	}

}

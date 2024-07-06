package cw;

import java.util.ArrayList;

// https://www.codewars.com/kata/554ca54ffa7d91b236000023/train/java
// Try it with a HashMap instead!!

public class EnoughIsEnough {
	
	// Values to test
	public static int[] test1 = {1,2,3,1,2,1,2,3};
	public static int test1a = 2;
	public static int[] test2 = {20,37,20,21};
	public static int test2a = 1;
	
	
	// Tools pack class
	private class Tools {
		
		// ArrayList method to actually populate array list
		static ArrayList<Integer> loopAndPopulateArrayList(int[] arrayParam, int maxOccurences) {
			// field to populate array with a maxOccurrences number
			ArrayList<Integer> maxOccurrList = new ArrayList<>();
			
			for (int i = 0; i < arrayParam.length; i++) {
				// Start occurence counter - Rigged
				int occurenceCounter = 1;
				// Think of this nested loop as a default to check the `maxOccurList` ArrayList after an item has been added. 
				// Count occurrences of arrayParam[i] in maxOccurrList - Rigged
                for (int j = 0; j < maxOccurrList.size(); j++) {
                    if (arrayParam[i] == maxOccurrList.get(j)) {
                    	occurenceCounter++;
                    }
                }
				// conditional outside of nested loop to make a decision to include integer in array list or not based on comparator
				if (occurenceCounter <= maxOccurences) {
					// add current index
					maxOccurrList.add(arrayParam[i]);
				}
			}
			return maxOccurrList;
		}
		
		// int[] array method to loop through populated array list and populate int[] array
		// Convert ArrayList to array --------------------------------------------------------------
        // Declare and initialize array with number of indices - Specify data type and number of elements. 
        // Assign a value to each index. 
		static int[] loopAndPopulateArray(ArrayList<Integer> arrayListParam) {
			int[] regularArray = new int[arrayListParam.size()];
			// Loop through array list, and assign to regular array
			for (int i = 0; i < arrayListParam.size(); i++) {
				regularArray[i] = arrayListParam.get(i);
			}
			return regularArray;
		}
	}
	
	public static int[] deleteNth(int[] elements, int maxOccurrences) {
		
		ArrayList<Integer> finalAnswerList = Tools.loopAndPopulateArrayList(elements, maxOccurrences);
		int[] finalAnswerArray = Tools.loopAndPopulateArray(finalAnswerList);
		
		return finalAnswerArray;
	}

}

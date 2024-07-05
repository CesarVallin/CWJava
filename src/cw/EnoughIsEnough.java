package cw;

import java.util.ArrayList;

public class EnoughIsEnough {
	
	// Tools pack class
	private class Tools {
		
		// field to populate array with a maxOccurrences number
		static ArrayList<Integer> maxOccurrList = new ArrayList<>();
		
		// void method to actually populate array list
		static void loopAndAssignMaxOccur(int[] arrayParam, int maxOccurences) {
			for (int i = 0; i < arrayParam.length; i++) {
				// Start occurence counter
				int occurenceCounter = 0;
				// nested loop to target/compare i to j
				for (int j = 0; j < arrayParam.length; j++) {
					if (arrayParam[i] == arrayParam[j]) {
						occurenceCounter ++;
					}
					
				}
				// conditional outside of nested loop to make a decision to include integer in array list or not based on comparator
				if (occurenceCounter <= maxOccurences) {
					// add current index
					Tools.maxOccurrList.add(arrayParam[i]);
				}
			}
		}
		
	}
	
	public static int[] deleteNth(int[] elements, int maxOccurrences) {
		
		ArrayList<Integer> finalAnswer = 
		
		
		return null;
	}

}

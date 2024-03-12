package cw;

import java.util.HashMap;

public class FindUnique {
	
	public static double arr1[] = {0, 0, 0.5, 0, 0};
	public static double arr2[] = {1, 1, 2, 1, 1};
	
	// TRY WITH HASHMAP

	public static double findUniq(double arr[]) {
		
		// Declare & assign values to compare
		double comparedValue = arr[0];
		int comparedValueCounter = 0;
		
		// Awaiting actual assignment of value in loop
		double nextValueComparator = 0;
		int nextValueCounterComparator = 0;
		
		for(int i = 0; i < arr.length; i++) {
			// Check occurrences of comparedValue and count
			if(arr[i] == comparedValue) {
				comparedValueCounter ++;
			}
			// Check occurrences of nextValueComparator and count
			if(arr[i] != comparedValue) {
				nextValueComparator = arr[i];
				nextValueCounterComparator ++;
			}
		}
		
		// Only one element in array does not repeat. 
		if (comparedValueCounter < nextValueCounterComparator) {
			return comparedValue;
		}
		
		return nextValueComparator;
		
	}
	
	// HashMap version ------------------------------------------------------------------------------------------------------
	// Needs work
	public static double findUniq2(double arr[]) {
		
		// Declare and initiate HashMap. 
		HashMap<Double, Integer> elementCount = new HashMap<>();
		
		// Count occurrences of each element (Double) in `double arr[]` parameter as you iterate through it. 
		for(int i = 0; i < arr.length; i++) {
			// Check if the element exists in the `HashMap`
			if(elementCount.containsKey(arr[i])) {
				// If it exists, increment its count
				elementCount.put(arr[i], elementCount.get(arr[i]) + 1);
			} else {
				// If it doesn't, add it with a count of 1. 
				elementCount.put(arr[i], 1);
			}
		}
		
		// Find the element that only has the count of 1. 
		for(int i = 0; i < arr.length; i++) {
			if (elementCount.get(arr[i]) == 1) {
				return elementCount.get(arr[i]);
			}
		}
		
		return 0.0;
	}
	
}

package cw;

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
	
}

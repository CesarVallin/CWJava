package cw;

public class SortTheOdd {
	
	// private class for SortTheOdd
	// Tools
	private class Tools {
		// Create a `no-modifications` stock array
		static int[] stockArray;
		
	}
	
	public static int[] sortArray(int[] array) {
		
		// `no-modifications` array has the same length as `array` parameter
		Tools.stockArray = new int[array.length];
		// Loop through array parameter
		for (int i = 0; i < array.length; i++) {
			// conditional for even number
			if(array[i] % 2 == 0) {
				Tools.stockArray[i] = i;
			}
		}
		
		return array;
	}

}

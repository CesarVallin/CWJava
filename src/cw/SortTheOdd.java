package cw;

public class SortTheOdd {
	
	// private class for SortTheOdd
	// Tools
	private class Tools {
		// Create a `no-modifications` stock array
		static int[] stockArray;
		// void method to `modify` stockArray - even numbers
		static void evenInteger(int num) {
			stockArray[num] = num;
		}
		// void method to `modify` stockArray - odd numbers
	}
	
	public static int[] sortArray(int[] array) {
		
		// Tools class - `no-modifications` array now has the same length as `array` parameter
		Tools.stockArray = new int[array.length];
		// Loop through array parameter
		for (int i = 0; i < array.length; i++) {
			// conditional for even number - keep index of element / no sorting. 
			if(array[i] % 2 == 0) {
				// Tools class - even Integer
				Tools.evenInteger(i);
			}
			// Just switch them! criss-cross apple sauce
			// check for the lesser number ahead
			if(array[i] % 2 != 0) {
				
			}
		}
		
		return array;
	}

}

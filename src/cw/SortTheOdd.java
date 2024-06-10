package cw;

import java.util.ArrayList;
import java.util.Comparator;

public class SortTheOdd {
	
	// private class for SortTheOdd
	// Tools
	private class Tools {
		// Create a `no-modifications` stock array
		static int[] stockArray;
		// void method to `modify` stockArray - even numbers
		static void evenInteger(int i, int num) {
			stockArray[i] = num;
		}
		
		// method to return only odd numbers, sorted
		static ArrayList<Integer>oddIntegers(int[] arrayPlaceholder) {
			ArrayList<Integer> odds = new ArrayList<Integer>();
			for (int j = 0; j < arrayPlaceholder.length; j++) {
				if (arrayPlaceholder[j] %2 != 0) {
					odds.add(arrayPlaceholder[j]);
				}
			}
			odds.sort((Comparator.naturalOrder()));	
			return odds;
		}
	}
	
	public static int[] sortArray(int[] array) {
		
		// Tools class - `no-modifications` array now has the same length as `array` parameter - with all values initialized to zero. 
		Tools.stockArray = new int[array.length];
		// Loop through array parameter
		for (int i = 0; i < array.length; i++) {
	
			// conditional for even number - keep index of element / no sorting. 
			if(array[i] % 2 == 0) {
				// Tools class - even Integer
				Tools.evenInteger(i, array[i]);
			}
			// Just switch them! criss-cross apple sauce
			// check for the lesser number ahead
			if(array[i] % 2 != 0) {
				
			}
		}
		
		return array;
	}

}

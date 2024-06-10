package cw;

import java.util.ArrayList;
import java.util.Comparator;

public class SortTheOdd {
	// Values to test
	public static int[] test1 = new int[] {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
	
	// private class for SortTheOdd
	// Tools
	private class Tools {
		// Create a `no-modifications` stock array
		static int[] stockArray;
		// void method to `modify` stockArray - even numbers
		static void evenInteger(int i, int num) {
			stockArray[i] = num;
		}
		// void method to `modify` stockArray - odd numbers
		static void oddInteger(int i, int num) {
			stockArray[i] = num;
		}
		
		
		// method to return only odd numbers, sorted, ready for comparison
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
	
	// Main
	public static int[] sortArray(int[] array) {
		
		// Tools class - `no-modifications` array now has the same length as `array` parameter - with all values initialized to zero. 
		Tools.stockArray = new int[array.length];
		
		// Tools class - `ordered odds only` - based on `int[] array` parameter
		ArrayList<Integer> ascendingOdds = Tools.oddIntegers(Tools.stockArray);
		
		// Loop through array parameter
		for (int i = 0; i < array.length; i++) {
			// conditional for even number - keep index of element / no sorting. 
			if(array[i] % 2 == 0) {
				// Tools class - even Integer
				Tools.evenInteger(i, array[i]);
			}
			
			
			// conditional for odd number - checking through a sorted array list
			if(array[i] % 2 != 0) {
				for (int j = 0; j < ascendingOdds.size(); j++) {
					Tools.oddInteger(i, ascendingOdds.get(j));
				}
			}	
		}
			
		return Tools.stockArray;
	}

}

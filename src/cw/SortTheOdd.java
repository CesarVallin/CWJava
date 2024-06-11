package cw;

import java.util.ArrayList;
import java.util.Comparator;

public class SortTheOdd {
	// Values to test
	public static int[] test1 = new int[] {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
	public static ArrayList<Integer> oddsTest = Tools.oddIntegers(test1);
	
	// private class for SortTheOdd
	// Tools pack!
	private class Tools {
		// Create a `no-modifications` stock array
		static int[] stockArray;	
		// void method to assign index and value to `stockArray`
		static void assignIndexValue(int i, int num) {
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
		// Tools class - no-modifications `stockArray` now has the same length as `array` parameter - all values initialized to zero.   -->
		Tools.stockArray = new int[array.length];	
		// Tools class - `oddIntegers` - based on `array` parameter.  ArrayList now contains all its odd numbers in ascending order     -->
		ArrayList<Integer> ascendingOdds = Tools.oddIntegers(array); // HERE!!
		// made up iterator index for accessing ascendingOdds values, outside of for loop.
		int oddIteratorIndex = 0;																										// \/
		// Loop through array parameter
		for (int i = 0; i < array.length; i++) {
			// conditional for even number - keep index of element / no sorting. 
			if(array[i] % 2 == 0) {
				// Tools class - even Integer
				Tools.assignIndexValue(i, array[i]);
			}		
			// conditional for odd number - checking through a sorted array list - utilizing `oddIteratorIndex`
			if(array[i] % 2 != 0) {
				Tools.assignIndexValue(i, ascendingOdds.get(oddIteratorIndex)); // .get() method called. 
				oddIteratorIndex++; 																								   // /\
			}	
		}
		return Tools.stockArray;
	}

}

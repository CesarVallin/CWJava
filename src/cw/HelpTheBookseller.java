package cw;

public class HelpTheBookseller {
	
	// cw `Help the bookseller !`
	
	public static String stockSummary(String lstOfArt[], String lstOf1stLetter[]) {
		
		// Declare and initiate a StringBuilder - remember, in java, Strings are immutable.
		StringBuilder result = new StringBuilder(); // call of StringBuilder method. 
		
		// iterate through the first array
		for (int i = 0; i < lstOfArt.length; i++) {
			// CHECK IF c or d ARE EMPTY, RETURN AN EMPTY String. ---  ---  ---  ---  ---  ---  ---  ---

			// Base construction
			StringBuilder construction = new StringBuilder(); // construction `tool` to help you build the `result` String.
			
			// access first character - of each string - in the first string array. 
			char c = lstOfArt[i].charAt(0); // method call on first element of string. 
			
			// access numeric value - of each string - in the first string array. 
			int quantity = Integer.parseInt(lstOfArt[i].replaceAll("[^0-9]", "")); // reference: https://www.geeksforgeeks.org/extract-all-integers-from-the-given-string-in-java/
			
			// now iterate through other array
			for (int j = 0; j < lstOf1stLetter.length; j ++) {
				// CHECK IF c or d ARE EMPTY, RETURN AN EMPTY String. ---  ---  ---  ---  ---  ---  ---  ---
				
				// Ready each element from string to char 
				char d = lstOf1stLetter[j].charAt(j);
				
				// CHECK LAST ITERATION - off scenario - meet this scenario first!!
				// ------------------------------------------------------------------
				// if ()
				
				// Conditional & utilize quantity. 
				if (c == d) {
					
				}
				
			}
		}
		
		return "";
	}

}

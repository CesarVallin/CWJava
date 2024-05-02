package cw;

import java.util.HashMap;

public class HelpTheBookseller {
	
	// values to test...
	public static String art[] = new String [] {"ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600"};
	public static String cd[] = new String [] {"A", "B"};
	
	// cw `Help the bookseller !`
	
	// 1st parameter is the stocklist (L in example), 
	// 2nd parameter is list of categories (M in example)
	// Your task is to find all the books of L with codes belonging to each category of M and to sum their quantity according to each category.
	
	public static String stockSummary(String lstOfArt[], String lstOf1stLetter[]) {
		// Declare and initialize a HashMap - data structure
		HashMap<Character, Integer> charMap = new HashMap<>();	
		// Declare and initiate a StringBuilder - remember, in java, Strings are immutable.
		StringBuilder result = new StringBuilder(); // call of StringBuilder method. 	
		// Check if lstOfArt or lstOf1stLetter is empty
	    if(lstOfArt.length == 0 || lstOf1stLetter.length == 0) {
	        return "";
	    }
		// iterate through the first array --- populate HashMap
		for (int i = 0; i < lstOfArt.length; i++) {
			char c = lstOfArt[i].charAt(0); // method call on the first element of each string.  String class charAt() method returns a char value.  
			// Check to see if the char can be added to HashMap
			if(!charMap.containsKey(c)) {
				// Variable quantity should be declared and initialized with a value of 0.
				int quantity = 0; 			
				// now iterate through other array
				for (int j = 0; j < lstOf1stLetter.length; j ++) {			
					// Ready each element from string to char 
					char d = lstOf1stLetter[j].charAt(0); // method call on string element.  String class charAt() method returns a char value. 
					// Conditional & utilize `quantity` variable. 
					if (c == d) {
						// access numeric value - of each string - in the first string array. 
						quantity += Integer.parseInt(lstOfArt[i].replaceAll("[^0-9]", "")); // reference: https://www.geeksforgeeks.org/extract-all-integers-from-the-given-string-in-java/
					}
					charMap.put(d, quantity);
				}
			}
			if(charMap.containsKey(c)) {
				// Get the value from the current existing key
				int quantity = charMap.get(c);
				quantity += Integer.parseInt(lstOfArt[i].replaceAll("[^0-9]", ""));
			}	
		}
		
		
		
		construction.append("(" + c + " : " + quantity + ")");
		result.append(construction);
		
		return result.toString();
	}
}

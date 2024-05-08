package cw;

import java.util.HashMap;
import java.util.Map;

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
		// Declare and initiate a StringBuilder for construction. 
		StringBuilder construction = new StringBuilder();

		// Check if lstOfArt or lstOf1stLetter is empty
	    if(lstOfArt.length == 0 || lstOf1stLetter.length == 0) {
	        return "";
	    }	    
	    
		// iterate through the first array
		for (int i = 0; i < lstOfArt.length; i++) {
			char c = lstOfArt[i].charAt(0); // method call on the first element of each string.  String class charAt() method returns a char value. 
			System.out.println(c + " " + "first character of each stringElement on first array");
			// iterate through other array
			for (int j = 0; j < lstOf1stLetter.length; j++ ) {
				// Ready each element from string to char
				char d = lstOf1stLetter[j].charAt(0); // method call on string element.  String class charAt() method returns a char value. 
				System.out.println(d + " " + "character of each stringElement on second array");
				// Conditional to check if c & d match
				if(c == d) {
					// Check to see if the char KEY does not exist in the HashMap and can be put in it with a new VALUE.  
					if(!charMap.containsKey(c)) {
						// declare a quantity variable for read-ability 
						int quantity = 0;
						quantity += Integer.parseInt(lstOfArt[i].replaceAll("[^0-9]", ""));// reference: https://www.geeksforgeeks.org/extract-all-integers-from-the-given-string-in-java/
					    charMap.put(c, quantity);
					}
					// Check to see if the char KEY exists in the HashMap.  If it does, add to its VALUE
					if (charMap.containsKey(c)) {
						// Get the value from the current existing key ~ murach's java
						int quantity = charMap.get(c);
						System.out.println(c + " " + quantity);
						quantity += Integer.parseInt(lstOfArt[i].replaceAll("[^0-9]", ""));
						// update the value.
						charMap.put(c, quantity);			
					}
					
				}
			}	
		}
		
		// -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		// Again, this can be simpler if you separate concerns.  
		// This is an over-all iteration of the HashMap
		// Iterate through HashMap. // https://sentry.io/answers/iterate-hashmap-java/
		for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
			Character theCharacter = entry.getKey();
			Integer theInteger = entry.getValue();
			// StringBuilder construction:
			construction.append("(" + theCharacter + " : " + theInteger + ")");
			result.append(construction);
		}
		
		return result.toString();
	}
}

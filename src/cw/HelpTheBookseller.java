package cw;

import java.util.HashMap;
import java.util.Map;

public class HelpTheBookseller {
	
	// values to test...
	public static String art[] = new String [] {"ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600"};
	public static String cd[] = new String [] {"A", "B"};
	
	// cw `Help the bookseller !`
	
	// String lstOfArt[] is an array - list of art
	// String lstOf1stLetter[] - list of first letter
	// Your task is to find all the art associated with the list of first letter.
	
	public static String stockSummary(String lstOfArt[], String lstOf1stLetter[]) {
		// Declare and initialize a HashMap - data structure
		HashMap<Character, Integer> charMap = new HashMap<>();	
		// Declare and initiate a StringBuilder - remember, in java, Strings are immutable.
		StringBuilder result = new StringBuilder(); 
		// Declare and initiate a StringBuilder for construction. 
		StringBuilder construction = new StringBuilder();

		// Check if lstOfArt or lstOf1stLetter is empty
	    if(lstOfArt.length == 0 || lstOf1stLetter.length == 0) {
	        return "";
	    }
	    
	    // iterate through lstOf1stLetter array
	    for (int i = 0; i < lstOf1stLetter.length; i++) {
	    	// Ready each element from string to char
	    	char c = lstOf1stLetter[i].charAt(0); // method call on String element.  String class charAt() method returns a char value. 
            System.out.println("Compare current `c` element to `d` iteration");
	    	System.out.println("c = " + c + " ...");
	    	// iterate through lstOfArt array
	    	for (int j = 0; j < lstOfArt.length; j++) {
	    		char d = lstOfArt[j].charAt(0); // method call on first element of each String.  String class charAt() method returns a char value.  
	    		System.out.println("d = " + d);
	    		// Conditional to check if c & d match
	    		if(c == d) {
	    			System.out.println("MATCH!");
	    			// Check to see if the char KEY does not exist in the HashMap and can be `.put()` in it with a VALUE
	    			if (!charMap.containsKey(c)) {
	    				System.out.println("KEY-VALUE not contained in HashMap... will put in HashMap...");
	    				// declare a quantity variable for read-ability and manipulation
	    				int quantity = 0;
	    				// could have also be written: c.replaceAll( );
	    				quantity += Integer.parseInt(lstOfArt[j].replaceAll("[^0-9]", ""));// reference: https://www.geeksforgeeks.org/extract-all-integers-from-the-given-string-in-java/
	    				System.out.println("KEY- " + c + " " + "VALUE- " + quantity);
	    				charMap.put(c, quantity);
	    			} else { // if the char KEY already exists in the HasMap, then update its VALUE with `.put()`
	    				// Get the VALUE from the current existing KEY ~ murach's Java
	    				int quantity = charMap.get(c);
						System.out.println("HashMap already contains - " + c + " . Its Integer is " + quantity + '\n');
						quantity += Integer.parseInt(lstOfArt[j].replaceAll("[^0-9]", ""));
						charMap.put(c, quantity);
	    			}
	    		}
	    		// Just for testing...
	    		if (c != d) {
					System.out.print("NO MATCH!!!" + '\n');
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

package cw;

public class HelpTheBookseller {
	
	// values to test...
	public static String art[] = new String [] {"ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600"};
	public static String cd[] = new String [] {"A", "B"};
	// ...
	
	
	// cw `Help the bookseller !`
	
	public static String stockSummary(String lstOfArt[], String lstOf1stLetter[]) {
		
		// Declare and initiate a StringBuilder - remember, in java, Strings are immutable.
		StringBuilder result = new StringBuilder(); // call of StringBuilder method. 
		
		// Check if lstOfArt or lstOf1stLetter is empty
	    if(lstOfArt.length == 0 || lstOf1stLetter.length == 0) {
	        return "";
	    }
	    // CONTINUE AND REVIEW !!!!
		
		// iterate through the first array
		for (int i = 0; i < lstOfArt.length; i++) {

			// Base construction
			StringBuilder construction = new StringBuilder(); // construction `tool` to help you build the `result` String.
			
			// access first character - of each string - in the first string array. 
			char c = lstOfArt[i].charAt(0); // method call on first element of string. 
			
			// Variable quantity should be declared and initialized with a value of 0.
			int quantity = 0; 
			
			// now iterate through other array
			for (int j = 0; j < lstOf1stLetter.length; j ++) {
				
				// Ready each element from string to char 
				char d = lstOf1stLetter[j].charAt(j); // method call on each element of string. ---.charAt(j) might not be needed--- 
				
				// CHECK LAST ITERATION - off scenario - meet this scenario first!!
				// ------------------------------------------------------------------
				// if ()
				
				// Conditional & utilize `quantity` variable. 
				if (c == d) {
					// access numeric value - of each string - in the first string array. 
					quantity += Integer.parseInt(lstOfArt[i].replaceAll("[^0-9]", "")); // reference: https://www.geeksforgeeks.org/extract-all-integers-from-the-given-string-in-java/
				}
			}
			
			construction.append("(" + c + " : " + quantity + ")");
			result.append(construction);
		}
		
		return result.toString();
	}

}

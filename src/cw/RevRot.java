package cw;

public class RevRot {
	
	 class Tools {
		// 1. Method to give me the substring
		// 2. Method to parse each char of string into an integer and add one by one
		// 3. Method to tell if it is divisible by 2
		// 4. Method to reverse substring
		// 5. Method to rotate to the left by one position
		// 6. Method to check conditionals stated on problem
		
		// 1. ---------------------------------------------------------------------------
		static String subStrng(String strng, int sz) {
			String str = new String(strng); // initialize String object
			return str.substring(0, sz);
		}
		
		
		// 2. ---------------------------------------------------------------------------
		static int subStrngNumTotal(String strng) {
			int total = 0;
			int digit;
			char c;
			for(int i = 0; i < strng.length(); i++) {
				c = strng.charAt(i);
				digit = Character.getNumericValue(c);
				total += digit;
			}
			
			return total;
		}
		
		
		// 3. ---------------------------------------------------------------------------
		static boolean isDivisibleBy2(int subStrngNumTotal) {
			boolean divisibleBy2 = false;
			if (subStrngNumTotal %2 == 0) {
				divisibleBy2 = true;
			}
			return divisibleBy2;
		}
		
		// 4. ---------------------------------------------------------------------------
		static String reverseString(String subString) {
			StringBuilder toolString = new StringBuilder(); // remember strings are immutable, thus StringBuilder class
			toolString.append(subString);
			toolString.reverse(); // actual reverse
			return toolString.toString(); // expected output from method is a String, not StringBuilder
		}
		
		// 5. ---------------------------------------------------------------------------
		static String rotateLeftByOne(String subStringParam) {
			StringBuilder toolString = new StringBuilder(); // --> strings are immutable, thus StringBuilder class
			toolString.append(subStringParam.substring(1)); // only identifying beginning index, begins here and extends to the end. 
			toolString.append(subStringParam.substring(0, 1)); // begin index inclusive, end index exclusive
			return toolString.toString();
		}
	}
	
	public static String revRot(String strng, int sz) {
		
		return "";
	}
}

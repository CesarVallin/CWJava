package cw;

public class EncryptThis {
	// values to test
	public static String test1 = "Hello";
	public static String test2 = "hello world";
	
	// Tools pack class
	private class Tools {
		static int asciiValue(String str) {
			return (int) str.charAt(0);
		}
		// find last character in a string
		static char lastChar(String str) {
			return str.charAt(str.length() - 1);
		}
		// find the second character in a string
		static char secondChar(String str) {
			return str.charAt(1);
		}
		// find the character at any given index of a string
		static char currentChar(String str, int num) {
			return str.charAt(num);
		}
	}
	
	// Main
	public static String encryptThis(String text) {
		// Declare and initialize StringBuilder result
		StringBuilder result = new StringBuilder();
		// Declare and initialize StringBuilder for modifications
		StringBuilder construction = new StringBuilder();
		
		for (int i = 0; i < text.length(); i++) {
			// break out of the loop on the last index
			if (i == text.length() - 1) {
				break;
			}
			// check for first index
			if (i == 0) {
				result.append(Tools.asciiValue(text));
				continue;
			}
			// check for second index
			if (i == 1) {
				result.append(Tools.lastChar(text));
				continue;
			} else {
				result.append(Tools.currentChar(text, i));
			}	
		}
		
		result.append(Tools.secondChar(text));
		
		return result.toString();
	}

}

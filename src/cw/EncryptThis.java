package cw;

public class EncryptThis {
	
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
		// Split input text into words
		String[] words = text.split(" ");
		
		for (int i = 0; i < words.length; i++) {
			// Declare and initialize StringBuilder for modifications
			StringBuilder construction = new StringBuilder();
			// Declare char placeholder for second char of string
			char secondChar = 0;
			
			for (int j = 0; j < words[i].length(); j++) {
				// assign value ot secondChar
				secondChar = Tools.secondChar(words[i]);
				// break out of the loop on the last index
				if (j == words[i].length() - 1) {
					break;
				}
				// check for first index
				if (j == 0) {
					construction.append(Tools.asciiValue(words[i]));
					continue;
				}
				// check for second index
				if (j == 1) {
					construction.append(Tools.lastChar(words[i]));
					continue;
				} else {
					// add remaining non-conditional characters
					construction.append(Tools.currentChar(words[i], j));
				}	
			}
			
			result.append(construction).append(secondChar).append(" ");
				
			}
		
		return result.toString().trim();
	}

}

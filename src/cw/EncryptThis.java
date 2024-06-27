package cw;

public class EncryptThis {
	
	// Tools pack class
	private class Tools {
		// find ascii value of character
		static int asciiValue(char character) {
			return (int) character;
		}
		// find last character in a string
		static char lastChar(String str) {
			return str.charAt(str.length() - 1);
		}
		
		// Declare and initialize StringBuilder result
		StringBuilder result = new StringBuilder();
		// Declare and initialize StringBuilder for modifications
		StringBuilder construction = new StringBuilder();
	}
	
	// Main
	public static String encryptThis(String text) {
		return "";
	}

}

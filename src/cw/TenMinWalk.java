package cw;

public class TenMinWalk {
	
	public static char[] walkArrayTest = {'n', 's', 'n', 's', 'n', 's', 'n', 's', 'n', 's'};
	
	public static boolean isValid(char[] walk) {
		
		int north = 0;
		int south = 0;
		int east = 0;
		int west = 0;
		
		int total = 0;
		
		for (int i = 0; i < walk.length; i++) {
			// Check each iteration:
//			System.out.println(walk[i]);
			
			switch(walk[i]) {
			case 'n':
				north++;
				total += 1;
				break;
			case 's':
				south++;
				total += 1;
				break;
			case 'e':
				east++;
				total += 1;
				break;
			case 'w':
				west++;
				total += 1;
				break;
			}
			
		}
		
		// Compare values from code
		if(north == south && east == west) {
			if (total == 10) {
				return true;
			}
		}
		
		return false;
	}

}

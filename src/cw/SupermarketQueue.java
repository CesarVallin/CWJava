package cw;

public class SupermarketQueue {
	
	
	private class Tools {
		
		// Check for `one` till open and add up all customer time. 
		static int checkForOneTillOpen(int [] customers) {
			int total = 0;
			for (int i = 0; i < customers.length; i++) {
				total += customers[i];
			}
			return total;
		}
		
		// Check for lowest number in Queue based on Tills n
		// Add that number to a time variable 
		// subtract from largest comparison 
		// @ end, add remainder of whatever was largest
		
		
		
	}
	
	public static int SolveMarketQueue(int [] customers, int n) {
		// Check for `one` till open and up all customer time
		if (n == 1) {
			return Tools.checkForOneTillOpen(customers);
		}
		
		
		return 0;
	}

}

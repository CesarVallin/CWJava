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
	}
	
	public static int SolveMarketQueue(int [] customers, int n) {
		return 0;
	}

}

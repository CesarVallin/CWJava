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
		
		// method to get the smallest number from a comparison version of array
		static int findSmallest(int [] customers, int n) {
			int smallest = customers[0];
			for (int i = 0; i < n; i++) {
				if (customers[i] < smallest) {
					smallest = customers[i];
				}
			}
			return smallest;
		}
		
		// method to get the largest number from a comparison version of array
		static int findBiggest(int [] customers, int n) {
			int biggest = customers[0];
			for (int i = 0; i < n; i++) {
				if (customers[i] > biggest) {
					biggest = customers[i];
				}
			}
			return biggest;
		}
		
		// HashMap!! only two key-value pairs, smallest and biggest.  
		// utilize these values to update separate variables until the end.  Keep adding smallest, at the end subtract biggest from smallest and add it too!
		// Initiate a HasMap populated with `n` number of tills
		// find smallest Queue, add to separate variable, remove from HashMap, and subtract all key-values the value of smallest, then continue with next `array loop iteration`
		
		
	}
	
	public static int SolveMarketQueue(int [] customers, int n) {
		// Check for `one` till open and up all customer time
		if (n == 1) {
			return Tools.checkForOneTillOpen(customers);
		}
		
		
		return 0;
	}

}

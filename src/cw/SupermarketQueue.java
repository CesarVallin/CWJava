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
		
		// method to get the smallest number from a smaller version of array
		static int findSmallest(int [] customers, int n) {
			int smallest = customers[0];
			for (int i = 0; i < n; i++) {
				if (customers[i] < smallest) {
					smallest = customers[i];
				}
			}
			return smallest;
		}
		
		// method to get the largest number from a smaller verson of array
		static int findBiggest(int [] customers, int n) {
			int biggest = customers[0];
			for (int i = 0; i < n; i++) {
				if (customers[i] > biggest) {
					biggest = customers[i];
				}
			}
			return biggest;
		}
		
		// methods & variables to modify comparisons?
		
	}
	
	public static int SolveMarketQueue(int [] customers, int n) {
		// Check for `one` till open and up all customer time
		if (n == 1) {
			return Tools.checkForOneTillOpen(customers);
		}
		
		
		return 0;
	}

}

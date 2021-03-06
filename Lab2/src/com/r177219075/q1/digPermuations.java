package com.r177219075.q1;

import java.util.*; // For scanner.

public class digPermuations {

	static class solution{
		
		public void permutations(String[] digs) {
			for(int i=0; i<digs.length; i++) {				
				for(int j=0; j<digs.length; j++) {					
					for(int k=0; k<digs.length; k++) {						
						System.out.print(digs[i]+digs[j]+digs[k]+", ");
					}
				}
				System.out.println();
			}
		}
	}
	public static void main(String[] args) {
		
		//Fetch 3-digits from user.
		String[] digs = new String[3];
		Scanner input = new Scanner (System.in);
		System.out.println("Drop three digits.");
		for(int i=0; i<3; i++) {
			Integer temp = new Integer(input.nextInt());
			if(0<=temp && temp<=9)
				digs[i] = temp.toString();
		}
		input.close();
		
		//Display permutations.
		solution sol = new solution();
		sol.permutations(digs);
	}
}

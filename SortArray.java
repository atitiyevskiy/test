package com.stubhub.interviews.tests;

import java.util.Arrays;


public class SortArray {

	public static void main(String[] args) {
		
		int [] duplicates={1,2,3,20,3,4,3,4,4,4,5,20,5};
	
		Arrays.sort(duplicates);
		

		for(int i = 1; i < duplicates.length; i++) {
			if(duplicates[i] == duplicates[i - 1]) {
				System.out.println("Duplicate: " + duplicates[i]);
			
			
			
			
			}		
		}
	}
}



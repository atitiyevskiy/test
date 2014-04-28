package com.stubhub.interviews.tests;

import java.util.HashSet;

public class EliminateDuplicates {

	public static void main(String[] args) {
		
		int [] duplicates={1,2,2,2,3,3,3,4,4,4,5,5,5};
		
		HashSet <Integer> set = new HashSet<Integer>(); 
		for (int i=0; i<duplicates.length; i++){
			set.add(duplicates[i]);
			
		}
		System.out.println(set);
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

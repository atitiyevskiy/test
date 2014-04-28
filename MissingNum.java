package com.stubhub.interviews.tests;

import java.util.Arrays;

public class MissingNum {

	public static void main(String[] args) {
				

		int [] abc = {1,3,4,2,6,9};
		Arrays.sort(abc);
		
		
		for (int i=0; i<abc.length-1;i++){
		int temp = abc[i]+1;
			while (temp!=abc[i+1]){
				System.out.println("Missing number " +temp);
				temp++;
			}
		
			
			

	
	}
}
}

package com.stubhub.interviews.tests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateNumbers {

	public static void main(String[] args) {
		numDuplicates();
		int [] ArrayOfNumbers = {1,2,2,3,4,5,5,6,6,6,7,7,7,7};
	//findDuplicateNumbers(ArrayOfNumbers);	
		
	}

	public static void findDuplicateNumbers (int[] a){
		HashSet <Integer> set = new HashSet<Integer>();
		
	
		for (int i=0; i<a.length;i++){
			for (int j=i+1;j<a.length;j++){
				if (a[i]==a[j]){
	
					
					set.add(a[i]);	
				}
			}
		}
		
		System.out.println(set);
		
	}
	
	public static void numDuplicates(){
		List <String> list= new ArrayList<String>();
		list.add("A");
		list.add("A");
		list.add("C");
		list.add("B");
		list.add("A");
	//	System.out.println("Number of times string is duplicated " + Collections.frequency(list, "A"));
		
		Set<String> set = new HashSet<String>(list);
		for (String temp: set){
			System.out.println(temp +":" + Collections.frequency(list, temp));
		}
		
		
	}
	
}

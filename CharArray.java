package com.stubhub.interviews.tests;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;


public class CharArray {

	public static void main(String[] args) {
		String[] str = {"abc","acd","aabb"};
		charArray(str);

	}
	
	public static void charArray(String[] A){
		
		char[] ch;
		TreeMap<Character, Integer> count = new TreeMap<Character, Integer>();
		
		for(int i=0;i<A.length;i++){
			ch = A[i].toCharArray();
			for(int j=0;j<ch.length;j++){
			if(count.containsKey(ch[j])){
				int inc = count.get(ch[j]) + 1;
				count.put(ch[j], inc);
			}
			else{
				count.put(ch[j], 1);
			}
			}
		}
		
		Iterator<Map.Entry<Character, Integer>> entries = count.entrySet().iterator();
		while (entries.hasNext()) {
		    Map.Entry<Character, Integer> entry = entries.next();
		    System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		}
		
		
		
	}

}

package com.scaler.day11.assignment;

import java.util.*;

public class AnagramsInArray {
	// DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<ArrayList<Integer>> anagrams(final List<String> A) {
    	ArrayList<ArrayList<Integer>> result = new ArrayList<>();
    	Map<String,ArrayList<Integer>> checkPointMap = new HashMap<>();
    	ArrayList<Integer> node;
    	
    	for(int i=0;i<A.size();i++) {
    		char[] charArr = A.get(i).toCharArray();
    		Arrays.sort(charArr);
    		
    		String sortedStr = new String(charArr);
    		if(checkPointMap.containsKey(sortedStr)) {
    			node = checkPointMap.get(sortedStr);
    			node.add(i);
    			checkPointMap.put(sortedStr, node);
    		} else {
    			node = new ArrayList<>();
    			node.add(i);
    			checkPointMap.put(sortedStr, node);
    		}
    	}
    	
    	return result;
    }
    
    public static void main(String[] args) {
		AnagramsInArray obj = new AnagramsInArray();
		List<String> ls = new ArrayList<>();
		String[] str = {"cat", "dog", "god", "tca"};
		obj.anagrams(ls);
	}
    

}

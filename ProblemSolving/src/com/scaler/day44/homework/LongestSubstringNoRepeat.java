package com.scaler.day44.homework;

import java.util.*;

public class LongestSubstringNoRepeat {
	public int lengthOfLongestSubstring(String A) {
		int result = 0;
		int i = 0, j =0;
		Map<Character, Integer> frequencyMap = new HashMap<>();
		
		while(j < A.length()) {
			char c = A.charAt(j);
			frequencyMap.put(c, frequencyMap.getOrDefault(c, 0)+1);
			
			while(frequencyMap.get(c) > 1) {
				frequencyMap.put(A.charAt(i), frequencyMap.get(A.charAt(i))-1);
				i++;
			}
			j++;
			result = Math.max(result, j-i);
		}
		
		
		return result;
    }
	
	public static void main(String[] args) {
		LongestSubstringNoRepeat obj = new LongestSubstringNoRepeat();
		System.out.println(obj.lengthOfLongestSubstring("abcbeabc"));
	}
}

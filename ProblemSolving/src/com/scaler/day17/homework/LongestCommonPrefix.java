package com.scaler.day17.homework;

import java.util.ArrayList;
import java.util.Arrays;

public class LongestCommonPrefix {
	
	public String longestCommonPrefix(ArrayList<String> A) {
		String longest = null;
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<A.size(); i++) {
		}
		
		return longest;
    }
	
	public static void main(String[] args) {
		LongestCommonPrefix obj = new LongestCommonPrefix();
		ArrayList<String> input = new ArrayList<>();
		String[] arr = {"abcdefgh", "aefghijk", "abcefgh"};
		input.addAll(Arrays.asList(arr));
		System.out.println(obj.longestCommonPrefix(input));
	}

}

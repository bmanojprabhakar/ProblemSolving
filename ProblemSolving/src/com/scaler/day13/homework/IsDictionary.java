package com.scaler.day13.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class IsDictionary {
	public int solve(ArrayList<String> A, String B) {
		char[] charArr = B.toCharArray();
		Map<Character, Integer> dict = new HashMap<>();
		int checkOccurrence = Integer.MIN_VALUE;
		
		for(int i=0;i<charArr.length;i++) {
			dict.put(charArr[i], i);
		}
		
		for(int i=0;i<A.size();i++) {
			int index = dict.get(A.get(i).charAt(0));
			
			if(checkOccurrence > index)
				return 0;
			else if(checkOccurrence == index) {
				if(A.get(i).length() < A.get(i-1).length())
					return 0;
			} else {
				checkOccurrence = index;
			}
		}
		
		return 1;
    }
	
	public static void main(String[] args) {
		IsDictionary obj = new IsDictionary();
		String[] strArr = {"fine", "no", "no"};
		ArrayList<String> al = new ArrayList<>(Arrays.asList(strArr));
		System.out.println(obj.solve(al, "qwertyuiopasdfghjklzxcvbnm"));
	}

}

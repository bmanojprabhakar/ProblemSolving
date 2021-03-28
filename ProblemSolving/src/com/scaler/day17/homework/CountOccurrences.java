package com.scaler.day17.homework;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountOccurrences {
	
	public int solve(String A) {
		int counter = 0;
		
		char[] arr = A.toCharArray();
		
		for(char c=0; c<arr.length-2; c++) {
			if(arr[c]=='b') {
				if(arr[c+1] == 'o' && arr[c+2] == 'b') {
					counter++;
				}
			}
		}
	    return counter;
    }
	
	public static void main(String[] args) {
		CountOccurrences obj = new CountOccurrences();
		System.out.println(obj.solve("bobob"));
	}


}

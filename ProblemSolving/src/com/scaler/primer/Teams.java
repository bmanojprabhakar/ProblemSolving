package com.scaler.primer;

import java.util.Arrays;

public class Teams {
	public int solve(String A) {
		int result = 0;
		int countOfZero = 0;
		int countOfOne = 0;
		
		for(int i=0;i<A.length();i++) {
			if(A.charAt(i) == '0')
				countOfZero++;
			else
				countOfOne++;
			
			if(countOfOne == countOfZero) {
				result++;
				countOfOne = 0;
				countOfZero = 0;
			}
		}
		
		return result;
    }
	
	public static void main(String[] args) {
		Teams obj = new Teams();
		System.out.println(obj.solve("00011011"));
	}
}

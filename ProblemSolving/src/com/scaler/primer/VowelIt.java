package com.scaler.primer;

import java.util.HashMap;
import java.util.Map;

public class VowelIt {
	public String solve(String A) {
		StringBuilder sbr = new StringBuilder();
		Map<Character, Boolean> vowels = new HashMap<>();
		vowels.put('a',true);
		vowels.put('e',true);
		vowels.put('i',true);
		vowels.put('o',true);
		vowels.put('u',true);
		
		for(int i=0; i<A.length(); i++) {
			if(vowels.containsKey(A.charAt(i)))
				sbr.append(A.charAt(i));
		}
		return sbr.toString();
    
	}
	public static void main(String[] args) {
		VowelIt obj = new VowelIt();
		System.out.println(obj.solve("interviewbit"));
	}
}

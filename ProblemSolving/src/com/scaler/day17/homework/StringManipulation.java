package com.scaler.day17.homework;

public class StringManipulation {
	public String solve(String A) {
		StringBuilder sbr = new StringBuilder();
		A = A.concat(A);
        
		for(char c: A.toCharArray()) {
			if(Character.isLowerCase(c)) {
				sbr.append(c);
			}
		}
		String ret = sbr.toString();
		
		ret = ret.replace("a", "#");
		ret = ret.replace("e", "#");
		ret = ret.replace("i", "#");
		ret = ret.replace("o", "#");
		ret = ret.replace("u", "#");
		
		return ret;
		
	}
	
	public static void main(String[] args) {
		StringManipulation obj = new StringManipulation();
		System.out.println(obj.solve("AbcaZeoB"));
	}

}

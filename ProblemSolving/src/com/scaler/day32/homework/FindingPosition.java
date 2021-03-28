package com.scaler.day32.homework;

import java.util.*;

public class FindingPosition {
	
	public int solve(int A) {
		int i = 1;
		String str = null;
		str.replaceFirst(String.valueOf(str.charAt(0)), "s");
		
		while(i<=A/2) {
			i *= 2;
		}
		return i;
    }
	public static void main(String[] args) {
		FindingPosition obj = new FindingPosition();
		System.out.println(obj.solve(10));
	}

}

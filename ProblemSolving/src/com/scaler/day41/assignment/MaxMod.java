package com.scaler.day41.assignment;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxMod {
	public int solve(ArrayList<Integer> A) {
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		
		for(int i=0;i<A.size();i++) {
			if(first < A.get(i)) {
				second = first;
				first = A.get(i);
			} else if(second < A.get(i) && A.get(i) != first)
				second = A.get(i);
		}
		
		if(second == Integer.MIN_VALUE)
			return 0;
		return second;
    }
	
	public static void main(String[] args) {
		MaxMod obj = new MaxMod();
		ArrayList<Integer> ls = new ArrayList<>(Arrays.asList(2,6,4));
		System.out.println(obj.solve(ls));
	}
}

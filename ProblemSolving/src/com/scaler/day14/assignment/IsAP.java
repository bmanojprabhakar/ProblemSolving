package com.scaler.day14.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class IsAP {
	public int solve(ArrayList<Integer> A) {
		Collections.sort(A);
		int difference = A.get(1) - A.get(0);
		
		for(int i=2;i<A.size();i++) {
			if(A.get(i) - A.get(i-1) != difference)
				return 0;
		}
		return 1;
    }
	
	public static void main(String[] args) {
		IsAP obj = new IsAP();
		Integer[] arr = {2, 4, 1};
		ArrayList<Integer> al = new ArrayList<>(Arrays.asList(arr));
		System.out.println(obj.solve(al));
	}
}

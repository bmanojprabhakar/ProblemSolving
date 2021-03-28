package com.scaler.primer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MaxElement {
	public int solve(ArrayList<Integer> A, int B) {
		int result = 0;
		boolean flag = false;

		for(int i: A) {
			if(i == B)
				flag = true;
			if(i>B)
				result++;
		}
		
		if(flag)
			return result;
		
		return -1;
    }
	
	public static void main(String[] args) {
		MaxElement obj = new MaxElement();
		Integer[] arr = {2, 4, 3, 1, 5};
		ArrayList<Integer> ls = new ArrayList<>(Arrays.asList(arr));
		System.out.println(obj.solve(ls, 3));
	}
}

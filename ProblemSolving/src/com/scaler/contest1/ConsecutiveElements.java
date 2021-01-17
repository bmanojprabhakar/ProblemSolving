package com.scaler.contest1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ConsecutiveElements {
	public int solve(ArrayList<Integer> A) {
		int isConsecutive = 1;
		
		Collections.sort(A);
		
		for(int i=0;i<A.size()-1;i++) {
			if(A.get(i+1) - A.get(i) > 1) {
				isConsecutive = 0;
				break;
			}
		}
		
		
		return isConsecutive;
    }
	
	public static void main(String[] args) {
		ConsecutiveElements obj = new ConsecutiveElements();
		ArrayList<Integer> al = new ArrayList<>();
		Integer[] arr =  {1,3,2,5};
		al.addAll(Arrays.asList(arr));
		
		System.out.println(obj.solve(al));
	}

}

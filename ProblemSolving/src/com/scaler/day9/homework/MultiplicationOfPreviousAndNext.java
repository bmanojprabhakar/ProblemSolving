package com.scaler.day9.homework;

import java.util.ArrayList;
import java.util.Arrays;

public class MultiplicationOfPreviousAndNext {
	ArrayList<Integer> computedValue = new ArrayList<>();
	
	public ArrayList<Integer> solve(ArrayList<Integer> A) {
		if(A.size()==1)
			computedValue.add(A.get(0));
		else {
			for(int i=0;i<A.size();i++) {
				if(i==0)
					computedValue.add(A.get(i)*A.get(i+1));
				else if(i==A.size()-1)
					computedValue.add(A.get(A.size()-1) * A.get(A.size()-2));
				else
					computedValue.add(A.get(i-1) * A.get(i+1));
			}
		}
		return computedValue;
    }
		
	
	public static void main(String[] args) {
		MultiplicationOfPreviousAndNext obj = new MultiplicationOfPreviousAndNext();
		ArrayList<Integer> input = new ArrayList<>();
		
		//2, 3, 8, 15, 20
//		Integer[] arr =  {1, 2, 3, 4, 5};
		Integer[] arr = {0};
//		Integer[] arr =  { 0, 0, 4, 4, 6, 0, 9, 6, 5, 1 };
		
		input.addAll(Arrays.asList(arr));
		
		System.out.println(obj.solve(input));
	}
}

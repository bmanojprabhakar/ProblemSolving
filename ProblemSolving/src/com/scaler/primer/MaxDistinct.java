package com.scaler.primer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MaxDistinct {
	public ArrayList<Integer> solve1(ArrayList<Integer> A, ArrayList<Integer> B) {
		ArrayList<Integer> result = new ArrayList<>();
		int start = 0;
		int queryIndex = 0;
		
		while(queryIndex < B.size()) {
			for(int i=0;i<A.size();i++) {
				start += A.get(i);
				if(start > B.get(queryIndex)) {
					result.add(i);
					queryIndex++;
					start = 0;
					break;
				} else if(i==A.size()-1) {
					result.add(i+1);
					queryIndex++;
					start = 0;
					break;
				}
			}
		}
		
		return result;
    }
	
	public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
		ArrayList<Integer> result = new ArrayList<>();
		ArrayList<Integer> prefixSum = new ArrayList<>();
		prefixSum.add(A.get(0));
		
		for(int i=1;i<A.size();i++) {
			prefixSum.add(prefixSum.get(i-1) + A.get(i));
		}
		
		for(int i=0;i<B.size();i++) {
			int key = Collections.binarySearch(prefixSum, B.get(i));
			
			if(key<0)
				result.add(Math.abs(key+1));
			else
				result.add(key);
		}
		
		return result;
    }
	
	public static void main(String[] args) {
		MaxDistinct obj = new MaxDistinct();
		Integer[] a = {3, 4, 4, 6};
		Integer[] b = {20, 4, 10, 2};
		// 0,4,1,2
		
		System.out.println(obj.solve(new ArrayList<>(Arrays.asList(a)), 
				new ArrayList<>(Arrays.asList(b))));
	}

}

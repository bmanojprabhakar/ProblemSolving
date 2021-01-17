package com.scaler.day9.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class GoodPair {
	public int poorSolution(ArrayList<Integer> A, int B) {
		int isGoodPair = 0;
		
		for(int i=0; i<A.size()-1; i++) {
			for(int j=i+1; j<A.size(); j++) {
				if (i==j)
					continue;
				else if(A.get(i) + A.get(j) == B){
					System.out.println("First value: "+A.get(i)+"\n Second: "+A.get(j));
					isGoodPair++;
				}
			}
		}
		
		return isGoodPair;
    }
	
	public int solve(ArrayList<Integer> A, int B) {
		int isGoodPair = 0;
		Map<Integer, Boolean> map = new HashMap<>();
		map.put(A.get(0), true);
		
		for(int i=1;i<A.size();i++) {
			int c = B - A.get(i);
			if(map.containsKey(c)) {
				isGoodPair++;
				break;
			} else {
				map.put(A.get(i), true);
			}
		}
		
		return isGoodPair;
    }
	
	public static void main(String[] args) {
		GoodPair obj = new GoodPair();
		ArrayList<Integer> al = new ArrayList<>();
//		Integer[] ar = {510827, 351151, 96897, 925335, 299818, 192489, 456948, 44720, 510589, 598577};
		Integer[] ar = {1,2,3,4};
		
		al.addAll(Arrays.asList(ar));
		System.out.println(obj.solve(al, 7));
//		System.out.println(obj.poorSolution(al, 7));
	}

}

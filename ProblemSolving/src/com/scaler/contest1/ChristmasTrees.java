package com.scaler.contest1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ChristmasTrees {
	public int solve(ArrayList<Integer> A, ArrayList<Integer> B) {
		Map<Integer, Integer> christMap = new TreeMap<>();
		List<Integer> duplicates = new ArrayList<>();
		
		int cost = 0;
		int finalCost = 0;
		
		for(int i=0;i<A.size();i++) {
			christMap.put(A.get(i), B.get(i));
		}
		
		duplicates = findDuplicates(A);
		
		ArrayList<Integer> costList = new ArrayList<>(christMap.values());
		
		for(int i=0;i<costList.size()-2;i++) {
			cost = costList.get(i) + costList.get(i+1) + costList.get(i+2);
			
			if(finalCost==0 || cost < finalCost)
				finalCost = cost;
		}
		return finalCost;
		
    }
	
	public List<Integer> findDuplicates(ArrayList<Integer> al) {
		List<Integer> returnDuplicates = new ArrayList<>();
		Set<Integer> set = new HashSet<>();
		
		for(int i: al) {
			if(!set.add(i))
				returnDuplicates.add(i);
		}
		return returnDuplicates;
	}
	
	
	
	public static void main(String[] args) {
		ChristmasTrees obj = new ChristmasTrees();
		ArrayList<Integer> height = new ArrayList<>();
		ArrayList<Integer> cost = new ArrayList<>();
		Integer[] h =  {5,9,10,4,7,8};
		Integer[] c =  {5,6,4,7,2,5};
		height.addAll(Arrays.asList(h));
		cost.addAll(Arrays.asList(c));
		System.out.println(obj.solve(height, cost));
	}

}

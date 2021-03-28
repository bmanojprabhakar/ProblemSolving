package com.scaler.day23.homework;

import java.util.*;

public class FindDeterminant {
	// DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int solve(final List<ArrayList<Integer>> A) {
    	if(A.size() == 2) {
    		return ((A.get(0).get(0)) * (A.get(1).get(1)) -
    				(A.get(0).get(1)) * (A.get(1).get(0)));
    	} else {
    		int firstFactor = A.get(0).get(0);
    		int secondFactor = A.get(0).get(1);
    		int thirdFactor = A.get(0).get(2);
    		
    		int firstCoFactor = (A.get(1).get(1) * A.get(2).get(2) -
    				A.get(1).get(2) * A.get(2).get(1));
    		int secondCoFactor = (A.get(1).get(0) * A.get(2).get(2) -
    				A.get(1).get(2) * A.get(2).get(0));
    		int thirdCoFactor = (A.get(1).get(0) * A.get(2).get(1) -
    				A.get(1).get(1) * A.get(2).get(0));
    		
    		return firstFactor*firstCoFactor - secondFactor*secondCoFactor +
    				thirdFactor*thirdCoFactor;
    	}
    	
    }
    
	public static void main(String[] args) {
		FindDeterminant obj = new FindDeterminant();
		Integer[] arr1 = {6, 1, 1};
		Integer[] arr2 = {4, -2, 5};
		Integer[] arr3 = {2, 8, 7};
		ArrayList<Integer> row1 = new ArrayList<>(Arrays.asList(arr1));
		ArrayList<Integer> row2 = new ArrayList<>(Arrays.asList(arr2));
		ArrayList<Integer> row3 = new ArrayList<>(Arrays.asList(arr3));
		
		List<ArrayList<Integer>> input = new ArrayList<>();
		input.add(row1);
		input.add(row2);
		input.add(row3);
		System.out.println(obj.solve(input));
	}
}

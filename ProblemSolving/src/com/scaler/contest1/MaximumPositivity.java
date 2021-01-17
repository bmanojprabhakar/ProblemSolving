package com.scaler.contest1;

import java.util.ArrayList;
import java.util.Arrays;

public class MaximumPositivity {
	/*public ArrayList<Integer> solve1(ArrayList<Integer> A) {
		ArrayList<Integer> al = new ArrayList<>();
		ArrayList<Integer> tempList = new ArrayList<>();
		int counter = 0;
		
		for(int i=0;i<A.size()-1;i++) {
			if(A.get(i+1) < 0 || A.get(i) < 0)
				continue;
			else if(A.get(i+1) - A.get(i) == 1) {
				if(counter == 0) {
					tempList.add(A.get(i));
					tempList.add(A.get(i+1));
					counter = 1;
				} else {
					tempList.add(A.get(i+1));
				}
			} else {
				counter = 0;
				
				if(tempList.size() > al.size()) {
					al.clear();
					al.addAll(tempList);
				} else {
					tempList.clear();
				}
			}
				
		}
		
		if(tempList.size() > al.size()) {
			al.clear();
			al.addAll(tempList);
		}
		
		return al;
    }*/
	
	public ArrayList<Integer> solve(ArrayList<Integer> A) {
		ArrayList<Integer> finalList = new ArrayList<>();
		ArrayList<Integer> tempList = new ArrayList<>();
		
		for(int i=0;i<A.size();i++) {
			if(A.get(i) > 0) {
				tempList.add(A.get(i));
			} else {
				if(tempList.size() > finalList.size()) {
					finalList.clear();
					finalList.addAll(tempList);
					tempList.clear();
				} else {
					tempList.clear();
				}
			}
			
			if(i == A.size()-1) {
				if(tempList.size() > finalList.size()) {
					finalList.clear();
					finalList.addAll(tempList);
					tempList.clear();
				}
			}
		}
		
		return finalList;
    }
	
	
	public static void main(String[] args) {
		MaximumPositivity obj = new MaximumPositivity();
		ArrayList<Integer> al = new ArrayList<>();
		Integer[] arr =  {-8,-9,1,2,-3,4,-5,6,7,8};
//		Integer[] arr =  {8986143, -5026827, 5591744, 4058312, 2210051, 5680315, -5251946, -607433, 1633303, 2186575};
		al.addAll(Arrays.asList(arr));
		
		System.out.println(obj.solve(al));
	}


}

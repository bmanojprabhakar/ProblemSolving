package com.scaler.day13.assignment;

import java.util.*;

public class SubarrayToSum {
	public ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
		ArrayList<Integer> result = null;
		/*Set<Integer> checkSet = new HashSet<>();
		
		for(int i=0;i<A.size();i++) {
			int checkValue = B - A.get(i);
			if(checkSet.contains(checkValue)) {
				result.add(checkValue);
				result.add(A.get(i));
				break;
			} else
				checkSet.add(A.get(i));
		}*/
		boolean flag = false;
		outer:
		for(int i=0;i<A.size();i++) {
			int sum = A.get(i);
			result = new ArrayList<>();
			result.add(A.get(i));
			for(int j=i;j<A.size();j++) {
				sum += A.get(j);
				
				result.add(A.get(j));
				
				if(sum == B) {
					flag = true;
					break outer;
				} else if(sum > B)
					break;
			}
		}
		
		if(!flag) {
			result.clear();
			result.add(-1);
		}
			
		
		return result;
    }
	
	public static void main(String[] args) {
		SubarrayToSum obj = new SubarrayToSum();
		Integer[] intArr = {1, 10000};
		ArrayList<Integer> al = new ArrayList<>(Arrays.asList(intArr));
		System.out.println(obj.solve(al, 10000));
	}
}

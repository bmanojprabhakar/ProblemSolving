package com.scaler.day40.assignment;

import java.util.*;

public class InversionCount {
	public int solve(ArrayList<Integer> A) {
		int inversionCount = 0;
		
		for(int i=0;i<A.size();i++) {
			for(int j=i+1;j<A.size();j++) {
				if(A.get(i) > A.get(j))
					inversionCount++;
			}
		}
		
		return inversionCount;
	
	}
	public static void main(String[] args) {
		InversionCount obj = new InversionCount();
		ArrayList<Integer> ls = new ArrayList<>(Arrays.asList(8, 4, 2, 1));
		System.out.println(obj.solve(ls));
	}

}

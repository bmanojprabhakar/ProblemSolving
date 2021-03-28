package com.scaler.primer;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxMod {
	public int solve(ArrayList<Integer> A) {
		int result = 0;
		
		for(int i=0;i<A.size();i++) {
			for(int j=0; j<A.size(); j++) {
				if((A.get(i)>0 && A.get(j)>0) && 
						(A.get(i) % A.get(j) > result))
					result = A.get(i) % A.get(j);
			}
		}
		return result;
	}
	public static void main(String[] args) {
		MaxMod obj = new MaxMod();
		Integer[] arr = {0, 2, 6, 5};
		System.out.println(obj.solve(new ArrayList<>(Arrays.asList(arr))));
	}

}

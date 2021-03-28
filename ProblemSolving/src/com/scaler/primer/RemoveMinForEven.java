package com.scaler.primer;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveMinForEven {
	public int solve(ArrayList<Integer> A) {
		int minElements = 0;
		
		for(int i=0; i<A.size(); i++) {
			if(A.get(i)%2!=0)
				minElements++;
		}
		
		return Math.min(A.size()-minElements, minElements);
    }
	
	public static void main(String[] args) {
		RemoveMinForEven obj = new RemoveMinForEven();
		Integer[] arr = {5, -1};
		System.out.println(obj.solve(new ArrayList<>(Arrays.asList(arr))));
	}

}

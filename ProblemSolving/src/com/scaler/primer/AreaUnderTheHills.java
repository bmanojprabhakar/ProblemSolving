package com.scaler.primer;

import java.util.ArrayList;
import java.util.Arrays;

public class AreaUnderTheHills {
	public String solve(ArrayList<Integer> A) {
		String result = "";
		int temp = 0;
		
		for(int i=0; i<A.size();i++) {
			temp += A.get(i);
		}
		
		result = String.valueOf(temp);
		
		return result;
    }
	
	public static void main(String[] args) {
		AreaUnderTheHills obj = new AreaUnderTheHills();
		Integer[] arr = {2,1,3};
		ArrayList<Integer> ls = new ArrayList<>(Arrays.asList(arr));
		System.out.println(obj.solve(ls));
	}

}

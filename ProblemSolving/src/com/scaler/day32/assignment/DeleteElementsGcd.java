package com.scaler.day32.assignment;

import java.util.ArrayList;
import java.util.Arrays;

public class DeleteElementsGcd {
	public int solve(ArrayList<Integer> A) {
		int gcd = 0;
		for(int a: A)
			gcd = findGcd(gcd,a);
		
		if(gcd > 1)
			return -1;
		else
			return 0;
    }
	
	private int findGcd(int a, int b) {
		if(a==0)
			return a;
		if(b==0)
			return b;
		
		if(a == b)
			return a;
		
		if(a>b)
			return findGcd(a-b, b);
		return findGcd(a, b-a);
	}
	
	public static void main(String[] args) {
		DeleteElementsGcd obj = new DeleteElementsGcd();
		Integer[] a = {7, 2, 5};
		System.out.println(obj.solve(new ArrayList<>(Arrays.asList(a))));
	}

}

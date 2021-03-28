package com.scaler.day9.homework;

import java.util.ArrayList;
import java.util.Arrays;

public class PrimalPower {
	public int solve(ArrayList<Integer> A) {
		int counter = 0;
		for(int i: A) {
			if(i>1 && calculatePrime(i))
				counter++;
		}
		return counter;
    }
	
	private boolean calculatePrime(int i) {
		boolean isComposite = false;
		
		for(int j=2; j<=i/2; ++j) {
			if(i%j == 0) {
				isComposite = true;
				break;
			}
		}
		
		if(!isComposite)
			System.out.println(i);
		
		return !isComposite;
	}
	
	public static void main(String[] args) {
		PrimalPower obj = new PrimalPower();
		ArrayList<Integer> input = new ArrayList<>();
		Integer[] arr = {97, 43, 29, 11, 100, 47, 76, 83, 37, 19, 17, 19, 71, 0, 1, -82, 2, -83, 37, 13, 5, 97, 17, 30, 31, 48, 2, 19, 31, 91, 19, 2, 5, 89, 2, 67, 31, 47, 43, 31, 5, 17, 83, 11, 47, 73, 19, 3, 3, 19, 59, 91, 67, 7, 43, 4, 3, 51, 52, 23, 3, 37, 53, 89, 9, 41, 19, 61, 7, 5, 53, 59, 19, 11, 79, 37, 31, 37, 73, 82, 41, 2, 13, 8, 2, 36, 19, 58, 17, 17, 59, 59, 37, 11, 13, 37, 47, 83, 31, 3 };
		input.addAll(Arrays.asList(arr));
		
		System.out.println(obj.solve(input));
	}

}

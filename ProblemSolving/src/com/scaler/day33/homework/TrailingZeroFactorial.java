package com.scaler.day33.homework;

public class TrailingZeroFactorial {
	public int trailingZeroes(int A) {
		int result = 0;
		
		while(A > 0) {
			result += A/5;
			A /= 5;
		}
		return result;
    }
	public static void main(String[] args) {
		TrailingZeroFactorial obj = new TrailingZeroFactorial();
		System.out.println(obj.trailingZeroes(10));
	}
}

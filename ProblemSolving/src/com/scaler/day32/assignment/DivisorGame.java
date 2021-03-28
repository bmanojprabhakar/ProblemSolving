package com.scaler.day32.assignment;

public class DivisorGame {
	public int solve(int A, int B, int C) {
		int count = 0;
		for(int i=1;i<=A;i++) {
			if(i%B==0 && i%C==0)
				count++;
		}
		return count;
    }
	
	public static void main(String[] args) {
		DivisorGame obj = new DivisorGame();
		System.out.println(obj.solve(6,1,4));
	}
}

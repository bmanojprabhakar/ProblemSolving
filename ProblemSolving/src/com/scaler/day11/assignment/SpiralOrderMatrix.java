package com.scaler.day11.assignment;

import java.util.ArrayList;
import java.util.Collections;

public class SpiralOrderMatrix {
	public ArrayList<ArrayList<Integer>> generateMatrix(int A) {
		ArrayList<ArrayList<Integer>> finalMatrix = new ArrayList<>();
		int a = 0;
		
		for(int i=1;i<=A;i++) {
			ArrayList<Integer> rowMatrix = new ArrayList<>();
			for(int j=1;j<=A;j++) {
				rowMatrix.add(++a);
			}
			if(i%2==0) {
				Collections.reverse(rowMatrix);
				finalMatrix.add(rowMatrix);
			} else {
				finalMatrix.add(rowMatrix);
			}
		}
		
		return finalMatrix;
    }
	
	public static void main(String[] args) {
		SpiralOrderMatrix obj = new SpiralOrderMatrix();
		System.out.println(obj.generateMatrix(3));
	}

}

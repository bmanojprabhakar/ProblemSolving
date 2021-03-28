package com.scaler.day9.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LeftRotationArray {
	public ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
		ArrayList<ArrayList<Integer>> afterRotation = new ArrayList<>();
		for(int i: B) {
			ArrayList<Integer> listToBeRotated = new ArrayList<>(A);
			afterRotation.add(leftRotate(i, listToBeRotated));
		}
		return afterRotation;
    }
	
	private ArrayList<Integer> leftRotate(int num, ArrayList<Integer> rotateList) {
//		Collections.rotate(rotateList, rotateList.size()-num);
		
		int size = rotateList.size();
		int modulo = num%size;
		ArrayList<Integer> leftRotation = new ArrayList<>();
		
		for(int i=0;i<size;++i) {
			leftRotation.add(rotateList.get((i+modulo)%size));
		}
		
		
		return leftRotation;
	}
	
	public static void main(String[] args) {
		LeftRotationArray obj = new LeftRotationArray();
		ArrayList<Integer> listA = new ArrayList<>();
		ArrayList<Integer> listB = new ArrayList<>();
		
		Integer[] arrA = {1,2,3,4,5};
		Integer[] arrB = {2,3};
		listA.addAll(Arrays.asList(arrA));
		listB.addAll(Arrays.asList(arrB));
		
		System.out.println(obj.solve(listA, listB));
	}

}

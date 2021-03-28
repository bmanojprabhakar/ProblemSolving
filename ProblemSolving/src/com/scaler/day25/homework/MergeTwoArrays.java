package com.scaler.day25.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MergeTwoArrays {
	public ArrayList<Integer> solve(final List<Integer> A, final List<Integer> B) {
		ArrayList<Integer> result = new ArrayList<>();
		
		result.addAll(A);
		result.addAll(B);
		
		Collections.sort(result);
		return result;
    }
	public static void main(String[] args) {
		MergeTwoArrays obj = new MergeTwoArrays();
		Integer[] arr1 = {1};
		Integer[] arr2 = {2};
		List<Integer> row1 = new ArrayList<>(Arrays.asList(arr1));
		List<Integer> row2 = new ArrayList<>(Arrays.asList(arr2));
		
		System.out.println(obj.solve(row1, row2));
	}
}

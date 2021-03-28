package com.scaler.day40.assignment;

import java.util.*;

public class KthSmallestElement {
	// DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int kthsmallest(final List<Integer> A, int B) {
    	Collections.sort(A);
    	return A.get(B-1);
    }
    
	public static void main(String[] args) {
		KthSmallestElement obj = new KthSmallestElement();
		List<Integer> ls = Arrays.asList(1,2);
		System.out.println(obj.kthsmallest(ls, 2));
	}
}

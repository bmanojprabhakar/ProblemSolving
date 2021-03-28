package com.scaler.day17.assignment;

public class ReverseString {
	public String solve(String A) {
		String[] arr = A.split(" ");
		StringBuilder sbr = new StringBuilder();

		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i].length() > 0) {
				sbr.append(arr[i] + " ");
			}

		}
		String result = sbr.toString();
		return result.trim();
    }
	
	public static void main(String[] args) {
		ReverseString obj = new ReverseString();
		System.out.println(obj.solve("       fwbpudnbrozzifml osdt ulc jsx kxorifrhubk ouhsuhf sswz qfho dqmy sn myq igjgip iwfcqq                 "));
	}
}

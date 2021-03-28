package com.scaler.day17.homework;

public class ClosestPalindrome {
	public String solve(String A) {
		char[] arr = A.toCharArray();
		
		int leftPtr = 0;
		int rightPtr = arr.length-1;
		int count = 0;
		
		while(leftPtr < rightPtr) {
			if(arr[leftPtr] != arr[rightPtr])
				count++;
			leftPtr++;
			rightPtr--;
		}
		
		if(count==1 || (count==0 && A.length()%2!=0))
			return "YES";
		return "NO";
	}
	
	public static void main(String[] args) {
		ClosestPalindrome obj = new ClosestPalindrome();
		System.out.println(obj.solve("aaaaaaaaaabaaaaaaaaa"));
	}

}

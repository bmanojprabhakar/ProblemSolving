package com.scaler.day9.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class AddOneToNumber {
	ArrayList<Integer> returnList = new ArrayList<>();
	
	public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
		int carry = 0;
		
		for(int i=A.size()-1; i>=0; i--) {
			int addedNumber = A.get(i) + carry;
			
			if(i==A.size()-1)
				addedNumber += 1;
			
			if(addedNumber>9) {
				carry = addedNumber/10;
				returnList.add(addedNumber%10);
			} else {
				returnList.add(addedNumber);
				carry = 0;
			}
			
			if(i==0 && carry>0 ) {
				returnList.add(carry);
			}
		}
		
		Collections.reverse(returnList);
		
		int a=0;
		
		while(true) {
			if(returnList.get(a)==0)
				returnList.remove(a);
			else
				break;
		}
		return returnList;
    }
	
	public static void main(String[] args) {
		AddOneToNumber obj = new AddOneToNumber();
		ArrayList<Integer> input = new ArrayList<>();
		
//		Integer[] arr =  {1,3,2,5};
//		Integer[] arr = {0};
		Integer[] arr =  { 0, 0, 4, 4, 6, 0, 9, 6, 5, 1 };
		
		input.addAll(Arrays.asList(arr));
		
		System.out.println(obj.plusOne(input));
	}

}

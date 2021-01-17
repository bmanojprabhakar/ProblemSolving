package com.scaler.day5.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SingleNumber {
	public int singleNumber1(final List<Integer> A) {
		int singleElement = A.get(0);
		
		outerloop:
		for(int i=0;i<A.size();i++) {
			for(int j=0;j<A.size();j++) {
				if(i==j)
					continue;
				
				if(A.get(i).equals(A.get(j)))
					continue outerloop;
				else {
					singleElement = A.get(i);
					
					if(j==A.size()-1)
						break outerloop;
				}
			}
			
		}
		
		return singleElement;
	}
	
	public int singleNumber(final List<Integer> A) {
		Collections.sort(A);
		System.out.print(A);
		int i = 0;
		while(i<A.size()) {
			if(i >= A.size()-1)
				return A.get(i);
			else {
				if((A.get(i)^A.get(i+1)) == 0)
					i = i+2;
				else
					return A.get(i);
			}
		}
		
		return A.get(0);
	}
	
	public static void main(String[] args) {
		SingleNumber obj = new SingleNumber();
//		Integer[] intArray = {723, 256, 668, 723, 140, 360, 597, 233, 128, 845, 737, 804, 986, 701, 906, 512, 845, 510, 510, 227, 430, 701, 366, 946, 464, 619, 946, 627, 209, 771, 424, 555, 959, 711, 530, 937, 716, 261, 505, 658, 706, 140, 511, 277, 396, 233, 819, 196, 475, 906, 583, 261, 147, 658, 517, 197, 196, 702, 944, 711, 128, 555, 149, 483, 530, 291, 716, 258, 430, 464, 601, 749, 149, 415, 802, 573, 627, 771, 660, 601, 360, 986, 291, 51, 415, 51, 227, 258, 937, 366, 923, 669, 33, 517, 417, 702, 475, 706, 110, 417, 275, 804, 500, 473, 746, 973, 669, 275, 973, 147, 817, 657, 277, 923, 144, 660, 197, 511, 793, 893, 944, 505, 322, 817, 586, 512, 322, 668, 33, 424, 962, 597, 144, 746, 345, 753, 345, 269, 819, 483, 368, 802, 573, 962, 583, 615, 208, 209, 269, 749, 256, 657, 619, 893, 959, 473, 753, 299, 396, 299, 500, 368, 586, 110, 793, 737, 615};
//		Integer[] intArray = {32, 34, 32, 725, 659, 980, 273, 725, 286, 875, 273, 538, 875, 34, 931, 150, 124, 150, 931, 659, 286, 124, 538};
		Integer[] intArray = {1};
		
		List<Integer> intList = Arrays.asList(intArray);
		System.out.println(obj.singleNumber(intList));
	}
	
	//1,1,3,4,4,5,6,5,6

}

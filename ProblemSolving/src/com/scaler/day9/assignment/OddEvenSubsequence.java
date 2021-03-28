package com.scaler.day9.assignment;

import java.util.ArrayList;
import java.util.Arrays;

public class OddEvenSubsequence {
	public int solve(ArrayList<Integer> A) {
        int counter = 1;
        
        boolean startValue = A.get(0)%2==0?true:false;
        
        if(startValue) {
        	counter = calculateSequence(counter, "odd", A);
        } else {
        	counter = calculateSequence(counter, "even", A);
        }
        
        return counter;
    }
	
	private int calculateSequence(int counter, String pointer, ArrayList<Integer> A) {
		String nextPointer = pointer;
		
    	for(int i=1;i<A.size();i++) {
    		if(nextPointer=="odd" && A.get(i)%2!=0) {
    			nextPointer = "even";
    			counter++;
    		} else if(nextPointer == "even" && A.get(i)%2==0) {
    			nextPointer = "odd";
    			counter++;
    		}
    	}
    	return counter;
	}
	
	public static void main(String[] args) {
		OddEvenSubsequence obj = new OddEvenSubsequence();
		ArrayList<Integer> input = new ArrayList<>();
		
		Integer[] arr =  {1,2,3,4,5};
		
		input.addAll(Arrays.asList(arr));
		
		System.out.println(obj.solve(input));
	}

}

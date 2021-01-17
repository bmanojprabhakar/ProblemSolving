package com.scaler.day9.assignment;

import java.util.ArrayList;

public class FizzBuzz {
	public ArrayList<String> fizzBuzz(int A) {
		ArrayList<String> fbList = new ArrayList<>();
		int i = 1;
		
		while(i <= A) {
			if (i % 3 == 0 && i%5 == 0) {
				fbList.add("FizzBuzz");
			} else if(i%3 == 0) {
				fbList.add("Fizz");
			} else if(i%5 == 0) {
				fbList.add("Buzz");
			} else {
				fbList.add(String.valueOf(i));
			}
			i++;
		}
		return fbList;
    }
	
	public static void main(String[] args) {
		FizzBuzz fizzBuzz = new FizzBuzz();
		System.out.println(fizzBuzz.fizzBuzz(15));
	}

}

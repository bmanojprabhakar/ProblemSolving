package com.scaler.day9.assignment;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RotationGame {
	private static List<String> elements = new ArrayList<>();
	private static List<Integer> rotationIndex = new ArrayList<>();
	
	private void rotateRight(List<String> arrElements, List<Integer> rotationIndex) {
		for(int i=0; i<arrElements.size(); i++) {
			String lineElement = arrElements.get(i);
			int[] elements = Arrays.stream(lineElement.substring(2,lineElement.length()).split(" ")).
					map(String::trim).mapToInt(Integer::parseInt).toArray();
			
			int rotationFactor = elements.length - (rotationIndex.get(i) % elements.length);
					
			for(int j=0; j<elements.length; j++) {
				System.out.print(elements[(j+rotationFactor) % elements.length]);
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = Integer.parseInt(scn.nextLine());
		
		for(int i=0;i<n;i++) {
			elements.add(scn.nextLine());
			rotationIndex.add(Integer.parseInt(scn.nextLine()));
		}
		System.out.println("Elements: "+elements);
		System.out.println("Factor: "+rotationIndex);
		
		RotationGame obj = new RotationGame();
		obj.rotateRight(elements, rotationIndex);
		
	}

}

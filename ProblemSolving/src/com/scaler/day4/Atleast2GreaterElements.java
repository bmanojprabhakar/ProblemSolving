package com.scaler.day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Atleast2GreaterElements {
	public ArrayList<Integer> solve(ArrayList<Integer> A) {
		ArrayList<Integer> greaterElementList = new ArrayList<>();
		
		for(int i=0;i<A.size();i++) {
			int count = 0;
			for(int j=0;j<A.size();j++) {
				if((i == j) || (greaterElementList.contains(A.get(j))))
					continue;
				if(A.get(i) < A.get(j)) {
					count++;
					if(count>1) {
						greaterElementList.add(A.get(i));
						break;
					}
				}
					
			}
		}
		
		return greaterElementList;
	}
	
	public static void main(String[] args) {
		Atleast2GreaterElements obj = new Atleast2GreaterElements();
//		Integer[] arr = {241, 710, 751, 904, 264, 955, 413, 163, 914, 173, 940, 164, 494, 545, 750, 685, 665, 619, 99, 953, 759, 783, 534, 706, 771, 570, 471, 543, 658, 674, 634, 766, 931, 40, 244, 209, 360, 517, 962, 420, 155, 711, 845, 646, 117, 641, 458, 790, 620, 46, 837, 560, 374, 510, 133, 214, 322, 275, 342, 460, 642, 153, 751, 317, 71, 8, 256, 195, 256, 469, 16, 986, 339, 753, 773, 921, 638, 529, 333, 73, 393, 985, 846, 175, 548, 694, 560, 174, 710, 478, 316 };
		Integer[] arr = {5, 17, 100, 11};
//		Integer[] arr = {947, 871, 859, 471, 763, 766, 379, 746, 485, 966, 10, 350, 341, 22, 706, 702, 717, 967, 641, 712, 10, 954, 751, 250, 777, 214, 820, 276, 708, 509, 123, 73, 593, 790, 797, 678, 320, 865, 392, 428, 611, 813, 655, 195, 102, 902, 919, 171, 706, 841, 873, 98, 128, 728, 878, 701, 874, 158, 548, 214, 414, 600, 869, 936, 841, 221, 87, 255, 233, 627, 487, 53, 270, 162, 517, 576, 240, 681, 172, 148, 86, 778, 205, 741, 483, 11, 795, 188, 450};
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.addAll(Arrays.asList(arr));
		System.out.println(obj.solve(a));
	}

}

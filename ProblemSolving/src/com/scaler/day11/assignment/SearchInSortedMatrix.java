package com.scaler.day11.assignment;

import java.util.ArrayList;

public class SearchInSortedMatrix {
	public int solve(ArrayList<ArrayList<Integer>> A, int B) {
		int logicalValue = -1;
		
		for(int i=0;i<A.size();i++) {
			for(int j=0;j<A.get(0).size();j++) {
				if(A.get(i).get(j)== B && logicalValue != -1)
					logicalValue = Math.min(logicalValue, ((i+1)*1009)+(j+1));
				else if(A.get(i).get(j)== B && logicalValue == -1)
					logicalValue = ((i+1)*1009)+(j+1);
			}
		}
		
		return logicalValue;
	
	}
	
	public int solve1(ArrayList<ArrayList<Integer>> A, int B) {
        int logicalValue = -1;

	    int rowPointer = 0;
	    int columnPointer = A.get(0).size()-1;
	
	    while(true) {
	        if(rowPointer == A.size()-1 &&
	                columnPointer == A.get(0).size()-1) {
	            if(A.get(rowPointer).get(columnPointer) == B) {
	                logicalValue = (rowPointer + 1) * 1009 + (columnPointer + 1);
	            }
	            break;
	        }
	        if(A.get(rowPointer).get(columnPointer) == B) {
	            logicalValue = (rowPointer+1)*1009 + (columnPointer+1);
	        } else if(A.get(rowPointer).get(columnPointer) > B) {
	            columnPointer--;
	        } else if(A.get(rowPointer).get(columnPointer) < B) {
	            rowPointer++;
	        }
	    }
	
	    return logicalValue;
	}
	
	public static void main(String[] args) {
		SearchInSortedMatrix obj = new SearchInSortedMatrix();
		
		int n = 3;
		ArrayList<ArrayList<Integer>> input = new ArrayList<>();
		int element = 0;
		
		for(int i=0;i<n;i++) {
			ArrayList<Integer> row = new ArrayList<>();
			for(int j=0;j<n;j++) {
				row.add(++element);
			}
			input.add(row);
		}
		System.out.println(input);
		System.out.println(obj.solve(input, 2));
		
	}

}

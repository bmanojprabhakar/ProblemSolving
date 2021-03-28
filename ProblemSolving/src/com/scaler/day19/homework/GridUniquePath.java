package com.scaler.day19.homework;

//Need to be revisited

public class GridUniquePath {
	public int uniquePaths(int A, int B) {
		return fetchDistance(0,0,A,B);
    }
	
	private int fetchDistance(int x, int y, int A, int B) {
		if(x == A || y == B)
			return 0;
		if(x == A-1 && y == B-1)
			return 1;
		return fetchDistance(x+1,y,A,B) + fetchDistance(x, y+1, A, B);
	}
	
	public static void main(String[] args) {
		GridUniquePath obj = new GridUniquePath();
		System.out.println(obj.uniquePaths(0,0));
	}
}

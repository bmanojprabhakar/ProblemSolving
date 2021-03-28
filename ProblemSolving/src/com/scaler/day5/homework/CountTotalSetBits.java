package com.scaler.day5.homework;

public class CountTotalSetBits {
	public int solve1(int A) {
        int bitCount = 0;

        for(int i=1; i<=A; i++) {
            bitCount += countSetBits(i);
        }
        return (int) ((bitCount)%((Math.pow(10,9)) + 7));
    }
	
	public int solve(int A) {
		A++;
        long powerOfTwo = 2;
        long count = A/2;

        while(powerOfTwo <= A) {
        	long totalCombos = A/powerOfTwo;
        	
        	count += (totalCombos/2)*powerOfTwo;
        	count += totalCombos%2==1 ? (A%powerOfTwo):0;
        	powerOfTwo<<=1;
        }
        return (int) ((count)%((Math.pow(10,9)) + 7));
    }
	
	private int countSetBits(int i) {
		if(i<=0)
			return 0;
		
		return (i%2==0?0:1) + countSetBits(i/2);
	}

	public static void main(String[] args) {
		CountTotalSetBits obj = new CountTotalSetBits();
		System.out.println(obj.solve(3));
	}
}

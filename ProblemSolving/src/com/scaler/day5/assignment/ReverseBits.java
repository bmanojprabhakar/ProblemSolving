package com.scaler.day5.assignment;

public class ReverseBits {
	public long reverse(long a) {
		StringBuffer binaryValue = new StringBuffer(String.format("%32s", Long.toBinaryString(a)).replace(" ","0"));
		return Long.parseLong(binaryValue.reverse().toString(),2);
	}
	
	public static void main(String[] args) {
		ReverseBits obj = new ReverseBits();
		System.out.println("Result: "+obj.reverse(3));
	}

}

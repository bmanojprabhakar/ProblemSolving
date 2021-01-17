package com.scaler.day5.assignment;

public class NumberOf1Bits {
	StringBuffer binaryValue = new StringBuffer();
	
	public int numSetBits(long a) {
		String binaryValue = convertToBinary(a);
		
		System.out.println(binaryValue);
		
		int numSet = 0;
		
		char[] inputChars = binaryValue.toCharArray();
		
		for(char c: inputChars) {
			if(c=='1')
				numSet++;
		}
		
		return numSet;
	}
	
	private String convertToBinary(long a) {
		long input = a;
		
		if(input==1)
			return binaryValue.append(1).toString();
		if(input==0)
			return binaryValue.append(0).toString();
		
		binaryValue.append(input%2);
		
		if(input/2 != 1)
			convertToBinary(input/2);
		else
			binaryValue.append(1);
		
		return binaryValue.toString();
	}

	public static void main(String[] args) {
		NumberOf1Bits obj = new NumberOf1Bits();
		System.out.println(obj.numSetBits(9));
	}

}

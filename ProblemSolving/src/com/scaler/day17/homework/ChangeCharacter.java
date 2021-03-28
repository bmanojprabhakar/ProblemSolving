package com.scaler.day17.homework;

import java.util.*;

public class ChangeCharacter {
	
	public int solve(String A, int B) {
		char[] charArr = A.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		List<Integer> ls = new ArrayList<>();
		
		for(int i=0;i<charArr.length;i++) {
			if(map.containsKey(charArr[i])) {
				int c = map.get(charArr[i]);
				map.put(charArr[i], c+1);
			}
			map.putIfAbsent(charArr[i], 1);
		}
		
		for(int x: map.values())
			ls.add(x);
		
		Collections.sort(ls);
		int sum = 0;
		int result = 0;
		
		for(int y = 0; y<ls.size(); y++) {
			sum += ls.get(y);
			
			if(sum > B) {
				result = map.size()- y;
				break;
			}
		}
		
        return result;
    }
	public static void main(String[] args) {
		ChangeCharacter obj = new ChangeCharacter();
		System.out.println(obj.solve("umeaylnlfd", 1));
	}
}

package com.scaler.day45.homework;

import java.util.*;

public class Anagrams {
	// DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<ArrayList<Integer>> anagrams(final List<String> A) {
    	ArrayList<ArrayList<Integer>> result = new ArrayList<>();
    	Map<String, ArrayList<Integer>> map = new HashMap<>();
    	
    	for(int i=0; i<A.size(); i++) {
    		String sortedChars = sortCharInString(A.get(i));
    		System.out.println(sortedChars);
    		ArrayList<Integer> frequency = new ArrayList<>();
    		
    		if(map.containsKey(sortedChars)) {
    			frequency = map.get(sortedChars);
    			frequency.add(i+1);
    			map.put(sortedChars, frequency);
    		} else {
	    		frequency.add(i+1);
	    		map.put(sortedChars, frequency);
    		}
    	}
    	
    	for(Map.Entry<String, ArrayList<Integer>> m: map.entrySet()) {
   			result.add(m.getValue());
    	}
    	
    	return result;
    }
    
	private String sortCharInString(String s) {
		char[] arr = s.toCharArray();
		Arrays.sort(arr);
		
		return new String(arr);
	}

	public static void main(String[] args) {
		Anagrams obj = new Anagrams();
		List<String> ls = Arrays.asList("abbbaabbbabbbbabababbbbbbbaabaaabbaaababbabbabbaababbbaaabbabaabbaabbabbbbbababbbababbbbaabababba", "abaaabbbabaaabbbbabaabbabaaaababbbbabbbaaaabaababbbbaaaabbbaaaabaabbaaabbaabaaabbabbaaaababbabbaa", "babbabbaaabbbbabaaaabaabaabbbabaabaaabbbbbbabbabababbbabaabaabbaabaabaabbaabbbabaabbbabaaaabbbbab", "bbbabaaabaaaaabaabaaaaaaabbabaaaabbababbabbabbaabbabaaabaabbbabbaabaabaabaaaabbabbabaaababbaababb", "abbbbbbbbbbbbabaabbbbabababaabaabbbababbabbabaaaabaabbabbaaabbaaaabbaabbbbbaaaabaaaaababababaabab", "aabbbbaaabbaabbbbabbbbbaabbababbbbababbbabaabbbbbbababaaaabbbabaabbbbabbbababbbaaabbabaaaabaaaaba", "abbaaababbbabbbbabababbbababbbaaaaabbbbbbaaaabbaaabbbbbbabbabbabbaabbbbaabaabbababbbaabbbaababbaa", "aabaaabaaaaaabbbbaabbabaaaabbaababaaabbabbaaaaababaaabaabbbabbababaabababbaabaababbaabbabbbaaabbb" );
		System.out.println(obj.anagrams(ls));
	}
}

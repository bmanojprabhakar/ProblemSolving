package com.scaler.day32.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DeleteOneGcd {
    public int solve(ArrayList<Integer> A) {
        List<Integer> prefixList = new ArrayList<>();
        List<Integer> suffixList = new ArrayList<>();
        int maxGcd = 0;

        for(int i=0;i<A.size()-1;i++) {
            prefixList = A.subList(0,i+1);
            suffixList = A.subList(i+2, A.size());

            int prefixGcd = findGcd(prefixList);
            int suffixGcd = findGcd(suffixList);
            maxGcd = Math.max(maxGcd, calculateGcd(prefixGcd, suffixGcd));
        }
        return maxGcd;

    }

    private int findGcd(List<Integer> ls) {
        int result = 0;
        for(int x: ls) {
            result = calculateGcd(result, x);

            if(result == 1)
                break;
        }
        return result;
    }

    private int calculateGcd(int a, int b) {
        if(a == 0)
            return b;
        return calculateGcd(Math.max(a,b) % Math.min(a,b), Math.min(a, b));
    }
    public static void main(String[] args) {
        DeleteOneGcd obj = new DeleteOneGcd();
        ArrayList<Integer> ls = new ArrayList<>(Arrays.asList(12, 15,18));
        obj.solve(ls);
    }
}

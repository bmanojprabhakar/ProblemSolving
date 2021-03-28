package com.scaler.day13.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SubArrayZeroSum {
    public int solve(ArrayList<Integer> A) {
        Set<Integer> storeSum = new HashSet<>();
        int sum = 0;

        for(int i=0;i<A.size();i++) {
            sum += A.get(i);

            if (A.get(i) == 0 ||
                    sum == 0 ||
                    storeSum.contains(sum))
                return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        SubArrayZeroSum obj = new SubArrayZeroSum();
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(96, -71, 18, 66, -39, -32, -16, -83, -11, -92, 55, 66, 93, 5, 50, -45, 66, -28, 69, -4, -34, -87, -32, 7, -53, 33, -12, -94, -80, -71, 48, -93, 62));
        System.out.println(obj.solve(al));
    }
}

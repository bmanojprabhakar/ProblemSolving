package com.scaler.day5.homework;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SingleNumber2 {
    public int singleNumber(final List<Integer> A) {
        int uniqueNumber = 0;
        Collections.sort(A);

        for(int i=0; i<A.size()-2; i++) {
            int a = A.get(i);
            int b = A.get(i+1);
            int c = A.get(i+2);

            if(a==b && b==c) {
                i = i+2;
                continue;
            } else {
                if(a==b)
                    uniqueNumber = c;
                else if(b==c)
                    uniqueNumber = a;
            }
        }

        if(uniqueNumber == 0)
            uniqueNumber = A.get(A.size()-1);

        System.out.println(A);
        return uniqueNumber;
    }

    public static void main(String[] args) {
        SingleNumber2 obj = new SingleNumber2();
        Integer[] arr = {1, 2, 4, 4, 4, 2, 2, 3, 3, 3};
        System.out.println(obj.singleNumber(Arrays.asList(arr)));
    }
}

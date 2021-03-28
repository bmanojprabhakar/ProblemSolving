package com.scaler.day17.assignment;

public class SimpleReverse {
    public String solve(String A) {
        StringBuilder sb = new StringBuilder(A);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        SimpleReverse t = new SimpleReverse();
        t.solve("Scaler");
    }
}

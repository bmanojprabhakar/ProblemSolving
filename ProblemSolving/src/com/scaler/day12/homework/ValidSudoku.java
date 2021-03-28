package com.scaler.day12.homework;

import java.util.Arrays;
import java.util.List;

public class ValidSudoku {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int isValidSudoku(final List<String> A) {
        for (String s : A) {
            if(!isValidFormat(s)) {
                return 0;
            }
        }

        for (int i=0;i<9;i++) {
            int[] countOfNos = new int[9];
            for(String s : A) {
                char c = s.charAt(i);
                if (Character.isDigit(c)) {
                    countOfNos[Character.getNumericValue(c) - 1]++;
                    if (countOfNos[Character.getNumericValue(c) - 1] > 1) {
                        return 0;
                    }
                }
            }
        }

        for (int i=0;i<9;i+=3) {
            StringBuilder[] builder = new StringBuilder[3];
            for(int k=0;k<3;k++) {
                builder[k] = new StringBuilder("");
            }

            for (int j=0;j<3;j++) {
                String str = A.get(i+j);
                builder[0].append(str.substring(0, 3));
                builder[1].append(str.substring(3, 6));
                builder[2].append(str.substring(6, 9));
            }

            for (int k=0;k<3;k++) {
                if (!isValidFormat(builder[k].toString())) {
                    return 0;
                }
            }
        }

        return 1;
    }

    public static boolean isValidFormat(String s) {
        int[] count  = new int[9];
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                count[Character.getNumericValue(c) - 1]++;
                if (count[Character.getNumericValue(c) - 1] > 1) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ValidSudoku obj = new ValidSudoku();
        List<String> ls = Arrays.asList("53..7....", "6..195...", ".98....6.", "8...6...3", "4..8.3..1", "7...2...6", ".6....28.", "...419..5", "....8..79");
        System.out.println(obj.isValidSudoku(ls));
    }
}

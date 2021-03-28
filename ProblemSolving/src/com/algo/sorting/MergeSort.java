package com.algo.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {

    public List<Integer> mergeSort(List<Integer> input) {
        if(input.size() <= 1)
            return input;

        int midPoint = input.size()/2;

        List<Integer> leftSubList = input.subList(0,midPoint);
        List<Integer> rightSubList = input.subList(midPoint, input.size());
        List<Integer> result = new ArrayList<>();

        leftSubList = mergeSort(leftSubList);
        rightSubList = mergeSort(rightSubList);
        result.addAll(merge(leftSubList, rightSubList));

        return result;
    }

    private List<Integer> merge(List<Integer> leftSubList, List<Integer> rightSubList) {
        List<Integer> result = new ArrayList<>();
        int leftPtr, rightPtr;
        leftPtr = rightPtr = 0;

        while(leftPtr < leftSubList.size() || rightPtr<rightSubList.size()) {
            if(leftPtr < leftSubList.size() && rightPtr < rightSubList.size()) {
                if(leftSubList.get(leftPtr) < rightSubList.get(rightPtr)) {
                    result.add(leftSubList.get(leftPtr));
                    leftPtr++;
                } else {
                    result.add(rightSubList.get(rightPtr));
                    rightPtr++;
                }
            } else if(leftPtr < leftSubList.size()) {
                result.add(leftSubList.get(leftPtr));
                leftPtr++;
            } else if(rightPtr < rightSubList.size()) {
                result.add(rightSubList.get(rightPtr));
                rightPtr++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        MergeSort obj = new MergeSort();
        System.out.println(obj.mergeSort(new ArrayList<>(Arrays.asList(5,4,3,2,1))));
    }
}

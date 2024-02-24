package org.example.calculator;

import java.util.Arrays;

public class MedianCalculator {
    
    public static float calculateMedian(int[] nums) {
        var sortedNums = nums.clone();
        Arrays.sort(sortedNums);
        var sortedNumsHalfLength = sortedNums.length / 2;
        if (sortedNums.length % 2 == 0) {
            var leftMedian = sortedNums[sortedNumsHalfLength - 1];
            var rightMedian = sortedNums[sortedNumsHalfLength];
            return (leftMedian + rightMedian) * 0.5f;
        } else {
            return sortedNums[sortedNumsHalfLength];
        }
    }
}

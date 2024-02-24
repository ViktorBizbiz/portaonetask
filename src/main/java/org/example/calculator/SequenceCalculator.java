package org.example.calculator;

import java.util.ArrayList;
import java.util.List;

public class SequenceCalculator {
    
    public static List<Integer> calculateLargestIncreasingSequence(int[] nums) {
        return calculateLargestSequence(nums, true);
    }
    
    public static List<Integer> calculateLargestDecreasingSequence(int[] nums) {
        return calculateLargestSequence(nums, false);
    }
    
    private static List<Integer> calculateLargestSequence(int[] nums, boolean increasing) {
        var result = new ArrayList<Integer>();
        var temp = new ArrayList<Integer>();
        int prev, present = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                present = nums[i];
                continue;
            }
            prev = present;
            present = nums[i];
            if (temp.isEmpty()) {
                temp.add(prev);
            }
            if ((increasing && present > prev) || (!increasing && present < prev)) {
                temp.add(present);
                if (i == nums.length - 1 && result.size() < temp.size()) {
                    result.clear();
                    result.addAll(temp);
                }
            } else {
                if (result.size() < temp.size()) {
                    result.clear();
                    result.addAll(temp);
                }
                temp.clear();
            }
        }
        return result;
    }
}

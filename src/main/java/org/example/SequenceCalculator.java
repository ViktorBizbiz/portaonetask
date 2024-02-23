package org.example;

import java.util.ArrayList;
import java.util.List;

public class SequenceCalculator {
    
    public static List<Integer> calculateLargestIncreasingSequence(List<String> strings) {
        return calculateLargestSequence(strings, true);
    }
    
    public static List<Integer> calculateLargestDecreasingSequence(List<String> strings) {
        return calculateLargestSequence(strings, false);
    }
    
    private static List<Integer> calculateLargestSequence(List<String> strings, boolean increasing) {
        List<Integer> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        var nums = strings.stream()
                .filter(str -> !str.isBlank())
                .mapToInt(Integer::parseInt)
                .toArray();
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

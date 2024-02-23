package org.example;

import java.util.List;

public class MedianCalculator {
    
    public static float calculateMedian(List<String> strings) {
        float median;
        var sortedNums = strings.stream()
                .filter(str -> !str.isBlank())
                .mapToInt(Integer::parseInt)
                .sorted()
                .toArray();
        var sortedNumsHalfLength = sortedNums.length / 2;
        if (sortedNums.length % 2 == 0) {
            var leftMedian = sortedNums[sortedNumsHalfLength - 1];
            var rightMedian = sortedNums[sortedNumsHalfLength];
            median = (leftMedian + rightMedian) * 0.5f;
        } else {
            median = sortedNums[sortedNumsHalfLength];
        }
        return median;
    }
}

package org.example.calculator;

import org.example.util.ProgramResult;
import org.example.util.StringParser;

import java.util.List;

public class ResultCalculator {
    
    public static ProgramResult calculate(List<String> strings) {
        var statistics = StringParser.parseToIntSummaryStatistics(strings);
        
        var max = statistics.getMax();
        var min = statistics.getMin();
        var arithmeticMean = statistics.getAverage();
        
        var nums = StringParser.parseToIntList(strings);
        
        float median;
        List<Integer> largestIncreasingSequence;
        List<Integer> largestDecreasingSequence;
        switch (nums.length) {

            case 0 -> throw new RuntimeException("File should have at least 2 numbers");
            case 1 -> {
                median = nums[0];
                largestIncreasingSequence = List.of(nums[0]);
                largestDecreasingSequence = List.of(nums[0]);
            }
            default -> {
                median = MedianCalculator.calculateMedian(nums);
                
                largestIncreasingSequence = SequenceCalculator.calculateLargestIncreasingSequence(nums);
                largestDecreasingSequence = SequenceCalculator.calculateLargestDecreasingSequence(nums);
            }
        }
        
        return ProgramResult.builder()
                .max(max)
                .min(min)
                .arithmeticMean(arithmeticMean)
                .median(median)
                .largestIncreasingSequence(largestIncreasingSequence)
                .largestDecreasingSequence(largestDecreasingSequence)
                .build();
    }
}

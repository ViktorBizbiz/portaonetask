package org.example;

import org.example.util.StringParser;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


public class Main {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        var strings = Files.readAllLines(Path.of("10m.txt"));
        var statistics = StringParser.parseToIntSummaryStatistics(strings);
        
        var max = statistics.getMax();
        var min = statistics.getMin();
        var arithmeticMean = statistics.getAverage();
        
        var nums = StringParser.parseToIntList(strings);
        
        float median = MedianCalculator.calculateMedian(nums);
        
        var largestIncreasingSequence = SequenceCalculator.calculateLargestIncreasingSequence(nums);
        var largestDecreasingSequence = SequenceCalculator.calculateLargestDecreasingSequence(nums);
        
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Median: " + median);
        System.out.println("Arithmetic mean: " + arithmeticMean);
        System.out.println("Largest increasing sequence with size " + largestIncreasingSequence.size() + ": " + largestIncreasingSequence);
        System.out.println("Largest decreasing sequence with size " + largestDecreasingSequence.size() + ": " + largestDecreasingSequence);
        
        long end = System.currentTimeMillis();
        System.out.println("Execution time: " + (end - start) + " millis");
    }
    
}

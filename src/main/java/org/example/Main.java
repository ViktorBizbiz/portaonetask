package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


public class Main {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        var strings = Files.readAllLines(Path.of("10m.txt"));
        var nums = strings.stream()
                .filter(str -> !str.isBlank())
                .mapToInt(Integer::parseInt)
                .summaryStatistics();
        
        var max = nums.getMax();
        var min = nums.getMin();
        var arithmeticMean = nums.getAverage();
        
        float median = MedianCalculator.calculateMedian(strings);
        
        var largestIncreasingSequence = SequenceCalculator.calculateLargestIncreasingSequence(strings);
        var largestDecreasingSequence = SequenceCalculator.calculateLargestDecreasingSequence(strings);
        
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Median: " + median);
        System.out.println("Arithmetic mean: " + arithmeticMean);
        System.out.println("Largest increasing sequence with size " + largestIncreasingSequence.size() + ": " + largestIncreasingSequence);
        System.out.println("Largest decreasing sequence with size " + largestDecreasingSequence.size() + ": " + largestDecreasingSequence);
        
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
    
}

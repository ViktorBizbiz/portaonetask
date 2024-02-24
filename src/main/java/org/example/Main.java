package org.example;

import org.example.calculator.ResultCalculator;
import org.example.util.ProgramResult;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


public class Main {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        var strings = Files.readAllLines(Path.of("10m.txt"));
        var result = ResultCalculator.calculate(strings);
        
        printResult(result);
        
        long end = System.currentTimeMillis();
        System.out.println("Execution time: " + (end - start) + " millis");
    }
    
    private static void printResult(ProgramResult result) {
        System.out.println("Max: " + result.getMax());
        System.out.println("Min: " + result.getMin());
        System.out.println("Median: " + result.getMedian());
        System.out.println("Arithmetic mean: " + result.getArithmeticMean());
        System.out.println("Largest increasing sequence with size " + result.getLargestIncreasingSequence().size() + ": " + result.getLargestIncreasingSequence());
        System.out.println("Largest decreasing sequence with size " + result.getLargestDecreasingSequence().size() + ": " + result.getLargestDecreasingSequence());
    }
    
}

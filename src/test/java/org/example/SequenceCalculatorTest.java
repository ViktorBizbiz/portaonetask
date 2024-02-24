package org.example;

import org.example.calculator.SequenceCalculator;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SequenceCalculatorTest {
    
    private static final int[] DATA = new int[]{1, 2, 3, 5, 2, 22, 20, 21, 19, 14, 10};
    
    @Test
    void shouldReturnLargestIncreasingSequence() {
        // when
        var result = SequenceCalculator.calculateLargestIncreasingSequence(DATA);
        
        // then
        var expected = List.of(1, 2, 3, 5);
        assertEquals(expected, result);
    }
    
    @Test
    void shouldReturnLargestDecreasingSequence() {
        // when
        var result = SequenceCalculator.calculateLargestDecreasingSequence(DATA);
        
        // then
        var expected = List.of(21, 19, 14, 10);
        assertEquals(expected, result);
    }
}

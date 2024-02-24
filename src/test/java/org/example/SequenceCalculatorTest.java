package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SequenceCalculatorTest {
    
    @Test
    void shouldReturnLargestIncreasingSequence() {
        // given
        var nums = new int[]{1, 2, 3, 5, 2, 22, 20, 21, 19, 14, 10};
        
        // when
        var result = SequenceCalculator.calculateLargestIncreasingSequence(nums);
        
        // then
        var expected = List.of(1, 2, 3, 5);
        assertEquals(expected, result);
    }
    
    @Test
    void shouldReturnLargestDecreasingSequence() {
        // given
        var nums = new int[]{1, 2, 3, 5, 2, 22, 20, 21, 19, 14, 10};
        
        // when
        var result = SequenceCalculator.calculateLargestDecreasingSequence(nums);
        
        // then
        var expected = List.of(21, 19, 14, 10);
        assertEquals(expected, result);
    }
}

package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MedianCalculatorTest {
    
    @Test
    void shouldReturnHalfSumOfTwoMiddleNumsWhenNumsSizeIsEven() {
        // given
        var nums = List.of("10", "5", "2", "22");
        
        // when
        var result = MedianCalculator.calculateMedian(nums);
        
        // then
        var expected = 7.5f;
        assertEquals(expected, result);
    }
    
    @Test
    void shouldReturnMiddleNumberWhenNumsSizeIsOdd() {
        // given
        var nums = List.of("10", "5", "2", "22", "36");
        
        // when
        var result = MedianCalculator.calculateMedian(nums);
        
        // then
        var expected = 10;
        assertEquals(expected, result);
    }
}

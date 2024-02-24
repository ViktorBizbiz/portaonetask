package org.example.calculator;

import org.example.calculator.ResultCalculator;
import org.example.util.ProgramResult;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ResultCalculatorTest {
    
    @Test
    void shouldReturnExpectedResultWhenNumsLengthMoreThanOne() {
        // given
        var strings = List.of("4", "50");
        
        // when
        var result = ResultCalculator.calculate(strings);
        
        // then
        var expected = ProgramResult.builder()
                .max(50)
                .min(4)
                .median(27f)
                .arithmeticMean(27f)
                .largestIncreasingSequence(List.of(4, 50))
                .largestDecreasingSequence(List.of(4))
                .build();
        
        assertEquals(expected, result);
    }
    @Test
    void shouldReturnExpectedResultWhenNumsLengthEqualsOne() {
        // given
        var strings = List.of("4");
        
        // when
        var result = ResultCalculator.calculate(strings);
        
        // then
        var expected = ProgramResult.builder()
                .max(4)
                .min(4)
                .median(4f)
                .arithmeticMean(4f)
                .largestIncreasingSequence(List.of(4))
                .largestDecreasingSequence(List.of(4))
                .build();
        
        assertEquals(expected, result);
    }
    @Test
    void shouldThrowExceptionWhenNumsLengthEqualsZero() {
        // given
        var strings = new ArrayList<String>();
        var message = "File should have at least 2 numbers";
        
        // then
        assertThrows(RuntimeException.class, () -> ResultCalculator.calculate(strings));
    }
}

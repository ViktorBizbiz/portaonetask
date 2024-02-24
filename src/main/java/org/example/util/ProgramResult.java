package org.example.util;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
@Builder
public class ProgramResult {

    private int max;
    private int min;
    private double arithmeticMean;
    private float median;
    private List<Integer> largestIncreasingSequence;
    private List<Integer> largestDecreasingSequence;
}

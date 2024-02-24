package org.example.util;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.IntStream;

public class StringParser {
    
    public static IntSummaryStatistics parseToIntSummaryStatistics(List<String> strings) {
        return parseToIntWithoutWhiteSpaces(strings).summaryStatistics();
    }
    
    public static int[] parseToIntList(List<String> strings) {
        return parseToIntWithoutWhiteSpaces(strings).toArray();
    }
    
    private static IntStream parseToIntWithoutWhiteSpaces(List<String> strings) {
        return strings.stream()
                .filter(str -> !str.isBlank())
                .mapToInt(Integer::parseInt);
    }
    
}

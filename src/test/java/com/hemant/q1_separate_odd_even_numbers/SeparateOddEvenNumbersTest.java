package com.hemant.q1_separate_odd_even_numbers;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SeparateOddEvenNumbersTest {
    @Test
    void shouldPartitionMixedNumbers() {
        int[] arr = {1, 2, 3, 4, 5, 6};

        Map<Boolean, List<Integer>> result =
                SeparateOddEvenNumbers.partitionOddAndEven(arr);

        assertEquals(List.of(2, 4, 6), result.get(true));
        assertEquals(List.of(1, 3, 5), result.get(false));
    }

    @Test
    void shouldHandleEmptyArray() {
        int[] arr = {};

        Map<Boolean, List<Integer>> result =
                SeparateOddEvenNumbers.partitionOddAndEven(arr);

        assertEquals(List.of(), result.get(true));
        assertEquals(List.of(), result.get(false));
    }

    @Test
    void shouldHandleOnlyEvenNumbers() {
        int[] arr = {2, 4, 6, 8};

        Map<Boolean, List<Integer>> result =
                SeparateOddEvenNumbers.partitionOddAndEven(arr);

        assertEquals(List.of(2, 4, 6, 8), result.get(true));
        assertEquals(List.of(), result.get(false));
    }

    @Test
    void shouldHandleOnlyOddNumbers() {
        int[] arr = {1, 3, 5, 7};

        Map<Boolean, List<Integer>> result =
                SeparateOddEvenNumbers.partitionOddAndEven(arr);

        assertEquals(List.of(), result.get(true));
        assertEquals(List.of(1, 3, 5, 7), result.get(false));
    }

    @Test
    void shouldHandleSingleEvenNumber() {
        int[] arr = {2};

        Map<Boolean, List<Integer>> result =
                SeparateOddEvenNumbers.partitionOddAndEven(arr);

        assertEquals(List.of(2), result.get(true));
        assertEquals(List.of(), result.get(false));
    }

    @Test
    void shouldHandleSingleOddNumber() {
        int[] arr = {1};

        Map<Boolean, List<Integer>> result =
                SeparateOddEvenNumbers.partitionOddAndEven(arr);

        assertEquals(List.of(), result.get(true));
        assertEquals(List.of(1), result.get(false));
    }

    @Test
    void shouldHandleZero() {
        int[] arr = {0};

        Map<Boolean, List<Integer>> result =
                SeparateOddEvenNumbers.partitionOddAndEven(arr);

        assertEquals(List.of(0), result.get(true));
        assertEquals(List.of(), result.get(false));
    }

    @Test
    void shouldHandleNegativeNumbers() {
        int[] arr = {-1, -2, -3, -4};

        Map<Boolean, List<Integer>> result =
                SeparateOddEvenNumbers.partitionOddAndEven(arr);

        assertEquals(List.of(-2, -4), result.get(true));
        assertEquals(List.of(-1, -3), result.get(false));
    }

    @Test
    void shouldHandleDuplicateNumbers() {
        int[] arr = {1, 2, 2, 3, 4, 4};

        Map<Boolean, List<Integer>> result =
                SeparateOddEvenNumbers.partitionOddAndEven(arr);

        assertEquals(List.of(2, 2, 4, 4), result.get(true));
        assertEquals(List.of(1, 3), result.get(false));
    }

    @Test
    void shouldHandleIntegerBoundaryValues() {
        int[] arr = {
                Integer.MIN_VALUE,
                Integer.MAX_VALUE,
                0
        };

        Map<Boolean, List<Integer>> result =
                SeparateOddEvenNumbers.partitionOddAndEven(arr);

        assertEquals(
                List.of(Integer.MIN_VALUE, 0),
                result.get(true)
        );

        assertEquals(
                List.of(Integer.MAX_VALUE),
                result.get(false)
        );
    }

    /* For list input */

    @Test
    void shouldPartitionMixedNumbers_list() {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6);

        Map<Boolean, List<Integer>> result =
                SeparateOddEvenNumbers.partitionOddAndEven(list);

        assertEquals(List.of(2, 4, 6), result.get(true));
        assertEquals(List.of(1, 3, 5), result.get(false));
    }

    @Test
    void shouldHandleEmptyArray_list() {
        List<Integer> list = List.of();

        Map<Boolean, List<Integer>> result =
                SeparateOddEvenNumbers.partitionOddAndEven(list);

        assertEquals(List.of(), result.get(true));
        assertEquals(List.of(), result.get(false));
    }

    @Test
    void shouldHandleOnlyEvenNumbers_list() {
        List<Integer> list = List.of(2, 4, 6, 8);

        Map<Boolean, List<Integer>> result =
                SeparateOddEvenNumbers.partitionOddAndEven(list);

        assertEquals(List.of(2, 4, 6, 8), result.get(true));
        assertEquals(List.of(), result.get(false));
    }

    @Test
    void shouldHandleOnlyOddNumbers_list() {
        List<Integer> list = List.of(1, 3, 5, 7);

        Map<Boolean, List<Integer>> result =
                SeparateOddEvenNumbers.partitionOddAndEven(list);

        assertEquals(List.of(), result.get(true));
        assertEquals(List.of(1, 3, 5, 7), result.get(false));
    }

    @Test
    void shouldHandleSingleEvenNumber_list() {
        List<Integer> list = List.of(2);

        Map<Boolean, List<Integer>> result =
                SeparateOddEvenNumbers.partitionOddAndEven(list);

        assertEquals(List.of(2), result.get(true));
        assertEquals(List.of(), result.get(false));
    }

    @Test
    void shouldHandleSingleOddNumber_list() {
        List<Integer> list = List.of(1);

        Map<Boolean, List<Integer>> result =
                SeparateOddEvenNumbers.partitionOddAndEven(list);

        assertEquals(List.of(), result.get(true));
        assertEquals(List.of(1), result.get(false));
    }

    @Test
    void shouldHandleZero_list() {
        List<Integer> list = List.of(0);

        Map<Boolean, List<Integer>> result =
                SeparateOddEvenNumbers.partitionOddAndEven(list);

        assertEquals(List.of(0), result.get(true));
        assertEquals(List.of(), result.get(false));
    }

    @Test
    void shouldHandleNegativeNumbers_list() {
        List<Integer> list = List.of(-1, -2, -3, -4);

        Map<Boolean, List<Integer>> result =
                SeparateOddEvenNumbers.partitionOddAndEven(list);

        assertEquals(List.of(-2, -4), result.get(true));
        assertEquals(List.of(-1, -3), result.get(false));
    }

    @Test
    void shouldHandleDuplicateNumbers_list() {
        List<Integer> list = List.of(1, 2, 2, 3, 4, 4);

        Map<Boolean, List<Integer>> result =
                SeparateOddEvenNumbers.partitionOddAndEven(list);

        assertEquals(List.of(2, 2, 4, 4), result.get(true));
        assertEquals(List.of(1, 3), result.get(false));
    }

    @Test
    void shouldHandleIntegerBoundaryValues_list() {
        List<Integer> list = List.of(
                Integer.MIN_VALUE,
                Integer.MAX_VALUE,
                0);

        Map<Boolean, List<Integer>> result =
                SeparateOddEvenNumbers.partitionOddAndEven(list);

        assertEquals(
                List.of(Integer.MIN_VALUE, 0),
                result.get(true)
        );

        assertEquals(
                List.of(Integer.MAX_VALUE),
                result.get(false)
        );
    }
}

package com.hemant.q1_separate_odd_even_numbers;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SeparateOddEvenNumbers {


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);

        System.out.println(partitionOddAndEven(arr));
        System.out.println(partitionOddAndEven(list));
    }

    public static Map<Boolean, List<Integer>> partitionOddAndEven(int[] arr){
        return Arrays.stream(arr).boxed().collect(Collectors.partitioningBy(num-> num % 2 == 0));
    }

    public static Map<Boolean, List<Integer>> partitionOddAndEven(List<Integer> list){
        return list.stream().collect(Collectors.partitioningBy(num-> num % 2 ==0));
    }
}

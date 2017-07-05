package com.java8.stream;

import java.util.Arrays;
import java.util.List;

/**
 * Created by himanshu.kapoor on 2017-07-03.
 */
public class ReduceOperation {
    public static void main(String st[]) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        int multiplication = numbers.stream().reduce(1, (a,b) -> a * b);
        System.out.print(multiplication);
    }
}

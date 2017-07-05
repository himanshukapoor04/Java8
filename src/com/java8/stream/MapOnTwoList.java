package com.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by himanshu.kapoor on 2017-07-03.
 */
public class MapOnTwoList {

    public static void main(String st[]) {
        List<Integer> list1 = Arrays.asList(1,2,3,4);
        List<Integer> list2 = Arrays.asList(6,7);
        List<int[]> ints = list1.stream().flatMap(i -> list2.stream().filter(j -> (i + j) % 3  == 0).map(j -> new int[] {i , j})).collect(Collectors.toList());
        ints.stream().forEach(ints1 -> System.out.println("{ " + ints1[0] + "," + ints1[1]+"}"));
    }
}

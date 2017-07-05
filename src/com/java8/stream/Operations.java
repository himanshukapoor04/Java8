package com.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Created by himanshu.kapoor on 6/15/2017.
 */
public class Operations {
    public static void main(String st[]) {
        List<String> words = Arrays.asList("Hello", "World");
        List<String> strings = words.stream().map((String s) -> s.split("")).flatMap(Arrays::stream).distinct().collect(Collectors.toList());

        List<Integer> intList = Arrays.asList(1,2,3,4,5);
        List<Integer> ins = intList.stream().map((Integer i) -> i * i).collect(Collectors.toList());
        ins.stream().forEach(System.out::println);

        List<Integer> list1 = Arrays.asList(1,2,3);
        List<Integer> list2 = Arrays.asList(3,4);
        list1.stream().flatMap(integer -> list2.stream().filter(j ->  (integer + j) %3 == 0).map(j -> new int[] {integer,j})).collect(Collectors.toList()).forEach(ints -> {
            System.out.println("{"+ints[0]+","+ints[1]+"}");
        });

    }
}

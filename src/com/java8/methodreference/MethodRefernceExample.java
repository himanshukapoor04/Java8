package com.java8.methodreference;

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by himanshu.kapoor on 6/15/2017.
 */
public class MethodRefernceExample {
    public static void main(String st[]) {
        List<String> values = Arrays.asList("d","b","a","c");
        System.out.print(values);
        values.sort(String::compareTo);

        System.out.println(values.toString());

        Function<String, Integer> stringToInteger =
                Integer::parseInt;
        List<String> valueInts = Arrays.asList("1","2","3","4","5");
        List<Integer> integers = valueInts.stream().map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> ints = integers.stream().filter(i -> i instanceof Integer ).collect(Collectors.toList());
        if(ints.equals(integers)) {
            System.out.println("Lists are equal");
        }


        BiPredicate<List<String>, String> contains =
                List::contains;
    }
}

package com.java8.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by himanshu.kapoor on 6/15/2017.
 */
public class AppleInventoryTester {

    public static void main(String st[]) {
        List<Apple> apples = new ArrayList<>();
        List<Integer> ints = Arrays.asList(1,2,3,4,5,6,7,8,9);
        for(Integer i : ints) {
            apples.add(new Apple(i));
        }
        apples.sort((a1,a2) -> a1.getWeight().compareTo(a2.getWeight()));
        apples.sort(Comparator.comparing((apple -> apple.getWeight())));
        apples.sort(Comparator.comparing(Apple::getWeight));

        apples.stream().forEach(apple -> System.out.println(apple.toString()));

    }


}

package com.java8.constructorreference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * Created by himanshu.kapoor on 6/15/2017.
 */
public class MainAppleConstructorRefernce {

    public static void main(String st[]) {
        List<Integer> weights = Arrays.asList(10,4,5,7,1);
        List<Apple> apples = map(weights, Apple::new);
        apples.stream().forEach(apple ->  System.out.println(apple.toString()));
    }

    public static List<Apple> map(List<Integer> list, Function<Integer, Apple> function) {
        List<Apple> apples = new ArrayList<>();
        for(Integer i : list) {
            apples.add(function.apply(i));
        }
        return  apples;
    }
}

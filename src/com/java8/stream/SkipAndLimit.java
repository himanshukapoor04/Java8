package com.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by himanshu.kapoor on 2017-06-29.
 */
public class SkipAndLimit {

    public static void main(String st[]) {
        Dish dish1 = new Dish("Curry", DishType.VEG, 10L);
        Dish dish2 = new Dish("Chicken Curry", DishType.NONVEG, 20L);
        Dish dish3 = new Dish("Salad", DishType.VEGAN, 15L);
        List<Dish> dishes = Arrays.asList(dish1, dish2, dish3);

        if(dishes.stream().filter(dish ->  dish.getPrice() > 10).collect(Collectors.toList()).size() == 2) {
            System.out.println("Size is 2");
        }

        if(dishes.stream().filter(dish -> dish.getPrice() > 10).limit(1).collect(Collectors.toList()).size() == 1) {
            System.out.println("Size is 1");
        }

        if(dishes.stream().filter(Dish::isVegetarian).collect(Collectors.toList()).size() == 2) {
            System.out.println("Got all the vegetarian dishes");
        }

        List<Dish> veganDish = dishes.stream().filter(Dish::isVegetarian).skip(1).collect(Collectors.toList());
        if(veganDish.size() == 1) {
            veganDish.stream().forEach(System.out::println);
        }






    }
}

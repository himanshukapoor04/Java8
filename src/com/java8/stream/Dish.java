package com.java8.stream;

/**
 * Created by himanshu.kapoor on 2017-06-29.
 */
public class Dish {
    private String name;
    private DishType dishType;
    private Long price;

    public Dish(String name, DishType dishType, Long price) {
        this.name = name;
        this.dishType = dishType;
        this.price = price;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DishType getDishType() {
        return dishType;
    }

    public void setDishType(DishType dishType) {
        this.dishType = dishType;
    }

    public boolean isVegetarian() {
        return dishType != DishType.NONVEG;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", dishType=" + dishType +
                ", price=" + price +
                '}';
    }
}

enum DishType {
    VEG, NONVEG, VEGAN;
}

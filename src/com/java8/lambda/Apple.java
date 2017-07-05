package com.java8.lambda;

/**
 * Created by himanshu.kapoor on 6/15/2017.
 */
public class Apple {

    private String color;
    private Integer weight;

    public Apple() {

    }

    public Apple(String color) {
        this.color = color;
    }

    public Apple(int weight) {
        this.weight = weight;
    }

    public Apple(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}

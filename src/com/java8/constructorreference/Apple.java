package com.java8.constructorreference;

/**
 * Created by himanshu.kapoor on 6/15/2017.
 */
public class Apple {
    private String color;
    private int weight;
    private int identifier;

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

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}

package com.java8.domain;

/**
 * Created by himanshu1920 on 04-07-2017.
 */
public class Transaction {
    private int value;
    private int year;
    private String city;
    private String name;

    public Transaction() {
    }

    public Transaction(int value, int year, String city, String name) {
        this.value = value;
        this.year = year;
        this.city = city;
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "value=" + value +
                ", year=" + year +
                ", city=" + city +
                ", name=" + name +
                '}';
    }
}

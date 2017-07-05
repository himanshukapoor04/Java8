package com.java8.function;

/**
 * Created by himanshu.kapoor on 6/15/2017.
 */
public class Letter {

    public static String addHeader(String text) {
        return "From Himanshu "+ text;
    }

    public static String addFooter(String text) {
        return text + "Kind regards";
    }

    public static String checkSpelling(String text) {
        return text.replaceAll("labda", "lambda");
    }

}

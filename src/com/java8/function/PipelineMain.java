package com.java8.function;

import java.util.function.Function;

/**
 * Created by himanshu.kapoor on 6/15/2017.
 */
public class PipelineMain {

    public static void main(String st[]) {
        Function<String,String> addHeader = Letter::addHeader;
        Function<String, String> transformationChain = addHeader.andThen(Letter::checkSpelling).andThen(Letter::addFooter);
        String s = "labda";
        System.out.print(transformationChain.apply(s));
    }
}

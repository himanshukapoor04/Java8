package com.java8.functionalinterface.main;

import com.java8.functionalinterface.finterface.StringProcessor;

import java.util.Arrays;
import java.util.List;

/**
 * Created by himanshu.kapoor on 6/15/2017.
 */
public class MainClass {

    private static List<String> strings = Arrays.asList("Himanshu", "Kapoor");
    public static void main(String st[]) {
        System.out.println(processString(((s) -> "1 " + s), strings.get(0) ));
        System.out.println(processString(((s) -> "2 " + s), strings.get(1) ));

    }

    public static String processString(StringProcessor processor, String input) {
        return processor.process(input);
    }
}

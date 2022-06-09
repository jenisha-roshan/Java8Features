package com.example.java8features;

import java.util.function.Function;

public class FunctionDemo {

    public static void main(String[] args) {

        Function<Integer,String> number = num -> num * 10 + " is a num divisible by 10";
        System.out.println(number.apply(23));

    }

}

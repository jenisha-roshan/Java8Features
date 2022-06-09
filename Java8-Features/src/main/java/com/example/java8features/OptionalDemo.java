package com.example.java8features;

import java.util.Optional;
public class OptionalDemo {

    public static void main(String[] args)
    {
       Optional<String> empty = Optional.ofNullable("Jenisha ");
        String ifNull = empty
                .map(String::toUpperCase)
                .orElse("Hey Guys!!!!");
        System.out.println(ifNull);
    }

}




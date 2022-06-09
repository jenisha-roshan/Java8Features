package com.example.java8features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {

    public static void main(String[] args) {

        List<String> cities = Arrays.asList("Tuty", "Chennai", "Paris","London","San Francisco", "Spain");
        Predicate<String> cityStartsWithS = str -> str.startsWith("S");
        cities
                .stream()
                .filter(cityStartsWithS)
                .forEach(System.out::println);
        Predicate<String> lengthGreaterThan = str -> str.length() >= 6;
        System.out.println(lengthGreaterThan.test("J"));

        cities.stream()
                .filter(cityStartsWithS.and(lengthGreaterThan))
                .forEach(System.out::println);
    }
}

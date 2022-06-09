package com.example.java8features;
import java.util.Arrays;
import java.util.List;

public class Stream {

    public static void main(String[] args) {
        List<String> vehicles = Arrays.asList("bus", "car", "bicycle", "flight", "train");
        vehicles
                .stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}

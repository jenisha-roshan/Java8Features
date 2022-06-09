package com.example.java8features;

import java.util.Arrays;
import java.util.List;

public class MethodReference {

    public static void main(String[] args){
        List<String> names = Arrays.asList("Jen","Aswin","Shiny","Sarah");
        names.forEach(System.out::println);
    }

}


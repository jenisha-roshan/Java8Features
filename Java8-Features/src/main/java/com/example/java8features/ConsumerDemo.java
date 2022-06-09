package com.example.java8features;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

    public static void main(String[] args){
        List<String> names = Arrays.asList("Jen","Aswin","Shiny","Sarah");

//    traditional inner class
//        names.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String item) {
//                System.out.println(item);
//            }
//        });

//        using lambda
//        names.forEach(item -> System.out.println(item));

//        method reference
        Consumer<String> println = System.out::println;

        names.forEach(println);

    }

}


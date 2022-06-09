package com.example.java8features;

import java.util.Optional;
import java.util.function.DoubleSupplier;
import java.util.function.Supplier;

public class SupplierDemo {

    public static void main(String[]args){
        Supplier<Double> randomSupplier1 = () -> Math.random();
        DoubleSupplier randomSupplier2 = () -> Math.random();

        System.out.println(randomSupplier2.getAsDouble());
        System.out.println(randomSupplier1.get());

        Optional<Double> empty = Optional.empty();
        System.out.println(empty.orElseGet(randomSupplier1));
    }
}

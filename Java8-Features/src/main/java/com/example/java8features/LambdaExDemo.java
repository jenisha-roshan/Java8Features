package com.example.java8features;


interface InterfaceShow {
    void show();
}

public class LambdaExDemo {
    public static void main(String[] args)
    {
        InterfaceShow obj2 = () -> System.out.println("Hey Team!!");
        obj2.show();
    }

}


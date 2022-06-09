package com.example.java8features;


interface Phone{

    void ring();
    default void alert(){
        System.out.println("Phone alert!!");
    }

}

class AndroidPhone implements Phone {
    @Override
    public void ring() {
        System.out.println("Phone rings!");
    }

}
public class DefaultMethod {

    public static void main(String[] args){

        Phone p = new AndroidPhone();
        p.ring();
        p.alert();

    }

}

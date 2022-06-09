package com.example.java8features;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIDemo {

    public static void main(String[] args) {
        List<Person> people = getPeople();

        // Imperative approach ❌

//    List<Person> females = new ArrayList<>();
//
//    for (Person person : people) {
//
//      if (person.getGender().equals(Gender.FEMALE)) {
//        females.add(person);
//      }
//    }
//
//    females.forEach(System.out::println);



        // Declarative approach ✅

        // Filter
        List<Person> females = people
                .stream()
                .filter(person -> person.getGender().equals(Gender.FEMALE))
                .collect(Collectors.toList());

//    females.forEach(System.out::println);

        // Sort
        List<Person> sorted = people.stream()
                .sorted(Comparator.comparing(Person::getAge))
                .collect(Collectors.toList());
        sorted.forEach(System.out::println);

    }

    private static List<Person> getPeople() {
        return List.of(
                new Person("Antonio", 20, Gender.MALE),
                new Person("Alina Smith", 33, Gender.FEMALE),
                new Person("Helen White", 57, Gender.FEMALE),
                new Person("Alex Boz", 14, Gender.MALE),
                new Person("Jamie Goa", 99, Gender.MALE),
                new Person("Anna Cook", 7, Gender.FEMALE),
                new Person("Zelda Brown", 120, Gender.FEMALE)
        );
    }

}
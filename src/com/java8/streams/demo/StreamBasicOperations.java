package com.java8.streams.demo;

import java.util.List;

/**
 * Created by JNiroshan on 4/20/2017.
 */
public class StreamBasicOperations
{

  public static void main(String[] args){

    List<Person> personList = StreamGenerator.getPeople();

    //People whose their name starts with A
    personList.stream()
        .filter((p) -> p.getFirstName().startsWith("A"))
        .forEach(person -> System.out.println(person));
    System.out.println("----------------------------------------------");

    //print only first names
    personList.stream()
        .map(person -> person.getFirstName())
        .forEach(s -> System.out.println(s));
    System.out.println("----------------------------------------------");

    //print only first names of female persons
    personList.stream()
        .filter(person -> person.getGender() == Person.Gender.FEMALE)
        .map(person -> person.getFirstName())
        .forEach(name -> System.out.println(name));
    System.out.println("----------------------------------------------");

    //count male persons
    long counter = personList.stream()
        .filter(person -> person.getGender() == Person.Gender.MALE)
        .count();
    System.out.println(counter);
    System.out.println("----------------------------------------------");


  }

}

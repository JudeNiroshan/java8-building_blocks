package com.java8.streams.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by JNiroshan on 4/20/2017.
 */
public class StreamGenerator
{

  public static void main(String[] args){

    Stream<String> emptyStream = Stream.empty();

    Stream<String> studentsInClass = Stream.of("Jude", "Alan", "Tharaka", "Perera");
    System.out.println(studentsInClass);
    System.out.println("----------------------------------------------");

    List<Person> personList = getPeople();
    //All persons
    personList.stream().forEach( person -> System.out.println(person));
    System.out.println("----------------------------------------------");

    //Print first 5 even numbers starting from 0
    Stream.iterate(0 , integer -> integer + 2)
        .limit(5)
        .forEach(no -> System.out.println(no));
    System.out.println("----------------------------------------------");



  }

  public static List<Person> getPeople(){
    List<Person> persons = new ArrayList<Person>();
    persons.add(new Person("James", "Goslin", Person.Gender.MALE, 42));
    persons.add(new Person("Abraham", "Lincoln", Person.Gender.MALE, 40));
    persons.add(new Person("Marie", "Curie", Person.Gender.FEMALE, 24));
    persons.add(new Person("Jane", "Fernando", Person.Gender.FEMALE, 16));
    persons.add(new Person("Alan", "Grey", Person.Gender.FEMALE, 12));
    return persons;
  }

}

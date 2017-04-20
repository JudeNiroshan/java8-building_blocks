package com.java8.streams.demo;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by JNiroshan on 4/20/2017.
 */
public class StreamToCollections
{

  public static void main(String[] args){


    List<Person> personList = StreamGenerator.getPeople();

    //List all children, under 18
    List<Person> children = personList.stream()
                              .filter(person -> person.getAge() < 18)
                              .collect(Collectors.toList());
    System.out.println(children);
    System.out.println("----------------------------------------------");


    //Map by the firstName to Person object
    Map<String, List<Person>> peopleByFirstName = personList.stream()
                                                      .collect(Collectors.groupingBy(o -> o.getFirstName()));
    System.out.println(peopleByFirstName);
    System.out.println("----------------------------------------------");



  }
}

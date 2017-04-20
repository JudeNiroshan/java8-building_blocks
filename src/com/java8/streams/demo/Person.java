package com.java8.streams.demo;

/**
 * Created by JNiroshan on 4/20/2017.
 */
public class Person
{

  public enum Gender{
    MALE,FEMALE
  }

  private String firstName;
  private String lastName;
  private Gender gender; //Male - 1, Female - 0
  private int age = 0;

  public Person(String firstName, String lastName, Gender gender, int age)
  {
    this.firstName = firstName;
    this.lastName = lastName;
    this.gender = gender;
    this.age = age;
  }

  @Override
  public String toString()
  {
    return "Person{" +
        "firstName='" + firstName + '\'' +
        ", lastName='" + lastName + '\'' +
        ", gender=" + gender +
        '}';
  }

  public String getFirstName()
  {
    return firstName;
  }

  public void setFirstName(String firstName)
  {
    this.firstName = firstName;
  }

  public String getLastName()
  {
    return lastName;
  }

  public void setLastName(String lastName)
  {
    this.lastName = lastName;
  }

  public Gender getGender()
  {
    return gender;
  }

  public void setGender(Gender gender)
  {
    this.gender = gender;
  }

  public int getAge()
  {
    return age;
  }

  public void setAge(int age)
  {
    this.age = age;
  }
}

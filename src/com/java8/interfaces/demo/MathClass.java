package com.java8.interfaces.demo;

import java.util.Scanner;

/**
 * Created by JNiroshan on 4/20/2017.
 */
public class MathClass
{

  public static void main(String[] args)
  {

    Scanner console = new Scanner(System.in);
    System.out.print("Please enter 2 numbers:");
    int no1 = console.nextInt();
    int no2 = console.nextInt();


    Formula formulaAnonymousInnerClass = new Formula()
    {
      @Override
      public int calculate(int number1, int number2)
      {
        return number1 + number2;
      }
    };
    int result = formulaAnonymousInnerClass.calculate(no1, no2);
    System.out.println("Formular answer(formulaAnonymousInnerClass) = " + result);


    //Lambda with data types, return statement & curly brances
    Formula formulaLambda = (int number1, int number2) ->
    {
      return number1 * number2;
    };
    result = formulaLambda.calculate(no1, no2);
    System.out.println("Formular answer(formulaLambda) = " + result);


    //curly braces can be omitted for single line methods
    //return statement cannot apply without curly braces
    Formula formulaLambdaSimplified = (number1, number2) -> number1 / number2;
    result = formulaLambdaSimplified.calculate(no1, no2);
    System.out.println("Formular answer(formulaLambdaSimplified) = " + result);


    //Using default methods in interface
    //You can use any instance of Formula to access default methods
    //E.g.: formulaAnonymousInnerClass/ formulaLambda/ formulaLambdaSimplified
    result = formulaLambdaSimplified.getRandomNumber();
    System.out.println("Formular random number = " + result);


    //Using static method in interface
    result = Formula.getLuckyNumber();
    System.out.println("Formular lucky number = " + result);
  }

}

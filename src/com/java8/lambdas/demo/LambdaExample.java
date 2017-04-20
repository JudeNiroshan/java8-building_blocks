package com.java8.lambdas.demo;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * Created by JNiroshan on 4/20/2017.
 */
public class LambdaExample
{

  private static Predicate<String> predicateCheckLength = s -> s.length() > 0;

  private static Predicate<String> predicateIsEmpty = s -> s.isEmpty();
  //Predicate<String> predicateIsEmpty = String::isEmpty;

  private static Function<String, Integer> stringTransformer = s -> vowelsCounter(s);

  private static Supplier<Bottle> bottleSupplier = () -> new Bottle();

  private static Consumer<Bottle> bottleConsumer = bottle -> bottle.drink();

  public static void main(String[] args)
  {

    Scanner console = new Scanner(System.in);
    System.out.println("Please enter your secret here:");
    String secret = console.nextLine();

    boolean isValidSecret = checkInput(secret);

    if (isValidSecret)
    {
      System.out.println("We'll keep it safe");
      bottleSupplier = () -> new Bottle("juice", "you", 15);
    }
    else
    {
      System.out.println("Not a secret");
    }

    Integer vowelsCount = stringTransformer.apply(secret);
    System.out.println("Number of vowel letters in your secret : " + vowelsCount);

    Bottle bottle = bottleSupplier.get();
    System.out.println(bottle);

    bottleConsumer.accept(bottle);
    System.out.println(bottle);
  }

  private static boolean checkInput(String inputString)
  {
    return predicateCheckLength.and(predicateIsEmpty.negate()).test(inputString);
  }

  private static Integer vowelsCounter(String string)
  {
    List<Character> vowels = Arrays.asList(new Character[] { 'a', 'e', 'i', 'o', 'u' });
    char[] letters = string.toCharArray();
    Integer count = new Integer(0);

    for (char c : letters)
    {
      if (vowels.contains(c))
      {
        count++;
      }
    }
    return count;
  }
}

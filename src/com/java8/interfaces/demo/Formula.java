package com.java8.interfaces.demo;

/**
 * Created by JNiroshan on 4/20/2017.
 */

@FunctionalInterface
public interface Formula
{

  int calculate(int number1, int number2);

  default int getRandomNumber()
  {
    return (int) (Math.random()*10);
  }

  static int getLuckyNumber()
  {
    return 7;
  }
}

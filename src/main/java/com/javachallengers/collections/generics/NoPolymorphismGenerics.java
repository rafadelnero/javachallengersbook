package com.javachallengers.collections.generics;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class NoPolymorphismGenerics {

  public static void main(String[] args) {
    // List<Number> list = new ArrayList<Integer>(); Doesn't compile
    List<Integer> intNumbers = new ArrayList<>();
    intNumbers.add(7);
    printNumbers(intNumbers);
    addNumbers();
  }

  public static void printNumbers(List<? extends Number> numbers) {
    numbers.forEach(System.out::println);
  }

  public static void addNumbers() {
    List<Number> numbers = new ArrayList<>();
    numbers.add(Integer.valueOf("7"));
    numbers.add(BigDecimal.TEN);
    numbers.add(Long.valueOf("7"));
    numbers.add(Double.valueOf("7"));
  }

}

package com.javachallengers.collections.generics;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class UpperUnboundedGenerics {
  public static void main(String[] args) {
    List<Integer> intNumbers = new ArrayList<>();
    intNumbers.add(7);
    printNumbers(intNumbers);

    List<BigDecimal> decimalNumbers = new ArrayList<>();
    decimalNumbers.add(BigDecimal.TEN);
    printNumbers(decimalNumbers);
  }
  static void printNumbers(List<? extends Number> numbers) {
    numbers.forEach(System.out::println);
  }
}

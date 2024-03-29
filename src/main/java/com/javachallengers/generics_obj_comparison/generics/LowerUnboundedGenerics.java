package com.javachallengers.generics_obj_comparison.generics;

import java.util.ArrayList;
import java.util.List;

public class LowerUnboundedGenerics {
  public static void main(String[] args) {
    List<Number> numbers = new ArrayList<>();
    numbers.add(7.0);
    numbers.add(3.0);
    List<? super Double> result = addNumbers(numbers);
    System.out.println(result);
  }

  static List<? super Double> addNumbers(List<? super Double> numbers) {
    numbers.add(1.0);
    return numbers;
  }
}

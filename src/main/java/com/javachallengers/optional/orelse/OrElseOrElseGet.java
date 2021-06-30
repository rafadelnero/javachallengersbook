package com.javachallengers.optional.orelse;

import java.util.Optional;

public class OrElseOrElseGet {

  public static void main(String[] args) {
//    orElseExample();
    orElseGetExample();
  }

  private static void orElseExample() {
    Optional<String> optYoshiFood = Optional.of("Apple");
    String yoshiFood = optYoshiFood.orElse("No food :(");
    System.out.println(yoshiFood);
  }

  static void orElseGetExample() {
    Optional<String> optYoshiFood = Optional.empty();
    String yoshiFood = optYoshiFood.orElseGet(OrElseOrElseGet::askFoodWhenNoFoodForYoshi);
    System.out.println(yoshiFood);
  }

  static String askFoodWhenNoFoodForYoshi() {
    String noFoodForYoshi = "No food :(";
    String askMoreForMario = " Mario needs to get more food!";
    return noFoodForYoshi.concat(askMoreForMario);
  }
}

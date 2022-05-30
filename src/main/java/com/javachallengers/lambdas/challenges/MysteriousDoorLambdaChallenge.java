package com.javachallengers.lambdas.challenges;

import java.util.Arrays;
import java.util.List;

public class MysteriousDoorLambdaChallenge {

  public static void main(String... theDoors) {
    int doorNumber = 0;
    doorNumber++;
    List<String> doors = Arrays.asList("A", "B", "C");
    doors.forEach(e -> {
//      System.out.println(e + doorNumber);   // # Line 11 - Compilation error here
    });
  }

}

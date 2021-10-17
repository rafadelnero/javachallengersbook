package com.javachallengers.generics_obj_comparison.generics;

public class UpperboundGenerics {

  public static void main(String[] args) {
    String upperBound = concatString("upperBound");
    System.out.println(upperBound);
  }

  static <T extends String> String concatString(T t) {
    return t.concat("Generics");
  }

}

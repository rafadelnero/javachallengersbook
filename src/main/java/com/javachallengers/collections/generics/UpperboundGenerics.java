package com.javachallengers.collections.generics;

public class UpperboundGenerics {

  public static void main(String[] args) {
    concatString("upperBound");
  }

  static <T extends String> String concatString(T t) {
    return t.concat("Generics");
  }

}

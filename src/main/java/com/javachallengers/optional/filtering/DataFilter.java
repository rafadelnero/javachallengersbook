package com.javachallengers.optional.filtering;

import java.util.Optional;

public class DataFilter {

  public static void main(String[] args) {
    String simpsonName = "Homer";
    Optional<String> optSimpsonName = Optional.of(simpsonName);

    boolean isHomer = optSimpsonName.filter(s -> s == "Homer").isPresent();
    System.out.println(isHomer);

    boolean isMarge = optSimpsonName.filter(s -> s == "Marge").isEmpty();
    System.out.println(isMarge);
  }

}

package com.javachallengers.optional.datamap;

import java.util.Optional;

public class SimpsonMapFilter {

  public static void main(String[] args) {
    Optional<String> optSimpson = Optional.of("homer simpson");

    boolean isSimpson = optSimpson
        .map(String::toUpperCase)
        .filter(simpsonName -> simpsonName.equals("HOMER SIMPSON"))
        .isPresent();

    System.out.println(isSimpson);
  }

}

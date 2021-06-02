package com.javachallengers.optional.ifpresent;

import java.util.Optional;

public class IfPresent {

  public static void main(String[] args) {
    // Old way
    String javaMascotNoOpt = "Duke";
    if (javaMascotNoOpt != null) {
      System.out.println(javaMascotNoOpt.concat(" Rocks"));
    }

    // With Optional
    Optional<String> opt = Optional.ofNullable("Duke");
    opt.ifPresent(javaMascot -> System.out.println(javaMascot.concat(" Rocks")));
  }

}

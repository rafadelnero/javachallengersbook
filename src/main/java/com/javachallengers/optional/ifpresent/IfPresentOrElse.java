package com.javachallengers.optional.ifpresent;

import java.util.Optional;

public class IfPresentOrElse {

  public static void main(String[] args) {
    Optional<String> javaMascotOpt = Optional.ofNullable("Duke");

    javaMascotOpt.ifPresentOrElse(
        (value) -> System.out.println("The Java mascot is: " + value),
        () -> System.out.println("No Java Mascot")
    );

    Optional<String> javaMascotOptEmpty = Optional.ofNullable(null);

    javaMascotOptEmpty.ifPresentOrElse(
        System.out::println,
        () -> System.out.println("No Java Mascot")
    );
  }

}

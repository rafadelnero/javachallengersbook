package com.javachallengers.optional.orelsethrow;

import java.util.Optional;

public class HomerBeer {

  public static void main(String[] args) {
    String noBeerForHomer = null;

    // orElseThrow with Lambda
    Object homer = Optional.ofNullable(noBeerForHomer)
        .orElseThrow(() -> new IllegalArgumentException("D'oh!"));

    // orElseThrow with Method Reference
    homer = Optional.ofNullable(noBeerForHomer)
        .orElseThrow(IllegalArgumentException::new);

    homer = Optional.ofNullable(noBeerForHomer)
        .orElseThrow(NoBeerException::new);

    // Java 10 orElseThrow
    homer = Optional.ofNullable(noBeerForHomer).orElseThrow();
  }

  static class NoBeerException extends RuntimeException {
    public NoBeerException(){
      super("D'oh!");
    }
  }
}

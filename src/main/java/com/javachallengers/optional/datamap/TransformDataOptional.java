package com.javachallengers.optional.datamap;

import java.util.List;
import java.util.Optional;

public class TransformDataOptional {

  public static void main(String[] args) {
    List<String> simpsonNames = List.of(
        "Homer", "Marge", "Bart", "Maggie", "Lisa");
    Optional<List<String>> simpsons = Optional.of(simpsonNames);

    int size = simpsons
        .map(List::size)
        .orElse(0);

    System.out.println(size);

    Optional<String> simpsonName = Optional.ofNullable("Homer");
    String name = simpsonName.map(s -> s.concat(" Simpson")).orElse("");

    System.out.println(name);
  }

}

package com.javachallengers.optional.filtering;

import java.util.Optional;

public class SimpsonCheck {

  public static boolean isHomerWithoutOptional(Simpson simpson) {
    boolean isHomer = false;
    if (simpson != null && simpson.name.equals("Homer") && simpson.age >= 34 &&
      simpson.age <= 39) {
      isHomer = true;
    }
    return isHomer;
  }

  public static boolean isHomerWithOptional(Simpson simpson) {
    Optional<Simpson> optSimpson = Optional.ofNullable(simpson);

    return optSimpson.filter(s -> s.getName().equals("Homer"))
        .map(Simpson::getAge)
        .filter(age -> age >= 34 && age <= 39)
        .isPresent();
  }

  public static void main(String[] args) {
    System.out.println(isHomerWithoutOptional(new Simpson("Bart", 10)));
    System.out.println(isHomerWithOptional(new Simpson("Homer", 34)));
    System.out.println(isHomerWithOptional(null));
  }

  static class Simpson {
    String name;
    int age;

    public Simpson(String name, int age) {
      this.name = name;
      this.age = age;
    }

    public String getName() {
      return name;
    }

    public int getAge() {
      return age;
    }
  }

}

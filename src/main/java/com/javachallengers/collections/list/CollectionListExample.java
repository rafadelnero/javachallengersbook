package com.javachallengers.collections.list;

import java.util.ArrayList;
import java.util.List;

public class CollectionListExample {

  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("Homer");
    list.add("Moe");
    list.add("Barney");

    list.forEach(System.out::println);

    list.remove(0);     // By index
    list.remove("Moe"); // By object

    list.forEach(System.out::println);

    list.set(0, "Burns");

    list.forEach(System.out::println);
  }

}

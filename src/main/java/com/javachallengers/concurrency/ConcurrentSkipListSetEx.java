package com.javachallengers.concurrency;

import java.util.NavigableSet;
import java.util.concurrent.ConcurrentSkipListSet;

public class ConcurrentSkipListSetEx {

  public static void main(String[] args) {
    NavigableSet<String> simpsons = new ConcurrentSkipListSet<>();
    simpsons.add("Homer");
    simpsons.add("Bart");
    simpsons.add("Marge");

    simpsons.forEach(System.out::println);
  }

}

package com.javachallengers.collections.vector;

import java.util.List;
import java.util.Vector;

public class VectorExample {
  public static void main(String[] args) {
    List<String> vector = new Vector<>();
    vector.add("Batman");
    vector.add("Joker");
    vector.add("Robin");
    vector.add("Joker");

    int indexOfJoker = vector.indexOf("Joker");
    int lastIndexOfJoker = vector.lastIndexOf("Joker");

    System.out.println(indexOfJoker);
    System.out.println(lastIndexOfJoker);
  }
}

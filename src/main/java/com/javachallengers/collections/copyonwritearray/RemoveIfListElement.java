package com.javachallengers.collections.copyonwritearray;

import java.util.ArrayList;
import java.util.List;

public class RemoveIfListElement {

  public static void main(String[] args) {
    List<String> villains = new ArrayList<>();
    villains.add("Joker");
    villains.add("Magneto");
    villains.add("Venom");

    villains.removeIf(e -> e.equals("Venom"));
    System.out.println(villains);
  }
}

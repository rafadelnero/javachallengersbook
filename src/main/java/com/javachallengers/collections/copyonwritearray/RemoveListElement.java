package com.javachallengers.collections.copyonwritearray;

import java.util.ArrayList;
import java.util.List;

public class RemoveListElement {

  public static void main(String[] args) {
    List<String> villains = new ArrayList<>();
    villains.add("Joker");
    villains.add("Magneto");
    villains.add("Venom");

    var villainToRemove = "Venom";

    for (String eachVillain: villains) {
      if (eachVillain.equals(villainToRemove)) {
        villains.remove(villainToRemove);
      }
    }

    System.out.println(villains);
  }
}

package com.javachallengers.collections.immutability;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnmodifiableList {
  private static List<String> villains = new ArrayList<>();
  public static void main(String[] args) {
    villains.add("Magneto");
    villains.add("Venom");
    villains.add("Dr. Octopus");

    villains = getUnmodifiableVillains();
    villains.add("Carnage");
  }

  public static List<String> getUnmodifiableVillains() {
    return Collections.unmodifiableList(villains);
  }
}

package com.javachallengers.generics_obj_comparison.challenges;

import java.util.ArrayList;
import java.util.List;

public class SpiderManVillainsWithoutGenericsChallenge {

  public static void main(String[] args) {
    List list = new ArrayList();
    list.add("Doctor Octopus");
    list.add("Venom");
    list.add("Carnage");

    // String superVillain = list.get(0); It won't compile because needs casting
    // Object superVillain = list.get(0); Works
//    var superVillain = list.get(0); // Works
    String superVillain = (String) list.get(0);

//    System.out.println(superVillain);
  }

}
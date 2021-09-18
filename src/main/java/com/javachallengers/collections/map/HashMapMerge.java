package com.javachallengers.collections.map;

import java.util.HashMap;
import java.util.Map;

// Omitted imports
public class HashMapMerge {

  public static void main(String[] args) {
    Map<Integer, String> ffSummons = new HashMap<>();
    ffSummons.put(1, "Ifrit");
    ffSummons.put(2, "Bahamut");
    ffSummons.put(3, "Knights of Round");

    Map<Integer, String> ffParty = new HashMap<>();
    ffParty.put(1, "Cid");
    ffParty.put(2, "Yuffie");
    ffParty.put(4, "Zack");

    ffSummons.forEach((k, v) ->
        ffParty.merge(k, v, (fighter, summon) -> fighter +" invokes " + summon));

    System.out.println(ffParty);
  }
}
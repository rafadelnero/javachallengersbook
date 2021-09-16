package com.javachallengers.collections.map;

import java.util.HashMap;
import java.util.Map;

// Omitted imports
public class HashMapMerge {

  public static void main(String[] args) {
    Map<Integer, String> ffSummons = new HashMap<>();
    ffSummons.put(1, "Ifrit");
    ffSummons.put(2, "Bahamut");
    ffSummons.put(3, "Eden");

    Map<Integer, String> ffParty = new HashMap<>();
    ffParty.put(3, "Cid");
    ffParty.put(4, "Yuffie");
    ffParty.put(5, "Zack");

    ffSummons.forEach((k, v) ->
        ffParty.merge(k, v, (fighter, summon) -> fighter +" invokes " + summon));

    System.out.println(ffParty);
  }
}
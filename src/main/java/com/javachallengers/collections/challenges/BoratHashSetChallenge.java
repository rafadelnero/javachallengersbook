package com.javachallengers.collections.challenges;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class BoratHashSetChallenge {
    public static void main(String... doYourBest) {
      Set<Borat> borats = new HashSet<>();
      borats.add(new Borat(1, "Kazakhstan"));
      borats.add(new Borat(2, "USAndA"));
      borats.add(new Borat(2, "England"));

      borats.forEach(b -> System.out.print(b.id + " " + b.country + " "));
    }
    static class Borat {
      int id;
      String country;
      Borat(int id, String country) { this.id = id; this.country = country; }

      public int hashCode() {
        System.out.println("hashCode:" + this.id + this.country);
        return this.id;
      }
      public boolean equals(Object obj) {
        System.out.println("equals:" + this.id + this.country);
        return ((Borat) obj).country.equals(this.country);
      }
    }
}

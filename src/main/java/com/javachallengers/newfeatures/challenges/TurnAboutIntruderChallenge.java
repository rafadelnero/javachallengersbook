package com.javachallengers.newfeatures.challenges;

import javax.annotation.Nonnull;
import java.util.ArrayList;
import java.util.Arrays;

//Planet JDK 11 – Var Turnabout intruder
/*
 Rules of var
  - No instance variables
  - No method parameters
  - No lambdas assigning
  - Only local variables
  - No null assigning
 */
public class TurnAboutIntruderChallenge {
    public static void main(String... awayTeam){
        var var = new Var() { public String collide(String c1, String c2) { return  c1 + c2; }};
        var drLester = (Var) null;
        drLester = var;

        Var reliantMistake = (@Nonnull var s1, final var s2) -> String.join(";", s1, s2, "Darth Vader");

        var numbers = new ArrayList<>(Arrays.asList(3, 2, 1));
        numbers.remove(2);

        System.out.println(var.collide("Kirk", "Spock"));
        System.out.println(reliantMistake.collide("Khan", "Borg"));
        System.out.println(drLester.getClass().getName());
        System.out.println(numbers);
    }

    private interface Var { String collide(String c1, String c2); }
}



/*
  Alternatives:
  a - Compilation error at line 4

  b - SpockKirk
      Khan;Borg;Darth Vader
      TurnAboutIntruderChallenge$1
      [3, 2]

  c - KirkSpock
      ;KhanBorgDarth Vader
      Var
      [2, 1]

  d - KirkSpock
      Khan;Borg;Darth Vader
      TurnAboutIntruderChallenge$1
      [3, 1]
 */
package com.javachallengers.newfeatures.challenges;

public class BeerRescueSwitchCaseChallenge {

  public static void main(String... beersRescue) {
    Object homerBeers = getBeers("Homer");
    Object carlBeers = getBeers("Carl");
    Object barneyBeers = getBeers("Barney");

    System.out.println("" + homerBeers + carlBeers + "\n" + barneyBeers);
  }

  static Object getBeers(String character) {
    return switch (character) {
      case "Homer" -> {
        System.out.print("Every day is a beer day. ");
        yield (Integer.valueOf(129) == 129 ? 10 : 7) + " beers for Homer. ";
      }
      case "Carl" -> "Lenny" == new String("Lenny") ? 2 : 4 + " beers for Carl.";
      default -> new NumberFormatException("9999 beers. Not enough beers for Barney!");
    };
  }
}

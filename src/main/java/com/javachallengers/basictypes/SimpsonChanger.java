package com.javachallengers.basictypes;

public class SimpsonChanger {

    public static void main(String... homerEatsCandies) {
        String[] simpsons = { "Homer", "Bart", "Marge"};
        changeFirstElementToLisa(simpsons);
        System.out.println(simpsons[0]);
    }

    private static void changeFirstElementToLisa(String[] sweets) {
        sweets[0] = "Lisa";
    }

}

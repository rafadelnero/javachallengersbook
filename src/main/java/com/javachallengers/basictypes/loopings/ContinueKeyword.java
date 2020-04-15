package com.javachallengers.basictypes.loopings;

public class ContinueKeyword {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i >= 3) {
                System.out.println("Goku beats one Majin Buu with " + i + " hits");
                continue;
            }
            System.out.println("Goku hits Majin Buu");
        }

    }
}

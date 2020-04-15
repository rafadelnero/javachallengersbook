package com.javachallengers.basictypes.challengers;

public class BidimensionalArrayChallenger {

    public static void main(String... doYourBest) {
        String[][] simpsonsFoods = new String[3][2];

        simpsonsFoods[0][0] = "Homer";
        simpsonsFoods[1][0] = "Marge";
        simpsonsFoods[2][0] = "Bart";

        for (int lineIndex = 0, columnIndex = 0; lineIndex < 2; lineIndex++) {
            columnIndex = 0;
            while (columnIndex < 2) {
                if (simpsonsFoods[lineIndex][0] == "Homer")
                    simpsonsFoods[lineIndex][columnIndex++] = "Donuts";
                else if (simpsonsFoods[lineIndex][0] == "Marge") {
                    simpsonsFoods[lineIndex][++columnIndex] = "Salad";
                    break;
                } else {
                    simpsonsFoods[lineIndex][columnIndex++] = "Hot-dog";
                }
            }
        }

        System.out.println(simpsonsFoods[0][1] + simpsonsFoods[1][1] + simpsonsFoods[2][1]);
    }
}

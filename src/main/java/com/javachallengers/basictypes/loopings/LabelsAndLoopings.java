package com.javachallengers.basictypes.loopings;

public class LabelsAndLoopings {

    public static void main(String[] args) {
        outer:
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                if (i == 2)
                    continue outer;
                if (i == 3)
                    break outer;

                System.out.println(i + ":" + j);
            }
        }

    }
}

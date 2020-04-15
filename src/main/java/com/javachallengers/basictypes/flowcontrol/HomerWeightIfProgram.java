package com.javachallengers.basictypes.flowcontrol;

public class HomerWeightIfProgram {

    public static void main(String[] args) {
        int homerWeight = 240;
        if (homerWeight > 340)
            System.out.println("Homer is obese");
        System.out.println("Homer needs to go on a diet"); // This line will always be executed
    }

}

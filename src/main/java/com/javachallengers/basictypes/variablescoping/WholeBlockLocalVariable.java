package com.javachallengers.basictypes.variablescoping;

public class WholeBlockLocalVariable {

    public static void main(String[] theSimpsons) {
        String simpsonName = "Homer"; // This variable can be used in the whole main block
        for (int i = 0; i <= 10; i++) {
            System.out.println(simpsonName); // simpsonName can be used here without a problem
        }
    }

}

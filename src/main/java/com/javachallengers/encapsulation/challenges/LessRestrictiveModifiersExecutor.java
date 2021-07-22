package com.javachallengers.encapsulation.challenges;

import com.javachallengers.encapsulation.challenges.access.LessRestrictiveModifiers;

public class LessRestrictiveModifiersExecutor extends LessRestrictiveModifiers {

    public static void main(String[] args) {
        LessRestrictiveModifiers challenger = new LessRestrictiveModifiers();
        System.out.println(challenger.publicVariable);
        System.out.println(new LessRestrictiveModifiersExecutor().protectedVariable);
    }
}

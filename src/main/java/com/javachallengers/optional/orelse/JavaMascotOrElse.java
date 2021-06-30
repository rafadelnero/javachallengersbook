package com.javachallengers.optional.orelse;

import java.util.Optional;

class JavaMascotOrElse {
    public static void main(String[] args) {
        Optional<String> optJavaMascot = Optional.ofNullable("Duke");
        optJavaMascot.orElse(printJavaMascot());
    }

    static String printJavaMascot() {
        System.out.println("Duke gets prepared...");
        return "Duke";
    }
}
package com.javachallengers.optional.orelse;

import java.util.Optional;

class JavaMascotOrElseGet {
    public static void main(String[] args) {
        Optional<String> optJavaMascot = Optional.ofNullable("Duke");
        optJavaMascot.orElseGet(JavaMascotOrElseGet::printJavaMascot);
    }

    static String printJavaMascot() {
        System.out.println("Duke gets prepared...");
        return "Duke";
    }
}
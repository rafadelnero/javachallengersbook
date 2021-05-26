package com.javachallengers.interfaces.staticmethod;

public class LukeSkyWalker implements Jedi {

    public static void main(String... staticMethodShadowing) {
        Jedi anakinSkyWalker = new LukeSkyWalker();
        // anakinSkyWalker.useSaber(); It doesn't compile
        Jedi.useSaber();
    }

    static void useSaber() {
        System.out.println("Luke uses his saber");
    }

}


interface Jedi {

    static void useSaber() {
        System.out.println("Anakin uses his saber");
    }

}

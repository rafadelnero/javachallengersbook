package com.javachallengers.exceptions.trywithresources;

import java.io.Closeable;

public class TheClose {

    public static void main(String... customAutocloseable) {
        try (Moe moe = new Moe(); Apu apu = new Apu()) { }
    }

    static class Moe implements AutoCloseable{

        public void close() {
            System.out.println("Moe closes the Bar");
        }
    }

    static class Apu implements Closeable {
        public void close() {
            System.out.println("Apu closes the shop");
        }
    }
}

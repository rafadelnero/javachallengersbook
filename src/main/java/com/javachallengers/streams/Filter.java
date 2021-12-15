package com.javachallengers.streams;

import java.util.Arrays;
import java.util.List;

public class Filter {

    static class Maverick {
        private String name;
        private double power;

        public Maverick(String name, double power) {
            this.name = name;
            this.power = power;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    public static void main(String[] args) {
        var mavericks = List.of(new Maverick("X", 9), new Maverick("Zero", 10), new Maverick("Axl", 8));

        mavericks.stream()
                .filter(m -> m.power > 8)
                .forEach(m -> System.out.println(m.name));

        mavericks.stream()
                .filter(m -> m.name.equals("X") && m.power > 8)
                .forEach(m -> System.out.println(m.name));

        System.out.println(mavericks);
    }
}

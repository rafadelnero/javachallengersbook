package com.javachallengers.streams;

import java.util.List;
import java.util.Objects;

public class Distinct {

    public static void main(String[] args) {
        distinctWithCustomObject();
    }

    static void distinctNumbers() {
        List<Integer> numbers = List.of(1, 1, 1, 2, 2, 3, 3, 4, 4, 4, 4);
        numbers.stream().distinct().forEach(n -> System.out.print(n + " "));
    }

    static void distinctWithCustomObject() {
        List<BojackCharacter> bojackCharacters = List.of(new BojackCharacter("Bojack"), new BojackCharacter("Bojack"),
                new BojackCharacter("Diane"), new BojackCharacter("Diane"));

        bojackCharacters.stream().distinct().forEach(b -> System.out.print(b.name + " "));
    }

    static class BojackCharacter {
        private String name;

        public BojackCharacter(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            BojackCharacter that = (BojackCharacter) o;
            return Objects.equals(name, that.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }
}

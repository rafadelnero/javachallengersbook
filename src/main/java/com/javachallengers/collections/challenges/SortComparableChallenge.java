package com.javachallengers.collections.challenges;

import java.util.*;

public class SortComparableChallenge {
    public static void main(String... doYourBest) {
        Set<Simpson> set = new TreeSet<>();
        set.add(new Simpson("Homer "));
        set.add(new Simpson("Marge "));
        set.add(new Simpson("Lisa "));
        set.add(new Simpson("Bart "));
        set.add(new Simpson("Maggie "));

        List<Simpson> list = new ArrayList<>(set);
        Collections.reverse(list);
        for (Simpson simpson : list) 
            System.out.print(simpson);
    }

    static class Simpson implements Comparable<Simpson> {
        String name;
        public Simpson(String name) { this.name = name; }

        public int compareTo(Simpson simpson) {
            return simpson.name.compareTo(this.name);
        }

        public String toString() { return this.name; }
    }
}
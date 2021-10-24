package com.javachallengers.collections.list;

import java.util.ArrayList;
import java.util.List;

public class PrintingAllListElements {

    public static void main(String[] args) {
        List<String> heroes = new ArrayList<>();         // #A
        heroes.add("Batman");                            // #B
        heroes.add("Spider-Man");
        heroes.add("Iron Man");

        System.out.println(heroes);                      // #C

        heroes.remove(0);        // By index
        heroes.remove("Iron Man"); // By object

        System.out.println(heroes);
    }
}

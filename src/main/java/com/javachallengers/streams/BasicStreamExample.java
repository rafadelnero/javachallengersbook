package com.javachallengers.streams;

import java.util.List;

public class BasicStreamExample {

    public static void main(String[] args) {
        List<String> list = List.of("Duke", "Juggy");
        list.stream().map(String::length).forEach(System.out::println);
    }
}

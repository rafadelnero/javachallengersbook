package com.javachallengers.encapsulation.challenges;

public class StaticSimpson {

    String name;
    static int age;

    public static void main(String[] args) {
        StaticSimpson homer = new StaticSimpson();
        homer.name = "Homer";
        homer.age = 35;

        StaticSimpson bart = new StaticSimpson();
        bart.name = "Bart";
        bart.age = 10;
        bart.age++;

        System.out.println(homer.name + bart.name);
        System.out.println(homer.age + bart.age);
    }
}

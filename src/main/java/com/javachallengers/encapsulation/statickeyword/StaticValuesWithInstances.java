package com.javachallengers.encapsulation.statickeyword;

public class StaticValuesWithInstances {

    static String name;

    public static void main(String[] args) {
        StaticValuesWithInstances staticValues1 = new StaticValuesWithInstances();
        staticValues1.name = "value1";

        StaticValuesWithInstances staticValues2 = new StaticValuesWithInstances();
        staticValues2.name = "value2";

        System.out.println(staticValues1.name);
        System.out.println(staticValues2.name);
    }
}

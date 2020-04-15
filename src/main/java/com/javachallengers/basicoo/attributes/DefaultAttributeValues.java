package com.javachallengers.basicoo.attributes;

public class DefaultAttributeValues {

    boolean isHomerThin;
    int homerGrade;
    double nedFlandersBeerCount;
    char maggieWords;
    String margeSenseOfHumor;

    public static void main(String[] defaultAttributesValues) {
        DefaultAttributeValues values = new DefaultAttributeValues();
        System.out.println(values.isHomerThin);
        System.out.println(values.homerGrade);
        System.out.println(values.nedFlandersBeerCount);
        System.out.println(values.maggieWords);
        System.out.println(values.margeSenseOfHumor);
    }
}

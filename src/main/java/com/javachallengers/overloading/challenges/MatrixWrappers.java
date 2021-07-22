package com.javachallengers.overloading.challenges;

import java.math.BigDecimal;

public class MatrixWrappers {

    static String result = "";

    public static void main(String... doYourBest) {
        wrapBullets(5, 5D);
        wrapBullets(1L, 5);
        wrapBullets(new BigDecimal(4), 5D);
        wrapBullets(5, 4);
        wrapBullets((short) 5.0, 5.);

        System.out.println(result);
    }

    static void wrapBullets(Integer integerWrapper, Double doubleWrapper) { result += "A";}
    static void wrapBullets(Short shortWrapper, Double doubleWrapper) { result += "B"; }
    static void wrapBullets(Number numberWrapper, Double doubleWrapper) { result += "C"; }
    static void wrapBullets(double doublePrimitive, int intPrimitive) { result += "D"; }

}

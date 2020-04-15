package com.javachallengers.overloading.wrappers;

public class MatrixBoxing {

    public static void main(String... wrapperTypesBoxing) {
        int primitiveInt = 7;
        Integer matrixInt = new Integer(primitiveInt);

        matrixInt = primitiveInt;

        int newMatrixInt = matrixInt.intValue();

        Integer matrixDouble = new Integer(7);

        Number matrixNumber = new Integer(7);
        matrixNumber = new Double(7);
        System.out.println(int.class);

        //Long matrixDouble2 = (Long) (Object) newMatrixInt;
        Double doubleMatrixNumber = (double) 7;
    }
}

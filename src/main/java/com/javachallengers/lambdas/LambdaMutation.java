package com.javachallengers.lambdas;

public class LambdaMutation {
    private int instanceNumber;
    private static int staticNumber;

    public static void main(String[] args) {
        LambdaMutation lambdaMutation = new LambdaMutation();
        Runnable runnable = () -> System.out.println(
            ++lambdaMutation.instanceNumber + ":" + ++staticNumber);
        runnable.run();
    }
}

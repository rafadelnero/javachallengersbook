package com.javachallengers.lambdas.challenges;

import java.util.function.Consumer;
import java.util.function.IntSupplier;

public class SupplierConsumerChallenge {

    static int value;
    public static void main(String... doYourBest) {
        IntSupplier valueS = () -> value++;                          // Line 5
        Consumer<Object> oneMoreValue = (Object test) -> value++;    // Line 6

        oneMoreValue.accept(2);
        System.out.println(value + " " + valueS.getAsInt());
    }

}

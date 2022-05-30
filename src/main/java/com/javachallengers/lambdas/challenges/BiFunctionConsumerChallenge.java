package com.javachallengers.lambdas.challenges;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionConsumerChallenge {

    public static void main(String... doYourBest) {
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        Function<Integer, Integer> sub = (a) -> a - 2;
        Function<Integer, Integer> mult = (a) -> a * 3;

        BiFunction<Integer, Integer, Integer> func =
            add.andThen(sub).andThen(sub);

        BiConsumer<Integer, Integer> consumer = (a, b)
                -> System.out.println(a + 2 + b + 2);

        int firstResult = func.apply(2, 2);
        add.andThen(sub).andThen(mult);
        int secondResult = add.apply(2, 2);

        consumer.accept(firstResult, secondResult);
    }

}

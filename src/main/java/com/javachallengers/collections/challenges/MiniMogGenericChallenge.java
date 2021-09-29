package com.javachallengers.collections.challenges;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MiniMogGenericChallenge {
    public static void main(String... doYourBest) {
        List<Integer> miniMogHitDamage;

        List<Integer> intDamage = new ArrayList<>();
        intDamage.add(10);
        miniMogHitDamage = addInto(intDamage);

        List<Long> longDamage = new ArrayList<>();
        miniMogHitDamage.addAll(addInto(longDamage));

        List<BigDecimal> bigDecimalDamage = new ArrayList<>();
        bigDecimalDamage.add(BigDecimal.ZERO);
        miniMogHitDamage.addAll(addInto(bigDecimalDamage));

        miniMogHitDamage.forEach(System.out::println);
    }
    static List addInto(List<? extends Number> list) {
        List<Number> resultList = new ArrayList<>();
        resultList.addAll(list);
        return resultList;
    }
}
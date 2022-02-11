package com.javachallengers.streams;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

public class MapToList {

    @Test
    public void streamMapToList() {
        Map<Integer, String> map = Map.of(1, "Homer", 2, "Marge", 3, "Bart", 4, "Lisa");

        List<Integer> keyList = map.keySet().stream().toList();
        System.out.println(keyList);

        List<String> valueList = map.values().stream().toList();
        System.out.println(valueList);
    }
}

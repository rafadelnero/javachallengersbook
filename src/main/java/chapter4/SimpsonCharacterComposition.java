package chapter4;

import java.util.ArrayList;
import java.util.List;

public class SimpsonCharacterComposition {

    static List<String> characters = new ArrayList<>();

    public static void main(String... goodExampleOfComposition) {
        characters.add("Homer");
        characters.forEach(System.out::println);
    }
}

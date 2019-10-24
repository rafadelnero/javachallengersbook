package chapter4;

import java.util.ArrayList;

public class SimpsonCharacterInheritance extends ArrayList<String> {

    public static void main(String... badExampleOfInheritance) {
        SimpsonCharacterInheritance simpsonCharacters = new SimpsonCharacterInheritance();
        simpsonCharacters.add("Homer");
        simpsonCharacters.forEach(System.out::println);
    }

}

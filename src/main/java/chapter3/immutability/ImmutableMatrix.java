package chapter3.immutability;

public class ImmutableMatrix {

    public static void main(String... immutableBehavior) {
        Integer number = 1;
        tryToChangeMatrix(number);
        System.out.println(number);
    }

    static void tryToChangeMatrix(Integer number) {
        number += 1;
    }

}

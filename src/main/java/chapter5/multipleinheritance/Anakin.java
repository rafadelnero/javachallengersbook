package chapter5.multipleinheritance;

public class Anakin implements Jedi, Sith {

    public static void main(String... defaultMethodMultipleInheritance) {
        new Anakin().useSaber();
    }

    @Override
    public void useSaber() {
        System.out.println("Anakin's Saber slash");
        Jedi.super.useSaber();
        Sith.super.useSaber();
    }
}

interface Jedi {
    default void useSaber() {
        System.out.println("Jedi's Saber slash");
    }
}

interface Sith {
    default void useSaber() {
        System.out.println("Sith's Saber slash");
    }
}

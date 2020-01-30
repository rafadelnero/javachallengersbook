package chapter3;

public class NeoOverloading {

    public static void main(String... matrixTheme) {
        NeoOverloading neo = new NeoOverloading();
        neo.learnAbility("Kung-Fu", 1010101);
        neo.learnAbility("Taekwondo", 100010101);
        neo.learnAbility("CloseQuartersCombat", 11100101, "Uzi");
        neo.learnAbility("Specialized weapon training", 10101, "RPG");
    }

    void learnAbility(String ability, int binaryCode) {
        System.out.printf("Neo has learned %s with the code %s \n", ability, binaryCode);
    }

    void learnAbility(String ability, int binaryCode, String weapon) {
        System.out.printf("Neo has learned %s with a %s and the code %s \n", ability, weapon, binaryCode);
    }

}

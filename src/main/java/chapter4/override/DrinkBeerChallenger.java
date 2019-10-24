package chapter4.override;

public class DrinkBeerChallenger {

    public static void main(String... doYourBest) {
        SimpsonCharacter bart = new Bart();
        drinkBeer(bart);
        drinkBeer(new Homer());
        drinkBeer(new SimpsonCharacter());
    }

    static void drinkBeer(SimpsonCharacter simpsonCharacter) {
        simpsonCharacter.drinkBeer(simpsonCharacter);
    }

}

class Homer extends SimpsonCharacter {
    void drinkBeer(SimpsonCharacter simpsonCharacter) {
        System.out.println("Homer drinks");
    }
}

class Bart extends Homer {
    void drinkBeer(SimpsonCharacter simpsonCharacter) {
        System.out.println("Bart can't drink!");
    }
}

class SimpsonCharacter {

    void drinkBeer(SimpsonCharacter simpsonCharacter) {
        System.out.println("A character is drinking beer");
    }

}

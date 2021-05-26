package com.javachallengers.polymorphism.composition;

public class CompositionExample {

    public static void main(String... personComposition) {
        new Person(new Brain(), new Heart() /* other elements */);
        // A Person is composed by brain, heart and many other elements
    }

    static class Person {
        Brain brain;
        Heart heart;

        Person(Brain brain, Heart heart) {
            this.brain = brain;
            this.heart = heart;
        }

    }

}

class Brain { }
class Heart { }

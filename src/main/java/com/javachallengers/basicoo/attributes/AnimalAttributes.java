package com.javachallengers.basicoo.attributes;

class AnimalAttributes {
    String breed;
    String emittedSound;

    public static void main(String [] args) {
        AnimalAttributes dog = new AnimalAttributes();
        dog.breed = "Husky";
        dog.emittedSound = "woof";
        
        System.out.println(dog.breed);
        System.out.println(dog.emittedSound);

        AnimalAttributes cat = new AnimalAttributes();
        cat.breed = "Persian";
        cat.emittedSound = "meow";
        
        System.out.println(cat.breed);
        System.out.println(cat.emittedSound);
    }
}

package com.javachallengers.basicoo.attributes;

class AnimalMethodInvocation {

        String emittedSound;

        void emitSound() {
            System.out.println(emittedSound);
        }

        public static void main(String[] args) {
            AnimalMethodInvocation dog = new AnimalMethodInvocation();
            dog.emittedSound = "woof";
            dog.emitSound();
        }

}

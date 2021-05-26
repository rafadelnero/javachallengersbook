package com.javachallengers.polymorphism.accessmodifier;

public class AccessModifierInheritance {


}

class Hero {
   void attack() {}
   public void jump() {}
}

class Wolverine extends Hero {
    public void attack() {} // It's possible to use a more opened access modifier
    public void jump() {} // It's possible to use the same access modifier
    // void jump() {} Compilation error because the default access modifier is more restrictive
    // private void jump() {} Compilation error because the private access modifier is more restrictive
}

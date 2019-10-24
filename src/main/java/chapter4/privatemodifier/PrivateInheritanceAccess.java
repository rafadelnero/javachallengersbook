package chapter4.privatemodifier;

public class PrivateInheritanceAccess {
}

class Villain {
    private int age;
    private void attack() {}
}

class Joker extends Villain {
    void doTrick() {
    // It's not possible to access private fields from an external class even with inheritance
    // System.out.println(super.age);
    // super.attack();
    }
}

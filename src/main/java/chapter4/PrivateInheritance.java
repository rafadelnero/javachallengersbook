package chapter4;

public class PrivateInheritance {
}

class Villain {
    private int age;
    private void attack() { }
}

class Joker extends Villain {
    void doTrick() {
        // Private methods or attributes are not visible when they are private
        // System.out.println(super.age);
        // super.attack();
    }
}

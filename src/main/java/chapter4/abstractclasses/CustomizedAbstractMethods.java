package chapter4.abstractclasses;

public class CustomizedAbstractMethods {

    public static void main(String[] args) {
        // new Simpson().talk(); It doesn't compile - We can't instantiate abstract classes
        new Homer().talk(); // The output will be D'oh
    }

}

abstract class Simpson { abstract void talk(); }
class Homer extends Simpson {
    @Override
    void talk() {
        System.out.println("D'oh");
    }
}

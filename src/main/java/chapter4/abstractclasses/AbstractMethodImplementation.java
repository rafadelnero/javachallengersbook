package chapter4.abstractclasses;

public class AbstractMethodImplementation {

    abstract class Hero { abstract void usePower(); }
    abstract class Marvel extends Hero {}

    class SpiderMan extends Marvel {
        @Override
        void usePower() {
        }
    }

}

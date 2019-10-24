package chapter4.finalinheritance;

public class NonFinalMethodWorking {
    class Character { void performAction() { }}
    class Homer extends Character {
        void performAction() { }
    }

}

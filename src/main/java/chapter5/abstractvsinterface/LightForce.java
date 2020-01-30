package chapter5.abstractvsinterface;

public abstract class LightForce {
    private int force;
    LightForce(int force) {
        this.force = force;
        System.out.println("The force is being used:" + this.force);
    }

    public static void main(String... abstractClassesVsInterfaces) {
        new LukeSkywalker(1099);
        new DarthVader().useForce();
    }
}

interface DarkForce {
    int FORCE = 999;

    default void useForce() {
        System.out.println("The force is being used:" + FORCE);
    }
}

class LukeSkywalker extends LightForce {
    LukeSkywalker(int force) {
        super(force);
    }
}
class DarthVader implements DarkForce {}



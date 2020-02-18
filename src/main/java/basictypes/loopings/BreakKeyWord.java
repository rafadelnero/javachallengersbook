package basictypes.loopings;

public class BreakKeyWord {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i >= 2) {
                System.out.println(i);
                break;
            }
        }

    }
}

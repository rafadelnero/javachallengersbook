package basictypes.variablescoping;

public class IfElseVariableInitialization {

    public static void main(String[] args) {
        int beerCount;
        boolean test = true;

        if (test) {
            beerCount = 0;
        } else {
            beerCount = 0;
        }

        System.out.println(beerCount);
    }
}

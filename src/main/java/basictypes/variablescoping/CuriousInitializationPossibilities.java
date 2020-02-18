package basictypes.variablescoping;

public class CuriousInitializationPossibilities {

    public static void main(String[] args) {
        int beerCount;

        if (true) {
            beerCount = 0;
        }

        System.out.println(beerCount);

        int moeAge;
        if (1 == 1) {
            moeAge = 0;
        }

        System.out.println(moeAge);
    }
}

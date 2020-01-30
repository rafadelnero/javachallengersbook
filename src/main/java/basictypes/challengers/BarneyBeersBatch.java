package basictypes.challengers;

public class BarneyBeersBatch {

    public static void main(String... doYourBest) {
        int batchOfBeer1 = 10;
        int batchOfBeer2 = 10;

        if (batchOfBeer1 > batchOfBeer2 & batchOfBeer1++ < ++batchOfBeer2) {
            batchOfBeer1++;
        }

        batchOfBeer1 = batchOfBeer1++ > batchOfBeer2 && ++batchOfBeer2 < batchOfBeer1++
                ?  ++batchOfBeer1 : ++batchOfBeer2;

        System.out.println("Barney will have: " + batchOfBeer1 + " and " + batchOfBeer2 + " beers.");
    }

}

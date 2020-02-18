package basictypes.flowcontrol;

public class MoreComplexTernaryIf {

    public static void main(String[] args) {
        int beerQuantity = 200;

        String beerOwner = beerQuantity >= 100 ?
                beerQuantity >= 200 ? beerQuantity >= 300 ? "Barney" : "Homer" : "Lenny" : "Carl";
    }
}

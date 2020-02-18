package basictypes;

public class SwitchReturnExample {

    public static void main(String[] args) {
        String barneyBeerPreference = "Duff";

    }

    static String getBeerByPrice(String barneyBeerPreference ) {
        switch (barneyBeerPreference) {
            case "Duff":
                return "Barney prefers Duff";
            default:
                return "Some other beer";
        }
    }
}

package basictypes;

public class SwitchReturnExample {

    public static void main(String[] args) {
        String barneyBeerPreference = "Duff";

    }

    String getBeer(String barneyBeerPreference ) {
        switch (barneyBeerPreference) {
            case "Duff":
                return "Barney prefers Duff";
            default:
                return "Some other beer";
        }
    }
}

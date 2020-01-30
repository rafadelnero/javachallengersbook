package basictypes;

public class SwitchExample {

    public static void main(String[] args) {
        String barneyBeerPreference = "Duff";

        switch (barneyBeerPreference) {
            case "Guinness":
                System.out.println("Barney prefers Guinness");
            case "Heineken":
                System.out.println("Barney prefers Heineken");
            case "Duff":
                System.out.println("Barney prefers Duff");
                break;
            default:
                System.out.println("Some other beer");
        }
    }

}

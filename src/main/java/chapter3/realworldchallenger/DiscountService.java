package chapter3.realworldchallenger;

public class DiscountService {

    boolean isDiscountAvailable(String customerId) {
        System.out.println("Discount available to " + customerId);
        return true;
    }

}

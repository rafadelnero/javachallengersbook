package chapter3.realworldchallenger;

public class DiscountController {

    DiscountService discountService = new DiscountService();

    boolean isDiscountAvailable(String customerId) {
        return discountService.isDiscountAvailable(customerId);
    }

    boolean isDiscountAvailable(String customerId, String userName) {
        System.out.println("CustomerId:" + customerId + "UserName:" + userName);
        return isDiscountAvailable(customerId);
    }

}

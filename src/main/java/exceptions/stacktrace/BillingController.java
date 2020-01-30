package exceptions.stacktrace;

public class BillingController {

    BillingService billingService;

    BillingController(BillingService billingService) {
        this.billingService = billingService;
    }

    public static void main(String... stackTrace) {
        BillingController controller = new BillingController(new BillingService());
        controller.applyDiscount("1");
    }

    void applyDiscount(String customerId) {
        billingService.applyDiscount(customerId);
    }
}

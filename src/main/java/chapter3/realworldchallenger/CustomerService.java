package chapter3.realworldchallenger;

public class CustomerService {

    CustomerDao dao;

    void insert(Customer customer) {
        dao.insert(customer);
    }

    void insert(String customerName) {
        Customer customer = new Customer(customerName);
        dao.insert(customer);
    }

    void processCustomerProduct(String customerId) {
        processCustomerProduct(customerId, null);
    }

    void processCustomerProduct(String customerId, String productId) {
        processCustomerProduct(customerId, productId, null);
    }

    void processCustomerProduct(String customerId, String productId, String discountId) {
        System.out.println("Processing:" + customerId + productId + discountId);
    }

}

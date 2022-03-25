package view;

import service.CustomerService;

import java.util.ServiceLoader;

public class CustomerView {

  public static void main(String[] args) {
    CustomerService customerService = ServiceLoader.load(CustomerService.class).findFirst().get();
    customerService.chargeCustomer();
  }
}

package view;

import service.CurrencyUtil;
import service.CustomerService;

import java.lang.reflect.Field;
import java.util.ServiceLoader;

public class CustomerView {

  public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
    ServiceLoader<CustomerService> serviceLoader = ServiceLoader.load(CustomerService.class);
    serviceLoader.stream().forEach(e -> e.get().chargeCustomer());

    Field field = CurrencyUtil.class.getDeclaredField("currency");
    field.setAccessible(true);
    System.out.println("The currency is: " + field.get(new CurrencyUtil()));
  }

}

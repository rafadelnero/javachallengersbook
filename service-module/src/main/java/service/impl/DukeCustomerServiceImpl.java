package service.impl;

import cache.SpecialCache;
import dao.CustomerDAO;
import dao.util.JavaMascotUtils;
import service.CustomerService;

public class DukeCustomerServiceImpl implements CustomerService {

  public void chargeCustomer() {
    CustomerDAO customerDAO = new CustomerDAO();
    JavaMascotUtils javaMascot = new JavaMascotUtils();
    System.out.println("Charging customer:" + customerDAO.getCustomer() + " with " + javaMascot.getMascotItem());
  }

  public void logCustomer() {
    CustomerDAO customerDAO = new CustomerDAO();
    SpecialCache specialCache = customerDAO.getCachedCustomer();
    System.out.println(specialCache.getCachedString());
  }

  public static void main(String[] args) {
    new DukeCustomerServiceImpl().logCustomer();
  }
}

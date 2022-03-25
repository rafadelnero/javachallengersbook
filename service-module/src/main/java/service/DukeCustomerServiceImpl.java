package service;

import dao.CustomerDAO;

public class DukeCustomerServiceImpl implements CustomerService {

  public void chargeCustomer() {
    CustomerDAO customerDAO = new CustomerDAO();
    System.out.println("Charging customer:" + customerDAO.getCustomer());
  }
}

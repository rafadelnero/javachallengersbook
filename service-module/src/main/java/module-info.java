import service.CustomerService;
import service.DukeCustomerServiceImpl;
import service.JuggyCustomerImpl;

module serviceModule {

  requires daoModule;
  exports service;
  provides CustomerService with DukeCustomerServiceImpl,
                                JuggyCustomerImpl;

}
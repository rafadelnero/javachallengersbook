import service.CustomerService;
import service.DukeCustomerServiceImpl;
import service.JuggyCustomerImpl;

module serviceModule {

  requires daoModule;
  exports service;
  opens service to viewModule;
  provides CustomerService with DukeCustomerServiceImpl,
                                JuggyCustomerImpl;

}
import service.CustomerService;
import service.impl.DukeCustomerServiceImpl;
import service.impl.JuggyCustomerImpl;

module serviceModule {

  requires daoModule;
  exports service;
  opens service to viewModule;
  provides CustomerService with DukeCustomerServiceImpl,
                                JuggyCustomerImpl;

}
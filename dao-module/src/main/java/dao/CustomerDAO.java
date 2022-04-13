package dao;

import cache.SpecialCache;

public class CustomerDAO {

  private final SpecialCache specialCache = new SpecialCache();

  public String getCustomer() {
    return "customer_duke";
  }

  public SpecialCache getCachedCustomer() {
    if (specialCache.getCachedString() == null) {
      specialCache.setCachedString(getCustomer());
    }

    return specialCache;
  }
}

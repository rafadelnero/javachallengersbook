module daoModule {
  requires transitive cacheModule;
  exports dao to serviceModule;
  exports dao.util to serviceModule;
}

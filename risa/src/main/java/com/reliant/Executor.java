package com.reliant;

import com.defiant.Captain;
import com.defiant.Spock;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ServiceLoader;

public class Executor {
  public static void main(String... doYourBest) throws NoSuchMethodException,
          InvocationTargetException, IllegalAccessException {
    Captain captain = ServiceLoader.load(Captain.class).findFirst().get();
    captain.attack("reliant");

    Method method = Spock.class.getDeclaredMethod("doh");
    method.setAccessible(true);
    method.invoke(new Spock());
  }
}

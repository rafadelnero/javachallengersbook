package com.javachallengers.newfeatures;

import org.junit.jupiter.api.Test;

public class ModuleExamples {

  @Test
  void unnamedModule() {
    Module module = ModuleExamples.class.getModule();

    System.out.print("Module Name: " + module.getName());
    System.out.println("Module Descriptor: " + module.getDescriptor());
  }
}

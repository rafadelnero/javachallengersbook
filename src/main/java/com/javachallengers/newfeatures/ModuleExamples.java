package com.javachallengers.newfeatures;

public class ModuleExamples {

  public static void main(String[] args) {
    Module module = ModuleExamples.class.getModule();

    System.out.println("Module Object: " + module);
    System.out.println("Module Name: " + module.getName());
    System.out.println("Module Descriptor: " + module.getDescriptor());
  }

}

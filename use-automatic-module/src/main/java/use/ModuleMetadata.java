package use;

import util.Automatic;

public class ModuleMetadata {

  public static void main(String[] args) {
    Automatic automatic = new Automatic();
    showModuleMetadata(automatic);
  }

  static void showModuleMetadata(Automatic automatic) {
    Module module = automatic.getClass().getModule();
    System.out.println("Module Name: " + module.getName());
    System.out.println("Module Descriptor: " + module.getDescriptor());
    System.out.println("Is Automatic: " + module.getDescriptor().isAutomatic());
  }

}
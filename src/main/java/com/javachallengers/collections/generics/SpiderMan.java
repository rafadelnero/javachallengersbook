package com.javachallengers.collections.generics;

import java.util.List;
import java.util.Objects;

public class SpiderMan {

  String armorName;
  String webGadget;
  List<String> skills;

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpiderMan spiderMan = (SpiderMan) o;
    return Objects.equals(armorName, spiderMan.armorName) && Objects
        .equals(webGadget, spiderMan.webGadget) && Objects.equals(skills, spiderMan.skills);
  }

  @Override
  public int hashCode() {
    return Objects.hash(armorName, webGadget, skills);
  }

}

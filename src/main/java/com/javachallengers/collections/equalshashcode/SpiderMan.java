package com.javachallengers.collections.equalshashcode;

import java.util.List;
import java.util.Objects;

public class SpiderMan {

  private String suit;
  private List<String> skills;
  private int age;

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpiderMan spiderMan = (SpiderMan) o;
    return age == spiderMan.age && suit.equals(spiderMan.suit) && skills.equals(spiderMan.skills);
  }

  @Override
  public int hashCode() {
    return Objects.hash(suit, skills, age);
  }

}

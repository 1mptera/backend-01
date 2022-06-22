package utils;

import models.Account;

public class GreetingPageGenerator extends PageGenerator {

   String name;

  public GreetingPageGenerator(String name) {
    if(name.isBlank()) {
      this.name = "world";
      return;
    }

    this.name = name;
  }

  public GreetingPageGenerator() {

    this.name = "world";
  }

  @Override
  public String content() {
    return "Hello , " + name;
  }
}

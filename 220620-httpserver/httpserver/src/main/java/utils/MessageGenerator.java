package utils;

import javax.xml.namespace.QName;

public class MessageGenerator {

  private String name;

  public MessageGenerator(String name) {
     this.name = name;
  }

  public MessageGenerator() {
    this.name = "world";
  }

  public String text() {
    return "Hello , " + name + "!";
  }
}

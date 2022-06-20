package utils;

public class MessageGenerator {
  private String name;

  public MessageGenerator() {
    this.name = "world";
  }

  public MessageGenerator(String name) {
    this.name = name;
  }

  public String text() {
    return "Hello, " + name + "!";
  }
}

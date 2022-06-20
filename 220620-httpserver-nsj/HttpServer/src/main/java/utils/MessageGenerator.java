
package utils;

public class MessageGenerator {
  private String name;

  public MessageGenerator() {
    this.name = "World";
  }

  public MessageGenerator(String name) {
    if (name.isBlank()) {
      this.name = "World";
      return;
    }
    this.name = name;
  }

  public String text() {
    return "Hello, " + name + "!";
  }
}

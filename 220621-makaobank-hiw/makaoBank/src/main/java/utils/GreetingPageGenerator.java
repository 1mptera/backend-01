package utils;

public class GreetingPageGenerator extends PageGenerator {
  private final String name;

  public GreetingPageGenerator() {
    this.name = "world";
  }

  public GreetingPageGenerator(String name) {
    if (name.isBlank()) {
      this.name = "world";
      return;
    }

    this.name = name;
  }

  public String content() {
    return "  <p>Hello, " + name + "!</p>\n";
  }
}

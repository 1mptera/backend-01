
package utils;

public class GreetingPageGenerator extends PageGenerator{
  private String name;

  public GreetingPageGenerator() {

    this.name = "World";
  }

  public GreetingPageGenerator(String name) {
    if (name.isBlank()) {
      this.name = "World";
      return;
    }
    this.name = name;
  }

  @Override
  public String html() {
    return "Hello, " + name + "!";
  }
}

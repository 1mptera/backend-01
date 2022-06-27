package utils;

public class GreetingPageGenerator extends PageGenerator {
  private String name;

  public GreetingPageGenerator(String name) {
    if (name.isBlank()) {
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
    return "Hello, " + this.name + "!";
  }
}
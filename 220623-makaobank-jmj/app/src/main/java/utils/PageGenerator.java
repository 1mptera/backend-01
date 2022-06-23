package utils;

public class PageGenerator {
  private String name;

  public PageGenerator() {
    this.name = "world";
  }

  public PageGenerator(String name) {
    if (name.isBlank()) {
      this.name = "world";
      return;
    }
    this.name = name;
  }

  public String text() {
    return "Hello, " + name + "!";
  }
}

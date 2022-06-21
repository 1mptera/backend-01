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

  public String html() {
    return "<!DOCTYPE html>\n"
        + "<html>\n"
        + "<head>\n"
        + "  <meta charset=\"UTF-8\" />\n"
        + "  <title>마카오뱅크</title>\n"
        + "</head>\n"
        + "<body>\n"
        + "  <p>Hello, " + name + "!</p>\n"
        + "</body>\n"
        + "</html>\n";
  }
}

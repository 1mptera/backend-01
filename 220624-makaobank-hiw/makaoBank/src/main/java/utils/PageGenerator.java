package utils;

public abstract class PageGenerator {
  public String html() {
    return
      "<!DOCTYPE html>\n" +
          "<html>\n" +
          "  <head>\n" +
          "    <meta charset=\"UTF-8\" />\n" +
          "    <title>마카오뱅크</title>\n" +
          "  </head>\n" +
          content() +
          "  <body>\n" +
          "  </body>\n" +
          "</html>";
  }

  public abstract String content();
}

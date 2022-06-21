package utils;

public abstract class PageGenerator {
  public String html() {
    return "<!DOCTYPE html>\n" +
        "<html>\n" +
        "<head>\n" +
        "<meta charset=\"UTF-8\" />\n" +
        "<title>MakaoBank</title>\n" +
        "</head>\n" +
        "<body>\n" +
        navigation() +
        content() +
        "</body>\n" +
        "</html>";
  }

  public String navigation() {
    return "<nav>" +
        "<a href=\"/\">Home</a>" +
        " <a href=\"Account\">잔액 조회</a>" +
        " <a href=\"Transfer\">송금하기</a>" +
        "</nav>";
  }

  public abstract String content();
}

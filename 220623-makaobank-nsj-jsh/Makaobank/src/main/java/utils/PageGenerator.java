package utils;

public abstract class PageGenerator {
  public String html() {
    return "<!DOCTYPE html>" +
        "<html>" +
        "<head>" +
        "<meta charset=\"UTF-8\">" +
        "</head>" +
        "<body>" +
        navigation() +
        content() +
        "</body>" +
        "</html>";
  }

  public String navigation() {
    return "<nav>" +
        "<a href=\"/\">홈으로</a>" +
        "<a href=\"/account\">잔액조회</a>" +
        "<a href=\"/transfer\">송금</a>" +
        "</nav>";
  }

  public abstract String content();
}
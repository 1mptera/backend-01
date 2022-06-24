package utils;

public abstract class PageGenerator {
  public String html() {
  return      "<!DOCTYPE html>" +
                "<html>" +
                "<head>" +
                "<meta charset=\"UTF-8\">" +
                "</head>" +
                "<body>" +
                "<nav>" +
                navigation() +
                "</nav>" +
                content() +
                "</body>" +
                "</html>";
  }

  private String navigation() {
    return "<a href=\"/\">홈으로</a>" +
        "<a href=\"/account\">잔액 조회</a>" +
        "<a href=\"/transfer\">송금</a>";
  }

  public abstract String content();


}


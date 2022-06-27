package utils;

public abstract class PageGenerator {
  public String html() {
   return  "<!DOCTYPE html>\n" +
        "<html>\n" +
        "<head>\n" +
        "<meta charset=\"UTF-8\">\n" +
        "</head>\n" +
        "<body>\n" +
       navigation() +
       content() +
        "</body>\n" +
        "</html>\n";
  }
  public String navigation() {
    return "<nav>" +
        "<a href=\"/\">홈</a>\n" +
        "<a href=\"/account\">잔액 조회</a>\n" +
        "<a href=\"/transfer\">송금</a>\n" +
        "</nav>\n";
  }

  public abstract String content();
}

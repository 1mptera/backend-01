package utils;

import models.Account;

public abstract class PageGenerator {

  public String html() {
    return "<!DOCTYPE html>\n" +
        "<html>\n" +
        "<head>\n" +
        "<meta charset=\"UTF-8\">\n" +
        "<title>MakaoBank</title>\n" +
        "</head>\n" +
        "<body>\n" +
        navigation() +
        content() +
        "</body>\n" +
        "</html>";
  }

  private String navigation() {
    return  "<nav>\n" +
        "<a href= \"/\">홈으로</a>" +
        "<a href= \"/account\">잔액조회</a>" +
        "<a href= \"/transfer\">송금하기</a>" +
        "</nav>\n";
  }

  public abstract String content();


}


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
            navigation() +
            content() +
            "  <body>\n" +
            "  </body>\n" +
            "</html>";
  }

  public String navigation() {
    return
        "    <nav>" +
            "      <a href=\"/\">홈으로</a> \n" +
            "      <a href=\"/Account\">잔액 조회</a> \n" +
            "      <a href=\"/Transfer\">송금하기</a> \n" +
            "      <a href=\"/Transaction\">거래내역 조회</a>\n" +
            "    </nav>\n";
  }

  public abstract String content();
}

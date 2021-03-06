package utils;

public abstract class PageGenerator {
  public String html() {
    return
        "<!DOCTYPE html>\n" +
            "<html>\n" +
            "  <head>\n" +
            "    <meta charset=\"UTF-8\" />\n" +
            "    <title>마카오 뱅크</title>\n" +
            "  </head>\n" +
            "  <body>\n" +
            navigation() +
            content() +
            "  </body>\n" +
            "</html>\n";
  }

  public String navigation() {
    return
        "    <nav>" +
            "      <a href=\"/\">홈으로</a> \n" +
            "      <a href=\"/Account\">잔액 조회하기</a> \n" +
            "      <a href=\"/Transfer\">송금하기</a> \n" +
            "    </nav>";
  }

  public abstract String content();
}

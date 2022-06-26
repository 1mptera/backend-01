// 브라우저에서는 정상인데 scanner, inputStream 둘 중 하나 문제인데
// inputStream 인코딩 하는 방법 찾기기
// 웹에서 서버로 요청된 바디의 인코딩 형태는 application/x-www-form-urlencoded 임
// 서버에서 리퀘스트 바디를 얻어오면 그 바디의 스트링은 유티에프-8이 아닌 위의 인코딩된 형태이므로
// 영어가 아닌 문자를 정상적으로 사용하려면 유티에프-8로 다시 디코딩을 해줘야 함
// 스트링 value = URLDecoder.decode(value, StandardCharsets.UTF_8);
// 참고한 레퍼런스 : https://kkh0977.tistory.com/238/


package utils;

import com.sun.net.httpserver.HttpExchange;

import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Scanner;

public class FormParser {
  private HttpExchange exchange;

  public FormParser(HttpExchange exchange) {
    this.exchange = exchange;
  }

  public String parse() throws UnsupportedEncodingException {
    InputStream inputStream = exchange.getRequestBody();
    Scanner scanner = new Scanner(inputStream);

    String value = "";
    if (scanner.hasNextLine()) {
      String line = scanner.nextLine();
      //System.out.println(line);
      String[] keyAndValue = line.split("=");
      value = keyAndValue.length == 1 ? "" : keyAndValue[1];
    }
    /// added by minji
    value = URLDecoder.decode(value, StandardCharsets.UTF_8);

    return value;
  }

}

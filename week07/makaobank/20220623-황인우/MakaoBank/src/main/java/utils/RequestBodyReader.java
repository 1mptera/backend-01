package utils;

import com.sun.net.httpserver.HttpExchange;

import java.io.InputStream;
import java.util.Scanner;

public class RequestBodyReader {

  private final HttpExchange exchange;

  public RequestBodyReader(HttpExchange exchange) {
    this.exchange = exchange;
  }

  public String read() {
    InputStream inputStream = exchange.getRequestBody();
    Scanner scanner = new Scanner(inputStream);

    String line = "";

    if (scanner.hasNextLine()) {
      line = scanner.nextLine();
    }

    return line;
  }
}

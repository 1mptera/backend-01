package utils;

import com.sun.net.httpserver.HttpExchange;

import java.io.IOException;
import java.io.OutputStream;

public class MessageWriter {
  private HttpExchange exchange;

  public void write(String content) throws IOException {
    OutputStream outputStream = exchange.getResponseBody();

    exchange.sendResponseHeaders(200, content.getBytes().length);

    outputStream.write(content.getBytes());
    outputStream.flush();
    outputStream.close();
  }
}


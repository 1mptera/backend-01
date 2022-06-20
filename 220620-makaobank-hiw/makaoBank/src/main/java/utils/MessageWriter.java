package utils;

import com.sun.net.httpserver.HttpExchange;

import java.io.IOException;
import java.io.OutputStream;

public class MessageWriter {
  private final HttpExchange exchange;

  public MessageWriter(HttpExchange exchange) {
    this.exchange = exchange;
  }

  public void write(String context) throws IOException {
    exchange.sendResponseHeaders(200, context.getBytes().length);

    OutputStream outputStream = exchange.getResponseBody();
    outputStream.write(context.getBytes());
    outputStream.flush();
    outputStream.close();
  }
}

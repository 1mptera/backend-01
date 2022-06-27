package utils;

public class MessagePage {
  public String html(String todoList) {
    return "<!DOCTYPE html>\n" +
        "<html>\n" +
        "<head>\n" +
        "<meta charset=\"UTF-8\">\n" +
        "<title>TODO LIST</title>\n" +
        "</head>\n" +
        "<body>\n" +
        "<header>\n" +
        "<h1>TODO LIST</h1>\n" +
        "</header>\n" +
        "<main>\n" +
        "<form method=\"POST\" accept-charset=\"UTF-8\">\n" +
        "<span>Todo</span>\n" +
        "<input type=\"text\" name=\"todo\" />\n" +
        "<button type=\"submit\">create</button>\n" +
        "</form>\n" +
        "<form method=\"POST\">\n" +
        todoList +
        "</form>\n" +
        "</main>\n" +
        "</body>\n" +
        "</html>\n";
  }
}

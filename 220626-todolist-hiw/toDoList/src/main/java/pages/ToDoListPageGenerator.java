package pages;

import utils.ToDoListManager;

import java.util.stream.Collectors;

public class ToDoListPageGenerator {
  private final ToDoListManager toDoListManager;

  public ToDoListPageGenerator(ToDoListManager toDoListManager) {
    this.toDoListManager = toDoListManager;
  }

  public String html() {
    return "<!DOCTYPE html>\n" +
        "<html>\n" +
        "  <head>\n" +
        "    <meta charset=\"UTF-8\">\n" +
        "    <title>TODO LIST</title>\n" +
        "  </head>\n" +
        "  <body>\n" +
        title() +
        input() +
        lists() +
        "  </body>\n" +
        "</html>";
  }

  public String title() {
    return "    <h1>TODO LIST</h1>\n";
  }

  public String input() {
    return "    <form>\n" +
        "      <span>Todo</span>\n" +
        "      <input type=\"text\" />\n" +
        "      <button>create</button>\n" +
        "    </form>\n";
  }

  public String lists() {
    return "    <ul>\n" +
        toDoListManager.list().stream()
            .map(eachToDoList -> "      <li>" + eachToDoList.toDo() + "</li>\n")
            .collect(Collectors.joining()) +
        "    </ul>\n";
  }
}

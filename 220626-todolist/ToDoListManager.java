package utils;

import java.util.ArrayList;
import java.util.List;

public class ToDoListManager {
  private List<String> toDoList;

  public ToDoListManager() {
    toDoList = new ArrayList<>();
  }

  public void add(String todo) {
    this.toDoList.add(todo);

  }

  public String stack() {
    String stackedList = "";

    for (int i = 0; i < toDoList.size(); i += 1) {
      stackedList += "<p>" + toDoList.get(i) + " ";
      //(todolist 1 + todolist 2  ))

      //"human(X) hunter(O) hwang(O)"   - "human" = hunter hwang

      if (!toDoList.get(i).isBlank()) {
        stackedList += "<button type=\"submit\" name=" + i +">X</button>";
      }

      stackedList += "</p>\n";
    }

    System.out.println(stackedList);

    return stackedList;
  }
}

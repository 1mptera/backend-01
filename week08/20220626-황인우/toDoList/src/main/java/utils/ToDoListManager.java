package utils;

import models.ToDo;

import java.util.ArrayList;
import java.util.List;

public class ToDoListManager {
  List<ToDo> toDoList;

  public ToDoListManager() {
    toDoList = List.of(
        new ToDo("밥먹기"),
        new ToDo("리액트 공부하기"),
        new ToDo("침대개기"),
        new ToDo("엄마한테 전화하기"),
        new ToDo("출근하기")
    );
  }

  public List<ToDo> list() {
    return new ArrayList<>(toDoList);
  }
}

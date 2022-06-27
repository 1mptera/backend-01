package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToDoTest {

  @Test
  void toDo() {
    ToDo toDo = new ToDo("밥먹기");

    assertEquals("밥먹기", toDo.toDo());
  }
}
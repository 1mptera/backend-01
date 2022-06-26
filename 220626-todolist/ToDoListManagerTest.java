package utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToDoListManagerTest {

  @Test
  void stack() {
    ToDoListManager toDoListManager = new ToDoListManager();
    toDoListManager.add("Ride a bike");

    String stackedList = toDoListManager.stack();

    assertTrue(stackedList.contains("Ride a bike"),
        "No to do list message problem\n" + stackedList);
  }
}
package pages;

import org.junit.jupiter.api.Test;
import utils.ToDoListManager;

import static org.junit.jupiter.api.Assertions.*;

class ToDoListPageGeneratorTest {

  @Test
  void singleList() {
    ToDoListManager toDoListManager = new ToDoListManager();

    ToDoListPageGenerator toDoListPageGenerator =
        new ToDoListPageGenerator(toDoListManager);

    assertTrue(
        toDoListPageGenerator.html().contains("밥먹기"),
        "string에 리스트 내용 1 없거나 테스트와 다름"
    );
  }

  @Test
  void manyLists() {
    ToDoListManager toDoListManager = new ToDoListManager();

    ToDoListPageGenerator toDoListPageGenerator =
        new ToDoListPageGenerator(toDoListManager);

    assertTrue(
        toDoListPageGenerator.html().contains("밥먹기"),
        "string에 리스트 내용 1 없거나 테스트와 다름"
    );
    assertTrue(
        toDoListPageGenerator.html().contains("리액트 공부하기"),
        "string에 리스트 내용 1 없거나 테스트와 다름"
    );
    assertTrue(
        toDoListPageGenerator.html().contains("침대개기"),
        "string에 리스트 내용 1 없거나 테스트와 다름"
    );
  }
}

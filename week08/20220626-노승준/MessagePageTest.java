package utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MessagePageTest {
  @Test
  void DefaultHtml() {
    MessagePage messagePage = new MessagePage();

    String html = messagePage.html("");
    assertEquals("Hi!", html);
  }

  @Test
  void ToDoListMessage() {
    MessagePage messagePage = new MessagePage();

    String html = messagePage.html("양치하기");

    assertTrue(html.contains("TODO LIST"), "타이틀 문제\n" + html);
    assertTrue(html.contains("Todo"), "소제목 문제\n" + html);
    assertTrue(html.contains("<input"), "입력 칸 문제\n" + html);
    assertTrue(html.contains("<button"), "버튼 문제\n" + html);
    assertTrue(html.contains("양치하기"), "todo 문제\n" + html);
  }

}
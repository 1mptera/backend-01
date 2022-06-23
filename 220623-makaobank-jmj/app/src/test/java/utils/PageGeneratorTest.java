package utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PageGeneratorTest {
  @Test
  void creation() {
    PageGenerator pageGenerator = new PageGenerator();

    assertEquals("Hello, world!", pageGenerator.text());
  }

  @Test
  void nameWithAshal() {
    PageGenerator pageGenerator = new PageGenerator("Ashal");

    assertEquals("Hello, Ashal!", pageGenerator.text());
  }

  @Test
  void withEmptyName() {
    PageGenerator pageGenerator = new PageGenerator("");

    assertEquals("Hello, world!", pageGenerator.text());
  }

  @Test
  void withBlankName() {
    PageGenerator pageGenerator = new PageGenerator("  ");

    assertEquals("Hello, world!", pageGenerator.text());
  }

}
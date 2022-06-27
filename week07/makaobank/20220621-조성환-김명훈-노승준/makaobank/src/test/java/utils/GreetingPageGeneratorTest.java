package utils;



import org.junit.jupiter.api.Assertions;



import org.junit.jupiter.api.Test;

class GreetingPageGeneratorTest {
  GreetingPageGeneratorTest() {
  }

  @Test
  void defaultTest() {
    PageGenerator pageGenerator = new GreetingPageGenerator();
    Assertions.assertEquals("Hello, world!", pageGenerator.html());
  }

  @Test
  void hellosunghwan() {
    PageGenerator pageGenerator = new GreetingPageGenerator("sunghwan");
    Assertions.assertEquals("Hello, sunghwan!", pageGenerator.html());
  }

  @Test
  void TestIsBlank() {
    PageGenerator pageGenerator = new GreetingPageGenerator("    ");
    Assertions.assertEquals("Hello, world!", pageGenerator.html());
  }
}

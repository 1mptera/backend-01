import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WatermelonTest {
  @Test
  void defaultTest() {
    Watermelon watermelon = new Watermelon();

    assertEquals("", watermelon.solution(0));
  }

  @Test
  void inputExampleNumber() {
    Watermelon watermelon = new Watermelon();

    assertEquals("수박수", watermelon.solution(3));
    assertEquals("수박수박", watermelon.solution(4));
  }

  @Test
  void inputRandomNumber() {
    Watermelon watermelon = new Watermelon();

    assertEquals("수박수박수박수", watermelon.solution(7));
    assertEquals("수박수박수박수박수박", watermelon.solution(10));
  }
}

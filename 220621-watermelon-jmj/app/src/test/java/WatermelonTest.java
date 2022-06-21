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
  }
}

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CodingTest2Test {
  @Test
  void creation() {
    CodingTest2 codingTest2 = new CodingTest2();
    int[] a = new int[]{0};
    int[] b = new int[]{0};

    assertEquals(0, CodingTest2.solution(a, b));
  }
}

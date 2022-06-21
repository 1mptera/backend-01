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

  @Test
  void exampleNumber1() {
    CodingTest2 codingTest2 = new CodingTest2();
    int[] a = new int[]{1, 2, 3, 4};
    int[] b = new int[]{-3, -1, 0, 2};

    assertEquals(3, CodingTest2.solution(a, b));
  }

  @Test
  void exampleNumber2() {
    CodingTest2 codingTest2 = new CodingTest2();
    int[] a = new int[]{-1, 0, 1};
    int[] b = new int[]{1, 0, -1};

    assertEquals(-2, CodingTest2.solution(a, b));
  }
}

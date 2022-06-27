import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class CodingTestTest {
  @Test
  void randomNumber() {
    CodingTest codingTest = new CodingTest();

    assertArrayEquals(new int[]{3, 5}, codingTest.solution(new int[]{44, 1, 0, 0, 31, 25},
        new int[]{31, 10, 45, 1, 6, 19}));

  }

  @Test
  void sample() {
    CodingTest codingTest = new CodingTest();

    assertArrayEquals(new int[]{1, 1}, codingTest.solution(new int[]{20, 9, 3, 45, 4, 35},
        new int[]{45, 4, 35, 20, 3, 9}));

  }

}
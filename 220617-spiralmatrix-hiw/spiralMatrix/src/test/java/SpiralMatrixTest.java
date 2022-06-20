import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpiralMatrixTest {

  @Test
  void oneLength() {
    SpiralMatrix testApplication = new SpiralMatrix();

    int[][] testMatrix = new int[][]{
        {0}
    };

    assertArrayEquals(testMatrix, testApplication.process(1));
  }

  @Test
  void twoLength() {
    SpiralMatrix testApplication = new SpiralMatrix();

    int[][] testMatrix = new int[][]{
        {0, 1},
        {3, 2}
    };

    assertArrayEquals(testMatrix, testApplication.process(2));
  }

  @Test
  void threeLength() {
    SpiralMatrix testApplication = new SpiralMatrix();

    int[][] testMatrix = new int[][]{
        {0, 1, 2},
        {7, 8, 3},
        {6, 5, 4}
    };

    assertArrayEquals(testMatrix, testApplication.process(3));
  }
}

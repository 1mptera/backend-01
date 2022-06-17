import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SpiralMatrixTest {
  @Test
  void input2() {
    SpiralMatrix spiralMatrix = new SpiralMatrix();
    int[][] matrixForTest = new int[][]{{0, 1}, {3, 2}};
    int[][] matrixFromOrigin = spiralMatrix.compute(2);
    assertEquals(matrixForTest[0][0], matrixFromOrigin[0][0]);
    assertEquals(matrixForTest[0][1], matrixFromOrigin[0][1]);
    assertEquals(matrixForTest[1][0], matrixFromOrigin[1][0]);
    assertEquals(matrixForTest[1][1], matrixFromOrigin[1][1]);
  }

  @Test
  void input3() {
    SpiralMatrix spiralMatrix = new SpiralMatrix();
    int[][] matrixForTest = new int[][]{{0, 1, 2}, {7, 8, 3}, {6, 5, 4}};
    int[][] matrixFromOrigin = spiralMatrix.compute(3);
    assertEquals(matrixForTest[0][0], matrixFromOrigin[0][0]);
    assertEquals(matrixForTest[0][1], matrixFromOrigin[0][1]);
    assertEquals(matrixForTest[0][2], matrixFromOrigin[0][2]);
    assertEquals(matrixForTest[1][0], matrixFromOrigin[1][0]);
    assertEquals(matrixForTest[1][1], matrixFromOrigin[1][1]);
    assertEquals(matrixForTest[1][2], matrixFromOrigin[1][2]);
    assertEquals(matrixForTest[2][0], matrixFromOrigin[2][0]);
    assertEquals(matrixForTest[2][1], matrixFromOrigin[2][1]);
    assertEquals(matrixForTest[2][2], matrixFromOrigin[2][2]);
  }
}
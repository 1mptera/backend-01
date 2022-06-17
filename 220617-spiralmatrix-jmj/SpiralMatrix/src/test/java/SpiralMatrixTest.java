import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SpiralMatrixTest {
  @Test
  void input2() {
    SpiralMatrix spiralMatrix = new SpiralMatrix();
    int[][] matrixForTest = new int[][]{{1, 2}, {4, 3}};
    int[][] matrixFromOrigin = spiralMatrix.compute(2);
    assertEquals(matrixForTest[0][0], matrixFromOrigin[0][0]);
    assertEquals(matrixForTest[0][1], matrixFromOrigin[0][1]);
    assertEquals(matrixForTest[1][0], matrixFromOrigin[1][0]);
    assertEquals(matrixForTest[1][1], matrixFromOrigin[1][1]);
  }
}
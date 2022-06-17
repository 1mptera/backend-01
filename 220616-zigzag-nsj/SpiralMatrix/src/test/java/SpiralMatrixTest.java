import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpiralMatrixTest {
  private SpiralMatrix spiralMatrix;

  @Test
  void SpiralMatrix() {
    spiralMatrix = new SpiralMatrix();

    assertArrayEquals(new int[][]{{0,1,2},
                                  {7,0,3},
                                  {6,5,4}}, spiralMatrix.process(3));

    assertArrayEquals(new int[][]{{0,1,2,3},
                                  {11,12,13,4},
                                  {10,15,14,5},
                                  {9,8,7,6}}, spiralMatrix.process(4));
  }
}


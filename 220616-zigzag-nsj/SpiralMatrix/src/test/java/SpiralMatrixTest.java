import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpiralMatrixTest {
  @Test
  void firstLine() {
    SpiralMatrix spiralMatrix = new SpiralMatrix();

    assertArrayEquals(new int[][]{{0,1,2},{0,0,0},{0,0,0}}, spiralMatrix.process(3));
  }
}
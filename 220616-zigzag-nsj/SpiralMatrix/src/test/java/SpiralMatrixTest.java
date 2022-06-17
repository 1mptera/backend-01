import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpiralMatrixTest {
  @Test
  void outsideFirstLine() {
    SpiralMatrix spiralMatrix = new SpiralMatrix();

    assertArrayEquals(new int[][]{{0,1,2},
                                  {0,0,0},
                                  {0,0,0}}, spiralMatrix.process(3));
  }

  @Test
  void outsideSecondLine() {
    SpiralMatrix spiralMatrix = new SpiralMatrix();

    assertArrayEquals(new int[][]{{0,1,2},
                                  {0,0,3},
                                  {0,0,4}}, spiralMatrix.process(3));
  }

  @Test
  void outsideThirdLine() {
    SpiralMatrix spiralMatrix = new SpiralMatrix();

    assertArrayEquals(new int[][]{{0,1,2},
                                  {0,0,3},
                                  {6,5,4}}, spiralMatrix.process(3));
  }
}


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpiralMatrixTest {

  @Test
  void isInitializedNormally() {
    SpiralMatrix testApplication = new SpiralMatrix();

    assertNotNull(testApplication.process(1));
    assertNotNull(testApplication.process(5));
  }

  @Test
  void oneLength() {
    SpiralMatrix testApplication = new SpiralMatrix();

    int[][] testMatrix = new int[][]{
        {0}
    };

    assertArrayEquals(testMatrix, testApplication.process(1));
  }
}

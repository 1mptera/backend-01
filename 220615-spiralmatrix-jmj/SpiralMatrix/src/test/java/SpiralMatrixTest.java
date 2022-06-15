import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpiralMatrixTest {
  @Test
  void workingTest() {
    SpiralMatrix spiralMatrix = new SpiralMatrix();
    assertNotNull(spiralMatrix.compute(0));
    assertEquals("결과 없음", spiralMatrix.compute(1));
  }
}

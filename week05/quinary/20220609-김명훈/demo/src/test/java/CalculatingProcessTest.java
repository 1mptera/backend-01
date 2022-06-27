import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatingProcessTest {
  @Test
  void equals() {
    CalculatingProcess calculatingProcess = new CalculatingProcess();

    CalculatingProcess calculatingProcess1 = calculatingProcess.process(137);

    assertEquals("137,1022",CalculatingProcess.process(137));

  }

}
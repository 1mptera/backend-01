import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZigzagTest {

  @Test
  void lessThanOneRow() {
    Zigzag testApplication = new Zigzag();

    testApplication.setMembers("ABC", 3);
    assertEquals("ABC", testApplication.process());

    testApplication.setMembers("HELL", 8);
    assertEquals("HELL", testApplication.process());

    testApplication.setMembers("HANWHA", 6);
    assertEquals("HANWHA", testApplication.process());
  }

  @Test
  void oneZigzaging() {
    Zigzag testApplication = new Zigzag();

    testApplication.setMembers("ABCDE", 3);
    assertEquals("AEBDC", testApplication.process());

    testApplication.setMembers("HELLOMEGA", 6);
    assertEquals("HELALGOEM", testApplication.process());

    testApplication.setMembers("HANWHAE", 4);
    assertEquals("HEAANHW", testApplication.process());
  }
}

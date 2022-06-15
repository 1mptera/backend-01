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
}

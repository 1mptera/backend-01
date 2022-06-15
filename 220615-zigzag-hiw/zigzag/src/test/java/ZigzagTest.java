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
  void zigzagingOnce() {
    Zigzag testApplication = new Zigzag();

    testApplication.setMembers("ABCDE", 3);
    assertEquals("AEBDC", testApplication.process());

    testApplication.setMembers("HELLOMEGA", 6);
    assertEquals("HELALGOEM", testApplication.process());

    testApplication.setMembers("HANWHAE", 4);
    assertEquals("HEAANHW", testApplication.process());
  }

  @Test
  void zigzagingTwice() {
    Zigzag testApplication = new Zigzag();

    testApplication.setMembers("HELLOMEGAPTERA", 6);
    assertEquals("HTEPELARLGAOEM", testApplication.process());

    testApplication.setMembers("HANWHAEAGLES", 4);
    assertEquals("HEAAASNHGEWL", testApplication.process());

    testApplication.setMembers("ABCDEFGHIJKLMN", 4);
    assertEquals("AGMBFHLNCEIKDJ", testApplication.process());
  }

  @Test
  void zigzagingMoreThanThreeTimes() {
    Zigzag testApplication = new Zigzag();

    testApplication.setMembers("HELLOMEGAPTERA", 3);
    assertEquals("HOARELMGPEALET", testApplication.process());

    testApplication.setMembers("HANWHAEAGLESVICTORY22SEASONS", 4);
    assertEquals("HEVYSAAASIR2AONHGECO2ENWLTSS", testApplication.process());

    testApplication.setMembers("ABCDEFGHIJKLMNOPQRSTUVWXYZ", 6);
    assertEquals("AKUBJLTVCIMSWDHNRXEGOQYFPZ", testApplication.process());
  }
}

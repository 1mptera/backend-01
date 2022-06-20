import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ZigzagTest {
  @Test
  void makeListsTest() {
    Zigzag testApplication = new Zigzag();

    List<List<Character>> lists = new ArrayList<>();

    for (int i = 0; i < 4; i += 1) {
      List<Character> list = new ArrayList<>();
      lists.add(list);
    }

    assertEquals(lists, testApplication.makeLists(4));
  }
}

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ZigzagTest {
  @Test
  void makeEmptyListsTest() {
    Zigzag testApplication = new Zigzag();

    List<List<Character>> lists = new ArrayList<>();

    List<Character> List1 = new ArrayList<>();
    lists.add(List1);
    List<Character> List2 = new ArrayList<>();
    lists.add(List2);

    assertEquals(lists, testApplication.makeLists(2));
  }
}

package utils;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class FormParserTest {

  @Test
  void parse() {
    FormParser formParser = new FormParser();

    Map<String, String> formData = formParser.parse("to=179-20&amount=1000");

    assertEquals("179-20", formData.get("to"));
    assertEquals("1000", formData.get("amount"));
  }
}

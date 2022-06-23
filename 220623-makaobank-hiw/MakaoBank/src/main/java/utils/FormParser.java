package utils;

import java.util.HashMap;
import java.util.Map;

public class FormParser {

  public Map<String, String> parse(String line) {
    Map<String, String> formData = new HashMap<>();

    String[] context = line.split("&");

    for (int i = 0; i < context.length; i += 1) {
      String[] keyAndValues = context[i].split("=");

      formData.put(keyAndValues[0], keyAndValues[1]);
    }

    /*Map<String, String> formData = Arrays.stream(line.split("&"))
        .map(context -> context.split("="))
        .collect(Collectors.toCollection());*/

    return formData;
  }
}

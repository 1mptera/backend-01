package utils;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class FormParser {

  public Map<String, String> parse(String line) {
    Map<String, String> formData = Arrays.stream(line.split("&"))
        .map(context -> context.split("="))
        .collect(Collectors.toMap(
            i -> i[0],    //key
            i -> i[1]     //value
        ));

    return formData;
  }
}

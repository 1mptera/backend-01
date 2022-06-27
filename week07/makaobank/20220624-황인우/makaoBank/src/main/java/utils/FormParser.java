package utils;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class FormParser {
  public Map<String, String> parse(String line) {
    return Arrays.stream(line.split("&"))
        .map(each -> each.split("="))
        .collect(Collectors.toMap(
                i -> i[0],    //key
                i -> i[1]     //value
            )
        );
  }
}

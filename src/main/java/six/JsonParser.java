package six;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JsonParser {
  public static void main(String[] args) throws Exception {
    String json = "{\"name\":\"John Doe\"}";
      System.out.println(json);
    ObjectMapper mapper = new ObjectMapper();
    JsonNode rootNode = mapper.readTree(json);
    String name = rootNode.get("name").asText();
    String regex = "(?i)(\"name\":\\s*\")([^\"]+)(\")";

    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(json);
    while (matcher.find()) {
        String matchedText = matcher.group();
        String replacement = "$1<span style=\"color:red\">$2</span>$3";
        String modifiedJson = json.replace(matchedText, matcher.replaceFirst(replacement));
        System.out.println(modifiedJson);
    }
  }
}
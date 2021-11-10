import java.util.Arrays;
import java.util.stream.Collectors;

public class JadenCase {

    public String toJadenCase(String phrase) {
        // TODO put your code below this comment
        if (null != phrase) {
            if (!phrase.isEmpty()) {
                StringBuilder newPhrase = new StringBuilder();
                for (String word : phrase.split(" ")) {
                    newPhrase.append(word.substring(0, 1).toUpperCase())
                            .append(word.substring(1))
                            .append(" ");
                }
                return newPhrase.toString().trim();
            }
        }
        return null;
    }

    public String toJadenCase2(String phrase){
        if (null == phrase || phrase.length() == 0) {
            return null;
        }
        return Arrays.stream(phrase.split(" "))
                .map(i -> i.substring(0, 1).toUpperCase() + i.substring(1))
                .collect(Collectors.joining(" "));
    }
}

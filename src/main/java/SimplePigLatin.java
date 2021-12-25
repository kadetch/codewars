import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Move the first letter of each word to the end of it, then add "ay" to the end of the word. Leave punctuation marks untouched.
 * Examples
 * <p>
 * pigIt('Pig latin is cool'); // igPay atinlay siay oolcay
 * pigIt('Hello world !');     // elloHay orldway !
 */
public class SimplePigLatin {
    private static String punctuation = ",./:;'|\\/{}[]%$^&*?<>!@#~";

    public static String pigIt(String str) {
        String[] strArray = str.split(" ");
        StringBuilder newString = new StringBuilder();
        for (String word : strArray) {
            int I = -1;
            int S = -1;
            int E = -1;
            String a = "";
            System.out.println(word);
            for (int i = 0; i < word.length(); i++) {
                System.out.println(word.charAt(i));
                if (-1 == punctuation.indexOf(word.charAt(i))) {
                    if (I == -1) {
                        a = word.substring(i, i + 1);
                        I = i;
                        System.out.println("A=" + a);
                    }
                } else {
                    if ((S == -1) && (I == -1)) {
                        S = i;
                    } else {
                        E = i;
                    }
                }
            }
            if (-1 != I) {
                System.out.println("S=" + S + " E=" + E + " I=" + I);
                if ((S != -1) && (S < I)) {
                    newString.append(word.substring(S, I));
                }
                if ((E != -1) && (E > I)) {
                    newString.append(word.substring(I + 1, E));
                    newString.append(a + "ay");
                    newString.append(word.substring(E));
                } else {
                    newString.append(word.substring(I + 1));
                    newString.append(a + "ay");
                }
            } else newString.append(word);
            newString.append(" ");
        }
        System.out.println("=>" + newString.toString().trim());
        return newString.toString().trim();
    }

    public static String pigIt2(String str) {
        return str.replaceAll("(\\w)(\\w*)", "$2$1ay");
    }

    public static String pigIt3(String str) {
        return Arrays.stream(str.trim().split(" "))
//                .map(v -> v.matches("[a-zA-Z]+") ? v.substring(1).concat(v.substring(0, 1)).concat("ay") : v)
                .map(v -> v.matches("([a-zA-Z])([a-zA-Z]*)") ? v.substring(1).concat(v.substring(0, 1)).concat("ay") : v)
                .collect(Collectors.joining(" "));
    }

    public static String pigIt4(String str) {
        return Arrays.stream(str.split(" ")).map(SimplePigLatin::pigify).collect(Collectors.joining(" "));
    }

    private static String pigify(String word){
        return word.length() > 1 || Character.isLetter(word.charAt(0)) ? word.substring(1) + word.charAt(0) + "ay" : word;

    }
}

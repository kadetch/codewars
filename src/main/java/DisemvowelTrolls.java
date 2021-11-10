public class DisemvowelTrolls {

    public static String getWithoutVowels(String text) {
        StringBuilder resultText = new StringBuilder().append(text);
        final String VOWELS = "AaEeIiOoUu";
        for (char letterVowel : VOWELS.toCharArray()) {

//            text.replace(String.valueOf(letterVowel), "");
            for (int i = 0; i < resultText.length(); i++) {
                if (resultText.charAt(i) == letterVowel) {
                    resultText.deleteCharAt(i);
                }
            }
        }
        return resultText.toString();
    }
}

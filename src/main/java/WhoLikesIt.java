/**
 * You probably know the "like" system from Facebook and other pages.
 * People can "like" blog posts, pictures or other items. We want to create the text
 * that should be displayed next to such an item.
 * <p>
 * Implement the function which takes an array containing the names of people that
 * like an item. It must return the display text as shown in the examples:
 * <p>
 * []                                -->  "no one likes this"
 * ["Peter"]                         -->  "Peter likes this"
 * ["Jacob", "Alex"]                 -->  "Jacob and Alex like this"
 * ["Max", "John", "Mark"]           -->  "Max, John and Mark like this"
 * ["Alex", "Jacob", "Mark", "Max"]  -->  "Alex, Jacob and 2 others like this"
 * <p>
 * Note: For 4 or more names, the number in "and 2 others" simply increases.
 */
public class WhoLikesIt {
    private static final String LIKES = " likes this";
    private static final String LIKE = " like this";
    private static final String NO_ONE_LIKES = "no one" + LIKES;
    private static final String OTHERS_LIKES = " others" + LIKE;

    public static String whoLikesIt(String... names) {
        String textToDisplay = null;
        if (names.length == 0)
            textToDisplay = new String(NO_ONE_LIKES);
        if (names.length == 1)
            textToDisplay = new String(names[0] + LIKES);
        if (names.length == 2)
            textToDisplay = new String(names[0] + " and " + names[1] + LIKE);
        if (names.length == 3)
            textToDisplay = new String(names[0] + ", " + names[1] + " and " + names[2] + LIKE);
        if (names.length > 3)
            textToDisplay = new String(names[0] + ", " + names[1] + " and " + Integer.toString(names.length - 2) + OTHERS_LIKES);
        return textToDisplay;
    }

    public static String whoLikesIt2(String... names) {
        final String Template1 = "%s likes this";
        final String Template2 = "%s and %s like this";
        final String Template3 = "%s, %s and %s like this";
        final String TemplateN = "%s, %s and %d others like this";
        return
                names.length == 0 ? "no one likes this" :
                        names.length == 1 ? String.format(Template1, names[0]) :
                                names.length == 2 ? String.format(Template2, names[0], names[1]) :
                                        names.length == 3 ? String.format(Template3, names[0], names[1], names[2]) :
                                                String.format(TemplateN, names[0], names[1], names.length - 2);
    }

    public static String whoLikesIt3(String... nms) {
        switch (nms.length) {
            case 0:
                return "no one likes this";
            case 1:
                return String.format("%s likes this", nms[0]);
            case 2:
                return String.format("%s and %s like this", nms[0], nms[1]);
            case 3:
                return String.format("%s, %s and %s like this", nms[0], nms[1], nms[2]);
            default:
                return String.format("%s, %s and %d others like this", nms[0], nms[1], nms.length - 2);
        }
    }
}

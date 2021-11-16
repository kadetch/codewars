/**
 * Write a function, which takes a non-negative integer (seconds) as input and returns the time in a human-readable format (HH:MM:SS)
 * <p>
 * HH = hours, padded to 2 digits, range: 00 - 99
 * MM = minutes, padded to 2 digits, range: 00 - 59
 * SS = seconds, padded to 2 digits, range: 00 - 59
 * <p>
 * The maximum time never exceeds 359999 (99:59:59)
 * <p>
 * You can find some examples in the test fixtures.
 */
public class HumanReadableTime {
    public static String makeReadable(int seconds) {
        int minutes = 0;
        int hours = 0;
        // Do something
        // 120 seconds = 1200/60 = 200 minutes = 200/60 = 3 hours 20 minutes
        if (seconds > 59) {
            minutes = seconds / 60;
            seconds = seconds - minutes * 60;
        }
        if (minutes > 59) {
            hours = minutes / 60;
            minutes = minutes - hours * 60;
        }
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }

}

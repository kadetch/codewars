public class DigitalRoot {
    public static int getSumOfDigital(int digital) {
        return (digital < 10) ? digital : getInteger(digital);
    }

    private static Integer getInteger(int digital) {
        StringBuilder digitalText = new StringBuilder().append(digital);
        while (digitalText.length() > 1) {
            int sum = 0;
            for (int i = 0; i < digitalText.length(); i++) {
                sum += Integer.parseInt(digitalText.charAt(i) + "");
            }
            digitalText.delete(0, digitalText.length()).append(sum);
        }
        return Integer.valueOf(digitalText.toString());
    }

    public static int digitalRoot(int n) {
        return (n < 10) ? n : digitalRoot(n / 10 + n % 10);
    }

    public static int digital_root(int n) {
        return (n != 0 && n%9 == 0) ? 9 : n % 9;
    }
}

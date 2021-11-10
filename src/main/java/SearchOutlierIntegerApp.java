import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class SearchOutlierIntegerApp {
    public static void main(String[] args) {
        System.out.println("== App Search Outlier Integer in Array ==");
        List<Integer> arrayToFind = new ArrayList<Integer>();
        arrayToFind.add(1);
        arrayToFind.add(4);
        arrayToFind.add(12);
        arrayToFind.add(110);
        arrayToFind.add(132);

        showResultMessage(new OutlierIntegerInArray().getOutlier(arrayToFind));

        arrayToFind.clear();

        arrayToFind.add(1);
        arrayToFind.add(3);
        arrayToFind.add(5);
        arrayToFind.add(7);
        arrayToFind.add(9);
        arrayToFind.add(11);
        arrayToFind.add(101);
        arrayToFind.add(155);
        arrayToFind.add(159);
        arrayToFind.add(200);

        showResultMessage(new OutlierIntegerInArray().getOutlier(arrayToFind));

        arrayToFind.clear();
        arrayToFind.add(1000);
        arrayToFind.add(30000);
        showResultMessage(new OutlierIntegerInArray().getOutlier(arrayToFind));

        arrayToFind.clear();
        arrayToFind.add(1000);
        arrayToFind.add(30000);
        arrayToFind.add(40000);
        arrayToFind.add(50000);
        arrayToFind.add(70000);
        showResultMessage(new OutlierIntegerInArray().getOutlier(arrayToFind));

        useDisemvowelTrolls();

        useJadenCase();

        // To permute string
        System.out.println("++++++++++++++++++++++++");
        permuteAndPrint("ABCDF");
        System.out.println();
        System.out.println(Permuter.permuteAndStore("ABCD"));
        Permuter.permuteAbsPrintStream("TEST");

        // Is a word palindrome?
        System.out.println();
        System.out.println("++++++++++++++++++++++++");
        System.out.println("Is word 'madam' palindrome? " + isPalindrome("madam"));
        System.out.println("Is word 'madame' palindrome? " + isPalindrome("madame"));
        System.out.println("Is word 'madam' palindrome? " + isPalindrome2("madam"));
        System.out.println("Is word 'madame' palindrome? " + isPalindrome2("madame"));
        System.out.println("Is word 'madam' palindrome? " + isPalindrome3("madam"));
        System.out.println("Is word 'madame' palindrome? " + isPalindrome3("madame"));
        System.out.println("Is word 'madam'  palindrome? " + isPalindrome4("madam"));
        System.out.println("Is word 'madame' palindrome? " + isPalindrome4("madame"));
    }


    private static void showResultMessage(Integer outlier) {
        if (outlier == null) {
            System.out.println("Array does not contain the outlier integer");
        } else if (outlier == -1) {
            System.out.println("Size of array is incorrect");
        } else {
            System.out.println("The outlier integer is the array is " + outlier);
        }
    }

    private static void useDisemvowelTrolls() {
        System.out.println(DisemvowelTrolls.getWithoutVowels("Array does not contain the outlier integer"));
        System.out.println(DisemvowelTrolls.getWithoutVowels("Size of array is incorrect"));
        System.out.println(DisemvowelTrolls.getWithoutVowels("The outlier integer is the array is"));
    }

    private static void useJadenCase() {
        System.out.println("== Use Jaden Case ==");
        JadenCase jadenCase = new JadenCase();
        jadenCase.toJadenCase("How can mirrors be real if our eyes aren't real");
        jadenCase.toJadenCase("");
        jadenCase.toJadenCase(null);
        jadenCase.toJadenCase("most trees are blue");
    }

    public static void permuteAndPrint(String str) {
        //permuteAndPrint("", str);
        Permuter.permuteAndPrint(str);
    }

    public static boolean isPalindrome(String str){
        int left = 0;
        int right = str.length()-1;
        while (right > left){
            if (str.charAt(left) != str.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }

    public static boolean isPalindrome2(String str) {
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome3(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }

    public static boolean isPalindrome4(String str) {
        return IntStream.range(0, str.length() / 2)
                .noneMatch(p -> str.charAt(p) !=
                        str.charAt(str.length() - p - 1));
    }
}

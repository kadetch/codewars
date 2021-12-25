import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Find the unknown digit
 *
 * To give credit where credit is due: This problem was taken from the ACMICPC-Northwest
 * Regional Programming Contest. Thank you problem writers.
 *
 * You are helping an archaeologist decipher some runes. He knows that this ancient society
 * used a Base 10 system, and that they never start a number with a leading zero. He's figured
 * out most of the digits as well as a few operators, but he needs your help to figure out the
 * rest.
 *
 * The professor will give you a simple math expression, of the form
 * [number][op][number]=[number]
 *
 * He has converted all of the runes he knows into digits. The only operators he knows are
 * addition (+),subtraction(-), and multiplication (*), so those are the only ones that will
 * appear. Each number will be in the range from -1000000 to 1000000, and will consist of only
 * the digits 0-9, possibly a leading -, and maybe a few ?s. If there are ?s in an expression,
 * they represent a digit rune that the professor doesn't know (never an operator, and never
 * a leading -). All of the ?s in an expression will represent the same digit (0-9), and it
 * won't be one of the other given digits in the expression. No number will begin with a 0 unless
 * the number itself is 0, therefore 00 would not be a valid number.
 *
 * Given an expression, figure out the value of the rune represented by the question mark.
 * If more than one digit works, give the lowest one. If no digit works, well, that's bad news
 * for the professor - it means that he's got some of his runes wrong. output -1 in that case.
 *
 * Complete the method to solve the expression to find the value of the unknown rune. The method
 * takes a string as a paramater repressenting the expression and will return an int value
 * representing the unknown rune or -1 if no such rune exists.
 */
public class Runes {

    enum Operation {
        ADDITION,
        SUBTRACTION,
        MULTIPLICATION
    }

    public static int solveExpression(final String expression) {
        int missingDigit = -1;
        //Write code to determine the missing digit or unknown rune
        //Expression will always be in the form
        //(number)[opperator](number)=(number)
        //Unknown digit will not be the same as any other digits used in expression

        String[] parts = new String[3];

        getParts(expression, parts);

        Operation operation = getOperation(expression, parts);

        int unknow = -1;
        boolean unknowns = false;
        int[] digits = new int[3];
        for (int i = 0; i < parts.length; i++) {
            if (!parts[i].contains("?")) {
                digits[i] = Integer.parseInt(parts[i]);
            } else {
                if (parts[i].length() == 1) {
                    unknow = i;
                } else {
                    unknowns = true;
                }
            }
        }

        if (!unknowns) {
            missingDigit = getResultOperation(digits, operation, unknow);
        } else {
            // получить набор релевантный цыфр для подстановки
            Set<Integer> setNumbers = new HashSet<Integer>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
            expression.chars().forEach(e -> setNumbers.remove(Character.getNumericValue(e)));
            // Проверить случаи ?, ?? и т.д. на 0, 00 и т.д.
            if ((parts[0].matches("\\?+")) || (parts[1].matches("\\?+"))){
                setNumbers.remove(0);
            }
            // подставить цифры
            for (Integer digit : setNumbers) {
                digits[0] = Integer.parseInt(parts[0].replace("?", Integer.toString(digit)));
                digits[1] = Integer.parseInt(parts[1].replace("?", Integer.toString(digit)));
                digits[2] = Integer.parseInt(parts[2].replace("?", Integer.toString(digit)));
                // вычислить выражение и
                int result = getResultOperation(digits, operation, 2);
                // сравнить результат с ожидаемым => совпал - завершить, нет - на очередной круг
                if (digits[2] == result) {
                    missingDigit = digit;
                    break;
                }
            }
        }
        System.out.print(expression +" => " + missingDigit);
        return missingDigit;
    }

    private static Operation getOperation(String expression, String[] parts) {
        Operation operation;

        char codeOperation = expression.charAt(parts[0].length());
        if (codeOperation == '+')
            operation = Operation.ADDITION;
        else if (codeOperation == '-')
            operation = Operation.SUBTRACTION;
        else
            operation = Operation.MULTIPLICATION;
        return operation;
    }

    private static void getParts(String expression, String[] parts) {
        String[] splitText = expression.split("[+\\-*=]");
        int length = splitText.length;
        int a = 0;
        for (int i = 0; i < length; i++) {
            if (splitText[i].length() == 0) {
                i++;
                parts[a] = "-" + splitText[i];
            } else parts[a] = splitText[i];
            a++;
        }
    }

    private static int getResultOperation(int[] digits, Operation operation, int unknown) {
        int result = -1;

        if (operation == Operation.ADDITION) {
            if (unknown == 0) {
                result = getOperation(digits[2], '-', digits[1]);
            }
            if (unknown == 1) {
                result = getOperation(digits[2], '-', digits[0]);
            }
            if (unknown == 2) {
                result = getOperation(digits[0], '+', digits[1]);
            }
        }
        if (operation == Operation.SUBTRACTION) {
            if (unknown == 0) {
                result = getOperation(digits[2], '+', digits[1]);
            }
            if (unknown == 1) {
                result = getOperation(digits[0], '-', digits[2]);
            }
            if (unknown == 2) {
                result = getOperation(digits[0], '-', digits[1]);
            }
        }
        if (operation == Operation.MULTIPLICATION) {
            if (unknown == 0) {
                result = getOperation(digits[2], '/', digits[1]);
            }
            if (unknown == 1) {
                result = getOperation(digits[2], '/', digits[0]);
            }
            if (unknown == 2) {
                result = getOperation(digits[0], '*', digits[1]);
            }
        }
        return result;
    }

    private static int getOperation(int digit1, char operation, int digit2) {
        int result = -1;
        switch (operation) {
            case '+':
                result = digit1 + digit2;
                break;
            case '-':
                result = digit1 - digit2;
                break;
            case '*':
                result = digit1 * digit2;
                break;
            case '/':
                result = digit1 / digit2;
                break;
        }
        return result;
    }

}

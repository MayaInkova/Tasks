package arrays;
//програма, която сравнява два масива от тип char лексикографски (буква по буква) и проверява кой от двата е по-рано в лексикографската подредба.
import java.util.Scanner;

public class LexicographicComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете първия низ: ");
        String str1 = scanner.next();

        System.out.print("Въведете втория низ: ");
        String str2 = scanner.next();

        int minLength = Math.min(str1.length(), str2.length());
        boolean areEqual = true;

        for (int i = 0; i < minLength; i++) {
            if (str1.charAt(i) < str2.charAt(i)) {
                System.out.println("Низът \"" + str1 + "\" е по-рано в лексикографската подредба от низа \"" + str2 + "\".");
                areEqual = false;
                break;
            } else if (str1.charAt(i) > str2.charAt(i)) {
                System.out.println("Низът \"" + str2 + "\" е по-рано в лексикографската подредба от низа \"" + str1 + "\".");
                areEqual = false;
                break;
            }
        }

        if (areEqual && str1.length() != str2.length()) {
            if (str1.length() < str2.length()) {
                System.out.println("Низът \"" + str1 + "\" е по-рано в лексикографската подредба от низа \"" + str2 + "\".");
            } else {
                System.out.println("Низът \"" + str2 + "\" е по-рано в лексикографската подредба от низа \"" + str1 + "\".");
            }
        } else if (areEqual) {
            System.out.println("Низовете са еднакви.");
        }
    }
}

package arrays;
//програма, която създава масив с всички букви от латинската азбука.
// Да се даде възможност на потребител да въвежда дума от конзолата и в резултат да се извеждат индексите на буквите от думата.
import java.util.Scanner;

public class LetterIndices {
    public static void main(String[] args) {
        // Създаване на масив с всички букви от латинската азбука
        char[] alphabet = new char[26];
        for (int i = 0; i < 26; i++) {
            alphabet[i] = (char) ('a' + i);
        }

        // Четене на дума от потребителя
        Scanner scanner = new Scanner(System.in);
        System.out.print("Въведете дума: ");
        String word = scanner.nextLine().toLowerCase();

        // Извеждане на индексите на буквите от думата
        System.out.println("Индексите на буквите в думата \"" + word + "\":");
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            int index = letter - 'a';
            if (index >= 0 && index < 26) {
                System.out.println(letter + ": " + index);
            } else {
                System.out.println(letter + ": Невалидна буква");
            }
        }
    }
}

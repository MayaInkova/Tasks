package Methods;

import java.util.Scanner;
// Имаме стринг от конзолата и принтираме средата

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        printMiddleChar(text);

    }

    public  static  void printMiddleChar( String text) {
        if (text.length() % 2 == 0) {
            System.out.print(text.charAt(text.length()/ 2-1 ));
            System.out.print(text.charAt(text.length()/ 2));
        }
        else  {
            //нечетно
            System.out.print(text.charAt(text.length()/ 2));
        }
    }
}

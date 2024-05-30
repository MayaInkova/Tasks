package Exam01;

import java.util.Scanner;

// търсим съвпадения с регулярен израз и изваждаме само част от текст

public class TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String message = scanner.nextLine();

        String command = scanner.nextLine();
        while (!command.equals("Decode")) {
            String[] comandParts = command.split(" \\|");
            String comandsName = comandParts[0];
            switch (comandsName) {
                case "ChangeAll":
                    message = changeAll(message, comandParts[1], comandParts[2]);
                    break;
                case "Insert":
                    message = insert(message, Integer.parseInt(comandParts[1]), comandParts[2]);
                    break;
                case "Move":
                    message = move(message, Integer.parseInt(comandParts[1]));
                    break;
                default:
                    throw new IllegalStateException("Unknown command" + comandsName);

            }

            command = scanner.nextLine();

        }
        System.out.println("The decrypted message is:" + message);

    }

    private static String changeAll(String message, String substr, String replacement) {
        return message.replace(substr,replacement);


    }

    private static String insert(String message, int index, String substr) {
        String firstPart = message.substring(0,index);
        String  secondPart= message.substring(index);
        return  firstPart+ substr + secondPart;


    }


    private static String move(String message, int lenght) {

        String  firstPart = message.substring(0,lenght);
        String  secondPart = message.substring(lenght);
        return secondPart + firstPart;

    }

    }














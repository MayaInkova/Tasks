package basics;

import java.util.Scanner;

// подаден user , а password наобратно имаме 4 опита

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter username:");
        String username = scanner.nextLine();
        String reversedUsername = "";

        for (int i = username.length() - 1; i >= 0; i--) {
            reversedUsername += username.charAt(i);
        }

        boolean isLogged = false;
        for (int i = 0; i < 4; i++) {
            System.out.println("Enter password:");
            String inputPassword = scanner.nextLine();

            if (inputPassword.equals(reversedUsername)) {
                System.out.printf("User %s logged in:", username);
                isLogged = true;
                break;
            } else {
                System.out.println("Incorrect password. Try again.");
            }
        }
        if (!isLogged) {
            System.out.printf("User %s blocked!", username);
        }
    }
}

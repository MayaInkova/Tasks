package methods;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        // Въвеждане на стойността на променливата n
        System.out.print("n = ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println();

        // Отпечатване на горната част на триъгълника
        for (int line = 1; line <= n; line++) {
            printLine(1, line);
        }

        // Отпечатване на долната част на триъгълника,
        // която е под най-дългия ред
        for (int line = n - 1; line >= 1; line--) {
            printLine(1, line);
        }
    }

    private static void printLine(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(" " + i);
        }
        System.out.println();
    }
}


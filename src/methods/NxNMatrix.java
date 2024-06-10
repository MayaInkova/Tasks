package methods;
// Matrica ako imame 3 imame 3 na 3 i t.n

import java.util.Scanner;

public class NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        printNxNMatrix (n);
    }
    public  static  void printNxNMatrix(int n) {
        // vyrti po redovete
        for (int r = 0; r <n ; r++) {
            // po koloni
            for (int c = 0; c <n ; c++) {
                System.out.print(n + " ");

            }
            System.out.println();

        }
    }
}

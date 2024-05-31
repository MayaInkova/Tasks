package Loops;
//Програма, която пресмята на колко нули завършва факториела на дадено число. Примери:
//N = 10 -> N! = 3628800 -> 2
//  N = 20 -> N! = 2432902008176640000 -> 4
import java.util.Scanner;

public class FactorialTrailingZeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете число N: ");
        int N = scanner.nextInt();

        int countZeros = countTrailingZeros(N);

        System.out.println("Броят на нулите в края на " + N + "! е: " + countZeros);
    }

    public static int countTrailingZeros(int N) {
        int count = 0;

        // Преброяване на броя на петици във факториела
        for (int i = 5; N / i >= 1; i *= 5) {
            count += N / i;
        }

        return count;
    }
}

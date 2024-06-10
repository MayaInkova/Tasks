package loops;
//програма, която по дадено число N отпечатва случайно число между 1 и N.
import java.util.Random;
import java.util.Scanner;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Въведете число N: ");
        int N = scanner.nextInt();

        int randomNumber = random.nextInt(N) + 1;

        System.out.println("Случайно число между 1 и " + N + " е: " + randomNumber);
    }
}

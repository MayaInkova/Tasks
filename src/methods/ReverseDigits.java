package methods;
// метод, който отпечатва цифрите на дадено десетично число в обратен ред. Например 256, трябва да бъде отпечатано като 652.
public class ReverseDigits {
    public static void main(String[] args) {
        reversePrint(256);
    }

    // Метод за отпечатване на цифрите в обратен ред
    public static void reversePrint(int number) {
        while (number > 0) {
            int digit = number % 10;
            System.out.print(digit);
            number /= 10;
        }
        System.out.println();
    }
}

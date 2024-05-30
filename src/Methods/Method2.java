package Methods;

// Създайте метод getMax() с два целочислени (int) параметъра, който връща по-голямото от двете числа.
// Напишете програма, която прочита три цели числа от конзолата и отпечатва най-голямото от тях,
// изпол­звайки метода getMax().

import java.util.Scanner;

public class Method2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Четене на три цели числа от конзолата
        System.out.println("Enter first number:");
        int num1 = scanner.nextInt();

        System.out.println("Enter second number:");
        int num2 = scanner.nextInt();

        System.out.println("Enter third number:");
        int num3 = scanner.nextInt();

        // Намиране на най-голямото число чрез метода getMax
        int maxOfFirstTwo = getMax(num1, num2);
        int maxNumber = getMax(maxOfFirstTwo, num3);

        // Отпечатване на най-голямото число
        System.out.println("The largest number is: " + maxNumber);



    }
    public static  int getMax ( int num1,int num2){
        if (num1 > num2){
            return  num1;

        }else {
            return num2;

        }

    }
}

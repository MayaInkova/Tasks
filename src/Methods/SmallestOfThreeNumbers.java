package Methods;

import java.util.Arrays;
import java.util.Scanner;
// Метод ,който принтира най-малкото от три числа

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1=Integer.parseInt(scanner.nextLine());
        int num2=Integer.parseInt(scanner.nextLine());
        int num3=Integer.parseInt(scanner.nextLine());

         int smallestNumber = getSmallestNumber (num1,num2,num3);

        System.out.println(smallestNumber);

    }
    private  static  int getSmallestNumber(int num1,int num2,int num3) {
        int [] numbers = { num1,num2,num3};
        Arrays.sort(numbers);
        return  numbers[0];
    }
}

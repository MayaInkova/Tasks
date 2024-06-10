package basics;

import java.util.Scanner;
//разбиваме едно число намираме му факториела и проверяваме числото
// 5! = 5*4*3*2*1 = 120
public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        String input = scanner.nextLine();
        int number = Integer.parseInt(input);
        int num = number;
        int allDigitsFact = 0;

        for (int i = 0; i<input.length();i++){
           int digit =  num % 10;
           num /= 10;

           int fact = 1;

            for (int j = 1; j <=digit ; j++) {
                fact *= j;

            }
           allDigitsFact += fact;

        }
        if (number == allDigitsFact){
            System.out.println("yes");

        }else {
            System.out.println("no");

        }


    }
}

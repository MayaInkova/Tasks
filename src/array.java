
//Напишете програма която получава от стандартния вход 5 низа, разделени с интервал и записва низовете в масив.
// Отпечатва низовете на екрана.

import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        String strings[] = new String[5];
        String input= scanner.nextLine();
        strings = input.split("");
        for (String str:strings){
            System.out.println(str);
        }
    }
}

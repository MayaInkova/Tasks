package Basics;

import java.util.Scanner;
//програма получава масив където 1 елемент отива отзад(ротация)


public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] array = scanner.nextLine().split(" ");
        int rotations = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <rotations ; i++) {
            String firstElement = array [0];
            // местя всички 1 ел. наляво без 1

            for (int j = 0; j <array.length-1 ; j++) {
                array [j]= array[j+1];



            }
            //добавяме 1 елемент на последната позиция

            array[array.length-1]= firstElement;



        }
        System.out.println( String .join(" ", array));

    }
}

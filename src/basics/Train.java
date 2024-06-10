package basics;

import java.util.Scanner;

//Влак, ще ни е дадено брой вагони с n  колко човека ше се качат
// Да принтираме целия влак и броя хора в него

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wagons = Integer.parseInt(scanner.nextLine());
        int [] train = new int [wagons];

        for (int i = 0; i <train.length ; i++) {
            train[i]=Integer.parseInt (scanner.nextLine());


        }
        int allPeople = 0;
        for (int i = 0; i <train.length ; i++) {
            allPeople += train[i];
            System.out.println(train[i]+ " ");

        }
        System.out.println(allPeople);

    }
}

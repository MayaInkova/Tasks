package basics;

import java.util.Scanner;

//Асансъор колко места и колко души имаме да изпринтираме колко пъти ще се дрвижи асансъора

public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int p = Integer.parseInt(scanner.nextLine());

        double courses = Math.ceil((double) n/p);
        //др вариант е да си  четем n като double и да не кастваме

        System.out.printf("%.0f", courses);
    }

}

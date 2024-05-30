
//Напишете програма, която по зададени две страни на правоъгълник изчислява и отпечатва неговото лице.
// Дължините на страните се въвеждат от стандартния вход.


import java.sql.SQLOutput;
import java.util.Scanner;

public class face {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        double length = scanner.nextDouble();
        double width =scanner.nextDouble();

        double face= length * width;
        System.out.println("Face:"+ face);

    }

}

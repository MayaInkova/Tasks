import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        printIntroduction ();

        Scanner scanner = new Scanner (System.in);

        double bmi = getBMI(scanner);

        String status = getStatus(bmi);

        reportResults(bmi,status);
    }

    public static void printIntroduction() {

    }
    public  static double getBMI(Scanner scanner) {
        double height = scanner.nextDouble();
        double weight = scanner.nextDouble();

        double heightInCm = height * 2.54;
        double weightInKg = weight / 2.2046;

        return  bmiFor(weightInKg,heightInCm);

    }
     public  static  double bmiFor(double weight,double height){
        return  weight * 703 / (height * height);
     }
     public  static  String getStatus(double bmi) {
        if (bmi <= 18.5) {
            return "underweight";
        } else if (bmi <= 25) {
            return "normal";
        } else if (bmi <= 30) {
            return "overweight";
        }else  {
            return  "obese";


        }

     }
     public  static  void reportResults (double bmi,String status) {
       double roundedBMI = Math.round(bmi * 100.0) / 100.0;
         System.out.println("BMI is:"+ roundedBMI);
         System.out.println("Status: "+ status);

     }

}

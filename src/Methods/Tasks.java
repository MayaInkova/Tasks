package Methods;
//Обръща последователността на цифрите на едно число.
// Пресмята средното аритметично на дадена редица.
//Решава линейното уравнение a * x + b = 0.
//Създайте подходящи методи за всяка една от задачите.

// програмата е написана така че на потребителя да му бъде изведено текстово меню, от което да избира коя задача да решава.
import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Изберете опция:");
            System.out.println("1. Обръщане на число");
            System.out.println("2. Пресмятане на средното аритметично на редица");
            System.out.println("3. Решаване на линейно уравнение");
            System.out.println("4. Изход");
            System.out.print("Вашият избор: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    reverseNumber();
                    break;
                case 2:
                    calculateAverage();
                    break;
                case 3:
                    solveLinearEquation();
                    break;
                case 4:
                    System.out.println("Довиждане!");
                    return;
                default:
                    System.out.println("Невалиден избор. Моля, опитайте отново.");
            }
        }
    }

    // Метод за обръщане на число
    public static void reverseNumber() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Моля, въведете число: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Грешка: Числото трябва да е неотрицателно.");
            return;
        }

        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        System.out.println("Обърнатото число е: " + reversedNumber);
    }

    // Метод за пресмятане на средното аритметично на редица
    public static void calculateAverage() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Моля, въведете броя на елементите в редицата: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Грешка: Редицата не трябва да е празна.");
            return;
        }

        double sum = 0;
        System.out.println("Моля, въведете елементите на редицата:");
        for (int i = 0; i < n; i++) {
            double num = scanner.nextDouble();
            sum += num;
        }

        double average = sum / n;
        System.out.println("Средното аритметично на редицата е: " + average);
    }

    // Метод за решаване на линейно уравнение
    public static void solveLinearEquation() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Моля, въведете коефициент a: ");
        double a = scanner.nextDouble();

        if (a == 0) {
            System.out.println("Грешка: Коефициентът a не трябва да е 0.");
            return;
        }

        System.out.print("Моля, въведете коефициент b: ");
        double b = scanner.nextDouble();

        double x = -b / a;
        System.out.println("Решение на уравнението " + a + " * x + " + b + " = 0 е: x = " + x);
    }
}


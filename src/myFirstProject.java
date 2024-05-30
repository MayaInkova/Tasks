import java.util.Scanner;


//Създайте проект myFirstProject. Създайте клас myFirstClass , в който има main() метод. В main() метода да се прочетат име, години и
// рожденна дата на даден човек, въведени от клавиатурата, чрез използване на класа Scanner. Данните да се отпечатат на стандартния изход.

public class myFirstProject {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String birthDate = scanner.nextLine();
        int age = scanner.nextInt();

        System.out.println("name:" + name);
        System.out.println("birthDate" + birthDate);
        System.out.println("age:" + age);
    }
}


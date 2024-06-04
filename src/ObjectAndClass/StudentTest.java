package ObjectAndClass;

import java.util.ArrayList;

public class StudentTest {
    public static void main(String[] args) {


        // Създаване на обекти от клас Student
        Student student1 = new Student("Иван Иванов Петров", 2, "Информатика", "Софийски университет", "ivan.petrov@example.com", "0888123456");
        Student student2 = new Student("Мария Георгиева", 1, "Математика", "Софийски университет", "mariq@example.com", "0888111222");
        Student student3 = new Student("Георги Иванов", 3, "Физика", "Софийски университет", "georgi@example.com", "0888333444");
        Student student4 = new Student("Анна Петрова", 2, "История", "Софийски университет", "anna@example.com", "0888444555");
        Student student5 = new Student("Петър Иванов", 1, "Биология", "Софийски университет", "petar@example.com", "0888555666");

        // Извеждане на информация за студентите
        System.out.println("Информация за студент 1:");
        System.out.println(student1);

        System.out.println("\nИнформация за студент 2:");
        System.out.println(student2);

        System.out.println("\nИнформация за студент 3:");
        System.out.println(student3);

        System.out.println("\nИнформация за студент 4:");
        System.out.println(student4);

        System.out.println("\nИнформация за студент 5:");
        System.out.println(student5);

        // Извеждане на броя на създадените обекти от клас Student
        System.out.println("\nБрой създадени обекти от клас Student: " + Student.getStudentCount());

        // Промяна на данни за студент 1 чрез сетъри
        student1.setFullName("Петър Георгиев Петров");
        student1.setCourse(3);
        student1.setEmail("petar.petrov@example.com");

        System.out.println("\nПроменена информация за студент 1:");
        System.out.println(student1);


    }

}


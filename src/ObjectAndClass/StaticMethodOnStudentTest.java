package ObjectAndClass;

import java.util.ArrayList;

public class StaticMethodOnStudentTest {
    private static ArrayList<Student> students = new ArrayList<>();

    // Статичен метод за създаване на няколко обекта от тип Student и съхранение в статично поле
    public static void createStudents() {
        students.add(new Student("Иван Иванов", 2, "Информатика", "СУ", "ivan@example.com", "0888111222"));
        students.add(new Student("Мария Георгиева", 3, "Математика", "ТУ", "maria@example.com", "0888222333"));
        students.add(new Student("Петър Петров", 1, "Физика", "НУ", "petar@example.com", "0888333444"));
    }

    public static void main(String[] args) {
        // Създаване на студентите
        createStudents();

        // Извеждане на информацията за студентите
        for (Student student : students) {
            System.out.println("Име: " + student.getFullName());
            System.out.println("Курс: " + student.getCourse());
            System.out.println("Специалност: " + student.getSpecialty());
            System.out.println("Университет: " + student.getUniversity());
            System.out.println("Имейл: " + student.getEmail());
            System.out.println("Телефонен номер: " + student.getPhoneNumber());
            System.out.println();
        }
    }
}

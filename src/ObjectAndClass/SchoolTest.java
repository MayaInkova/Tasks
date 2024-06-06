package ObjectAndClass;

public class SchoolTest {
    public static void main(String[] args) {
        // Създаване на дисциплини
        Discipline math = new Discipline("Mathematics", 30, 15);
        Discipline history = new Discipline("History", 20, 10);
        Discipline biology = new Discipline("Biology", 25, 20);

        // Създаване на преподаватели
        Teacher teacher1 = new Teacher("Mr. Smith");
        Teacher teacher2 = new Teacher("Mrs. Johnson");

        teacher1.addDiscipline(math);
        teacher1.addDiscipline(history);
        teacher2.addDiscipline(biology);

        // Създаване на ученици
        Student student1 = new Student("Alice", 1);
        Student student2 = new Student("Bob", 2);
        Student student3 = new Student("Charlie", 3);

        // Създаване на класове
        SchoolClass classA = new SchoolClass("Class A");
        classA.addTeacher(teacher1);
        classA.addTeacher(teacher2);
        classA.addStudent(student1);
        classA.addStudent(student2);

        SchoolClass classB = new SchoolClass("Class B");
        classB.addTeacher(teacher1);
        classB.addStudent(student3);

        // Създаване на училище
        School school = new School("Green Valley High School");
        school.addSchoolClass(classA);
        school.addSchoolClass(classB);

        // Демонстрация на данните
        System.out.println("School: " + school.getName());
        for (SchoolClass schoolClass : school.getSchoolClasses()) {
            System.out.println(schoolClass);
        }
    }
}

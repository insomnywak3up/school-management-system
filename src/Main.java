import Project.School;
import Project.Student;
import Project.Teacher;

public class Main {
    public static void main(String[] args) {
        //  an array of students
        Student[] students = new Student[3];
        students[0] = new Student("Boris", 16, "A");
        students[1] = new Student("Gregory", 17, "B");
        students[2] = new Student("Mary", 15, "A");

        //  an array of teachers
        Teacher[] teachers = new Teacher[3];
        teachers[0] = new Teacher("Prof Maksat", 40, "Math");
        teachers[1] = new Teacher("Prof Aigerim", 35, "Science");
        teachers[2] = new Teacher("Prof Aliya", 50, "History");

        // create a school
        School school = new School("48 Lyceum", "Abaya 44", students, teachers);


        school.getAvailableStudents();
        System.out.println();
        school.getAvailableTeachers();
        System.out.println();

        // Create comparisons
        students[0].isOlderThan(students[1]);
        students[1].isOlderThan(students[2]);
        teachers[0].isOlderThan(teachers[1]);
    }
}

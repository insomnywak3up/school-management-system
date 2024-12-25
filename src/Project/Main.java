// Main class to demonstrate the School Management System
package Project;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        School school = new School("Greenwood High");

        // Add students
        school.addStudent(new Student("Alice", 14, 8));
        school.addStudent(new Student("Bob", 15, 9));
        school.addStudent(new Student("Charlie", 14, 8));

        // Add teachers
        school.addTeacher(new Teacher("Mr. Smith", 40, "Math"));
        school.addTeacher(new Teacher("Ms. Johnson", 35, "English"));

        // List all students and teachers
        school.listStudents();
        school.listTeachers();

        // Filter students by grade
        ArrayList<Student> grade8Students = school.filterStudentsByGrade(8);
        System.out.println("\nStudents in grade 8:");
        for (Student student : grade8Students) {
            System.out.println(student);
        }

        // Sort students by name
        school.sortStudentsByName();
        System.out.println("\nStudents after sorting by name:");
        school.listStudents();

        // Search teachers by subject
        ArrayList<Teacher> mathTeachers = school.searchTeachersBySubject("Math");
        System.out.println("\nTeachers who teach Math:");
        for (Teacher teacher : mathTeachers) {
            System.out.println(teacher);
        }

        // Demonstrate teacher duties
        for (Teacher teacher : school.searchTeachersBySubject("Math")) {
            teacher.performDuties();
        }
    }
}

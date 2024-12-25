package Project;
public class School {
    private String name;
    private String location;
    private Student[] students;
    private Teacher[] teachers;

    // constructor
    public School(String name, String location, Student[] students, Teacher[] teachers) {
        this.name = name;
        this.location = location;
        this.students = students;
        this.teachers = teachers;
    }

    // method to get the available students
    public void getAvailableStudents() {
        System.out.println("Students at " + name + ":");
        for (Student student : students) {
            System.out.println(student.getStudentFull());
        }
    }

    // method to get the available teachers
    public void getAvailableTeachers() {
        System.out.println("Teachers at " + name + ":");
        for (Teacher teacher : teachers) {
            System.out.println(teacher.getTeacherFull());
        }
    }
}

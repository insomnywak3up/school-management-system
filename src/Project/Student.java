package Project;
public class Student {
    private String name;
    private int age;
    private String grade;

    // constructor
    public Student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGrade() {
        return grade;
    }

    // method to compare ages
    public void isOlderThan(Student other) {
        if (this.age > other.getAge()) {
            System.out.println(this.name + " is older than " + other.getName());
        } else if (this.age < other.getAge()) {
            System.out.println(other.getName() + " is older than " + this.name);
        } else {
            System.out.println(this.name + " and " + other.getName() + " are the same age.");
        }
    }

    // method to display full student details
    public String getStudentFull() {
        return this.name + " (" + this.age + " years old) - Grade: " + this.grade;
    }
}

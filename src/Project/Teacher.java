package Project;

public class Teacher {
    private String name;
    private int age;
    private String subject;

    // constructor
    public Teacher(String name, int age, String subject) {
        this.name = name;
        this.age = age;
        this.subject = subject;
    }

    // getter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSubject() {
        return subject;
    }

    // Method to compare ages
    public void isOlderThan(Teacher other) {
        if (this.age > other.getAge()) {
            System.out.println(this.name + " is older than " + other.getName());
        } else if (this.age < other.getAge()) {
            System.out.println(other.getName() + " is older than " + this.name);
        } else {
            System.out.println(this.name + " and " + other.getName() + " are the same age.");
        }
    }

    // Method to display full teacher details
    public String getTeacherFull() {
        return this.name + " (" + this.age + " years old) - Subject: " + this.subject;
    }
}

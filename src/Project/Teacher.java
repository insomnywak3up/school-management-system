package Project;

import Abstract.Employee;

public class Teacher extends Employee {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age, "Science Technology");
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public void performDuties() {
        System.out.println(getName() + " is teaching " + subject + ".");
    }

    @Override
    public String toString() {
        return super.toString() + "\nSubject: " + subject;
    }
}


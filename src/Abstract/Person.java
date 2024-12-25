package Abstract;

public abstract class Person {
    private static int idCounter = 1;
    private int id;
    private String name;
    private int age;

    public Person(String name, int age) {
        this.id = idCounter++;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "ID: " + id + "\nName: " + name + "\nAge: " + age + " years";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return id == person.id && name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return (name == null ? 0 : name.hashCode()) + id;
    }
}


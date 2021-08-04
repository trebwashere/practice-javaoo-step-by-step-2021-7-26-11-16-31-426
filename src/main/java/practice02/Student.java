package practice02;

public class Student extends Person{
    private final int klass;

    public Student(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public String introduce() {
        return String.format("I am a Student. I am at Class %d.", klass);
    }

    public int getKlass() {
        return klass;
    }
}

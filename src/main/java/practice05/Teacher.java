package practice05;

public class Teacher extends Person{
    private Integer klass;

    public Teacher(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public String introduce() {
        String teacherIntro = super.introduce() + " " + "I am a Teacher. ";
        return klass != null ? teacherIntro + String.format("I teach Class %d.", klass) : teacherIntro + "I teach No Class.";
    }

    public int getKlass() {
        return klass;
    }
}

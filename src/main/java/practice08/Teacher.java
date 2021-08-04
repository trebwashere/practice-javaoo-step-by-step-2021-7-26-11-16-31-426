package practice08;


public class Teacher extends Person {
    private Klass klass;

    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public String introduce() {
        String personIntro = super.introduce();
        return klass != null ? personIntro + " " + String.format("I am a Teacher. I teach %s.", klass.getDisplayName())
                : personIntro + " " + "I am a Teacher. I teach No Class.";
    }

    public String introduceWith(Student student) {
        String teacherIntro = super.introduce() + " " + "I am a Teacher. ";
        String studentName = student.getName();
        return student.getKlass().getNumber().equals(this.getKlass().getNumber()) ?
                teacherIntro + String.format("I teach %s.", studentName) : teacherIntro + String.format("I don't teach %s.", studentName);
    }

    public Klass getKlass() {
        return klass;
    }
}

package practice10;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import java.util.stream.Collectors;

public class Teacher extends Person implements Observer {
    private List<Klass> klasses = new ArrayList<>();
    private Klass klass;

    public Teacher(int id, String name, int age, List<Klass> klasses) {
        super(id, name, age);
        this.klasses = klasses;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public String introduce() {
        String personIntro = super.introduce();
        return !klasses.isEmpty() ? personIntro + " " + String.format("I am a Teacher. I teach Class %s.",
                klasses.stream().map(klass -> klass.getNumber().toString()).collect(Collectors.joining(", ")))
                : personIntro + " " + "I am a Teacher. I teach No Class.";
    }

    public String introduceWith(Student student) {
        String teacherIntro = super.introduce() + " " + "I am a Teacher. ";
        String studentName = student.getName();
        return this.getClasses().stream()
                .map(Klass::getNumber)
                .collect(Collectors.toList()).contains(student.getKlass().getNumber()) ?
                teacherIntro + String.format("I teach %s.", studentName) : teacherIntro + String.format("I don't teach %s.", studentName);
    }

    public List<Klass> getClasses() {
        return klasses;
    }

    public boolean isTeaching(Student student) {
        return klasses.stream()
                .map(Klass::getNumber)
                .collect(Collectors.toList())
                .stream()
                .anyMatch(klass -> klass.equals(student.getKlass().getNumber()));

    }

    @Override
    public void update(Observable observable, Object arg)
    {
        klass = (Klass) observable;
        System.out.printf("I am %s. I know %s become Leader of Class %d%n", getName(), klass.getLeader().getName(), klass.getNumber());
    }

}

package practice10;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class Klass extends Observable {
    private final Integer number;
    private Student studentLeader;
    private List<Student> klassStudents = new ArrayList<>();

    public Klass(Integer number) {
        this.number = number;
    }

    public Integer getNumber() {
        return number;
    }

    public Student getLeader() {
        return studentLeader;
    }

    public void assignLeader(Student studentLeader) {
        if (klassStudents.contains(studentLeader)) {
            this.studentLeader = studentLeader;
            notifyObservers();
        } else {
            System.out.print("It is not one of us.\n");
        }
    }

    public List<Student> getKlassStudents() {
        return klassStudents;
    }

    public String getDisplayName() {
        return "Class " + number;
    }

    public void appendMember(Student student) {
        klassStudents.add(student);
    }

    @Override
    public void notifyObservers(){
        setChanged();
        super.notifyObservers();
    }
}

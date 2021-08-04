package practice07;

public class Klass {
    private final Integer number;
    private Student studentLeader;

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
        this.studentLeader = studentLeader;
    }

    public String getDisplayName() {
        return "Class " + number;
    }
}

package practice09;


public class Student extends Person {
    private Klass klass;

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public String introduce() {
        String studentIntro = super.introduce() + " " + "I am a Student. ";
        String studentNotLeader = studentIntro + String.format("I am at Class %d.", klass.getNumber());
        if (klass.getLeader() != null) {
            String leaderName = klass.getLeader().getName();
            return leaderName.equals(this.getName()) ?
                    studentIntro + String.format("I am Leader of Class %d.", klass.getNumber()) : studentNotLeader;
        }
        return studentNotLeader;
    }

    public Klass getKlass() {
        return klass;
    }
}

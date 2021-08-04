package practice07;

public class Person {
    private final int id;
    private final String name;
    private final int age;

    public Person(int id, String name, int age) {
        this.id = id;
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

    public String introduce() {
        return String.format("My name is %s. I am %d years old.", name, age);
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Person) {
            return ((Person) o).getId() == this.getId();
        }
        return false;
    }
}

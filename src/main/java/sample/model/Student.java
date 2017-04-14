package sample.model;

/**
 * Created by kinjin on 22.03.17.
 */
public class Student {
    private int id;
    private int numberOfStudentCard;
    private String name;
    private String surname;
    private Group group;

    public Student() {
    }

    public Student(int id, int numberOfStudentCard, String name, String surname, Group group) {
        this.id = id;
        this.numberOfStudentCard = numberOfStudentCard;
        this.name = name;
        this.surname = surname;
        this.group = group;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumberOfStudentCard() {
        return numberOfStudentCard;
    }

    public void setNumberOfStudentCard(int numberOfStudentCard) {
        this.numberOfStudentCard = numberOfStudentCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "\n" +
                "id:" + id +"\n"+
                "StudentCard=" + numberOfStudentCard +
                "\n" + name +
                "\n" + surname +
                "\n" + group;
    }
}

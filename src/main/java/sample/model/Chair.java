package sample.model;

/**
 * Created by kinjin on 22.03.17.
 */
public class Chair {
    private int id;
    private String fullName;
    private String abr;
    private String chairman;
    private String phoneNumber;
    private int faculty;

    public Chair() {
    }

    public Chair(int id, String fullName, String abr, String chairman, String phoneNumber, int faculty) {
        this.id = id;
        this.fullName = fullName;
        this.abr = abr;
        this.chairman = chairman;
        this.phoneNumber = phoneNumber;
        this.faculty = faculty;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAbr() {
        return abr;
    }

    public void setAbr(String abr) {
        this.abr = abr;
    }

    public String getChairman() {
        return chairman;
    }

    public void setChairman(String chairman) {
        this.chairman = chairman;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getFaculty() {
        return faculty;
    }

    public void setFaculty(int faculty) {
        this.faculty = faculty;
    }

    @Override
    public String toString() {
        return "Chair{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", abr='" + abr + '\'' +
                ", chairman='" + chairman + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", faculty=" + faculty +
                '}';
    }
}

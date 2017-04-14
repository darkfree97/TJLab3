package sample.model;

/**
 * Created by kinjin on 22.03.17.
 */
public class Institute {
    private int id;
    private String fullName;
    private String abr;
    private String chief;
    private String phoneNumber;

    public Institute() {
    }

    public Institute(int id, String fullName, String abr, String chief, String phoneNumber) {
        this.id = id;
        this.fullName = fullName;
        this.abr = abr;
        this.chief = chief;
        this.phoneNumber = phoneNumber;
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

    public String getChief() {
        return chief;
    }

    public void setChief(String chief) {
        this.chief = chief;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Institute{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", abr='" + abr + '\'' +
                ", chief='" + chief + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}

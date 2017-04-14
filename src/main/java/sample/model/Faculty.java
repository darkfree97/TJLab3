package sample.model;

/**
 * Created by kinjin on 22.03.17.
 */
public class Faculty {
    private int id;
    private String fullName;
    private String abr;
    private String dean;
    private String phoneNumber;
    private int intstitute;

    public Faculty() {
    }

    public Faculty(int id, String fullName, String abr, String dean, String phoneNumber, int intstitute) {
        this.id = id;
        this.fullName = fullName;
        this.abr = abr;
        this.dean = dean;
        this.phoneNumber = phoneNumber;
        this.intstitute = intstitute;
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

    public String getDean() {
        return dean;
    }

    public void setDean(String dean) {
        this.dean = dean;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getIntstitute() {
        return intstitute;
    }

    public void setIntstitute(int intstitute) {
        this.intstitute = intstitute;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", abr='" + abr + '\'' +
                ", dean='" + dean + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", intstitute=" + intstitute +
                '}';
    }
}

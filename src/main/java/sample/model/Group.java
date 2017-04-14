package sample.model;

/**
 * Created by kinjin on 22.03.17.
 */
public class Group {
    private int id;
    private String name;
    private int monitorId;
    private String Curator;
    private int chairId;

    public Group() {
    }

    public int getId() {
        return id;
    }

    public Group(int id, String name, int monitorId, String curator, int chairId) {
        this.id = id;
        this.name = name;
        this.monitorId = monitorId;
        Curator = curator;
        this.chairId = chairId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonitorId() {
        return monitorId;
    }

    public void setMonitorId(int monitorId) {
        this.monitorId = monitorId;
    }

    public String getCurator() {
        return Curator;
    }

    public void setCurator(String curator) {
        Curator = curator;
    }

    public int getChairId() {
        return chairId;
    }

    public void setChairId(int chairId) {
        this.chairId = chairId;
    }

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", monitorId=" + monitorId +
                ", Curator='" + Curator + '\'' +
                ", chairId=" + chairId +
                '}';
    }
}

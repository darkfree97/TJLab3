package sample.service.faculty;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import sample.model.Faculty;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Darkfree on 06.04.2017.
 */
public class SFaculty {
    List<Faculty> faculties = new ArrayList<>();

    public SFaculty() {
        new ClassPathXmlApplicationContext("faculty-context.xml").getBeansOfType(Faculty.class).values().forEach(item->faculties.add(item));
    }

    public List<Faculty> getFaculties() {
        return faculties;
    }

    public void setFaculties(List<Faculty> faculties) {
        this.faculties = faculties;
    }

    public List<Faculty> getAll(){
        return faculties;
    }

    @Override
    public String toString() {
        return "SFaculty{" +
                "faculties=" + faculties +
                '}';
    }
}

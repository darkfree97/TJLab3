package sample.service.institute.impls;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import sample.model.Institute;
import sample.service.institute.interfaces.IInstituteService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kinjin on 29.03.17.
 */
public class SInstitute implements IInstituteService {
    List<Institute> listOfInstitutes = new ArrayList<>();

    public List<Institute> getListOfInstitutes() {
        return listOfInstitutes;
    }

    public void setListOfInstitutes(List<Institute> listOfInstitutes) {
        this.listOfInstitutes = listOfInstitutes;
    }

    public SInstitute() {
        new ClassPathXmlApplicationContext("institute-context.xml").getBeansOfType(Institute.class).values().forEach(item->listOfInstitutes.add(item));
    }

    public void create(Institute institute) {

    }

    public Institute read(int id) {
        return null;
    }

    public void update(Institute institute) {

    }

    public void delete(int id) {

    }

    public List<Institute> getAll() {

        return this.listOfInstitutes;
    }

    public String showAll() {
        String s = "";
        for (Institute item:this.listOfInstitutes) {
            s+=item.toString()+"\n";
        }
        return s;
    }
}

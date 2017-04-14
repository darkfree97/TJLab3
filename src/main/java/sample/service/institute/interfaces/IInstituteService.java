package sample.service.institute.interfaces;

import sample.model.Institute;

import java.util.List;

/**
 * Created by kinjin on 29.03.17.
 */
public interface IInstituteService{
    void create(Institute institute);
    Institute read(int id);
    void update(Institute institute);
    void delete(int id);
    List<Institute> getAll();
    String showAll();

}

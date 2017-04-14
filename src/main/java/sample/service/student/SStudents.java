package sample.service.student;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import sample.model.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Darkfree on 06.04.2017.
 */
public class SStudents {
    List<Student> students = new ArrayList<>();

    public SStudents() {
        try {
            new ClassPathXmlApplicationContext("student-context.xml").getBeansOfType(Student.class).values().forEach(item->students.add(item));
        }
        catch (RuntimeException exp){}
    }

    public List<Student> getAll(){
        return students;
    }
}

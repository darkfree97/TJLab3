package sample.service.group;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import sample.model.Group;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Darkfree on 06.04.2017.
 */
public class SGroup {
    List<Group> groups = new ArrayList<>();

    public SGroup() {
        try {
            new ClassPathXmlApplicationContext("group-context.xml").getBeansOfType(Group.class).values().forEach(item->groups.add(item));
        }
        catch (RuntimeException exp){

        }
    }

    public List<Group> getAll(){
        return groups;
    }
}

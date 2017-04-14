package sample.control;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import sample.service.faculty.SFaculty;
import sample.service.group.SGroup;
import sample.service.institute.impls.SInstitute;
import sample.service.student.SStudents;

public class Controller {
    SInstitute institutes = new SInstitute();
    SFaculty facultyes = new SFaculty();
    SGroup groups = new SGroup();
    SStudents students = new SStudents();

    @FXML
    private TextArea textEdit;

    @FXML
    private Button bInstitute;

    @FXML
    private Button fuc_btn;

    @FXML
    private Button pzks_btn;

    @FXML
    private Button our_btn;

    @FXML
    private TextField name_edt;

    @FXML
    private Button search;

    @FXML
    private TextField g_edit;

    public void initialize(){
        bInstitute.setOnAction(evt->{
            textEdit.clear();
            institutes.getAll().forEach(p->textEdit.appendText(p.getFullName()+"\n"));
        });
        fuc_btn.setOnAction(evt->{
            textEdit.clear();
            facultyes.getAll().forEach(p->textEdit.appendText(p.getFullName()+"\n"));
        });
        pzks_btn.setOnAction(evt->{
            textEdit.clear();
            groups.getAll().forEach(p->textEdit.appendText(p.toString()+"\n"));
        });
        our_btn.setOnAction(evt->{
            textEdit.clear();
            students.getAll().stream().filter(p->p.getGroup().getId()==1).forEach(item->textEdit.appendText(item.toString()+"\n"));
        });
        search.setOnAction(evt->{
            textEdit.setText("Found students:");
            students.getAll().stream().filter(p->{
                if (name_edt.getText().isEmpty())
                    return true;
                if (name_edt.getText().equals(p.getName().toString())||name_edt.getText().equals(p.getSurname().toString()))
                    return true;
                return false;
            }).filter(p->{
                if(g_edit.getText().isEmpty())
                    return true;
                if(p.getGroup().getName().equals(g_edit.getText().toString()))
                    return true;
                return false;
            }).forEach(item->textEdit.appendText(item.toString()+"\n"));
        });
    }
}

package sample;

import com.google.gson.Gson;
import com.thoughtworks.xstream.XStream;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/sample.fxml"));
        primaryStage.setTitle("TJLab3 Journal");
        primaryStage.getIcons().add(new Image("/fxml/images/wtf.gif"));
        primaryStage.setScene(new Scene(root));
        primaryStage.show();

    }
    public static void main(String[] args) {
//        XStream xStream = new XStream();
//        xStream.alias("person",Person.class);
//        xStream.alias("persons",PersonList.class);
//        xStream.addImplicitCollection(PersonList.class,"persons");
//
//
//
//        String json = new Gson().toJson(intlist);
//        FileWriter fileWriter;
//        try {
//            fileWriter = new FileWriter("file.json");
//            fileWriter.write(json);
//            fileWriter.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        try {
//            fileWriter = new FileWriter("file.xml");
//            fileWriter.write(xStream.toXML(personList));
//            fileWriter.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println(json);
        launch(args);
    }

}

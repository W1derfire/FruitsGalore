package sample;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {





    @Override
    public void start(Stage stage) throws Exception{


        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        //Parent other = FXMLLoader.load(getClass().getResource("fruitAdder.fxml"));


        stage.setTitle("Hello World");

        stage.setScene(new Scene(root, 1200, 810));
        //stage.setResizable(false);

        //if(justUsed == false || justUsed == true) {
            //primaryStage.setScene(new Scene(oneInUse, 600, 600));
        //}
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}

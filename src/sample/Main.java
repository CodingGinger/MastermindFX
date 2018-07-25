package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.swing.text.NavigationFilter;
import java.io.IOException;


public class Main extends Application {
    private static Navigation navigation;

    public static Navigation getNavigation(){
        return navigation;
    }

    @Override
    public void start(Stage primaryStage) throws Exception{

        navigation = new Navigation(primaryStage);

        primaryStage.setTitle("MastermindFX v0.1");
        primaryStage.show();

        Main.getNavigation().load(Controller.URL_FXML).Show();

        //Parent start = FXMLLoader.load(getClass().getResource("sample.fxml"));
        //Parent game = FXMLLoader.load(getClass().getResource("game.fxml"));

    }

    public static void main(String[] args) {
        launch(args);
    }
}

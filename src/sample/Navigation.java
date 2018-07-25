package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class Navigation {
    private final Stage stage;
    private final Scene scene;

    private List<ControllerInterface> controllers = new ArrayList<>();

    public Navigation(Stage stage){
        this.stage = stage;
        scene = new Scene(new AnchorPane(), 600, 900);
        stage.setScene(scene);
    }

    public ControllerInterface load(String sUrl){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(sUrl));
            Node root = fxmlLoader.load();

            ControllerInterface controller = fxmlLoader.getController();
            controller.setView(root);

            return controller;
        } catch(Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public void Show(ControllerInterface controller){
        try {
            scene.setRoot((Parent) controller.getView());
            controllers.add(controller);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}

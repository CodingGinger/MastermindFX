package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Sphere;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller extends BaseController implements Initializable {

    public static final String URL_FXML = "sample.fxml";

    @FXML
    private Sphere frontball1;

    @FXML
    private Button start;

    @FXML
    private Label Title;

    @FXML
    private Sphere frontball3;

    @FXML
    private Button quit;

    @FXML
    private Sphere frontball2;

    @FXML
    private Sphere frontball5;

    @FXML
    private TextArea frontext1;

    @FXML
    private Sphere frontball4;

    @FXML
    private Sphere frontball6;

    @FXML
    private Button newgame;

    @FXML
    public void start() {
        System.out.println("Mouse clicked");
    }

    @FXML
    public void quit(){
        System.exit(0);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        frontball1.setMaterial(Colors.getRED());

        frontball2.setMaterial(Colors.getYELLOW());

        frontball3.setMaterial(Colors.getBLUE());

        frontball4.setMaterial(Colors.getGREEN());

        frontball5.setMaterial(Colors.getWHITE());

        frontball6.setMaterial(Colors.getBlack());

        frontext1.setEditable(false);

        start.setOnAction(event -> {
            Main.getNavigation().load(Game.URL_FXML).Show();
        });
    }
}
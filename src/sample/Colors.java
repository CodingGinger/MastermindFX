package sample;

import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;


public class Colors {
    private static final PhongMaterial blackMaterial = new PhongMaterial();
    private static final PhongMaterial greenMaterial = new PhongMaterial();
    private static final PhongMaterial yellowMaterial = new PhongMaterial();
    private static final PhongMaterial blueMaterial = new PhongMaterial();
    private static final PhongMaterial redMaterial = new PhongMaterial();
    private static final PhongMaterial whiteMaterial = new PhongMaterial();
    private static final PhongMaterial transMaterial = new PhongMaterial();
    private static final PhongMaterial change = new PhongMaterial();
    private static final Image normalMap = new Image("sample/moonmap1k.jpg");


    // methods for setting the color blue
    public static PhongMaterial getBLUE() {
        blueMaterial.setDiffuseColor(Color.BLUE);
        blueMaterial.setSpecularColor(Color.WHITE);
        return blueMaterial;
    }

    // methods for setting the color green
    public static PhongMaterial getGREEN() {
        greenMaterial.setDiffuseColor(Color.GREEN);
        greenMaterial.setSpecularColor(Color.WHITE);
        return greenMaterial;
    }

    // methods for setting the color red
    public static PhongMaterial getRED() {
        redMaterial.setDiffuseColor(Color.RED);
        redMaterial.setSpecularColor(Color.WHITE);
        return redMaterial;
    }

    // methods for setting the color white
    public static PhongMaterial getWHITE() {
        whiteMaterial.setDiffuseColor(Color.WHITE);
        whiteMaterial.setSpecularColor(Color.rgb(220,220,220));
        return whiteMaterial;
    }

    // methods for setting the color yellow
    public static PhongMaterial getYELLOW() {
        yellowMaterial.setDiffuseColor(Color.YELLOW);
        yellowMaterial.setSpecularColor(Color.WHITE);
        return yellowMaterial;
    }

    // methods for setting the color black
    public static PhongMaterial getBlack() {
        blackMaterial.setDiffuseColor(Color.BLACK);
        blackMaterial.setSpecularColor(Color.WHITE);
        return blackMaterial;
    }

    public static PhongMaterial getTrans() {
        transMaterial.setDiffuseColor(Color.BEIGE);
        transMaterial.setSpecularColor(Color.BEIGE);
        return transMaterial;
    }
    public static PhongMaterial getBumpMap(){
        change.setBumpMap(normalMap);
        return change;

    }
}

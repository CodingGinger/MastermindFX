package sample;

import javafx.scene.paint.PhongMaterial;

public class CodeMaker extends ColorPicker {

    private static int secretCode; // Secret code variable

    public static void CodeMaker(int r) {
        new ColorPicker(r);
    }

    // setting the code
    public static int getSecretCode() {
        setSecretCode();
        int r = secretCode;
        return r;
    }

    // math.random to set random number between 1 and 6
    private static void setSecretCode() {
        int minCodeValue = 1;
        int maxCodeValue = 7;
        secretCode = ((int) (Math.random()*(maxCodeValue - minCodeValue))) + minCodeValue;
    }


}
package sample;

import javafx.scene.paint.PhongMaterial;

import static sample.Game.*;

//Picks colors to be used as secrete code depending on secretCode int
public class ColorPicker extends Colors{

    private PhongMaterial picked;
    Colors c = new Colors();

    // Constructor for ColorPicker no args
    public ColorPicker() {
    }

    // getting secret code and set it as color
    public ColorPicker(int secretCode){
        switch (secretCode){
            case 1:
                picked = c.getRED(); // Change variable name later
                System.out.println(picked);
                break;
            case 2:
                picked = c.getBLUE(); // Change variable name later
                System.out.println(picked);
                break;
            case 3:
                picked = c.getGREEN(); // Change variable name later
                System.out.println(picked);
                break;
            case 4:
                picked = c.getYELLOW(); // Change variable name later
                System.out.println(picked);
                break;
            case 5:
                picked = c.getWHITE(); // Change variable name later
                System.out.println(picked);
                break;
            case 6:
                picked = c.getBlack(); // Change variable name later
                System.out.println(picked);
                break;
            default:
                System.out.println("Error: Wrong input");
                System.out.println(secretCode);

        }
    }
    //??
    public PhongMaterial getPicked() {
        return picked;
    }
}


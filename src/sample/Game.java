package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Sphere;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.ResourceBundle;

import static javax.swing.UIManager.put;

public class Game extends BaseController implements Initializable {

    public static final String URL_FXML = "game.fxml";
    public PhongMaterial colorChoice;
    String row;
    public int[] secretCode = new int[4];
    public int[] currentCode = new int[4];
    public int[] result = new int[2];
    public int currentRow = 1;
    HashMap colorMap = new HashMap <Color, Integer>() {{
        put( Color.RED, 1 );
        put( Color.BLUE, 2 );
        put( Color.GREEN, 3 );
        put( Color.YELLOW, 4 );
        put( Color.WHITE, 5 );
        put( Color.BLACK, 6 );
    }};
    HashMap spheres = new HashMap<Integer ,Sphere>(){{
    }};

    HashMap emptyspheres = new HashMap<Integer ,Sphere>(){{
    }};

    HashMap peggis = new HashMap<Integer ,Sphere>(){{
    }};

    ArrayList pegs = new ArrayList();


    @FXML
    private Button option;

    @FXML
    private Sphere BlackSphere;

    @FXML
    private Sphere RedSphere;

    @FXML
    private Sphere WhiteSphere;

    @FXML
    private Sphere BlueSphere;

    @FXML
    private Sphere GreenSphere;

    @FXML
    private Sphere YellowSphere;

    @FXML
    private Sphere Sphere4row2;

    @FXML
    private Sphere Sphere4row1;

    @FXML
    private Sphere Sphere1row10;

    @FXML
    private Sphere Sphere1row9;

    @FXML
    private Sphere Sphere3row3;

    @FXML
    private Sphere Sphere1row8;

    @FXML
    private Sphere Sphere3row2;

    @FXML
    private Sphere Sphere1row7;

    @FXML
    private Sphere Sphere3row1;

    @FXML
    private Sphere Sphere1row6;

    @FXML
    private Sphere Sphere2row2;

    @FXML
    private Sphere Sphere4row10;

    @FXML
    private Sphere Sphere2row1;

    @FXML
    private Sphere Sphere2row4;

    @FXML
    private Sphere Sphere2row3;

    @FXML
    private Sphere Sphere2row6;

    @FXML
    private Sphere Sphere2row5;

    @FXML
    private Sphere Sphere2row8;

    @FXML
    private Sphere Sphere2row7;

    @FXML
    private Sphere Sphere2row9;

    @FXML
    private Sphere Sphere1row1;

    @FXML
    private Sphere Sphere3row10;

    @FXML
    private Sphere Sphere3row9;

    @FXML
    private Sphere Sphere3row8;

    @FXML
    private Sphere Sphere1row5;

    @FXML
    private Sphere Sphere3row7;

    @FXML
    private Sphere Sphere1row4;

    @FXML
    private Sphere Sphere3row6;

    @FXML
    private Sphere Sphere1row3;

    @FXML
    private Sphere Sphere3row5;

    @FXML
    private Sphere Sphere1row2;

    @FXML
    private Sphere Sphere3row4;

    @FXML
    private Sphere Sphere2row10;

    @FXML
    private Button Generate;

    @FXML
    private Button done;

    @FXML
    private Sphere Sphere4row8;

    @FXML
    private Sphere Sphere4row7;

    @FXML
    private Sphere Sphere4row9;

    @FXML
    private Sphere Sphere4row4;

    @FXML
    private Sphere Sphere4row3;

    @FXML
    private Sphere Sphere4row6;

    @FXML
    private Sphere Sphere4row5;

    @FXML
    private Sphere SecretSphere1;

    @FXML
    private Sphere SecretSphere2;

    @FXML
    private Sphere SecretSphere3;

    @FXML
    private Sphere SecretSphere4;

    @FXML
    private Sphere peg1r1, peg2r1, peg3r1, peg4r1;

    @FXML
    private Sphere peg1r2, peg2r2, peg3r2, peg4r2;

   @FXML
    private Sphere peg1r3,peg2r3,peg3r3, peg4r3;

    @FXML
    private Sphere peg1r4, peg2r4, peg3r4, peg4r4;

    @FXML
    private Sphere peg1r5, peg2r5, peg3r5, peg4r5;

    @FXML
    private Sphere peg1r6, peg2r6, peg3r6, peg4r6;

    @FXML
    private Sphere peg1r7, peg2r7, peg3r7, peg4r7;

    @FXML
    private Sphere peg1r8, peg2r8, peg3r8, peg4r8;

    @FXML
    private Sphere peg1r9, peg2r9, peg3r9, peg4r9;

    @FXML
    private Sphere peg1r10, peg2r10, peg3r10, peg4r10;


    @Override
    public void initialize(URL location, ResourceBundle resources) {

        spheres.put(1, RedSphere);
        spheres.put(2, BlueSphere);
        spheres.put(3, GreenSphere);
        spheres.put(4, YellowSphere);
        spheres.put(5, BlackSphere);
        spheres.put(6, WhiteSphere);

        emptyspheres.put(1,Sphere1row1);
        emptyspheres.put(2,Sphere2row1);
        emptyspheres.put(3,Sphere3row1);
        emptyspheres.put(4,Sphere4row1);

        emptyspheres.put(5,Sphere1row2);
        emptyspheres.put(6,Sphere2row2);
        emptyspheres.put(7,Sphere3row2);
        emptyspheres.put(8,Sphere4row2);

        emptyspheres.put(9,Sphere1row3);
        emptyspheres.put(10,Sphere2row3);
        emptyspheres.put(11,Sphere3row3);
        emptyspheres.put(12,Sphere4row3);

        emptyspheres.put(13,Sphere1row4);
        emptyspheres.put(14,Sphere2row4);
        emptyspheres.put(15,Sphere3row4);
        emptyspheres.put(16,Sphere4row4);

        emptyspheres.put(17,Sphere1row5);
        emptyspheres.put(18,Sphere2row5);
        emptyspheres.put(19,Sphere3row5);
        emptyspheres.put(20,Sphere4row5);

        emptyspheres.put(21,Sphere1row6);
        emptyspheres.put(22,Sphere2row6);
        emptyspheres.put(23,Sphere3row6);
        emptyspheres.put(24,Sphere4row6);

        emptyspheres.put(25,Sphere1row7);
        emptyspheres.put(26,Sphere2row7);
        emptyspheres.put(27,Sphere3row7);
        emptyspheres.put(28,Sphere4row7);

        emptyspheres.put(29,Sphere1row8);
        emptyspheres.put(30,Sphere2row8);
        emptyspheres.put(31,Sphere3row8);
        emptyspheres.put(32,Sphere4row8);

        emptyspheres.put(33,Sphere1row9);
        emptyspheres.put(34,Sphere2row9);
        emptyspheres.put(35,Sphere3row9);
        emptyspheres.put(36,Sphere4row9);

        emptyspheres.put(37,Sphere1row10);
        emptyspheres.put(38,Sphere2row10);
        emptyspheres.put(39,Sphere3row10);
        emptyspheres.put(40,Sphere4row10);


        setColorChoices();
        emptyspheres.forEach((key, value)-> ((Sphere)value).setMaterial(setColor(7)));

        HashMap pegrow1 = new HashMap<Integer, Sphere>(){{
        }};
        pegrow1.put(1, peg1r1);
        pegrow1.put(2, peg2r1);
        pegrow1.put(3, peg3r1);
        pegrow1.put(4, peg4r1);

        HashMap pegrow2 = new HashMap<Integer, Sphere>(){{
        }};
        pegrow2.put(1, peg1r2);
        pegrow2.put(2, peg2r2);
        pegrow2.put(3, peg3r2);
        pegrow2.put(4, peg4r2);

        HashMap pegrow3 = new HashMap<Integer, Sphere>(){{
        }};
        pegrow3.put(1, peg1r3);
        pegrow3.put(2, peg2r3);
        pegrow3.put(3, peg3r3);
        pegrow3.put(4, peg4r3);

        HashMap pegrow4 = new HashMap<Integer, Sphere>(){{
        }};
        pegrow4.put(1, peg1r4);
        pegrow4.put(2, peg2r4);
        pegrow4.put(3, peg3r4);
        pegrow4.put(4, peg4r4);

        HashMap pegrow5 = new HashMap<Integer, Sphere>(){{
        }};
        pegrow5.put(1, peg1r5);
        pegrow5.put(2, peg2r5);
        pegrow5.put(3, peg3r5);
        pegrow5.put(4, peg4r5);

        HashMap pegrow6 = new HashMap<Integer, Sphere>(){{
        }};
        pegrow6.put(1, peg1r6);
        pegrow6.put(2, peg2r6);
        pegrow6.put(3, peg3r6);
        pegrow6.put(4, peg4r6);

        HashMap pegrow7 = new HashMap<Integer, Sphere>(){{
        }};
        pegrow7.put(1, peg1r7);
        pegrow7.put(2, peg2r7);
        pegrow7.put(3, peg3r7);
        pegrow7.put(4, peg4r7);

        HashMap pegrow8 = new HashMap<Integer, Sphere>(){{
        }};
        pegrow8.put(1, peg1r8);
        pegrow8.put(2, peg2r8);
        pegrow8.put(3, peg3r8);
        pegrow8.put(4, peg4r8);

        HashMap pegrow9 = new HashMap<Integer, Sphere>(){{
        }};
        pegrow9.put(1, peg1r9);
        pegrow9.put(2, peg2r9);
        pegrow9.put(3, peg3r9);
        pegrow9.put(4, peg4r9);

        HashMap pegrow10 = new HashMap<Integer, Sphere>(){{
        }};
        pegrow10.put(1, peg1r10);
        pegrow10.put(2, peg2r10);
        pegrow10.put(3, peg3r10);
        pegrow10.put(4, peg4r10);

        pegrow1.forEach((key, value)-> ((Sphere)value).setMaterial(setColor(7)));
        pegrow2.forEach((key, value)-> ((Sphere)value).setMaterial(setColor(7)));
        pegrow3.forEach((key, value)-> ((Sphere)value).setMaterial(setColor(7)));
        pegrow4.forEach((key, value)-> ((Sphere)value).setMaterial(setColor(7)));
        pegrow5.forEach((key, value)-> ((Sphere)value).setMaterial(setColor(7)));
        pegrow6.forEach((key, value)-> ((Sphere)value).setMaterial(setColor(7)));
        pegrow7.forEach((key, value)-> ((Sphere)value).setMaterial(setColor(7)));
        pegrow8.forEach((key, value)-> ((Sphere)value).setMaterial(setColor(7)));
        pegrow9.forEach((key, value)-> ((Sphere)value).setMaterial(setColor(7)));
        pegrow10.forEach((key, value)-> ((Sphere)value).setMaterial(setColor(7)));

        pegs.add(pegrow1);
        pegs.add(pegrow2);
        pegs.add(pegrow3);
        pegs.add(pegrow4);
        pegs.add(pegrow5);
        pegs.add(pegrow6);
        pegs.add(pegrow7);
        pegs.add(pegrow8);
        pegs.add(pegrow9);
        pegs.add(pegrow10);
        //System.out.println(pegs.get(3));

    }

    public void showCode(MouseEvent mouseEvent) {
        for (int i = 0; i < secretCode.length; i++) {
            int r = CodeMaker.getSecretCode();
            secretCode[i] = r;
        }
        SecretSphere1.setVisible(false);
        SecretSphere2.setVisible(false);
        SecretSphere3.setVisible(false);
        SecretSphere4.setVisible(false);
        setColorSphere1( secretCode[0] );
        setColorSphere2( secretCode[1] );
        setColorSphere3( secretCode[2] );
        setColorSphere4( secretCode[3] );

        Generate.setDisable( true );

    }

    public void setColorChoices(){

        spheres.forEach((key, value)-> ((Sphere)value).setMaterial(setColor( (Integer) key )));
    }

    public PhongMaterial setColor(int x){
        if (x == 1){
            return Colors.getRED();
        }else if (x == 2){
            return Colors.getBLUE();
        }else if (x == 3){
            return Colors.getGREEN();
        }else if (x == 4){
            return Colors.getYELLOW();
        }else if (x == 5){
            return Colors.getBlack();
        }else if (x == 6){
            return Colors.getWHITE();
        }else if (x == 7){
            return Colors.getTrans();
        }
        return null;
    }


    public void setColorSphere1(int s1) {
        switch (s1) {
            case 1:
                SecretSphere1.setMaterial( Colors.getRED() );
                SecretSphere1.setDisable( true );
                break;
            case 2:
                SecretSphere1.setMaterial( Colors.getBLUE() );
                SecretSphere1.setDisable( true );
                break;
            case 3:
                SecretSphere1.setMaterial( Colors.getGREEN() );
                SecretSphere1.setDisable( true );
                break;
            case 4:
                SecretSphere1.setMaterial( Colors.getYELLOW() );
                SecretSphere1.setDisable( true );
                break;
            case 5:
                SecretSphere1.setMaterial( Colors.getWHITE() );
                SecretSphere1.setDisable( true );
                break;
            case 6:
                SecretSphere1.setMaterial( Colors.getBlack() );
                SecretSphere1.setDisable( true );
                break;
            default:
                System.out.println( s1 );
        }

    }

    public void setColorSphere2(int s2) {
        switch (s2) {
            case 1:
                SecretSphere2.setMaterial( Colors.getRED() );
                SecretSphere2.setDisable( true );
                break;
            case 2:
                SecretSphere2.setMaterial( Colors.getBLUE() );
                SecretSphere2.setDisable( true );
                break;
            case 3:
                SecretSphere2.setMaterial( Colors.getGREEN() );
                SecretSphere2.setDisable( true );
                break;
            case 4:
                SecretSphere2.setMaterial( Colors.getYELLOW() );
                SecretSphere2.setDisable( true );
                break;
            case 5:
                SecretSphere2.setMaterial( Colors.getWHITE() );
                SecretSphere2.setDisable( true );
                break;
            case 6:
                SecretSphere2.setMaterial( Colors.getBlack() );
                SecretSphere2.setDisable( true );
                break;
            default:
                System.out.println( s2 );
        }
    }

    public void setColorSphere3(int s3) {
        switch (s3) {
            case 1:
                SecretSphere3.setMaterial( Colors.getRED() );
                SecretSphere3.setDisable( true );
                break;
            case 2:
                SecretSphere3.setMaterial( Colors.getBLUE() );
                SecretSphere3.setDisable( true );
                break;
            case 3:
                SecretSphere3.setMaterial( Colors.getGREEN() );
                SecretSphere3.setDisable( true );
                break;
            case 4:
                SecretSphere3.setMaterial( Colors.getYELLOW() );
                SecretSphere3.setDisable( true );
                break;
            case 5:
                SecretSphere3.setMaterial( Colors.getWHITE() );
                SecretSphere3.setDisable( true );
                break;
            case 6:
                SecretSphere3.setMaterial( Colors.getBlack() );
                SecretSphere3.setDisable( true );
                break;
            default:
                System.out.println( s3 );
        }
    }

    public void setColorSphere4(int s4) {
        switch (s4) {
            case 1:
                SecretSphere4.setMaterial( Colors.getRED() );
                SecretSphere4.setDisable( true );
                break;
            case 2:
                SecretSphere4.setMaterial( Colors.getBLUE() );
                SecretSphere4.setDisable( true );
                break;
            case 3:
                SecretSphere4.setMaterial( Colors.getGREEN() );
                SecretSphere4.setDisable( true );
                break;
            case 4:
                SecretSphere4.setMaterial( Colors.getYELLOW() );
                SecretSphere4.setDisable( true );
                break;
            case 5:
                SecretSphere4.setMaterial( Colors.getWHITE() );
                SecretSphere4.setDisable( true );
                break;
            case 6:
                SecretSphere4.setMaterial( Colors.getBlack() );
                SecretSphere4.setDisable( true );
                break;
            default:
                System.out.println( s4 );
        }
    }

    public void setBaseColor(Sphere x) {

        x.setMaterial( Colors.getTrans() );
    }

    public void red(MouseEvent mouseEvent) {
        setColorChoices();
        colorChoice = Colors.getRED();
        PhongMaterial c = Colors.getBumpMap();
        //spheres[0].setMaterial(c);
    }

    public void blue(MouseEvent mouseEvent) {
        setColorChoices();
        colorChoice = Colors.getBLUE();
        PhongMaterial c = Colors.getBumpMap();
        //spheres[1].setMaterial(c);
    }

    public void yellow(MouseEvent mouseEvent) {
        setColorChoices();
        colorChoice = Colors.getYELLOW();
        PhongMaterial c = Colors.getBumpMap();
        //spheres[2].setMaterial(c);
    }

    public void white(MouseEvent mouseEvent) {
        setColorChoices();
        colorChoice = Colors.getWHITE();
        PhongMaterial c = Colors.getBumpMap();
        //spheres[5].setMaterial(c);
    }

    public void black(MouseEvent mouseEvent) {
        setColorChoices();
        colorChoice = Colors.getBlack();
        PhongMaterial c = Colors.getBumpMap();
        //spheres[4].setMaterial(c);
    }

    public void green(MouseEvent mouseEvent) {
        setColorChoices();
        colorChoice = Colors.getGREEN();
        PhongMaterial c = Colors.getBumpMap();
        //spheres[3].setMaterial(c);
    }

    public void setColorS1R1(MouseEvent mouseEvent) {
        Sphere1row1.setMaterial( colorChoice );
        Sphere1row1.setDisable( true );
        currentCode[0] = (int) colorMap.get( colorChoice.getDiffuseColor() );
    }

    public void setColorS2R1(MouseEvent mouseEvent) {
        Sphere2row1.setMaterial( colorChoice );
        Sphere2row1.setDisable( true );
        currentCode[1] = (int) colorMap.get( colorChoice.getDiffuseColor() );
    }

    public void setColorS3R1(MouseEvent mouseEvent) {
        Sphere3row1.setMaterial( colorChoice );
        Sphere3row1.setDisable( true );
        currentCode[2] = (int) colorMap.get( colorChoice.getDiffuseColor() );
    }

    public void setColorS4R1(MouseEvent mouseEvent) throws InterruptedException {
        Sphere4row1.setMaterial( colorChoice );
        //Sphere4row1.setDisable(true);
        currentCode[3] = (int) colorMap.get( colorChoice.getDiffuseColor() );
        System.out.println( Sphere4row1.getId() );
    }

    public void setColor(MouseEvent mouseEvent) {
        Sphere circle = (Sphere) (mouseEvent.getSource());
        String rawId = circle.getId();
        String id = rawId.substring( 6, 7 ); // Sphere index
        row = rawId.substring( 7 ); // String Row
        String placeH = row.substring( 3 );
        int rowIndex = Integer.parseInt(placeH);
        if (currentRow == rowIndex){
            currentCode[Integer.parseInt( id ) - 1] = (int) colorMap.get( colorChoice.getDiffuseColor() );
            circle.setMaterial( colorChoice );
        }else{
            System.out.println("Crash");
        }
    }

    public void checkCorrectGuess() {
        currentRow++;
        if (row.equals( "row1" )) {
            Sphere1row1.setDisable( true );
            Sphere2row1.setDisable( true );
            Sphere3row1.setDisable( true );
            Sphere4row1.setDisable( true );
        } else if (row.equals( "row2" )) {
            Sphere1row2.setDisable( true );
            Sphere2row2.setDisable( true );
            Sphere3row2.setDisable( true );
            Sphere4row2.setDisable( true );
        } else if (row.equals( "row3" )) {
            Sphere1row3.setDisable( true );
            Sphere2row3.setDisable( true );
            Sphere3row3.setDisable( true );
            Sphere4row3.setDisable( true );
        } else if (row.equals( "row4" )) {
            Sphere1row4.setDisable( true );
            Sphere2row4.setDisable( true );
            Sphere3row4.setDisable( true );
            Sphere4row4.setDisable( true );
        } else if (row.equals( "row5" )) {
            Sphere1row5.setDisable( true );
            Sphere2row5.setDisable( true );
            Sphere3row5.setDisable( true );
            Sphere4row5.setDisable( true );
        } else if (row.equals( "row6" )) {
            Sphere1row6.setDisable( true );
            Sphere2row6.setDisable( true );
            Sphere3row6.setDisable( true );
            Sphere4row6.setDisable( true );
        } else if (row.equals( "row7" )) {
            Sphere1row7.setDisable( true );
            Sphere2row7.setDisable( true );
            Sphere3row7.setDisable( true );
            Sphere4row7.setDisable( true );
        } else if (row.equals( "row8" )) {
            Sphere1row8.setDisable( true );
            Sphere2row8.setDisable( true );
            Sphere3row8.setDisable( true );
            Sphere4row8.setDisable( true );
        } else if (row.equals( "row9" )) {
            Sphere1row9.setDisable( true );
            Sphere2row9.setDisable( true );
            Sphere3row9.setDisable( true );
            Sphere4row9.setDisable( true );
        } else if (row.equals( "row10" )) {
            Sphere1row10.setDisable( true );
            Sphere2row10.setDisable( true );
            Sphere3row10.setDisable( true );
            Sphere4row10.setDisable( true );
        }
        int[] tempCode = new int[4];
        int[] tempNums = new int[4];
        for (int i = 0; i < 4; i++) {
            tempCode[i] = secretCode[i];
            tempNums[i] = currentCode[i];
        }
        int blackPegs = 0;
        for (int i = 0; i < secretCode.length; i++) {
            if (tempCode[i] == tempNums[i]) {
                blackPegs++;
                tempCode[i] = -1;
                tempNums[i] = -1;
            }

        }
        int whitePegs = 0;
        for (int i=0; i < secretCode.length; i++) {
            if (tempCode[i]==-1) {
                continue;
            }
            for (int j=0;j < secretCode.length; j++) {
                if (tempNums[j]==-1) {
                    continue;
                }
                if (tempCode[i]==tempNums[j]) {
                   whitePegs++;
                    tempCode[i]=-1;
                    tempNums[j]=-1;
                }
            }
        }


        result[0] = blackPegs;
        result[1] = whitePegs;

        System.out.println("Black pegs " + result[0]);
        System.out.println("White pegs " + result[1]);
        pegPlacement();
    }

    public void pegPlacement(){
        int row = currentRow - 1;
        //System.out.println(row);
        HashMap test = (HashMap)pegs.get(row -1);
        //System.out.println(test);

        //test.forEach((key, value)-> ((Sphere)value).setMaterial(colorPegs( (Integer) value )));
        //System.out.println(result[0]);
        int blackPegs = result[0];
        int whitePegs = result[1];
        int i = 0;
        while (i < blackPegs) {
            i++;
            Sphere sphere = (Sphere) test.get(i);
            sphere.setMaterial(Colors.getBlack());
            }
            int j = 0;
        while (j < whitePegs){
            j++;
            Sphere sphere = (Sphere) test.get(j+i);
            sphere.setMaterial(Colors.getRED());
        }
        if (row == 10 || blackPegs == 4){
            SecretSphere1.setVisible(true);
            SecretSphere2.setVisible(true);
            SecretSphere3.setVisible(true);
            SecretSphere4.setVisible(true);
        }

            //sphere.setMaterial(Colors.getBlack());
    }

    public PhongMaterial colorPegs(int x){
        return null;
    }

    public void menuOption(MouseEvent mouseEvent) {
        Stage secondStage = new Stage();
        secondStage.setX(500);
        secondStage.setY(500);
        secondStage.setScene(new Scene(new HBox(4, new Label("Second window"))));
        secondStage.show();
    }

    public void newGame(){
        Main.getNavigation().load(Game.URL_FXML).Show();
    }
}
package sample;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.util.Duration;


import java.awt.*;
import java.util.Locale;


public class Controller {

    @FXML
    private Button buttonSTART;
    @FXML
    private Button buttonRESET;
    @FXML
    private Button buttonSTOP;
    @FXML
    private TextField textField;
    @FXML
    private Label time;


    static int interval = -1;

    private boolean hasStarted = false;
    private String secs;

    static Timeline timeline;

    @FXML
    public void initialize(){

        time.setText("00:00");


    }


    public void printSomething(){








        if(interval == -1) {
            updateCountDownText();
            interval = Integer.parseInt(secs) * 60;
        }


        if (interval > 1) {
            buttonSTART.setDisable(true);
            buttonRESET.setDisable(true);
        }
        else {
            buttonSTART.setDisable(false);
            buttonRESET.setDisable(false);
        }
        timeline = new Timeline(new KeyFrame(Duration.seconds(1), ev -> {
            hasStarted = true;

                        time.setText(String.format(Locale.getDefault(), "%02d:%02d",interval / 60,  setInterval() % 60 ));

        }));
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();




    }

    private void updateCountDownText() {
        textField.textProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue.matches("\\d*")) {
                textField.setText(newValue.replaceAll("[^\\d]", ""));
            }
        });

        secs = textField.getText();


        String timew = String.format(Locale.getDefault(),"%02d:%02d", Integer.parseInt(secs), 0);

        interval = Integer.parseInt(secs)* 60;

        time.setText(timew);


    }

    public void resetTimer(){
        updateCountDownText();
    }



    private static final int setInterval() {
        if (interval == 1) {
            timeline.stop();
            Toolkit.getDefaultToolkit().beep();
        }
        return interval--;
    }

    public void stopSomething(){

        if(hasStarted){
            timeline.stop();
            buttonSTART.setDisable(false);
            buttonRESET.setDisable(false);
            buttonRESET.setVisible(true);
            secs = String.valueOf(interval);


        }




    }



}

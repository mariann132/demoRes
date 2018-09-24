package sample;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.util.Duration;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;

public class Controller {

    @FXML
    private Button button;
    @FXML
    private TextField textField;
    @FXML
    private Label time;

    private int minute;
    private int hour;
    private int second;

    private  Timer timer = new Timer();
    Timeline fiveSecondsWonder;
    static int i = 0;
    public void printSomething(){


         fiveSecondsWonder = new Timeline(new KeyFrame(Duration.seconds(1), new EventHandler<ActionEvent>() {

            int w =0;
            @Override
            public void handle(ActionEvent event) {
                System.out.println("new something " + w);
               w++;
            }
        }));
        fiveSecondsWonder.setCycleCount(Timeline.INDEFINITE);
        fiveSecondsWonder.play();






//
//
//        timer.schedule(
//                new TimerTask() {
//
//                    @Override
//                    public void run() {
//                        System.out.println("ping");
//                    }
//                }, 0, 1000);



    }

    public void stopSomething(){


       fiveSecondsWonder.stop();




    }

    @FXML
    public void initialize() {






//        int min = 25;
//        Timeline clock = new Timeline(new KeyFrame(Duration.ZERO, e -> {
//
//
//            second = LocalDateTime.now().getSecond();
//            minute = 25;
//            //hour = LocalDateTime.now().getHour();
//            time.setText(String.format(Locale.getDefault(),"%02d:%02d",  minute, second));
//        }),
//                new KeyFrame(Duration.seconds(1))
//        );
//        clock.setCycleCount(Animation.INDEFINITE);
//        clock.play();

   }

   public void startTime(){

   }
}

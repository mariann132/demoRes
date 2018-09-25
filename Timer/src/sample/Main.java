package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Timer");
        primaryStage.setScene(new Scene(root, 450, 275));
        primaryStage.show();
    }

    static int interval;
    static Timer timer;

    public static void main(String[] args) {
      launch(args);

    }
//        String secs = "10";
//        int delay = 1000;
//        int period = 1000;
//        timer = new Timer();
//        interval = Integer.parseInt(secs);
//        System.out.println(secs);
//        timer.scheduleAtFixedRate(new TimerTask() {
//
//            public void run() {
//                System.out.println(setInterval());
//
//            }
//        }, delay, period);
//    }
//
//    private static final int setInterval() {
//        if (interval == 1)
//            timer.cancel();
//        return --interval;
//    }
}

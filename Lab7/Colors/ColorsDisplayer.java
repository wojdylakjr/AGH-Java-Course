package com.company;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ColorsDisplayer extends Application implements Comparable<HSVColor>{


    private List<HSVColor> createColorsToDisplay() {
        Random rand = new Random();
        List<HSVColor> list = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            list.add(new HSVColor(rand.nextInt(360), rand.nextDouble(), rand.nextDouble()));
        }
        list.add(new HSVColor(1000,10,10));
        Collections.sort(list);
        return list;
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane pane = new BorderPane();

        HBox colorBox = new HBox();
        pane.setCenter(colorBox);

        for (HSVColor color : createColorsToDisplay()) {
            System.out.println(color.getHue() + " " + color.getSaturation() + " " + color.getValue());
            Rectangle colorRect = new Rectangle(20, 20);
            colorRect.setFill(Color.hsb(color.getHue(), color.getSaturation(), color.getValue()));
            colorBox.getChildren().add(colorRect);
        }

        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public int compareTo(HSVColor o) {
        return 0;
    }
}
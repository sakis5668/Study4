/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sakis.anthologium.main;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author isaaktosounidis
 */
public class Anthologium extends Application {
    
    public static Stage stage;

    @Override
    public void start(Stage primaryStage) {
        try {
            AnthologiumController ctrl = new AnthologiumController(new AnthologiumView(), new AnthologiumModel());
            BorderPane root = ctrl.getView();
            Scene scene = new Scene(root, 1200, 800);
            scene.setFill(null);
            primaryStage.setScene(scene);
            Anthologium.stage = primaryStage;
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}

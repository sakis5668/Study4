/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sakis.anthologium.main;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXButton.ButtonType;
import javafx.scene.control.ToolBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.paint.Paint;

/**
 *
 * @author isaaktosounidis
 */
public class AnthologiumView extends BorderPane {

    private HBox topHBox;
    private ToolBar toolBar1, toolBar2;
    private JFXButton photoOverviewButton, actorsButton, songsButton, exitButton, minimizeButton;

    /**
     * Constructor
     */
    public AnthologiumView() {
        // first get the style sheet 
        final String cssString = getClass().getResource("/com/sakis/anthologium/css/StyleSheet.css").toExternalForm();
        getStylesheets().add(cssString);

        // set the style class for the BorderPane
        getStyleClass().add("mainborderpane");

        // *** draw the top content
        // create the the 2 tool bars and set their style
        // we need here 2 tool bars, because one contains the button on the upper
        // right , and the second contains only the minimize button on the top left corner
        toolBar1 = new ToolBar();
        toolBar1.getStyleClass().add("toolbar");
        toolBar2 = new ToolBar();
        toolBar2.getStyleClass().add("toolbar");

        // create the buttons
        // photo overview button
        String url1 = "/com/sakis/anthologium/images/photos.png";
        Image img1 = new Image(getClass().getResourceAsStream(url1));
        ImageView iv1 = new ImageView(img1);
        iv1.setFitHeight(32);
        iv1.setFitWidth(32);
        iv1.setPreserveRatio(true);
        photoOverviewButton = new JFXButton("Photos", iv1);
        photoOverviewButton.setButtonType(ButtonType.RAISED);

        // 2. Actors button
        String url2 = "/com/sakis/anthologium/images/actor.png";
        ImageView iv2 = new ImageView(new Image(getClass().getResourceAsStream(url2)));
        iv2.setFitHeight(32);
        iv2.setFitWidth(32);
        iv2.setPreserveRatio(true);
        actorsButton = new JFXButton("Actors", iv2);
        actorsButton.setButtonType(ButtonType.RAISED);

        // 3. Songs button
        String url3 = "/com/sakis/anthologium/images/songs.png";
        ImageView iv3 = new ImageView(new Image(getClass().getResourceAsStream(url3)));
        iv3.setFitHeight(32);
        iv3.setFitWidth(32);
        iv3.setPreserveRatio(true);
        songsButton = new JFXButton("Songs", iv3);
        songsButton.setButtonType(ButtonType.RAISED);

        // 4. Exit button
        String url4 = "/com/sakis/anthologium/images/exit.png";
        ImageView iv4 = new ImageView(new Image(getClass().getResourceAsStream(url4)));
        iv4.setFitHeight(32);
        iv4.setFitWidth(32);
        iv4.setPreserveRatio(true);
        exitButton = new JFXButton("Exit", iv4);
        exitButton.setButtonType(ButtonType.RAISED);

        // 5. Minimize button
        String url5 = "/com/sakis/anthologium/images/minimize.png";
        ImageView iv5 = new ImageView(new Image(getClass().getResourceAsStream(url5)));
        iv5.setFitHeight(32);
        iv5.setFitWidth(32);
        iv5.setPreserveRatio(true);
        minimizeButton = new JFXButton("", iv5);
        minimizeButton.setButtonType(ButtonType.RAISED);
        minimizeButton.setRipplerFill(Paint.valueOf("gray"));

        // Add the created buttons to the corresponding tool bars
        toolBar1.getItems().add(photoOverviewButton);
        toolBar1.getItems().add(actorsButton);
        toolBar1.getItems().add(songsButton);
        toolBar1.getItems().add(exitButton);
        toolBar2.getItems().add(minimizeButton);

        // add the tool bars to the horizontal box
        topHBox = new HBox();
        HBox.setHgrow(toolBar1, Priority.ALWAYS);
        topHBox.getChildren().addAll(toolBar1, toolBar2);

        // and finally set the the top content
        setTop(topHBox);
    }

    
    /**
     * Getter for the photoOverviewButton
     * @return 
     */
    public JFXButton getPhotoOverviewButton() {
        return photoOverviewButton;
    }

    
    /**
     * Getter for the actorsButton
     * @return 
     */
    public JFXButton getActorsButton() {
        return actorsButton;
    }

    
    /**
     * Getter for the songsButton
     * @return 
     */
    public JFXButton getSongsButton() {
        return songsButton;
    }

    
    /**
     * Getter for the exitButton
     * @return 
     */
    public JFXButton getExitButton() {
        return exitButton;
    }

    
    /**
     * Getter for the minimizeButton
     * @return 
     */
    public JFXButton getMinimizeButton() {
        return minimizeButton;
    }
    
    
    

}

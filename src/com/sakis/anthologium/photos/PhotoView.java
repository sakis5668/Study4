/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sakis.anthologium.photos;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXButton.ButtonType;
import com.jfoenix.controls.JFXTextField;
import javafx.collections.ObservableList;
import javafx.geometry.Orientation;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;

/**
 *
 * @author isaaktosounidis
 */
public class PhotoView extends Pane {

    HBox bigHBox;
    VBox leftVBox, rightVBox;
    JFXButton btn1, btn2, btn3;
    JFXTextField searchTextField;
    TilePane tilePane;

    public PhotoView() {

        // get the style sheet
        final String css = getClass().getResource("/com/sakis/anthologium/css/StyleSheet.css").toExternalForm();
        getStylesheets().add(css);

        // set the style class for the pane
        getStyleClass().add("photooverview-pane");

        // left VBox
        leftVBox = new VBox();
        leftVBox.setId("leftvbox");

        ImageView searchIcon = new ImageView(new Image(getClass().getResourceAsStream("/com/sakis/anthologium/images/search.png")));
        searchTextField = new JFXTextField();
        searchTextField.setPromptText("Actor to look for ...");

        HBox innerHBox = new HBox();
        innerHBox.setId("innerhbox");
        innerHBox.getChildren().addAll(searchIcon, searchTextField);

        tilePane = new TilePane(Orientation.HORIZONTAL, 10, 10);
        tilePane.setPrefHeight(200);
        tilePane.setId("tilepane");
        tilePane.setPrefRows(1);
        
        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setContent(tilePane);
        scrollPane.setPannable(true);
        // TODO : complete here the left vbox
        leftVBox.setFillWidth(true);
        leftVBox.getChildren().addAll(innerHBox, scrollPane);

        // right vbox
        rightVBox = new VBox();
        rightVBox.setId("rightvbox");

        btn1 = new JFXButton("New");
        btn1.setButtonType(ButtonType.RAISED);

        btn2 = new JFXButton("Edit");
        btn2.setButtonType(ButtonType.RAISED);

        btn3 = new JFXButton("Delete");
        btn3.setButtonType(ButtonType.RAISED);

        rightVBox.getChildren().addAll(btn1, btn2, btn3);

        // Now put all together
        bigHBox = new HBox();
        bigHBox.getStyleClass().add("testbox");
        bigHBox.getChildren().addAll(leftVBox, rightVBox);
        getChildren().add(bigHBox);
    }

    public TilePane getTilePane() {
        return tilePane;
    }
    
    public void populateTilePane(ObservableList<Image> images) {
        this.tilePane.setPrefColumns(images.size());
        for (int i=0; i<images.size(); i++) {
            Image img = images.get(i);
            ImageView iv = new ImageView(img);
            iv.setFitHeight(150);
            iv.setFitWidth(150);
            iv.setPreserveRatio(true);
            this.tilePane.getChildren().add(iv);
        }
    }

}

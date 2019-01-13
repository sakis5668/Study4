/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sakis.anthologium.main;

import com.sakis.anthologium.photos.PhotoController;
import com.sakis.anthologium.photos.PhotoModel;
import com.sakis.anthologium.photos.PhotoView;
import java.util.Optional;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

/**
 *
 * @author isaaktosounidis
 */
public class AnthologiumController {

    private AnthologiumModel model;
    private AnthologiumView view;

    /**
     * Constructor
     *
     * @param view
     * @param model
     */
    public AnthologiumController(AnthologiumView view, AnthologiumModel model) {
        this.view = view;
        this.model = model;

        this.view.getPhotoOverviewButton().setOnAction(e -> handlePhotoOverviewButton());
        this.view.getActorsButton().setOnAction(e -> handleActorsButton());
        this.view.getSongsButton().setOnAction(e -> handleSongsButton());
        this.view.getExitButton().setOnAction(e -> handleExitButton());
        this.view.getMinimizeButton().setOnAction(e -> handleMinimizeButton());
    }

    /**
     * Handle the photos overview button
     */
    private void handlePhotoOverviewButton() {
        view.setCenter(null);
        PhotoView photoView = new PhotoView();
        PhotoModel photoModel = new PhotoModel();
        PhotoController ctrl = new PhotoController(photoView, photoModel);
        view.setCenter(ctrl.getView());
    }

    /**
     * Handle the actors button
     */
    private void handleActorsButton() {
        view.setCenter(null);
    }

    /**
     * Handle the songs button
     */
    private void handleSongsButton() {
        view.setCenter(null);
    }

    /**
     * Handle the exit button
     */
    private void handleExitButton() {
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setContentText("Confirm");
        alert.setHeaderText("Are you sure you want to exit ?");
        alert.setContentText("Press OK to really exit ...");
        Optional<javafx.scene.control.ButtonType> result = alert.showAndWait();
        if (result.get() == javafx.scene.control.ButtonType.OK) {
            System.exit(0);
        }
    }

    /**
     * Handle the minimize button
     */
    private void handleMinimizeButton() {
        Anthologium.stage.setIconified(true);
    }

    /**
     * Return this controllers view object
     *
     * @return
     */
    public AnthologiumView getView() {
        return this.view;
    }

}

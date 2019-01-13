/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sakis.anthologium.photos;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 *
 * @author isaaktosounidis
 */
public class PhotoController {

    private final PhotoView view;
    private final PhotoModel model;

    public PhotoController(PhotoView view, PhotoModel model) {
        this.view = view;
        this.model = model;
        
        this.view.populateTilePane(this.model.getCurrentImages());
        
    }

    public PhotoView getView() {
        return this.view;
    }

}

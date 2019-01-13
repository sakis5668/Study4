/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sakis.anthologium.photos;

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
    }
    
    
    public PhotoView getView() {
        return this.view;
    }
    
}

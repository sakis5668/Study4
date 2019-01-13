package com.sakis.anthologium.photos;

import javafx.event.EventHandler;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;


public class PhotoController {

    private final PhotoView view;
    private final PhotoModel model;

    
    /**
     * Constructor
     * @param view
     * @param model 
     */
    public PhotoController(PhotoView view, PhotoModel model) {
        this.view = view;
        this.model = model;
        
        this.view.populateTilePane(this.model.getCurrentImages());
        
        addHandlers();
        
    }


    /**
     * Return this controllers view
     * @return 
     */
    public PhotoView getView() {
        return this.view;
    }

    private void addHandlers() {
        
        this.view.addKeyEventHandler(new EventHandler<KeyEvent>(){
            @Override
            public void handle(KeyEvent event) {
                if (event.getCode()==KeyCode.ENTER) {
                    model.setSearchStringProperty(view.getSearchTextField().getText());
                    view.populateTilePane(model.getCurrentImages());
                    Image img = model.getCurrentImage();
                    view.populateBigImageView(img);
                }
            }
        });
        
//        this.view.addMouseEventHandler(new EventHandler<MouseEvent>() {
//            @Override
//            public void handle(MouseEvent event) {
//                if (event.getButton().equals(MouseButton.PRIMARY)) {
//                    if (event.getClickCount()==1) {
//                        ImageView iv = (ImageView) event.getSource();
//                        view.populateBigImageView(iv.getImage());
//                    }
//                }
//            }
//        });
        
    }

}

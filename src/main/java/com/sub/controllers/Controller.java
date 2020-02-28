package com.sub.controllers;

import com.sub.utils.FxmlUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.BorderPane;

public class Controller {

    ///import primaryStageFXML
    @FXML
    private BorderPane borderPane;

    //import menuContrlller
    @FXML
    LeftController leftController;

    // po starcie applikacji wstrzyknij kontroller menu do głowengo kontrolera
    @FXML
    private void initialize(){
        leftController.setController( this );
    }

    ///wstawienie w central BorderPane
    public void setCenter(String fxmlPath){
        borderPane.setCenter( FxmlUtils.fxmlLoader( fxmlPath ) );
    }
}

package com.sub.controllers;

import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;

public class Center {


    public static final String TEXT = "Jak ktoś by nie wiedział to jest KOłO";

    public void okClickKolo(MouseEvent mouseEvent) {
        Alert alert = new Alert( Alert.AlertType.INFORMATION );
        alert.setTitle( "Helloł" );
        alert.setHeaderText( "Jest Problem" );
        TextArea textArea = new TextArea( TEXT );
        alert.getDialogPane().setContent( textArea );
        alert.showAndWait();
    }
}

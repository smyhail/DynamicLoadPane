package com.sub.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class LeftController {
    private Controller controller;

    public void onShowU() {
        controller.setCenter( "/Center.fxml" );
    }

    //seter z pobranego MainKontrollera
    public void setController(Controller controller) {
        this.controller = controller;
    }
}

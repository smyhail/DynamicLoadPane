package com.sub;

import com.sub.utils.FxmlUtils;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {

    //funkcj start - ustawienia startowe aplikacji
    @Override
    public void start(Stage primaryStage) throws Exception {
        //1. import pane
        Pane borderPane = FxmlUtils.fxmlLoader( "/AppMain.fxml" );
        //2.podstawa to scena
        Scene scene = new Scene(borderPane);
        //3. a STAGE musi miec scene
        primaryStage.setScene(scene);
       // primaryStage.setTitle( "yyyyyyyyy" );    //tytuł zazwuczam powinien byc :)
        //4.nakazac naszemu STAGE, w którym jest SCENE i ma w koncu mp.pane. na "pokazanie"
        primaryStage.show();
    }
    ///start aplikacji
    public static void main(String[] args) {
        launch( args );
    }
}

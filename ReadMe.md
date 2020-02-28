# pliki

## Java file
1. FxmlUtils
2. Main
3. MainController
4. MenuController
5. NextController


## FXML'e file
1. MainFXML
2. MenuFXML
3. NextFXML


# kodowanie

## 1. FxmlUtils - klasa odpowiedzialna za impoprt zasobów

```JAVA
    public static Pane fxmlLoader(String fxmlPath){        
        FXMLLoader loader = new FXMLLoader( FxmlUtils.class.getResource( fxmlPath ));     
        try {
            return loader.load();
        } catch (IOException e) {
            e.printStackTrace();         
        }
        return null;
    }
```
## 2. Main 

```JAVA
public class Main extends Application {    
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
```
# 3. MainController 

```JAVA 
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
```
## 4. MenuController    

```JAVA public class LeftController {
    private Controller controller;

        //ON ACTION BUTTONS
    public void onShowU() {
        controller.setCenter( "/Center.fxml" );
    }

    //seter z pobranego MainKontrollera
    public void setController(Controller controller) {
        this.controller = controller;
    }
}
```

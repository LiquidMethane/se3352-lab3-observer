package observer;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuBar;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private MenuBar menu;

    private Subject cs;

    public void spawnAddition() throws IOException{
        //TODO
        Addition add = new Addition(cs);

        Stage primaryStage = (Stage)menu.getScene().getWindow();

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Addition.fxml"));
        Parent spawnAddition = (Parent) fxmlLoader.load();

        AdditionController additionController = (AdditionController) fxmlLoader.getController();
        additionController.setModel(add);

        Scene scene = new Scene(spawnAddition);
        Stage stage = new Stage();

        stage.setX(primaryStage.getX() + 620);
        stage.setY(primaryStage.getY() + 60);

        stage.setScene(scene);
        stage.setTitle("Addition Observer");
        stage.initModality(Modality.APPLICATION_MODAL);

        stage.show();
    }

    public void spawnDivision() throws IOException{
        //TODO
        Division div = new Division(cs);

        Stage primaryStage = (Stage)menu.getScene().getWindow();


        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Division.fxml"));
        Parent spawnDivision = (Parent) fxmlLoader.load();

        DivisionController divisionController = (DivisionController) fxmlLoader.getController();
        divisionController.setModel(div);

        Scene scene = new Scene(spawnDivision);
        Stage stage = new Stage();

        stage.setX(primaryStage.getX() + 10);
        stage.setY(primaryStage.getY() + 410);

        stage.setScene(scene);
        stage.setTitle("Division Observer");
        stage.initModality(Modality.APPLICATION_MODAL);

        stage.show();
    }

    public void spawnMultiplication() throws IOException{
        //TODO
        Multiplication multiply = new Multiplication(cs);

        Stage primaryStage = (Stage)menu.getScene().getWindow();

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Multiplication.fxml"));
        Parent spawnMultiplication = (Parent) fxmlLoader.load();

        MultiplicationController multiplicationController = (MultiplicationController) fxmlLoader.getController();
        multiplicationController.setModel(multiply);

        Scene scene = new Scene(spawnMultiplication);
        Stage stage = new Stage();

        stage.setX(primaryStage.getX() + 620);
        stage.setY(primaryStage.getY() + 410);

        stage.setScene(scene);
        stage.setTitle("Multiplication Observer");
        stage.initModality(Modality.APPLICATION_MODAL);

        stage.show();
    }

    public void start() throws IOException{

        Stage primaryStage = (Stage)menu.getScene().getWindow();

        spawnAddition();
        spawnDivision();
        spawnMultiplication();

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ConcreteSubject.fxml"));
        Parent parent = (Parent) fxmlLoader.load();

        ConcreteSubjectController concreteSubjectController = (ConcreteSubjectController) fxmlLoader.getController();
        concreteSubjectController.setModel(cs);

        Scene scene = new Scene(parent);
        Stage stage = new Stage();

        stage.setX(primaryStage.getX() + 10);
        stage.setY(primaryStage.getY() + 60);

        stage.setScene(scene);
        stage.setTitle("Concrete Subject");
        stage.initModality(Modality.APPLICATION_MODAL);

        stage.show();


    }

    public void closeWindow() {
        ((Stage)menu.getScene().getWindow()).close();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        cs = new ConcreteSubject();
    }
}

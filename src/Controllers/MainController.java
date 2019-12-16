package Controllers;

import Models.MyModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class MainController {

    @FXML
    private Pane topPane;

    @FXML
    private Button highscoreButton;

    @FXML
    private Button startButton;

    @FXML
    private GridPane mainPage;

    @FXML
    private Button exitButton;

    @FXML
    private Button xButton;


    public void pressStart(ActionEvent event) throws IOException {
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        Parent gameModePage = FXMLLoader.load(getClass().getClassLoader().getResource("Views/GameModeView.fxml"));
        Scene scene = new Scene(gameModePage);
        window.setScene(scene);
    }

    public void pressExit(ActionEvent event) {
        MyModel.getInstance().close();
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.close();
    }
}
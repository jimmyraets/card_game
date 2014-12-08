package gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

public class HomePageController implements ControlledScreen {

    ScreensController myController;

    @FXML
    private VBox mainVBox;

    @FXML
    private Button btnAddSkill;

    @FXML
    private BorderPane mainPane;

    @FXML
    private Button btnAddCard;

    @FXML
    void addCard(ActionEvent event) {
        myController.setScreen(ScreensFramework.screen2ID);
    }

    @FXML
    void addSkill(ActionEvent event) {
        myController.setScreen(ScreensFramework.screen3ID);
    }

    @FXML
    void initialize() {
        assert mainVBox != null : "fx:id=\"mainVBox\" was not injected: check your FXML file 'HomePage.fxml'.";
        assert btnAddSkill != null : "fx:id=\"btnAddSkill\" was not injected: check your FXML file 'HomePage.fxml'.";
        assert mainPane != null : "fx:id=\"mainPane\" was not injected: check your FXML file 'HomePage.fxml'.";
        assert btnAddCard != null : "fx:id=\"btnAddCard\" was not injected: check your FXML file 'HomePage.fxml'.";
    }

    @Override
    public void setScreenParent(ScreensController screenPage) {
        myController = screenPage;
    }
}

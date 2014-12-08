package gui;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


public class AddCardPageController implements ControlledScreen {

    ScreensController myController;

    @Override
    public void setScreenParent(ScreensController screenPage) {
        myController = screenPage;
    }

    @FXML
    private VBox center_vbox;

    @FXML
    private HBox hboxName;

    @FXML
    private HBox hboxImage;

    @FXML
    private HBox top_hbox;

    @FXML
    private BorderPane AddCardPane;

    @FXML
    private Button btnHome;

    @FXML
    void goHome(ActionEvent event) {
        myController.setScreen(ScreensFramework.screen1ID);
    }

    @FXML
    void initialize() {
        assert center_vbox != null : "fx:id=\"center_vbox\" was not injected: check your FXML file 'AddCardPage.fxml'.";
        assert hboxName != null : "fx:id=\"hboxName\" was not injected: check your FXML file 'AddCardPage.fxml'.";
        assert hboxImage != null : "fx:id=\"hboxImage\" was not injected: check your FXML file 'AddCardPage.fxml'.";
        assert top_hbox != null : "fx:id=\"top_hbox\" was not injected: check your FXML file 'AddCardPage.fxml'.";
        assert AddCardPane != null : "fx:id=\"AddCardPane\" was not injected: check your FXML file 'AddCardPage.fxml'.";
        assert btnHome != null : "fx:id=\"btnHome\" was not injected: check your FXML file 'AddCardPage.fxml'.";

    }
}

package ma.fstt.trackingl;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.sql.SQLException;
import java.net.URL;
import java.util.ResourceBundle;

public class GestionCommandeController implements Initializable {

    @FXML
    private Button closee;
    public void close(){

        Stage stage =(Stage) closee.getScene().getWindow();
        stage.close();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}

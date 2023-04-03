package ma.fstt.trackingl;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class MenuController {


    public void gerer_pro(ActionEvent event) throws IOException {
        Parent tableviewParent=  FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        Scene tableViewScene= new Scene(tableviewParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(tableViewScene);
        window.show();
    }
    public void gerer_liv(ActionEvent event) throws IOException {
        Parent tableviewParent=  FXMLLoader.load(getClass().getResource("gestionProduit.fxml"));
        Scene tableViewScene= new Scene(tableviewParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(tableViewScene);
        window.show();
    }
    public void gerer_com(ActionEvent event) throws IOException {
        Parent tableviewParent=  FXMLLoader.load(getClass().getResource("gestionCommande.fxml"));
        Scene tableViewScene= new Scene(tableviewParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(tableViewScene);
        window.show();
    }

}




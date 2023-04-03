package ma.fstt.trackingl;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import ma.fstt.model.Produit;
import ma.fstt.model.ProduitDAO;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class GestionProduitController implements Initializable {


    @FXML
    private TextField nom ;


    @FXML
    private TextField prix ;

    @FXML
    private Button pro;
    @FXML
    private Button closee;
    @FXML
    private TableView<Produit> mytable ;

    @FXML
    private TableColumn<Produit ,Long> col_id ;

    @FXML
    private TableColumn <Produit ,String> col_nom ;

    @FXML
    private TableColumn <Produit ,String> col_prix ;


    @FXML
    protected void onSaveButtonClick() throws RuntimeException {

        // accees a la bdd

        try {
            ProduitDAO produitDAO = new ProduitDAO();

            Produit pro = new Produit(0l , nom.getText() , prix.getText());

            produitDAO.save(pro);


            UpdateTable();




        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

    public void close(){

        Stage stage =(Stage) closee.getScene().getWindow();
        stage.close();
    }


    public void UpdateTable(){
        col_id.setCellValueFactory(new PropertyValueFactory<Produit,Long>("id_produit"));
        col_nom.setCellValueFactory(new PropertyValueFactory<Produit,String>("nom"));

        col_prix.setCellValueFactory(new PropertyValueFactory<Produit,String>("prix"));



        mytable.setItems(this.getDataProduits());
    }

    public static ObservableList<Produit> getDataProduits(){

        ProduitDAO produitDAO = null;

        ObservableList<Produit> listfx = FXCollections.observableArrayList();

        try {
            produitDAO = new ProduitDAO();
            for (Produit ettemp : produitDAO.getAll())
                listfx.add(ettemp);

        }catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return listfx ;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        UpdateTable();

    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import static javafx.collections.FXCollections.observableList;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author User
 */
public class OrderHistoryController implements Initializable {

    @FXML
    private TableView<Letter> orderHistoryTable;
    @FXML
    private TableColumn<Letter, String> receivername;
    @FXML
    private TableColumn<Letter, String> address;
    @FXML
    private TableColumn<Letter, String> payment;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        receivername.setCellValueFactory(new PropertyValueFactory<Letter, String>("receivername"));
        address.setCellValueFactory(new PropertyValueFactory<Letter, String>("receiveraddress"));
        payment.setCellValueFactory(new PropertyValueFactory<Letter, String>("payment"));
        orderHistoryTable.setItems(getLetters());
    }    
   private ObservableList<Letter> getLetters(){
       ObservableList<Letter> letter=FXCollections.observableArrayList();
       File f = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            f = new File("Letter.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            Letter l;
            try {
                while (true) {
                    l = (Letter) ois.readObject();
                    letter.add(l);
                }
            } catch (Exception e) {
            }
        } catch (IOException ex) {
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException ex) {
            }
        }
       return letter;
   } 

    @FXML
    private void goHomeButton(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("customerhomepage.fxml")); /* jei fxml e jete chai oitar name likhte hobe*/
        Parent parentName = loader.load();
        Scene sceneName = new Scene(parentName);
        Stage stageName = (Stage) ((Node) event.getSource()).getScene().getWindow();   
        stageName.setScene(sceneName);
        stageName.show();
    }
}

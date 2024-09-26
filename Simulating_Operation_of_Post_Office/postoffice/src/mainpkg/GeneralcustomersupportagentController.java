/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author User
 */
public class GeneralcustomersupportagentController implements Initializable {

    @FXML
    private Button logoutButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void trackingLetter(ActionEvent event) {
    }

    @FXML
    private void deliveryIssue(ActionEvent event) {
    }

    @FXML
    private void stamSale(ActionEvent event) {
    }

    @FXML
    private void updateCustomerInfo(ActionEvent event) {
    }

    @FXML
    private void billingAssist(ActionEvent event) {
    }

    @FXML
    private void urgentDelivery(ActionEvent event) {
    }

    @FXML
    private void lostAndDamaged(ActionEvent event) {
    }

    @FXML
    private void logoutButton(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("FXMLDocument.fxml"));
        /* jei fxml e jete chai oitar name likhte hobe*/
        Parent parentName = loader.load();
        Scene sceneName = new Scene(parentName);
        Stage stageName = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stageName.setScene(sceneName);
        stageName.show();
    }
    
}

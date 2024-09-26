/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author User
 */
public class CustomerContactingAgentController implements Initializable {

    @FXML
    private ComboBox<String> issueTypeComboBox;
    @FXML
    private ComboBox<String> contactMethodComboBox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        issueTypeComboBox.getItems().addAll("Tracking", "Delivery issue", "Billing assist","Lost and Damage", "Update Info");
        issueTypeComboBox.setValue("Tracking");
        contactMethodComboBox.getItems().addAll("VIA Call", "Send-Email");
        contactMethodComboBox.setValue("VIA Call");
    }    

    @FXML
    private void sendandBackButton(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("customerhomepage.fxml")); /* jei fxml e jete chai oitar name likhte hobe*/
        Parent parentName = loader.load();
        Scene sceneName = new Scene(parentName);
        Stage stageName = (Stage) ((Node) event.getSource()).getScene().getWindow();   
        stageName.setScene(sceneName);
        stageName.show();
    }
}

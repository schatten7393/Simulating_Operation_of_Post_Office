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
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author User
 */
public class ModifycustomerinfoController implements Initializable {

    @FXML
    private Button saveButton;
    @FXML
    private Button gobackButton;
    @FXML
    private ComboBox<String> sendletterComboBox1;
    @FXML
    private ComboBox<String> sendletterComboBox2;
    @FXML
    private TextField letternoTextFiled1;
    @FXML
    private TextField nameTextFiled1;
    @FXML
    private TextField addressTextFiled1;
    @FXML
    private TextField contactTextFiled1;
    @FXML
    private TextField contactTextFiled2;
    @FXML
    private TextField nameTextFiled2;
    @FXML
    private TextField addressTextFiled2;
    @FXML
    private TextField zipTextFiled2;
    @FXML
    private TextField zipTextFiled1;
    @FXML
    private ComboBox<String> selectdivisionComboBox1;
    @FXML
    private ComboBox<String> selectcityComboBox1;
    @FXML
    private ComboBox<String> selectcityComboBox2;
    @FXML
    private ComboBox<String> selectdivisionComboBox2;
    @FXML
    private TextField letternoTextFiled2;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        sendletterComboBox1.getItems().addAll("Inside Dhaka (80tk)", "Nationwide-delivery (120tk)", "Urgent-delivery (150tk)");
        sendletterComboBox1.setValue("Inside Dhaka"); 
        selectdivisionComboBox1.getItems().addAll("Dhaka Division", "Khulna Division", "Rangpur Division","Barishal Division","Chittagong Division","Mymensingh Division","Rajshahi Division","Sylhet Division");
        selectdivisionComboBox1.setValue("Dhaka Division");
        selectcityComboBox1.getItems().addAll("Dhaka", "Khulna", "Rangpur","Barishal","Chittagong","Mymensingh","Rajshahi","Sylhet","Faridpur","Feni","Jessore","Cox's Bazar","Bhola","Sherpur","Sunamganj","Tangail");
        selectcityComboBox1.setValue("Dhaka");
        sendletterComboBox2.getItems().addAll("Inside Dhaka (80tk)", "Nationwide-delivery (120tk)", "Urgent-delivery (150tk)");
        sendletterComboBox2.setValue("Inside Dhaka"); 
        selectdivisionComboBox2.getItems().addAll("Dhaka Division", "Khulna Division", "Rangpur Division","Barishal Division","Chittagong Division","Mymensingh Division","Rajshahi Division","Sylhet Division");
        selectdivisionComboBox2.setValue("Dhaka Division");
        selectcityComboBox2.getItems().addAll("Dhaka", "Khulna", "Rangpur","Barishal","Chittagong","Mymensingh","Rajshahi","Sylhet","Faridpur","Feni","Jessore","Cox's Bazar","Bhola","Sherpur","Sunamganj","Tangail");
        selectcityComboBox2.setValue("Dhaka");
    }    

    @FXML
    private void saveButton(MouseEvent event) {
    }

    @FXML
    private void gobackButton(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("customerhomepage.fxml")); /* jei fxml e jete chai oitar name likhte hobe*/
        Parent parentName = loader.load();
        Scene sceneName = new Scene(parentName);
        Stage stageName = (Stage) ((Node) event.getSource()).getScene().getWindow();   
        stageName.setScene(sceneName);
        stageName.show();
    }
    
}

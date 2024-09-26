/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
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
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author User
 */
public class CreateaccountController implements Initializable {

    @FXML
    private RadioButton maleRadioButton;
    @FXML
    private RadioButton femaleRadioButton;
    @FXML
    private TextField lastnameTextField;
    @FXML
    private TextField zipcodeTextField;
    @FXML
    private ToggleGroup pickone;
    @FXML
    private ComboBox<String> usertypeComboBox;
    @FXML
    private TextField ageTextField;
    @FXML
    private Button previouspageTextField;
    @FXML
    private Button submitButton;
    @FXML
    private DatePicker dobDatePicker;
    @FXML
    private Label dojDatePicker;
    @FXML
    private TextField firstnameTextField;
    @FXML
    private TextField middlenameTextField;
    @FXML
    private TextField emailTextField;
    @FXML
    private TextField parmanentaddressTextField;
    @FXML
    private TextField countryTextField;
    @FXML
    private TextField phonenumberTextField;
    @FXML
    private TextField recentaddressTextField;
    @FXML
    private TextField passwordTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        usertypeComboBox.getItems().addAll("Customer", "General Customer Support Agent", "Post Office Clerk:", "Administrator", "Warehouse Staff", "Security Officer", "Accountant");
        usertypeComboBox.setValue("General Customer Support Agent");
    }

    @FXML
    private void maleRadioButton(MouseEvent event) {
    }

    @FXML
    private void femaleRadioButton(MouseEvent event) {
    }

    @FXML
    private void previouspageTextField(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("FXMLDocument.fxml"));
        /* jei fxml e jete chai oitar name likhte hobe*/
        Parent parentName = loader.load();
        Scene sceneName = new Scene(parentName);
        Stage stageName = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stageName.setScene(sceneName);
        stageName.show();
    }

    @FXML
    private void submitButton(MouseEvent event) throws IOException {
        String str = usertypeComboBox.getValue();
        if (str.equals("Customer")) {
            File f = null;
            FileOutputStream fos = null;
            ObjectOutputStream oos = null;
            try {
                f = new File("Customer.bin");
                if (f.exists()) {
                    fos = new FileOutputStream(f, true);
                    oos = new AppendableObjectOutputStream(fos);
                } else {
                    fos = new FileOutputStream(f);
                    oos = new ObjectOutputStream(fos);
                }
                RadioButton rb = (RadioButton) (pickone.getSelectedToggle());
                Customer s = new Customer(
                        passwordTextField.getText(),
                        firstnameTextField.getText() + ' ' + middlenameTextField.getText() + ' ' + lastnameTextField.getText(),
                        parmanentaddressTextField.getText(),
                        recentaddressTextField.getText(),
                        countryTextField.getText(),
                        emailTextField.getText(),
                        Integer.parseInt(zipcodeTextField.getText()),
                        phonenumberTextField.getText(),
                        Integer.parseInt(ageTextField.getText()),
                        rb.getText()
                );
                oos.writeObject(s);

            } catch (IOException ex) {
            } finally {
                try {
                    if (oos != null) {
                        oos.close();
                    }
                } catch (IOException ex) {
                }
            }
        }
        else if (str.equals("General Customer Support Agent")) {
            File f = null;
            FileOutputStream fos = null;
            ObjectOutputStream oos = null;
            try {
                f = new File("Agent.bin");
                if (f.exists()) {
                    fos = new FileOutputStream(f, true);
                    oos = new AppendableObjectOutputStream(fos);
                } else {
                    fos = new FileOutputStream(f);
                    oos = new ObjectOutputStream(fos);
                }
                RadioButton rb = (RadioButton) (pickone.getSelectedToggle());
                Agent agent = new Agent(
                        passwordTextField.getText(),
                        firstnameTextField.getText() + ' ' + middlenameTextField.getText() + ' ' + lastnameTextField.getText(),
                        parmanentaddressTextField.getText(),
                        recentaddressTextField.getText(),
                        countryTextField.getText(),
                        emailTextField.getText(),
                        Integer.parseInt(zipcodeTextField.getText()),
                        phonenumberTextField.getText(),
                        Integer.parseInt(ageTextField.getText()),
                        rb.getText()
                );
                oos.writeObject(agent);

            } catch (IOException ex) {
            } finally {
                try {
                    if (oos != null) {
                        oos.close();
                    }
                } catch (IOException ex) {
                }
            }
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

}

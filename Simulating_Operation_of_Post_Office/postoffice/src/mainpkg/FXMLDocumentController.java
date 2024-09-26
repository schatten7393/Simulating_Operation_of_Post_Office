/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package mainpkg;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
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
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 *
 * @author User
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Label label;
    @FXML
    private Button loginButton;
    @FXML
    private Button createaccountButton;
    @FXML
    private ComboBox<String> usertypeComboBox;
    @FXML
    private TextField useremailTextField;
    @FXML
    private TextField passwordTextField;

    private void handleButtonAction(ActionEvent event) {
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        usertypeComboBox.getItems().addAll("Customer", "General Customer Support Agent", "Post Office Clerk:", "Administrator", "Warehouse Staff", "Security Officer", "Accountant");
        usertypeComboBox.setValue("Customer");
    }

    @FXML
    private void loginButton(MouseEvent event) throws IOException {
        File f = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        if (usertypeComboBox.getValue().equals("Customer")) {
            try {
                f = new File("Customer.bin");
                fis = new FileInputStream(f);
                ois = new ObjectInputStream(fis);
                Customer c;
                try {
                    while (true) {
                        c = (Customer) ois.readObject();
                        if (c.verification(useremailTextField.getText(), passwordTextField.getText()) == true) {
                            FXMLLoader loader = new FXMLLoader();
                            loader.setLocation(getClass().getResource("customerhomepage.fxml"));
                            /* jei fxml e jete chai oitar name likhte hobe*/
                            Parent parentName = loader.load();
                            Scene sceneName = new Scene(parentName);
                            Stage stageName = (Stage) ((Node) event.getSource()).getScene().getWindow();
                            stageName.setScene(sceneName);
                            stageName.show();

                        }
                    }
                }//end of nested try
                catch (Exception e) {
                    //
                }//nested catch             
            } catch (IOException ex) {
            } finally {
                try {
                    if (ois != null) {
                        ois.close();
                    }
                } catch (IOException ex) {
                }
            }
        }
        else if (usertypeComboBox.getValue().equals("General Customer Support Agent")) {
            try {
                f = new File("Agent.bin");
                fis = new FileInputStream(f);
                ois = new ObjectInputStream(fis);
                Agent agent;
                try {
                    while (true) {
                        agent = (Agent) ois.readObject();
                        if (agent.verification(useremailTextField.getText(), passwordTextField.getText()) == true) {
                            FXMLLoader loader = new FXMLLoader();
                            loader.setLocation(getClass().getResource("generalcustomersupportagent.fxml"));
                            /* jei fxml e jete chai oitar name likhte hobe*/
                            Parent parentName = loader.load();
                            Scene sceneName = new Scene(parentName);
                            Stage stageName = (Stage) ((Node) event.getSource()).getScene().getWindow();
                            stageName.setScene(sceneName);
                            stageName.show();

                        }
                    }
                }//end of nested try
                catch (Exception e) {
                    //
                }//nested catch             
            } catch (IOException ex) {
            } finally {
                try {
                    if (ois != null) {
                        ois.close();
                    }
                } catch (IOException ex) {
                }
            }
        }

    }

    @FXML
    private void createaccountButton(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("createaccount.fxml"));
        /* jei fxml e jete chai oitar name likhte hobe*/
        Parent parentName = loader.load();
        Scene sceneName = new Scene(parentName);
        Stage stageName = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stageName.setScene(sceneName);
        stageName.show();
    }

}

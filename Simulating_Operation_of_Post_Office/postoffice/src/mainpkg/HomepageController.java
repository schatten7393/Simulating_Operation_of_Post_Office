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
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author User
 */
public class HomepageController implements Initializable {

    @FXML
    private Button trackingButton;
    @FXML
    private Button ordershistoryButton;
    @FXML
    private TextField sendernameTextField;
    @FXML
    private TextField sendercontactnumberTextField;
    @FXML
    private TextField senderaddressTextField;
    @FXML
    private TextField letteramountTextField;
    @FXML
    private ComboBox<String> divisionComboBox;
    @FXML
    private ComboBox<String> cityComboBox;
    @FXML
    private Label totalamountTextArea;
    @FXML
    private ComboBox<String> makepaymentComboBox;
    @FXML
    private TextField receivercontactnumberTextField;
    @FXML
    private TextField receiverpostalcodeTextField;
    @FXML
    private TextField receiveraddressTextField;
    @FXML
    private TextField receievernameTextField;
    @FXML
    private ComboBox<String> sendletterComboBox;
    @FXML
    private Button modifysendershipmentButton;
    @FXML
    private Button logoutButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        sendletterComboBox.getItems().addAll("Inside Dhaka (80tk)", "Nationwide-delivery (120tk)", "Urgent-delivery (150tk)");
        sendletterComboBox.setValue("Inside Dhaka");
        sendernameTextField.setPromptText("Sender Name");
        sendercontactnumberTextField.setPromptText("Sender Contact Number");
        senderaddressTextField.setPromptText("Sender Address");
        receievernameTextField.setPromptText("Receiver Name");
        receivercontactnumberTextField.setPromptText("Receiver Contact Number");
        receiverpostalcodeTextField.setPromptText("Receiver Postal/Zip Code");
        receiveraddressTextField.setPromptText("Receiver Address");
        letteramountTextField.setPromptText("Letter Amount");
        divisionComboBox.getItems().addAll("Dhaka Division", "Khulna Division", "Rangpur Division", "Barishal Division", "Chittagong Division", "Mymensingh Division", "Rajshahi Division", "Sylhet Division");
        divisionComboBox.setValue("Dhaka Division");
        cityComboBox.getItems().addAll("Dhaka", "Khulna", "Rangpur", "Barishal", "Chittagong", "Mymensingh", "Rajshahi", "Sylhet", "Faridpur", "Feni", "Jessore", "Cox's Bazar", "Bhola", "Sherpur", "Sunamganj", "Tangail");
        cityComboBox.setValue("Dhaka");
        makepaymentComboBox.getItems().addAll("Cash On Delivery", "Payment By Receiver");
        makepaymentComboBox.setValue("Cash On Delivery");
    }

    @FXML
    private void lettertypeComboBox(MouseEvent event) {

    }

    @FXML
    private void trackingButton(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("trackshipment.fxml"));
        /* jei fxml e jete chai oitar name likhte hobe*/
        Parent parentName = loader.load();
        Scene sceneName = new Scene(parentName);
        Stage stageName = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stageName.setScene(sceneName);
        stageName.show();

    }

    @FXML
    private void ordershistoryButton(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("orderHistory.fxml"));
        /* jei fxml e jete chai oitar name likhte hobe*/
        Parent parentName = loader.load();
        Scene sceneName = new Scene(parentName);
        Stage stageName = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stageName.setScene(sceneName);
        stageName.show();
    }

    @FXML
    private void contactwithagentButton(MouseEvent event) throws IOException {
                FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("customerContactingAgent.fxml"));
        /* jei fxml e jete chai oitar name likhte hobe*/
        Parent parentName = loader.load();
        Scene sceneName = new Scene(parentName);
        Stage stageName = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stageName.setScene(sceneName);
        stageName.show();
    }

    @FXML
    private void divisionComboBox(MouseEvent event) {
    }

    @FXML
    private void cityComboBox(MouseEvent event) {
    }

    @FXML
    private void makepaymentComboBox(MouseEvent event) {
    }

    @FXML
    private void modifysendershipmentButton(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("modifycustomerinfo.fxml"));
        /* jei fxml e jete chai oitar name likhte hobe*/
        Parent parentName = loader.load();
        Scene sceneName = new Scene(parentName);
        Stage stageName = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stageName.setScene(sceneName);
        stageName.show();
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

    @FXML
    private void submitButton(MouseEvent event) {
        String sendername = sendernameTextField.getText();
        String sendercontact = sendercontactnumberTextField.getText();
        String senderaddress = senderaddressTextField.getText();
        String receivername = receievernameTextField.getText();
        String receivercontact = receivercontactnumberTextField.getText();
        String receiveraddress = receiveraddressTextField.getText();
        Integer receiverzipcode = Integer.parseInt(receiverpostalcodeTextField.getText());
        String receiverdivision = divisionComboBox.getValue();
        String receivercity = cityComboBox.getValue();
        String sendlocation = sendletterComboBox.getValue();
        String payment = makepaymentComboBox.getValue();
        File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            f = new File("Letter.bin");
            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }
            Letter l = new Letter(
                    sendername, sendercontact, senderaddress, receivername, receivercontact, receiveraddress, receiverzipcode, receiverdivision, receivercity, sendlocation, payment
            );
            oos.writeObject(l);

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

    @FXML
    private void confirmButton(MouseEvent event) {
        String sendlocation = sendletterComboBox.getValue();
        Integer letteramount= Integer.parseInt(letteramountTextField.getText());
        if (sendlocation.equals("Inside Dhaka (80tk)")) {
            totalamountTextArea.setText(letteramount*80+" tk");
        } else if (sendlocation.equals("Nationwide-delivery (120tk)")) {
            totalamountTextArea.setText(letteramount*120+" tk");
        } else if (sendlocation.equals("Urgent-delivery (150tk)")) {
            totalamountTextArea.setText(letteramount*150+" tk");
        } else {
            totalamountTextArea.setText(letteramount*80+" tk");
        }
    }
}

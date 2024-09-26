/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpkg;

import java.io.Serializable;

/**
 *
 * @author User
 */
public class Letter implements Serializable{

    String sendername;
    String sendercontact;
    String senderaddress;
    String receivername;
    String receivercontact;
    String receiveraddress;
    Integer receiverzipcode;
    String receiverdivision;
    String receivercity;
    String sendlocation;
    String payment;

    public Letter(String sendername, String sendercontact, String senderaddress, String receivername, String receivercontact, String receiveraddress, Integer receiverzipcode, String receiverdivision, String receivercity, String sendlocation, String payment) {
        this.sendername = sendername;
        this.sendercontact = sendercontact;
        this.senderaddress = senderaddress;
        this.receivername = receivername;
        this.receivercontact = receivercontact;
        this.receiveraddress = receiveraddress;
        this.receiverzipcode = receiverzipcode;
        this.receiverdivision = receiverdivision;
        this.receivercity = receivercity;
        this.sendlocation = sendlocation;
        this.payment= payment;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public String getSendername() {
        return sendername;
    }

    public void setSendername(String sendername) {
        this.sendername = sendername;
    }

    public String getSendercontact() {
        return sendercontact;
    }

    public void setSendercontact(String sendercontact) {
        this.sendercontact = sendercontact;
    }

    public String getSenderaddress() {
        return senderaddress;
    }

    public void setSenderaddress(String senderaddress) {
        this.senderaddress = senderaddress;
    }

    public String getReceivername() {
        return receivername;
    }

    public void setReceivername(String receivername) {
        this.receivername = receivername;
    }

    public String getReceivercontact() {
        return receivercontact;
    }

    public void setReceivercontact(String receivercontact) {
        this.receivercontact = receivercontact;
    }

    public String getReceiveraddress() {
        return receiveraddress;
    }

    public void setReceiveraddress(String receiveraddress) {
        this.receiveraddress = receiveraddress;
    }

    public Integer getReceiverzipcode() {
        return receiverzipcode;
    }

    public void setReceiverzipcode(Integer receiverzipcode) {
        this.receiverzipcode = receiverzipcode;
    }

    public String getReceiverdivision() {
        return receiverdivision;
    }

    public void setReceiverdivision(String receiverdivision) {
        this.receiverdivision = receiverdivision;
    }

    public String getReceivercity() {
        return receivercity;
    }

    public void setReceivercity(String receivercity) {
        this.receivercity = receivercity;
    }

    public String getSendlocation() {
        return sendlocation;
    }

    public void setSendlocation(String sendlocation) {
        this.sendlocation = sendlocation;
    }

}

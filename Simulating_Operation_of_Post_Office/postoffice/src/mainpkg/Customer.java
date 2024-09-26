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
public class Customer implements Serializable {

    String password;
    String name;
    String parmanentAddress;
    String recentAddress;
    String country;
    String email;
    Integer zipcode;
    String phoneNumber;
    Integer age;
    String gender;

    public Customer(String password, String name, String parmanentAddress, String recentAddress, String country, String email, Integer zipcode, String phoneNumber, Integer age, String gender) {
        this.password = password;
        this.name = name;
        this.parmanentAddress = parmanentAddress;
        this.recentAddress = recentAddress;
        this.country = country;
        this.email = email;
        this.zipcode = zipcode;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.gender = gender;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParmanentAddress() {
        return parmanentAddress;
    }

    public void setParmanentAddress(String parmanentAddress) {
        this.parmanentAddress = parmanentAddress;
    }

    public String getRecentAddress() {
        return recentAddress;
    }

    public void setRecentAddress(String recentAddress) {
        this.recentAddress = recentAddress;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getZipcode() {
        return zipcode;
    }

    public void setZipcode(Integer zipcode) {
        this.zipcode = zipcode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean verification(String uemail,String upassword){
        if(email.equals(uemail) && password.equals(upassword)){
            return true;
        }
        return false;
    }
}

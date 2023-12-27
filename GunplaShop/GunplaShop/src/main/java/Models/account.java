/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author namti
 */
public class account {

    private String a_Id;
    private String a_Username;
    private String a_Password;
    private String a_Fullname;
    private String a_Email;
    private String a_Phone;
    private String a_Address;
    private String a_Avatar;

    public account() {
    }

    public account(String a_Id, String a_Username, String a_Password, String a_Fullname, String a_Email, String a_Phone, String a_Address, String a_Avatar) {
        this.a_Id = a_Id;
        this.a_Username = a_Username;
        this.a_Password = a_Password;
        this.a_Fullname = a_Fullname;
        this.a_Email = a_Email;
        this.a_Phone = a_Phone;
        this.a_Address = a_Address;
        this.a_Avatar = a_Avatar;
    }

    public String getA_Id() {
        return a_Id;
    }

    public void setA_Id(String a_Id) {
        this.a_Id = a_Id;
    }

    public String getA_Username() {
        return a_Username;
    }

    public void setA_Username(String a_Username) {
        this.a_Username = a_Username;
    }

    public String getA_Password() {
        return a_Password;
    }

    public void setA_Password(String a_Password) {
        this.a_Password = a_Password;
    }

    public String getA_Fullname() {
        return a_Fullname;
    }

    public void setA_Fullname(String a_Fullname) {
        this.a_Fullname = a_Fullname;
    }

    public String getA_Email() {
        return a_Email;
    }

    public void setA_Email(String a_Email) {
        this.a_Email = a_Email;
    }

    public String getA_Phone() {
        return a_Phone;
    }

    public void setA_Phone(String a_Phone) {
        this.a_Phone = a_Phone;
    }

    public String getA_Address() {
        return a_Address;
    }

    public void setA_Address(String a_Address) {
        this.a_Address = a_Address;
    }

    public String getA_Avatar() {
        return a_Avatar;
    }

    public void setA_Avatar(String a_Avatar) {
        this.a_Avatar = a_Avatar;
    }

}

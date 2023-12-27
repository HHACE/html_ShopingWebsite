/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author namti
 */
public class product {

    private String pd_Id;
    private String pd_Name;
    private double pd_Price;
    private String pd_Des;
    private int pd_Quan;
    private String pd_Img;
    private int c_Id;

    public product() {
    }

    public product(String pd_Id, String pd_Name, double pd_Price, String pd_Des, int pd_Quan, String pd_Img, int c_Id) {
        this.pd_Id = pd_Id;
        this.pd_Name = pd_Name;
        this.pd_Price = pd_Price;
        this.pd_Des = pd_Des;
        this.pd_Quan = pd_Quan;
        this.pd_Img = pd_Img;
        this.c_Id = c_Id;
    }

    public String getPd_Id() {
        return pd_Id;
    }

    public void setPd_Id(String pd_Id) {
        this.pd_Id = pd_Id;
    }

    public String getPd_Name() {
        return pd_Name;
    }

    public void setPd_Name(String pd_Name) {
        this.pd_Name = pd_Name;
    }

    public double getPd_Price() {
        return pd_Price;
    }

    public void setPd_Price(double pd_Price) {
        this.pd_Price = pd_Price;
    }

    public String getPd_Des() {
        return pd_Des;
    }

    public void setPd_Des(String pd_Des) {
        this.pd_Des = pd_Des;
    }

    public int getPd_Quan() {
        return pd_Quan;
    }

    public void setPd_Quan(int pd_Quan) {
        this.pd_Quan = pd_Quan;
    }

    public String getPd_Img() {
        return pd_Img;
    }

    public void setPd_Img(String pd_Img) {
        this.pd_Img = pd_Img;
    }

    public int getC_Id() {
        return c_Id;
    }

    public void setC_Id(int c_Id) {
        this.c_Id = c_Id;
    }
    
}  
	 
   
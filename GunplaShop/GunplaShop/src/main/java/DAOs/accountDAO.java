/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOs;

import Models.account;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author namti
 */
public class accountDAO {

    private Connection conn;

    public accountDAO() {
        conn = DB.DbConnection.GetConnection();
    }

    public ResultSet GetAll() {
        ResultSet rs = null;
        String sql = "SELECT * From Accounts";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

        } catch (SQLException ex) {
            Logger.getLogger(accountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }

  public account login(String username, String password) {
    ResultSet rs = null;
    account acc = null;

    String sql = "SELECT * FROM Accounts WHERE a_Username=? AND a_Password=?";
    try {
        // Hash the password
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] messageDigest = md.digest(password.getBytes());
        BigInteger no = new BigInteger(1, messageDigest);
        String hashtext = no.toString(16);
        while (hashtext.length() < 32) {
            hashtext = "0" + hashtext;
        }

        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, username);
        ps.setString(2, hashtext);
        rs = ps.executeQuery();

        if (rs.next()) {
            // User credentials are correct
            acc = new account(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
                    rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8));
        } else {
            // User credentials are incorrect
            throw new SQLException("Invalid username or password"); // Throw an exception
        }
    } catch (SQLException ex) {
        Logger.getLogger(accountDAO.class.getName()).log(Level.SEVERE, null, ex);
    } catch (NoSuchAlgorithmException ex) {
        Logger.getLogger(accountDAO.class.getName()).log(Level.SEVERE, null, ex);
    }
    return acc;
}
  
 public account checkAccountExist(String username) {
    ResultSet rs = null;
    account acc = null;

    String sql = "SELECT * FROM Accounts WHERE a_Username=?";
    try {
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, username);
        rs = ps.executeQuery();

        if (rs.next()) {
            // Account exists
            acc = new account(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
                    rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8));
        }
    } catch (SQLException ex) {
        Logger.getLogger(accountDAO.class.getName()).log(Level.SEVERE, null, ex);
    }

    return acc;
}


}

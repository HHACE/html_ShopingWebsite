/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class DbConnection {
    private static Connection conn = null;
    
    public static Connection GetConnection(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //conn = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-6M8JQG0\\SQLEXPRESS01:1433;databaseName=ProjectGundam;user=sa;password=123;encrypt=true;trustServerCertificate=true;");
            conn = DriverManager.getConnection("jdbc:sqlserver://MSI\\SQLEXPRESS:1433;databaseName=ProjectGundam;user=sa;password=SQLServer123;encrypt=true;trustServerCertificate=true;");

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }
}

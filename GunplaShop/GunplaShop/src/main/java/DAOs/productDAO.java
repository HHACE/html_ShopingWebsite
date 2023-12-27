/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOs;

import Models.product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author namti
 */
public class productDAO {

    private Connection conn;

    public productDAO() {
        conn = DB.DbConnection.GetConnection();
    }

    public List<product> GetAllProduct() {
        List<product> list = new ArrayList<>();
        ResultSet rs = null;
        String sql = "Select * From Products";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("ok");
                list.add(new product(
       
                        rs.getString(1),
                        rs.getString(2),
                        rs.getDouble(3),
                        rs.getString(4),
                        rs.getInt(5),
                        rs.getString(6),
                        rs.getInt(7)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(productDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public List<product> getProductByCateID(int c_Id) {
        List<product> list = new ArrayList<>();
        ResultSet rs = null;
        String sql = "Select * From Products where c_Id=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, c_Id);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new product(rs.getString(1),
                        rs.getString(2),
                        rs.getDouble(3),
                        rs.getString(4),
                        rs.getInt(5),
                        rs.getString(6),
                        rs.getInt(7)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(productDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    public List<product> getProductByName(String txtSearch) {
        List<product> list = new ArrayList<>();
        ResultSet rs = null;
        String sql = "Select * From Products where p_Name=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, txtSearch);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new product(rs.getString(1),
                        rs.getString(2),
                        rs.getDouble(3),
                        rs.getString(4),
                        rs.getInt(5),
                        rs.getString(6),
                        rs.getInt(7)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(productDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public product getProductByID(String id) {
        ResultSet rs = null;
        String sql = "Select * From Products where pd_Id=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new product(rs.getString(1),
                        rs.getString(2),
                        rs.getDouble(3),
                        rs.getString(4),
                        rs.getInt(5),
                        rs.getString(6),
                        rs.getInt(7));
            }
        } catch (SQLException ex) {
            Logger.getLogger(productDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}

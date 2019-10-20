
package Model;

import HotelSystem.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainModel {
    
    public String table;
    public String fields;
    
    public ResultSet get() {
        ResultSet rs = null;
        try {
            Conexion cn = new Conexion();
            String sql = "SELECT * FROM " + this.table;
            Statement st = cn.getConexion().createStatement();
            rs = st.executeQuery(sql);
            cn.getConexion().close();
        } catch (SQLException e) {
            System.out.print(e);
        }
        return rs;
    }
    
     public ResultSet getOne(String val) {
        ResultSet rs = null;
        try {
            Conexion cn = new Conexion();
            String sql = "SELECT * FROM " + this.table  + " WHERE " + this.getMainField() + " = '" + val + "'";
            Statement st = cn.getConexion().createStatement();
            rs = st.executeQuery(sql);
            cn.getConexion().close();
        } catch (SQLException e) {
            System.out.print(e);
        }
        return rs;
     
    }
    public boolean delete(String val) {
        try {
            PreparedStatement pst = null;
            Conexion cn = new Conexion();
            String sql = "DELETE FROM " + this.table + " WHERE " + this.getMainField() + " = '" + val + "'";
            pst = cn.getConexion().prepareStatement(sql);
            if (pst.executeUpdate() == 1) {
                return true;
            }
            cn.getConexion().close();
        } catch (SQLException e) {
            System.out.print(e);
        }
        return false;
    }
    
    public boolean insert(Object[] data, String[] type, boolean remove){
        Object [] fields = null;
        if (remove){
           fields = (this.fields.replace(this.getMainField()+",", "")).split(",");
        }else{
           fields = this.fields.split(",");
        }
        String sql = "INSERT INTO " + this.table + " (";
        
        for(int i = 0; i < fields.length; i++)
            sql += fields[i] + ",";
        
        sql = sql.substring(0, sql.length() - 1) + ") VALUES (";
        for(int i = 0; i < data.length; i++)
            sql += "?,";
        
        sql = sql.substring(0, sql.length() - 1)  + ")";
//        return sql;
        try {
            PreparedStatement pst = null;
            Conexion cn = new Conexion();
            pst = cn.getConexion().prepareStatement(sql);
            for(int i = 0; i < data.length; i++){
                if(type[i] == "i")
                    pst.setInt(i + 1, (int) data[i]);
                else if(type[i] == "s")
                    pst.setString(i + 1, (String) data[i]);
                else if(type[i] == "d")
                    pst.setDouble(i + 1, (double) data[i]);
            }
            if (pst.executeUpdate() == 1) {
                return true;
            }
        } catch (SQLException e) {
            System.out.print(e);
        }
        return false;
    }
    
    public ResultSet execute(String sql){
         ResultSet rs = null;
        try {
            Conexion cn = new Conexion();
            Statement st = cn.getConexion().createStatement();
            rs = st.executeQuery(sql);
            cn.getConexion().close();
        } catch (SQLException e) {
            System.out.print(e);
        }
        return rs;
    }
    
     public String getMainField() {
        return (this.fields.split(","))[0];
    }
}

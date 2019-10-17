package Model;

import HotelSystem.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


public class Habitacion extends MainModel {
    
    public String cod_habitacion;
    public int numero;
    public int piso;
    public String observaciones;
    
    public String table = "habitaciones";
   
    public ResultSet listar() {
        ResultSet rs = null;
        try {
            Conexion cn = new Conexion();
            String sql = "select * from habitaciones";
            Statement st = cn.getConexion().createStatement();
            rs = st.executeQuery(sql);
            cn.getConexion().close();
        } catch (Exception e) {
            System.out.print(e);
        }
        return rs;
    }
    public boolean createHabitation(String cod, int number, int floor, String observations) {
        try {
            PreparedStatement pst = null;
            Conexion cn = new Conexion();
            String sql = "insert into habitaciones (cod_habitacion, numero, piso, observaciones) values(?,?,?,?)";
            pst = cn.getConexion().prepareStatement(sql);
            pst.setString(1, cod);
            pst.setInt(2, number);
            pst.setInt(3, floor);
            pst.setString(4, observations);
            if (pst.executeUpdate() == 1) {
                return true;
            }
        } catch (Exception e) {
        }
        return false;
    }
}

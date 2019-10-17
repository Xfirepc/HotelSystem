package Model;

import HotelSystem.Conexion;
import java.sql.PreparedStatement;

public class Habitacion extends MainModel {
    
    public String cod_habitacion;
    public int numero;
    public int piso;
    public String observaciones;
    
    public Habitacion(){
        super();
        super.table = "habitaciones";
        super.fields = "cod_habitacion,numero,piso,observaciones";
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

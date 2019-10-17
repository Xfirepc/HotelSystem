package Controller;

import HotelSystem.Conexion;
import java.sql.ResultSet;
import java.sql.Statement;


public class HandlerRequest {
    public ResultSet Listar() {
        ResultSet rs = null;
        try {
            Conexion cn = new Conexion();
            String sql = "select * from habitaciones";
            Statement st = cn.getConexion().createStatement();
            rs = st.executeQuery(sql);
            // cn.getConexion().close();
        } catch (Exception e) {
            System.out.print(e);
        }
        return rs;
    }
}

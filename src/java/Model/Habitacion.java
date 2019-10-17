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
    
    public boolean create(Object[] data) {
        String[] types = {"s", "i", "i", "s"};
        return super.insert(data, types, null);
    }
}

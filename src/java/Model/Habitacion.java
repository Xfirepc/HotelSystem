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
    
    public boolean create() {
        // Types are defined by s: String, i: int, d: Date
        String[] types = {"s", "i", "i", "s"};
        Object[] data = {
            this.cod_habitacion, 
            this.numero, 
            this.piso, 
            this.observaciones
        };
        return super.insert(data, types, null);
    }
}

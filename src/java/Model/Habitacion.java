package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Habitacion extends MainModel {
    
    public String cod_habitacion;
    public String nombre;
    public String descripcion;
    public String imagen;
    public String observaciones;
    public double precio;
    public int piso;
    public int estado;
    
    public int status_free = 0;
    public int status_busy = 1;
    public int status_noservice = 2;
    
    public Habitacion() {
        super();
        super.table = "habitaciones";
        super.type = "string";
        super.fields = "cod_habitacion,nombre,descripcion,precio,piso,imagen,observaciones";
    }    
    
    public boolean create() {
        // Types are defined by s: String, i: int, D: Date, d: Double
        String[] types = {"s", "s", "s", "d", "i", "s", "s"};
        Object[] data = {
            this.cod_habitacion, 
            this.nombre, 
            this.descripcion, 
            this.precio, 
            this.piso, 
            this.imagen, 
            this.observaciones
        };
        return super.insert(data, types, false);
    }
    
    public double priceByDay(double precio, int dias, double extras){
        return (double) (precio * dias + extras);
    }
    
    public boolean setState(int status){
        String sql = "UPDATE " + this.table + " SET estado=" + status + " WHERE cod_habitacion='" + this.cod_habitacion +"'";
        boolean res = super.executeUpdate(sql);
        return res;
    }
}

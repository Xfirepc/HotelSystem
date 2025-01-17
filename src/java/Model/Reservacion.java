package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Reservacion extends MainModel {
    
    public int no_reservacion;
    public String fecha_inicial;
    public String fecha_final;
    public int dias;
    public double costo_total;
    public double abonado;
    public double extras;
    public String observaciones;
    public String habitacion;
    public int cliente;
    public int usuario;
    
    public Reservacion(){
        super();
        super.fields = "no_reservacion,fecha_inicial,fecha_final,dias,costo_total,abonado,extras,observaciones,habitacion,cliente,usuario";
        super.type = "integer";
        super.table = "reservaciones";
    }

    public boolean create() {
        String[] types = {"s", "s", "i", "d", "d", "d", "s", "s", "i", "i"};
        Object[] data = {
            this.fecha_inicial, 
            this.fecha_final, 
            this.dias,
            this.costo_total,
            this.abonado,
            this.extras,
            this.observaciones,
            this.habitacion,
            this.cliente,
            this.usuario
        };
        int dias_disponibles = Integer.parseInt(this.fecha_final.split("-")[2]);
        int dia_actual = Integer.parseInt(this.getDateNow().split("-")[2]);
        // Capture days by date now and end date of the reservation to set busy state
        if(this.dias <= 1 && dias_disponibles - dia_actual <= 1){
            Habitacion hab = new Habitacion();
            hab.cod_habitacion = this.habitacion;
            hab.setState(hab.status_busy);
        }
        return super.insert(data, types, true);
    }
    public String getUserName(Object index) throws SQLException{
        Cliente client = new Cliente();
        ResultSet res = client.getOne(index, "integer");
        if(res.next())
            return res.getString("nombres") + " " + res.getString("apellidos");
        return "Desconocido";
    }
    public boolean delete(Object val){
        Habitacion hab = new Habitacion();
        hab.cod_habitacion = this.habitacion;
        hab.setState(hab.status_free);
        return super.delete(val);
    }
    public String getDateNow() {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(cal.getTime());
    }
}

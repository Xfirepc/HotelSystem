package Model;

public class Habitacion extends MainModel {
    
    public String cod_habitacion;
    public String nombre;
    public String descripcion;
    public String imagen;
    public String observaciones;
    public double precio;
    public int piso;
    
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
}


package Model;

public class Inventario extends MainModel{
    
    public String codigo;
    public String nombre;
    public String descripcion;
    public String habitacion;
    public int usuario;
    public String observaciones;
    
    public Inventario() {
        super();
        super.table = "inventario";
        super.type = "string";
        super.fields = "codigo,nombre,descripcion,habitacion,usuario,observaciones";
    }
     public boolean create() {
        String[] types = {"s", "s", "s", "s", "i", "s"};
        Object[] data = {
            this.codigo, 
            this.nombre, 
            this.descripcion,
            this.habitacion,
            this.usuario,
            this.observaciones
        };
        return super.insert(data, types, false);
     }
}

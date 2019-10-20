
package Model;

public class Cliente extends MainModel{
    
    public int cedula;
    public int telefono;
    public String nombres;
    public String apellidos;
    public String direccion;
    public String email;
    public String observaciones;
    
    public Cliente() {
        super();
        super.table = "clientes";
        super.type = "integer";
        super.fields = "cedula,nombres,apellidos,direccion,telefono,email,observaciones";
    }    
    
    public boolean create() {
        // Types are defined by s: String, i: int, d: Date
        String[] types = {"i", "s", "s", "s", "i", "s", "s"};
        Object[] data = {
            this.cedula, 
            this.nombres, 
            this.apellidos, 
            this.direccion,
            this.telefono,
            this.email,
            this.observaciones
        };
        return super.insert(data, types, false);
    }
    
    public String update(Object index){
        String[] types = {"i", "s", "s", "s", "i", "s", "s", "i"};
        Object[] data = {
            this.cedula, 
            this.nombres, 
            this.apellidos, 
            this.direccion,
            this.telefono,
            this.email,
            this.observaciones,
            (int) index,
        };
        return super.update(data, types);
    }
}

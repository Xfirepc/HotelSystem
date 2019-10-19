
package Model;

public class User extends MainModel{
    
    public String name;
    public String email;
    public String pass;
    
    public User() {
        super();
        super.table = "usuarios";
        super.fields = "id,name,email,password";
    }
    
    public boolean create() {
        String[] types = {"s", "s", "s"};
        Object[] data = {
            this.name,
            this.email,
            this.pass
        };
        return super.insert(data, types, true);
    }
}

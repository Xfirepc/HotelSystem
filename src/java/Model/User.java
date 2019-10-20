
package Model;

import java.sql.ResultSet;

public class User extends MainModel{
    
    public String name;
    public String email;
    public String pass;
    
    public User() {
        super();
        super.table = "usuarios";
        super.type = "integer";
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
    public ResultSet getLoginData(String email, String pass){
        String sql = "SELECT * FROM " + this.table + " WHERE email = '"+ email +"' AND " + "'" + pass + "'";
        return super.execute(sql);
    }
}

package HotelSystem;

import java.sql.*;

public class Conexion {
    
    Connection cn;
    
    public Connection getConexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");//com.oracle.jdbc.driver.OracleDriver
            //oracle.jdbc.driver.OracleDriver
            cn=DriverManager.getConnection("jdbc:mysql://localhost/hotelsystem","root","");
            
            //("jdbc:oracle:oci:@ORACLEBD", "user", "passw"); 
        }catch( Exception e){
            System.out.println(e);
        }
        return cn;
    }
     
}
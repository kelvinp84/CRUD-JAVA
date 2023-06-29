
package Negocio;

import java.sql.*;


public class ConexionSQL {
    
    Connection con;

    public ConexionSQL() {
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto","root","jeremias9");
           
        }catch(Exception e){
            
        }
    }
    
    public Connection getConnection(){
        return con;
    }
    
}

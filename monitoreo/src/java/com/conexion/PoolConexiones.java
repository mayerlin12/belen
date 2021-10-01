package com.conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/** Maneja un pool de conexiones internas hacia un esquema de base de datos Postgre.
*/
public class PoolConexiones {
  Connection conn= null; 
  public PoolConexiones(){
   
        String url = "jdbc:postgresSQL://localhost:5432/PortentoST";
        String user = "postgres", password = "1234";
        try{
            conn = DriverManager.getConnection(url, user, password);
        }catch(SQLException e){
            System.out.println("Error " + e.getMessage());
        }
    }
    public Connection getConnection(){
        return this.conn;
    }
}
  
   



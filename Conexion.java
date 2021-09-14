
package Proyecto;
import java.sql.*;
import javax.swing.*;

public class Conexion {
    private static Connection conexion;
    private static Conexion instancia;
    private static final String URL="JDBC:MySql://LocalHost/Agenda";
    private static final String User="root";
    private static final String Pass="";
    
    public Connection conectar(){
        try{
            Class.forName("com.myqsql.cj.jdbc.Driver");
            conexion= DriverManager.getConnection(URL, User, Pass);
            JOptionPane.showMessageDialog(null,"Conexion Exitosa");
            
            conexion.close();
            JOptionPane.showMessageDialog(null,"Conexion Exitosamente cerrada");
            
            
        } catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error: "+ e);
        }
        return conexion;
    }
    public void cerrarConexion () throws SQLException {
        try{
            conexion.close();
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "ERROR: "+ e);
            conexion.close();
        } finally {
            conexion.close();
        }
    }
    public static Conexion getInstance(){
        if(instancia == null){
            instancia = new Conexion();
        }
        return instancia;
    }
}

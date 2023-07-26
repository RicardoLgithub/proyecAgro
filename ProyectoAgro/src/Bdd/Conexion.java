package Bdd;
import java.sql.DriverManager;
import java.sql.Connection;
import javax.swing.JOptionPane;

public class Conexion {
    private final String bdd = "jdbc:mysql://Localhost/agroalimentaria";
    private final String usu = "root";
    private final String clave = "";
    
    private final String x = "com.mysql.jdbc.Driver";
    Connection obj = null;
    
    public Conexion(){
        try {
            //escribis todo lo que quieras ejecutar
          //  Class.forName("com.mysql.jdbc.Driver");
        
            Class.forName(x);
            obj = DriverManager.getConnection(bdd, usu, clave);
    /*        if (obj !=null) {
                System.out.println("conectado");
            }           */
        } catch (Exception e) {
            //posibles errores ==> EXCEPTION (ERROR ES GENERAL)
            JOptionPane.showMessageDialog(null, "Error, no se encontro el driver para la conexión", "Conexión a Base de Datos", JOptionPane.ERROR_MESSAGE);
        }
        //PROGRAMA CONTINUA
    }
    public Connection conectar(){
        return obj;
    }
    public void desconectar(){
        
    }
}

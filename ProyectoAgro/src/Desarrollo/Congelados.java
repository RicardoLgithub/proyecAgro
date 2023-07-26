package Desarrollo;


import Bdd.Conexion;
import Desarrollo.Alimento;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Congelados extends Alimento {

    private int TempMant;

    Conexion c = new Conexion();    //instanciar quiere decir que constructor va a usar
    PreparedStatement Ps;   

    public Congelados(int TempMant, PreparedStatement Ps) {
        this.TempMant = TempMant;
        this.Ps = Ps;
    }
    
    public void Alta() {
        String articulo = "";
        
        try {    
            Ps = c.conectar().prepareStatement(articulo);//use agroalimentaria
            Ps.setInt(1, this.Cod);
            Ps.setString(2, this.Nom);
            int x = Ps.executeUpdate();// esto es el rayito
            if (x > 0) {
                JOptionPane.showMessageDialog(null, "cargado");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR !!, no pudo ingresar el producto Congelado" + "\n" + e);
        }
    }

    public void Baja() {
    }

    public void Modificar() {
    }

    public void Mostrar() {
    }
}

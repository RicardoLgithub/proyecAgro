package Desarrollo;
import Bdd.Conexion;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultListModel;
import javax.swing.DefaultComboBoxModel;
public class PaisOrigen {
    private String nom;
    
    public PaisOrigen(){        
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public void Alta(){
        String pais = "INSERT INTO paises (Nom) VALUES (?)";//pasa el contenido del atributo al signo de pregunta
        Conexion c = new Conexion();    //aqui esta trabajado de modo local
        PreparedStatement Ps;   // "prepareStatement" lo que hace es traducir la sentencia insert
        
        try {    
            Ps = c.conectar().prepareStatement(pais);//use agroalimentaria
            Ps.setString(1, this.nom);
            int x = Ps.executeUpdate();//ejecuta el rayito
            if (x > 0) {
                JOptionPane.showMessageDialog(null, "cargado");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR !!, no pudo ingresar el pais" + "\n" + e);
        }
    }
    public void Baja(String NomPais){
        Conexion c = new Conexion();    //aqui esta trabajado de modo local
        PreparedStatement Ps;
        String Borrar = "delete from paises where Nom = '"+ NomPais +"'";
        
        try {
            Ps = c.conectar().prepareStatement(Borrar);
            int x = Ps.executeUpdate();
            if (x > 0) {
                JOptionPane.showMessageDialog(null, "País eliminado");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error, no pudo borrarlo, error en la sentencia, no tiene permiso para borrar");
        }
    }
    public void Modificar(String PaisViejo, String PaisNuevo){
        String cambio = "UPDATE paises SET Nom = '"+ PaisNuevo +"' WHERE Nom = '"+ PaisViejo +"'";
        
        Conexion c = new Conexion();
        PreparedStatement Ps;
        try {
            Ps = c.conectar().prepareStatement(cambio);
            int x = Ps.executeUpdate();
            if (x > 0) {
                JOptionPane.showMessageDialog(null, "Registro modificado");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error, no pudo cambiar el nombre del país");
        }
    }
    
    public DefaultListModel Mostrar(){
        DefaultListModel objx = new DefaultListModel();
        String muestro = "select Nom from paises order by Nom"; //esto es sql
        Conexion c = new Conexion();    //esto es sql
        PreparedStatement Ps;   //esto es sql
        ResultSet Rs;   //esto es sql
        
        try {   //esto es sql
            Ps = c.conectar().prepareStatement(muestro);    //esto es sql
            Rs = Ps.executeQuery(); //esto es sql
            while (Rs.next()) { //next ==> significa que va a recorrer hasta que llegue al final    //esto es sql
                //los datos que queres mostrar
                //el Rs.getString(1) //esto es sql
                objx.addElement(Rs.getString(1));
            }
        } catch (SQLException e) { //esto es sql
            JOptionPane.showMessageDialog(null, "no puede mostrar los paises"); //esto es sql
        }
        return objx;
    }
    
    public DefaultComboBoxModel LlenarCombo(){
        DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();
        String muestro = "select Nom from paises order by Nom"; //esto es sql
        Conexion c = new Conexion();    //esto es sql
        PreparedStatement Ps;   //esto es sql
        ResultSet Rs;   //esto es sql
        
        try {   //esto es sql
            Ps = c.conectar().prepareStatement(muestro);    //esto es sql
            Rs = Ps.executeQuery(); //esto es sql
            while (Rs.next()) { //next ==> significa que va a recorrer hasta que llegue al final    //esto es sql
                //los datos que queres mostrar
                //el Rs.getString(1) //esto es sql
                modeloCombo.addElement(Rs.getString(1));
            }
        } catch (SQLException e) { //esto es sql
            JOptionPane.showMessageDialog(null, "no puede mostrar los paises" + "\n" + e); //esto es sql
        }
        return modeloCombo;
    }
    
    public int DevolverIdpais(String PaisElegido){
        String PaisABuscar = "select IdPaises from paises where Nom = '"+ PaisElegido +"'";
        Conexion c = new Conexion();    //aqui esta trabajado de modo local
        PreparedStatement Ps;
        ResultSet Rs;
        int IdADevolver = 0;
        try {
            Ps = c.conectar().prepareStatement(PaisABuscar);
            Rs = Ps.executeQuery();
            if (Rs.next()) {
                IdADevolver = Rs.getInt(1);
            }   
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR!!, no pudo encontrar el pais" + "\n" + e);
        }
        return IdADevolver;
    }
}

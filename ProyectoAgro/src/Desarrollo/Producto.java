package Desarrollo;
import Bdd.Conexion;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;
public class Producto {
    private int Cod;
    private String Nom;
    
    Conexion c = new Conexion();    //instanciar quiere decir que constructor va a usar
    PreparedStatement Ps;   
    ResultSet Rs;
    
    public Producto(int Codigo, String Nom) {
        this.Cod = Codigo;
        this.Nom = Nom;
    }

    public Producto() {
    }

    public int getCod() {
        return Cod;
    }

    public void setCod(int Cod) {
        this.Cod = Cod;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    
    
    public void Alta() {
        String articulo = "INSERT INTO producto(idProducto,Nom)VALUES(?,?)";
        
        try {    
            Ps = c.conectar().prepareStatement(articulo);//use agroalimentaria
            Ps.setInt(1, this.Cod);
            Ps.setString(2, this.Nom);
            int x = Ps.executeUpdate();// esto es el rayito
            if (x > 0) {
                JOptionPane.showMessageDialog(null, "cargado");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR !!, no pudo ingresar el producto" + "\n" + e);
        }
    }
    public void Baja(int Codigo) {
        
        String Borrar = "DELETE FROM producto WHERE idProducto = '"+ Codigo +"'";
        
        try {
            Ps = c.conectar().prepareStatement(Borrar);
            int x = Ps.executeUpdate();
            if (x > 0) {
                JOptionPane.showMessageDialog(null, "Producto eliminado");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error, no pudo borrarlo, error en la sentencia, no tiene permiso para borrar");
        }
    }
    
    public void Baja(String Nombre) {
        
        String Borrar = "DELETE FROM producto WHERE Nom = '"+ Nombre +"'";
        
        try {
            Ps = c.conectar().prepareStatement(Borrar);
            int x = Ps.executeUpdate();
            if (x > 0) {
                JOptionPane.showMessageDialog(null, "Producto eliminado");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error, no pudo borrarlo, error en la sentencia, no tiene permiso para borrar");
        }
    }
    
    public boolean Buscar(int Codigo){
        boolean estado;
        String CodigoABuscar = "select idProducto, Nom from Producto where idProducto = '"+ Codigo +"'";
        try {
            Ps = c.conectar().prepareStatement(CodigoABuscar);
            Rs = Ps.executeQuery();
            if (Rs.next()) {
                setCod(Rs.getInt(1));
                setNom(Rs.getString(2));
                estado = true;
            }else{
                estado = false;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error, no se encontro el producto");
            estado = false;
        }
        return estado;
    }
    
    public void Buscar(String Nombre){
        
    }
    
    public void Modificar(int Codigo, String NuevoNombre) {
        String cambio = "UPDATE producto SET Nom = '"+ NuevoNombre +"' WHERE idProducto = '"+ Codigo +"'";
        
        try {
            Ps = c.conectar().prepareStatement(cambio);
            int x = Ps.executeUpdate();
            if (x > 0) {
                JOptionPane.showMessageDialog(null, "Registro modificado");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error, no pudo cambiar el nombre del producto");
        }
    }
    
    public void Modificar(String Nombre, String NuevoNombre) {
        String cambio = "UPDATE producto SET Nom = '"+ NuevoNombre +"' WHERE Nom = '"+ Nombre +"'";
        
        try {
            Ps = c.conectar().prepareStatement(cambio);
            int x = Ps.executeUpdate();
            if (x > 0) {
                JOptionPane.showMessageDialog(null, "Registro modificado");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error, no pudo cambiar el nombre del producto");
        }
    }
    
    public void Mostrar() {
    }
    
    public DefaultComboBoxModel LlenarCombo(){
        String ListaProducto = "select Nom from producto order by Nom";
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        try {
            Ps = c.conectar().prepareStatement(ListaProducto);
            Rs = Ps.executeQuery();
            while (Rs.next()) {
                //el producto leido me lo agregue al combo
                modelo.addElement(Rs.getString(1));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en la muestra de productos"+ "\n" + e);
        }
        return modelo;
    }
    
    public void DevolverIdProd(String ProductoElegido){
        String ProductoABuscar = "select idProducto from producto where Nom = '"+ ProductoElegido +"'";
        
        //int IdADevolver = 0;
        try {
            Ps = c.conectar().prepareStatement(ProductoABuscar);
            Rs = Ps.executeQuery();
            if (Rs.next()) {
                this.Cod = Rs.getInt(1);    //getInt(1), el 1 es por la posicion de la tabla
                //this.setCod(Rs.getInt(1));
            }   
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR!!, no pudo encontrar el producto" + "\n" + e);
        }
        //return IdADevolver;
    }
}

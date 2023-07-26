package Desarrollo;

import Bdd.Conexion;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Frescos extends Alimento {

    private Date FechaEnva;
    private final String TipoArt = "PF";
    private int CodPais;

    Conexion c = new Conexion();    //instanciar quiere decir que constructor va a usar
    PreparedStatement Ps;
    ResultSet Rs;

    public Frescos(Date FechaEnva, int NroLote, Date FechaVto, int CodProd, int CodPais) {
        super(NroLote, FechaVto, CodProd);
        this.CodPais = CodPais;
        this.FechaEnva = FechaEnva;
    }

    public Frescos(){
        
    }

    public Date getFechaEnva() {
        return FechaEnva;
    }

    public void setFechaEnva(Date FechaEnva) {
        this.FechaEnva = FechaEnva;
    }

    public int getCodPais() {
        return CodPais;
    }

    public void setCodPais(int CodPais) {
        this.CodPais = CodPais;
    }
    
    
    public void Alta() {
        String articulo = "INSERT INTO informacionespecifica(FechaVto,NroLote,TipoArt,FechaEnvasado,Paises_idPaises,Producto_idProducto)VALUES(?,?,?,?,?,?)";
        
        try {    
            Ps = c.conectar().prepareStatement(articulo);//use agroalimentaria
            Ps.setDate(1, this.getFechaVto());
            Ps.setInt(2, this.getNroLote());
            Ps.setString(3, this.TipoArt);
            Ps.setDate(4, this.FechaEnva);
            Ps.setInt(5, this.CodPais);
            Ps.setInt(6, this.getCodProd());
            
            int x = Ps.executeUpdate();// esto es el rayito
            if (x > 0) {
                JOptionPane.showMessageDialog(null, "cargado");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR !!, no pudo ingresar el producto Fresco" + "\n" + e);
        }
    }

    public void Baja() {
    }

    public void Modificar() {
        
    }
    
    DefaultTableModel modeloTabla; //creamos un obj de la clase DefaultTableModel
    
    public DefaultTableModel MostrarTitulos() {
        String [] titulos = {"Código de Producto", "N° de Lote", "Fecha de Envasado", "Fecha de Vencimiento"};
        String [][]registros = {};
        modeloTabla = new DefaultTableModel(registros, titulos);
        return modeloTabla;
    }
    public DefaultTableModel MostrarContenidos() {
        String mostrarSql = "select Producto_idProducto, NroLote, FechaEnvasado, FechaVto from informacionespecifica where TipoArt = 'PF'";
        
        try {
            Ps = c.conectar().prepareStatement(mostrarSql);
            Rs = Ps.executeQuery();
            if (modeloTabla.getRowCount() > 0) {
                MostrarTitulos();
            }
            while (Rs.next()) {
                //tomar cada columna del select
                
                //puedas enviar cada valor del select a los atributos
                //debe armar el registro
                Object [] vector = {Rs.getInt(1),Rs.getInt(2),Rs.getDate(3), Rs.getDate(4)};
                //ese registro debe sumarse al modeloTabla
                modeloTabla.addRow(vector);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en la consulta de productos frescos" + "\n" + e);
        }
        return modeloTabla;
    }
    
}

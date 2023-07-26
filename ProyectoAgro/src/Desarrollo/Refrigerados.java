package Desarrollo;
import Bdd.Conexion;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Refrigerados extends Alimento {

    private String CodOrga;
    private Date FechaEnvasado;
    private int TempMant;
    private int PaisOrigen;
    private final String TipoArt = "PR";
    
    private String NomPais;
    private String NomProd;

    Conexion c = new Conexion();    //instanciar quiere decir que constructor va a usar
    PreparedStatement Ps;
    ResultSet Rs;

    public Refrigerados(String CodOrga, Date FechaEnvasado, int TempMant, int PaisOrigen, int NroLote, Date FechaVto, int CodProd) {
        super(NroLote, FechaVto, CodProd);
        this.CodOrga = CodOrga;
        this.FechaEnvasado = FechaEnvasado;
        this.TempMant = TempMant;
        this.PaisOrigen = PaisOrigen;
    }
    public Refrigerados() {
    }

    public String getCodOrga() {
        return CodOrga;
    }

    public void setCodOrga(String CodOrga) {
        this.CodOrga = CodOrga;
    }

    public Date getFechaEnvasado() {
        return FechaEnvasado;
    }

    public void setFechaEnvasado(Date FechaEnvasado) {
        this.FechaEnvasado = FechaEnvasado;
    }

    public int getTempMant() {
        return TempMant;
    }

    public void setTempMant(int TempMant) {
        this.TempMant = TempMant;
    }

    public int getPaisOrigen() {
        return PaisOrigen;
    }

    public void setPaisOrigen(int PaisOrigen) {
        this.PaisOrigen = PaisOrigen;
    }

    public String getTipoArt() {
        return TipoArt;
    }

    public String getNomPais() {
        return NomPais;
    }

    public void setNomPais(String NomPais) {
        this.NomPais = NomPais;
    }

    public String getNomProd() {
        return NomProd;
    }

    public void setNomProd(String NomProd) {
        this.NomProd = NomProd;
    }
    
    
    public void Alta() {
        String articulo = "INSERT INTO informacionespecifica (FechaVto,NroLote,TipoArt,FechaEnvasado,CodOrganismo,TempRecomendada,Paises_idPaises,Producto_idProducto)VALUES(?,?,?,?,?,?,?,?)";
        
        try {    
            Ps = c.conectar().prepareStatement(articulo);//use agroalimentaria
        //    Ps.setInt(1, this.Cod);
        //    Ps.setString(2, this.Nom);
            Ps.setDate(1, this.getFechaVto());
            Ps.setInt(2, this.getNroLote());
            Ps.setString(3, this.getTipoArt());
            Ps.setDate(4, this.getFechaEnvasado());
            Ps.setString(5, this.getCodOrga());
            Ps.setInt(6, this.getTempMant());
            Ps.setInt(7, this.getPaisOrigen());
            Ps.setInt(8, this.getCodProd());
            int x = Ps.executeUpdate();// esto es el rayito
            if (x > 0) {
                JOptionPane.showMessageDialog(null, "cargado");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR !!, no pudo ingresar el producto Refrigerado" + "\n" + e);
        }
    }

    public void Baja(int Lote) {
        String Borrar = "delete from informacionespecifica where NroLote = '"+ Lote +"'";
        try {    
            Ps = c.conectar().prepareStatement(Borrar);//use agroalimentaria
            int x = Ps.executeUpdate();// esto es el rayito
            if (x > 0) {
                JOptionPane.showMessageDialog(null, "PRODUCTO ELIMINADO");
            } else {
                JOptionPane.showMessageDialog(null, "Error, Lote inexistente");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR !!, no pudo encontrar al producto Refrigerado");
        }
    }

    public void Modificar() {
        String modifica = "UPDATE informacionespecifica SET FechaVto = '"+ this.getFechaVto() +"', FechaEnvasado = '"+ this.getFechaEnvasado() +"', CodOrganismo = '"+ this.getCodOrga() +"', TempRecomendada = '"+ this.getTempMant()+"', Paises_idPaises = '"+ this.getPaisOrigen() +"', Producto_idProducto = '"+ this.getCodProd()+"' WHERE NroLote = '"+ this.getNroLote()+"';";
        try {    
            Ps = c.conectar().prepareStatement(modifica);//use agroalimentaria
            int x = Ps.executeUpdate();// esto es el rayito
            if (x > 0) {
                JOptionPane.showMessageDialog(null, "PRODUCTO MODIFICADO");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR !!, no pudo encontrar al producto Refrigerado" + "\n"+ e);
        }
    }

    DefaultTableModel modeloTabla; //creamos un obj de la clase DefaultTableModel
    
    public DefaultTableModel MostrarTitulos() {
        String [] titulos = {"Código de Producto", "N° de Lote", "Fecha de Envasado", "Fecha de Vencimiento", "Codigo de Organismo", "Temperatura Recomendada"};
        String [][]registros = {};
        modeloTabla = new DefaultTableModel(registros, titulos);
        return modeloTabla;
    }
    public DefaultTableModel MostrarContenidos() {
        String mostrarSql = "select Producto_idProducto, NroLote, FechaEnvasado, FechaVto ,CodOrganismo, TempRecomendada from informacionespecifica where TipoArt = 'PR'";
        
        try {
            Ps = c.conectar().prepareStatement(mostrarSql);
            Rs = Ps.executeQuery();
            while (Rs.next()) {
                //tomar cada columna del select
                
                //puedas enviar cada valor del select a los atributos
                //debe armar el registro
                Object [] vector = {Rs.getInt(1), Rs.getInt(2), Rs.getDate(3), Rs.getDate(4), Rs.getString(5), Rs.getInt(6)};
                //ese registro debe sumarse al modeloTabla
                modeloTabla.addRow(vector);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en la consulta de productos Refrigerados" + "\n" + e);
        }
        return modeloTabla;
    }
    
    public DefaultTableModel MostrarProductoyLote() {
        String [] titulos = {"Nombre de Producto", "N° de Lote", "Código de Producto"};
        String [][]registros = {};
        modeloTabla = new DefaultTableModel(registros, titulos);
        return modeloTabla;
    }
    public DefaultTableModel MostrarContenidoProductoyLote() {
        String mostrarSql = "select a.Nom, i.NroLote, i.idInformacionEspecifica from informacionespecifica as i inner join producto as a on i.Producto_idProducto = a.idProducto where i.TipoArt = 'PR' order by a.Nom asc, NroLote asc";        
        try {
            Ps = c.conectar().prepareStatement(mostrarSql);
            Rs = Ps.executeQuery();
            if (modeloTabla.getRowCount() > 0) {//cuenta la cantidad de filas con contenido y te imprime una sola vez
                MostrarProductoyLote();
            }
            while (Rs.next()) {
                //tomar cada columna del select
                
                //puedas enviar cada valor del select a los atributos
                //debe armar el registro
                Object [] vector = {Rs.getString(1), Rs.getInt(2), Rs.getInt(3)};
                //ese registro debe sumarse al modeloTabla
                modeloTabla.addRow(vector);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en la consulta de productos Refrigerados" + "\n" + e);
        }
        return modeloTabla;
    }
    public void BuscarPorLote(int Lote){
        String buscar = "select a.Nom, i.NroLote, i.FechaVto, i.TempRecomendada, i.CodOrganismo, i.FechaEnvasado, p.Nom from informacionespecifica as i inner join producto as a on i.Producto_idProducto = a.idProducto inner join paises as p on i.Paises_idPaises = p.idPaises where i.TipoArt = 'PR' and i.NroLote = '"+ Lote+"'";
        try {
            Ps = c.conectar().prepareStatement(buscar);
            Rs = Ps.executeQuery();
            if (Rs.next()) {
                this.setNomProd(Rs.getString(1));
                this.setNroLote(Rs.getInt(2));
                this.setFechaVto(Rs.getDate(3));
                this.setTempMant(Rs.getInt(4));
                this.setCodOrga(Rs.getString(5));
                this.setFechaEnvasado(Rs.getDate(6));
                this.setNomPais(Rs.getString(7));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error, no esncuentra al Lote" + "\n" + e);
        }
    }
}

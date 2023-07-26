package Desarrollo;
import java.sql.Date;
public abstract class Alimento {    //Abstractac esta clase no te permite trabajar con constructores

    protected int NroLote; //podemos acceder a este atributo mediante un protected o un metodo getter
    private Date FechaVto; //yyyy-mm-dd
    private int CodProd;
    
    public Alimento(int NroLote, Date FechaVto, int CodProd) {
        this.NroLote = NroLote;
        this.FechaVto = FechaVto;
        this.CodProd = CodProd;
    }

    public Alimento() {
    }
    

    public int getCodProd() {
        return CodProd;
    }
    public int getNroLote() {
        return NroLote;
    }

    public Date getFechaVto() {
        return FechaVto;
    }

    public void setNroLote(int NroLote) {
        this.NroLote = NroLote;
    }

    public void setFechaVto(Date FechaVto) {
        this.FechaVto = FechaVto;
    }

    public void setCodProd(int CodProd) {
        this.CodProd = CodProd;
    }
    
    public void Mostrar(){
        System.out.println("Este es un mensaje nuevo");
        System.out.println("Segundo intento");
    }
}

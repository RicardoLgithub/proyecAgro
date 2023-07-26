package Desarrollo;
//import Bdd.Conexion;   se borra, solo se lo utilizo para probar si conectaba
import Formulario.FrmMenu;
public class Inicio {
    public static void main(String[] args) {
  //      Conexion obj = new Conexion();    aqui tambien se borra
        FrmMenu obj = new FrmMenu();
        obj.setVisible(true);
    }
}

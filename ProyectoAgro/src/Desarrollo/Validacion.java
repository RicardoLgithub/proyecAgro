package Desarrollo;

import javax.swing.JOptionPane;

public class Validacion {
//si no creamos un constructor, java asume por default que tenemos un constructor sin parametros    
    
    public static void SoloLetras(java.awt.event.KeyEvent obj){ //Cuando haces un metodo Static te ahorra de crearte un objeto 
        char letra = obj.getKeyChar();
        int nro = (int) obj.getKeyChar();
        if (!Character.isLetter(letra) && nro != 8) {// el 8 se refiere a un codigo que nos paso por pdf que se refiere a las teclas
            obj.consume();//esta funcion sirve para que no pueda seguir tipiando y no se exceda de la longitud que le permitimos
            JOptionPane.showMessageDialog(null, "Error !!, debe escribir solamente letras");
        }
          
    }
    public static void SoloNros(java.awt.event.KeyEvent obj){
        char tecla = obj.getKeyChar();
        int nro = (int) obj.getKeyChar();
        if (!Character.isDigit(tecla) && nro != 8) {// el 8 se refiere a un codigo que nos paso por pdf que se refiere a las teclas
            obj.consume();
            JOptionPane.showMessageDialog(null, "Error !!, debe escribir solamente letras");
        }
    }
    
    public static java.sql.Date ConvertirFecha(java.util.Date FechaForm){//dd-mm-yyyy
        java.sql.Date FechaSql = new java.sql.Date(FechaForm.getTime());
        return FechaSql;//yyyy-mm-dd
    }
    public static void Simbolos (java.awt.event.KeyEvent obj){
        char tecla = obj.getKeyChar();
        int nro = (int) obj.getKeyChar();
        if (!Character.isDigit(nro) && !Character.isLetter(tecla) && nro != 8) {
            obj.consume();
            JOptionPane.showMessageDialog(null, "No se pueden ingrear simbolos");
        }
    }
}
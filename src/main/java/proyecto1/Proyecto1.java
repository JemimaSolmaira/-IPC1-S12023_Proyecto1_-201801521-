

package proyecto1;


import Ventanas.Loggin;




public class Proyecto1 {
    
    
    public static Precios PreciosReg = new Precios();
    public static Kioscos Kioscos = new Kioscos();
    public static Regiones datosreg = new Regiones();
    public static RegistroTarjetas regtarjeta = new RegistroTarjetas();
    public static Facturacion facturacion = new Facturacion();
    public static Envios envios = new Envios();
    public static Usuarios usuarios= new Usuarios();
    
    public static void main (String[] args){
     
        
        Loggin ventana = new Loggin ();
    ventana.setVisible(true);
   

    
    }

    
}


package proyecto1;

import java.util.ArrayList;


public class Facturacion {

private ArrayList <Infcompra> Facturacion = new ArrayList<Infcompra>();

    public Facturacion(){
    this.Facturacion = new ArrayList<>();
    }

    public void agregardatos(Infcompra datos){
    Facturacion.add(datos);
    }

    public ArrayList<Infcompra> getFacturacion() {
        return Facturacion;
    }

    public void setFacturacion(ArrayList<Infcompra> Facturacion) {
        this.Facturacion = Facturacion;
    }
    
 



}

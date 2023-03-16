
package proyecto1;

import java.util.ArrayList;



public class Kioscos {

    private ArrayList<Datos> kiosco = new ArrayList();
    
    public Kioscos() {
      this.kiosco = new ArrayList<>();  
    }

    
    public void Insertardatos (Datos Datos) {
    
    kiosco.add(Datos);
    }
    
    
    
    public String devolverdatos (){
    
    String reporte="";
    
    for (int i =0; i<kiosco.size();i++){
    reporte = kiosco.get(i).toString();
    }
    return reporte;    
     
    

    }

    public ArrayList<Datos> getKiosco() {
        return kiosco;
    }

    public void setKiosco(ArrayList<Datos> kiosco) {
        this.kiosco = kiosco;
    }

    
    
}

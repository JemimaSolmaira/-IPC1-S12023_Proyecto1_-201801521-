
package proyecto1;

import java.util.ArrayList;


public class RegistroTarjetas {
    
  private ArrayList <Infcompra> Regtarjetas = new ArrayList<Infcompra>();

    
    public RegistroTarjetas(){
    this.Regtarjetas = new ArrayList<>();
    }
    
    public void agregardatos(Infcompra datos){
    Regtarjetas.add(datos);

    }
    
   
    public void Verdatos(){

      for (int i =0; i < Regtarjetas.size();i++){
          String informacion = "\n"+ Regtarjetas.get(i).getDato1() +  
                  "\n"+ Regtarjetas.get(i).getDato2() +
                  "\n"+ Regtarjetas.get(i).getDato3();
  }
    
    }
      
    

    public ArrayList<Infcompra> getRegtarjetas() {
        return Regtarjetas;
    }

    public void setRegtarjetas(ArrayList<Infcompra> Regtarjetas) {
        this.Regtarjetas = Regtarjetas;
    }
    
     

    
   
      
    
}

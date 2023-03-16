
package proyecto1;

import java.util.ArrayList;



public class Precios {

    
    private ArrayList <Preciomod> Precios = new ArrayList<Preciomod>();

    
    public Precios(){
    this.Precios = new ArrayList<>();
    }
    
    public void agregardatos(){
 
       Precios.add( new Preciomod ("35","25"));
       Precios.add( new Preciomod ("68.50","45.55"));
       Precios.add( new Preciomod ("58.68","35.48"));
       Precios.add( new Preciomod ("38.68","32.48"));
       Precios.add( new Preciomod ("34","29"));
       Precios.add( new Preciomod ("44.50","40"));
  
    }
    
    public void modificardatos(Preciomod Datos, int indice){
   
       Precios.set(indice,Datos);
 
    }

    public void Verdatos(){

      for (int i =0; i < Precios.size();i++){
          String informacion = "\n"+Precios.get(i).getPestandar() + 
                   
                  "\n"+ Precios.get(i).getPespecial();
  }
    
    }
        

    
    public ArrayList<Preciomod> getPrecios() {
        return Precios;
    }

    public void setPrecios(ArrayList<Preciomod> Precios) {
        this.Precios = Precios;
    }
    
    
    
    
    }

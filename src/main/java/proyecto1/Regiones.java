
package proyecto1;

import proyecto1.DatosParaRegiones;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import proyecto1.Datos;

public class Regiones extends Precios{
 
  
    private ArrayList<DatosParaRegiones> Datosreg= new ArrayList();
    private Set<Datos> deptosreg = new HashSet();
    private ArrayList <Integer> contadores = new ArrayList <Integer>();
    
    public Regiones() {
        this.Datosreg = new ArrayList<>();
        this.deptosreg = new HashSet<>();
    }

    public void agregarusuario(DatosParaRegiones datos){
    Datosreg.add(datos);
    
    }

    
    public void agregardepto(Datos datos){
    deptosreg.add(datos);
        
    }
    
   
    
    public ArrayList<Preciomod> precios(){
     ArrayList<Preciomod> precios= new ArrayList<Preciomod>();
    precios = getPrecios();

    return precios;
    }
    
    public ArrayList <String> buscarmun(String depto){
    ArrayList <String> mun = new ArrayList<String>();
    String munEncontrado = null;
       for (DatosParaRegiones deptos : Datosreg) {
           if(deptos.getNombreDep().equalsIgnoreCase(depto)) {
           munEncontrado = deptos.getNombreMun();
           mun.add(munEncontrado);
           }
       }
    return mun;

    }
   
    public void agregarcontador (){
    contadores.add(0); //1- Metropolitana
    contadores.add(0); //2-  Norte
    contadores.add(0); //3- Nororiente
    contadores.add(0); //4- Suroriente
    contadores.add(0); //5- Suroccidente
    contadores.add(0); //6- Noroccidente
    
    }
    
    
    
    public void contador(String region){
    
    
    int cant =0;
    if(region.equalsIgnoreCase("Metropolitana")){
     cant = contadores.get(0)+ 1;
        contadores.set(0, cant);
            
    }else if(region.equalsIgnoreCase("Norte")){
        cant = contadores.get(1)+ 1;
        contadores.set(1, cant);

    }else if(region.equalsIgnoreCase("Nororiente")){
        cant = contadores.get(2)+ 1;
        contadores.set(2, cant);
    
    }else if(region.equalsIgnoreCase("Suroriente")){
        cant = contadores.get(3)+ 1;
        contadores.set(3, cant);
    
    }else if(region.equalsIgnoreCase("Metropolitana")){
        cant = contadores.get(4)+ 1;
        contadores.set(4, cant);
    
    }else if(region.equalsIgnoreCase("Suroccidente")){
    cant = contadores.get(5)+ 1;
        contadores.set(5, cant);
        
    }
    

    }
    
    
    
    public ArrayList<DatosParaRegiones> getDatosreg() {
        return Datosreg;
    }

    public void setDatosreg(ArrayList<DatosParaRegiones> Datosreg) {
        this.Datosreg = Datosreg;
    }

    public Set<Datos> getDeptosreg() {
        return deptosreg;
    }

    public void setDeptosreg(Set<Datos> deptosreg) {
        this.deptosreg = deptosreg;
    }

    public ArrayList<Integer> getContadores() {
        return contadores;
    }

    public void setContadores(ArrayList<Integer> contadores) {
        this.contadores = contadores;
    }


    }
       


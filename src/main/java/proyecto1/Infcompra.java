
package proyecto1;


public class Infcompra {
    
    private String nombre;
    private String Dato1;
    private String Dato2;        
    private String Dato3;

    public Infcompra(String nombre, String Dato1, String Dato2, String Dato3) {
        this.nombre = nombre;
        this.Dato1 = Dato1;
        this.Dato2 = Dato2;
        this.Dato3 = Dato3;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDato1() {
        return Dato1;
    }

    public void setDato1(String Dato1) {
        this.Dato1 = Dato1;
    }

    public String getDato2() {
        return Dato2;
    }

    public void setDato2(String Dato2) {
        this.Dato2 = Dato2;
    }

    public String getDato3() {
        return Dato3;
    }

    public void setDato3(String Dato3) {
        this.Dato3 = Dato3;
    }

    @Override
    public String toString() {
        return    Dato1 + "/" + Dato2 + "/" + Dato3 ;
    }
    
    
    
    
}

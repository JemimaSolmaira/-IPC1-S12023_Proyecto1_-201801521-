
package proyecto1;


public class Preciomod {
    
    private String Pestandar;
    private String Pespecial;

    public Preciomod(String Pestandar, String Pespecial) {
        this.Pestandar = Pestandar;
        this.Pespecial = Pespecial;
    }

    public String getPestandar() {
        return Pestandar;
    }

    public void setPestandar(String Pestandar) {
        this.Pestandar = Pestandar;
    }

    public String getPespecial() {
        return Pespecial;
    }

    public void setPespecial(String Pespecial) {
        this.Pespecial = Pespecial;
    }

    @Override
    public String toString() {
        return "Preciomod{" + "Pestandar=" + Pestandar + ", Pespecial=" + Pespecial + '}';
    }
    
    
    
}

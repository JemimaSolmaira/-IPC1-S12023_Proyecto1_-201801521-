
package proyecto1;

import java.util.Objects;


public class Datos {
    
    private String Dato1;
    private String Dato2;        
    private String Dato3;

    public Datos(String Dato1, String Dato2, String Dato3) {
        this.Dato1 = Dato1;
        this.Dato2 = Dato2;
        this.Dato3 = Dato3;
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
        return "\n"+ Dato1 + "\n" + Dato2 + "\n" + Dato3 ;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Datos other = (Datos) obj;
        if (!Objects.equals(this.Dato1, other.Dato1)) {
            return false;
        }
        if (!Objects.equals(this.Dato2, other.Dato2)) {
            return false;
        }
        return Objects.equals(this.Dato3, other.Dato3);
    }

    
    
}

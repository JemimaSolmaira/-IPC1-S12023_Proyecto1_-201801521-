
package proyecto1;

import java.util.Objects;


public class UsuariosDatos {
    
    private String correo;
    private String contra;

    public UsuariosDatos(String correo, String contra) {
        this.correo = correo;
        this.contra = contra;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    @Override
    public String toString() {
        return   correo + " " + contra ;
    }

    @Override
    public int hashCode() {
        int hash = 3;
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
        final UsuariosDatos other = (UsuariosDatos) obj;
        if (!Objects.equals(this.correo, other.correo)) {
            return false;
        }
        return Objects.equals(this.contra, other.contra);
    }
   
    
    

}

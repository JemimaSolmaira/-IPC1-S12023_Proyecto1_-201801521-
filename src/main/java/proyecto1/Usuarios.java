
package proyecto1;

import java.util.HashSet;
import java.util.Set;


public class Usuarios {
 
    private Set<UsuariosDatos> Usuarios = new HashSet<UsuariosDatos>();

    private String Usuarioactual;

    
    
    public Usuarios(){
    this.Usuarios = new HashSet<>();
    }
    
    public void agregardatos(UsuariosDatos datos){
    Usuarios.add(datos);

    } 
    
    public String nombre(){
    
        String nombre = "";
        return nombre;
    }  
    
    public String getUsuarioactual() {
        return Usuarioactual;
    }

    public void setUsuarioactual(String Usuarioactual) {
        this.Usuarioactual = Usuarioactual;
    }

    public Set<UsuariosDatos> getUsuarios() {
        return Usuarios;
    }

    public void setUsuarios(Set<UsuariosDatos> Usuarios) {
        this.Usuarios = Usuarios;
    }
    
    
    
}

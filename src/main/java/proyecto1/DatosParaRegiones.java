
package proyecto1;

public class DatosParaRegiones {
   
    private String codigoDep;
    private String codigoMun;
    private String NombreMun;
    private String NombreDep;
    private String codigoReg;

    public DatosParaRegiones(String codigoReg,String codigoDep, String codigoMun, String NombreMun, String NombreDep) {
        this.codigoReg = codigoReg;
        this.codigoDep = codigoDep;
        this.codigoMun = codigoMun;
        this.NombreMun= NombreMun;
        this.NombreDep = NombreDep;
        
    }

    public String getCodigoReg() {
        return codigoReg;
    }

    public void setCodigoReg(String codigoReg) {
        this.codigoReg = codigoReg;
    }

    public String getCodigoMun() {
        return codigoMun;
    }

    public void setCodigoMun(String codigoMun) {
        this.codigoMun = codigoMun;
    }

    public String getCodigoDep() {
        return codigoDep;
    }

    public void setCodigoDep(String codigoDep) {
        this.codigoDep = codigoDep;
    }

    public String getNombreMun() {
        return NombreMun;
    }

    public void setNombreMun(String NombreMun) {
        this.NombreMun = NombreMun;
    }

    public String getNombreDep() {
        return NombreDep;
    }

    public void setNombreDep(String NombreDep) {
        this.NombreDep = NombreDep;
    }
    
    
    
    
}

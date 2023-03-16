
package proyecto1;


public class Datosenvios {
    
    private String nombreusuario;
    private String Codigopaquete;
    private String DatosFac;
    private String Servicio;
    private String nombreor;
    private String Origen;
    private String nombredest;
    private String Destino;
    private String Peso;
    private String Cantidad;
    private String Tipopago;
    private String Total;

    public Datosenvios(String nombreusuario, String Codigopaquete, String DatosFac, String Servicio, String nombreor, String Origen, String nombredest, String Destino, String Peso, String Cantidad, String Tipopago, String Total) {
        this.nombreusuario = nombreusuario;
        this.Codigopaquete = Codigopaquete;
        this.DatosFac = DatosFac;
        this.Servicio = Servicio;
        this.nombreor = nombreor;
        this.Origen = Origen;
        this.nombredest = nombredest;
        this.Destino = Destino;
        this.Peso = Peso;
        this.Cantidad = Cantidad;
        this.Tipopago = Tipopago;
        this.Total = Total;
    }

   

    public String getNombreusuario() {
        return nombreusuario;
    }

    public void setNombreusuario(String nombreusuario) {
        this.nombreusuario = nombreusuario;
    }

    public String getCodigopaquete() {
        return Codigopaquete;
    }

    public void setCodigopaquete(String Codigopaquete) {
        this.Codigopaquete = Codigopaquete;
    }

    public String getDatosFac() {
        return DatosFac;
    }

    public void setDatosFac(String DatosFac) {
        this.DatosFac = DatosFac;
    }

    public String getServicio() {
        return Servicio;
    }

    public void setServicio(String Servicio) {
        this.Servicio = Servicio;
    }

    public String getOrigen() {
        return Origen;
    }

    public void setOrigen(String Origen) {
        this.Origen = Origen;
    }

    public String getDestino() {
        return Destino;
    }

    public void setDestino(String Destino) {
        this.Destino = Destino;
    }

    public String getPeso() {
        return Peso;
    }

    public void setPeso(String Peso) {
        this.Peso = Peso;
    }

    public String getCantidad() {
        return Cantidad;
    }

    public void setCantidad(String Cantidad) {
        this.Cantidad = Cantidad;
    }

    public String getTipopago() {
        return Tipopago;
    }

    public void setTipopago(String Tipopago) {
        this.Tipopago = Tipopago;
    }

    public String getTotal() {
        return Total;
    }

    public void setTotal(String Total) {
        this.Total = Total;
    }

    public String getNombreor() {
        return nombreor;
    }

    public void setNombreor(String nombreor) {
        this.nombreor = nombreor;
    }

    public String getNombredest() {
        return nombredest;
    }

    public void setNombredest(String nombredest) {
        this.nombredest = nombredest;
    }

    @Override
    public String toString() {
        return    " Codigopaquete: " + Codigopaquete + ", Datos de Facturacion : " + DatosFac + ", Tipo de Servicio: " 
                + Servicio + ", nombre de remitente" + nombreor + ", direccion de Origen: " + 
                Origen + " nombre destino: " + nombredest + ", Direccion de Destino: " + Destino + ", Peso: " + Peso 
                + ", Cantidad: " + Cantidad + ", Tipo de pago: " + Tipopago + ", Total: " + Total ;
    }
            
    
    
    
}

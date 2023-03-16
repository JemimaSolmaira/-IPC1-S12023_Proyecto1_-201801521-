
package proyecto1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;



public class Envios extends Regiones {
  
   private ArrayList<Datosenvios> Envios = new ArrayList<Datosenvios>();
   private String deptodestino;
   private String servicio;
   private String ruta = "C:\\Users\\joz\\OneDrive\\Documentos\\NetBeansProjects\\Proyecto1\\Factura.html";
   private String ruta1 = "C:\\Users\\joz\\OneDrive\\Documentos\\NetBeansProjects\\Proyecto1\\Guia.html";
   
    public Envios() {
        this.Envios = new ArrayList<Datosenvios>();
  
    } 
    

    public String getDeptodestino() {
        return deptodestino;
    }

    public void setDeptodestino(String deptodestino) {
        this.deptodestino = deptodestino;
    }

    public String getRuta1() {
        return ruta1;
    }

    public void setRuta1(String ruta1) {
        this.ruta1 = ruta1;
    }
    

    
    //Envios
    public void agregardatos(Datosenvios datos){
    Envios.add(datos);
 
    }

    public ArrayList<Datosenvios> seleccionarinf(String usuario){
    ArrayList<Datosenvios> informacion = new ArrayList<Datosenvios>();
  
    Datosenvios usuarioEncontrado = null;
       for (Datosenvios us : Envios) {
           if(us.getNombreusuario().equalsIgnoreCase(usuario)) {
           usuarioEncontrado = us;
           informacion.add(usuarioEncontrado);
           }
       }
    return informacion;
   }

    
     public ArrayList<String> mostrarinf(String usuario){
    ArrayList<String> informacion = new ArrayList<String>();
  
    String usuarioEncontrado = null;
       for (Datosenvios us : Envios) {
           if(us.getNombreusuario().equalsIgnoreCase(usuario)) {
           usuarioEncontrado = us.toString();
           informacion.add(usuarioEncontrado);
           }
       }
    return informacion;
   }
    
    
    
    
    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
        

    private String cuerpofactura(String datosfac,String nufac,String peso, String cant,
                                  String tiposerv, String origen, String destino, String total){
    String body = 
            "<font face=\"Calibri\">\n" +
"    \n" +
"      <table>\n" +
"        <tr>\n" +
" 	<td colspan=\"4\"><b>Usac Delivery</b> </td>      \n" +
"        </tr>\n" +
"      <tr>\n" +
" 	<td colspan=\"4\">Nombre:"+ datosfac + " <br/> No.Factura:"+ nufac+" Codigo paquete </td>      \n" +
"        \n" +
"        \n" +
"          </tr>\n" +
"   \n" +
"	 <tr>\n" +
" 	<td colspan=\"2\">Resumen de Factura </td>      \n" +
"         <td> Peso  </td>\n" +
"        <td>Cantidad </td>\n" +
"        \n" +
"          </tr>\n" +
"      <tr>\n" +
" 	<td colspan=\"2\">Servicio "+tiposerv+" <br/> Origen: "+ origen+"  <br/> Destino "+destino+" </td> \n" +
"        <td > "+peso+" lbs </td>\n" +
"        <td > "+cant+" </td>\n" +
"        </tr>\n" +
"\n" +
"          <tr>\n" +
" 	<td colspan=\"4\">Total: "+total+" </td>      \n" +
"        \n" +
"        \n" +
"          </tr>\n" +
"         \n" +
"    </table>\n" +
"\n" +
"\n" +
       "</font>";
       
      return body;  
    }
    
    private String style(){
     String style = 
             "table, td {\n" +
"        border:2px solid black;\n" +
"      }\n" +
"      table {\n" +
"        border-collapse:collapse;\n" +
"        width:25%;\n" +
"      }\n" +
"      td {\n" +
"        padding:20px;\n" +
"      }";
             
        return style;
    }
    
    
    public void descargarfactura(String codigo){
      
        Datosenvios en = buscarcodigo(codigo);
        
  
        String datosfac = en.getDatosFac();
        String nufac = Integer.toString((int) (Math.random()*1000+9999));
        String peso = en.getPeso();
        String cant = en.getCantidad();
        String tiposerv = en.getServicio();
        String origen = en.getOrigen();
        String destino = en.getDestino();
        String total = en.getTotal();
        
        
        
        String body = cuerpofactura(datosfac, nufac,peso,cant,tiposerv,origen,destino,total);
        String Style = style();
        
        String html = "<html>"
                       + "<head>"
                       + "<meta charset=\"utf-5\">"
                       + "<title>Factura</title>"
                       + "<style>"
                       + Style
                       + "</style>"
                       + "</head>"
                       + "<body>"
                       + body
                       + "</body>"
                       + "</hmtl>";
        
        File file = new File(getRuta());
        
        try {

            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write(html);
            bw.close();
            

        } catch (Exception e) {
            e.printStackTrace();
        }
       
        
        
    }
    
    private String cuerpoguia(String codigo,String nombreor,String direccionor, 
            String nombredest, String direcciondest, String peso, String cant, 
            String tiposerv, String pago, String total){
    String body = "<font face=\"Calibri\">\n" +
"    <table>\n" +
"      <tr>\n" +
"        <td rowspan=\"2\"><b>Usac</b><br/><b>Delivery</b></td>\n" +
"        <td> Codigo Paquete: </td>\n" +
"        \n" +
"      </tr>\n" +
"      <tr>\n" +
"        <td>"+codigo+ "</td>\n" +
"        \n" +
"      </tr>\n" +
"      <tr>\n" +
" 	<td colspan=\"2\"><b>Origen</b> <br/> Nombre:"+ nombreor +"<br/> \n" +
"      Direccion :"+direccionor+"<br/> <b>Destino</b> <br/> Nombre : "+ nombredest + "<br/> \n" +
"        Direccion :"+ direcciondest + "  </td>      \n" +
"        </tr>\n" +
"         <tr>\n" +
" 	<td colspan=\"2\">///////////////////////</td>      \n" +
"        \n" +
"        </tr>\n" +
"         <tr>\n" +
" 	<td colspan=\"2\"><b>Paquete informacion</b> <br/> Peso: "+ peso + " <br/> \n" +
"      Cantidad : "+cant + " <br/><b> Pago</b> <br/> Servicio: " + tiposerv +"<br/> \n" +
"        Tipo de pago : "+ pago + "<br/><b> Total: " + total +"</b><br/><b> Fecha de envio:</b> </td>   \n" +
"\n" +
"    \n" +
"      </tr>\n" +
"    </table>\n" +
"   </font>"; 
            
     return body;       
    }
    
    private String styleguia(){
    String style = "table, td {\n" +
"        border:2px solid black;\n" +
"      }\n" +
"      table {\n" +
"        border-collapse:collapse;\n" +
"        width:18%;\n" +
"      }\n" +
"      td {\n" +
"        padding:20px;\n" +
"      }";

    return style;             
    }
    
    
    public Datosenvios buscarcodigo(String codigo){
      Datosenvios en = null;
       for (Datosenvios us : Envios) {
           if(us.getCodigopaquete().equalsIgnoreCase(codigo)) {
           en = us; 
           }
       }
    return en;
   }
    
    
    
    
    public void descargarguia(String codigo){
    
 
        Datosenvios en = buscarcodigo(codigo);
        
        String codi = en.getCodigopaquete();
        String nombreor = en.getNombreor();
        String direccionor = en.getOrigen();
        String nombredest = en.getNombredest();
        String direcciondest = en.getDestino();
        String peso = en.getPeso();
        String cant = en.getCantidad();
        String tiposerv = en.getServicio();
        String pago = en.getTipopago();
        String total = en.getTotal();
        
       
        String body = cuerpoguia(codi,nombreor,direccionor,nombredest,
                direcciondest,peso,cant,tiposerv, pago, total );
        String Style = styleguia();
       
        /*
        
        */
        
        
        
        
        String html = "<html>"
                       + "<head>"
                       + "<meta charset=\"utf-5\">"
                       + "<title>Factura</title>"
                       + "<style>"
                       + Style
                       + "</style>"
                       + "</head>"
                       + "<body>"
                       + body
                       + "</body>"
                       + "</hmtl>";
        
        File file = new File(getRuta1());
        
        try {

            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write(html);
            bw.close();
            

        } catch (Exception e) {
            e.printStackTrace();
        }
       

    
    }

    public ArrayList<Datosenvios> getEnvios() {
        return Envios;
    }

    public void setEnvios(ArrayList<Datosenvios> Envios) {
        this.Envios = Envios;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }
   
    
    
    
    
}


package Ventanas;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import proyecto1.Datosenvios;
import proyecto1.Envios;
import proyecto1.Facturacion;
import proyecto1.Infcompra;
import proyecto1.RegistroTarjetas;
import proyecto1.Usuarios;


public class Compra extends javax.swing.JFrame {

    public Envios envios = proyecto1.Proyecto1.envios;
    public Usuarios usuarios = proyecto1.Proyecto1.usuarios;
    public Facturacion facturacion = proyecto1.Proyecto1.facturacion;
    public RegistroTarjetas regtarjetas = proyecto1.Proyecto1.regtarjeta;
    
    
    public InterfazUsuario interfaz = Ventanas.Loggin.interfazusuario;
    DefaultListModel Datoscotizados = new DefaultListModel();
    
    public Compra() {
        tema();
        initComponents();
        setLocationRelativeTo(null);
        this.elijatarjeta.setVisible(false);
        this.tarjetas.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tarjetas = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        Datosfac = new javax.swing.JComboBox<>();
        Realizarenvio = new javax.swing.JButton();
        exacta1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nombreorigen = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        exacta2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        nombredestino = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        fecharecoleccion = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        Datos = new javax.swing.JList<>();
        elijatarjeta = new javax.swing.JLabel();
        Efectivo = new javax.swing.JCheckBox();
        Tarjeta = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Compra");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Completa los datos para el envio");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Tipo de pago");

        tarjetas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pago con Efectivo" }));

        jLabel3.setText("Datos de facturacion");

        Realizarenvio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Realizarenvio.setText("Realizar Envio");
        Realizarenvio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RealizarenvioActionPerformed(evt);
            }
        });

        jLabel5.setText("Direccion exacta");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Origen");

        jLabel7.setText("Nombre ");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Destino");

        jLabel9.setText("Direccion exacta");

        jLabel10.setText("Nombre");

        jLabel11.setText("Fecha de recoleccion");

        jScrollPane2.setViewportView(Datos);

        elijatarjeta.setText("Elija Tarjeta");

        Efectivo.setText("Efectivo");
        Efectivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EfectivoActionPerformed(evt);
            }
        });

        Tarjeta.setText("Tarjeta");
        Tarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TarjetaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(227, 227, 227)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(Tarjeta)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Efectivo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Datosfac, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(elijatarjeta)
                                .addGap(43, 43, 43)
                                .addComponent(tarjetas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(219, 219, 219)
                                .addComponent(jLabel8)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jSeparator3)
                                            .addComponent(fecharecoleccion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(exacta1, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(nombreorigen, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(exacta2, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(nombredestino, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
                                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(102, 102, 102))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(Realizarenvio, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(136, 136, 136))))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel6)
                        .addGap(3, 3, 3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(exacta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addComponent(nombreorigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addGap(1, 1, 1)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(exacta2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel10)
                        .addGap(3, 3, 3)
                        .addComponent(nombredestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fecharecoleccion, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Datosfac, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(6, 6, 6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Efectivo)
                    .addComponent(Tarjeta))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(elijatarjeta)
                            .addComponent(tarjetas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(Realizarenvio)))
                .addGap(58, 58, 58))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void tema(){
     try {
           
         UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Loggin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Loggin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Loggin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loggin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    
    
    }
    
    
    private void RealizarenvioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RealizarenvioActionPerformed
        String dir = this.exacta1.getText();
        String dir2 = this.exacta2.getText();
        String norigen = this.nombreorigen.getText();
        String ndest = this.nombredestino.getText();
        String fecha = this.fecharecoleccion.getText();
        
        if(dir.length()== 0 || dir2.length() == 0 || 
                norigen.length() ==0 || ndest.length() ==0 || fecha.length() ==0){
        
        JOptionPane.showMessageDialog(null, "Complete todos los datos");}
        else{
         int tam = this.Datosfac.getItemCount();
        if(tam==0){
        JOptionPane.showMessageDialog(null,"Se necesita datos de Facturacion" 
                + "\n" + "Registrar datos de Facturacion");
        
        }else{
            
        enviarahistorial();
        JOptionPane.showMessageDialog(null, "Envio registrado correctamente" + "Su Codigo de Envio es: " + codigounico()
                                      + "\n" + " Puede descargar la guia y la factura en la seccion de estado de envío "); 
        dispose();
        }

        }

    }//GEN-LAST:event_RealizarenvioActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
//          Datos.setModel(Datoscotizados);
//          Datoscotizados.addElement(interfaz.mostrardatos());
//          llenarcombo();
//          formapago();
    }//GEN-LAST:event_formWindowOpened

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
         Datos.setModel(Datoscotizados);
          Datoscotizados.addElement(interfaz.mostrardatos());
          llenarcombo();
          formapago();
    }//GEN-LAST:event_formWindowActivated

    private void TarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TarjetaActionPerformed
        this.elijatarjeta.setVisible(true);
     this.tarjetas.setVisible(true);

   
          String [] x = new String [regtarjetas.getRegtarjetas().size()];
          
             for (int i = 0; i <  regtarjetas.getRegtarjetas().size() ; i++) {
              
                 String numero = regtarjetas.getRegtarjetas().get(i).getDato2();
            char a = numero.charAt(14);
            char b = numero.charAt(13);
            char c = numero.charAt(12);
            char d = numero.charAt(11);
            String oculto = "----------" + d + c + b+ a;
                 
                 
                 x [i]= regtarjetas.getRegtarjetas().get(i).getDato1() 
                         + oculto;
             }

             this.tarjetas.setModel(new DefaultComboBoxModel(x));
    }//GEN-LAST:event_TarjetaActionPerformed

    private void EfectivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EfectivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EfectivoActionPerformed

    private void llenarcombo(){
       this.Datosfac.removeAllItems();
        
       ArrayList<Infcompra> informacion = new ArrayList<Infcompra>();    
           
       informacion = facturacion.getFacturacion();
       if(informacion==null){
       Datosfac.addItem("Agregue datos de facturacion");
       }else{
        for (int i=0; i< informacion.size();i++){
       Datosfac.addItem(informacion.get(i).getDato1()+informacion.get(i).getDato3());
       
        }
       }
       }
    
    private int codigounico(){
    int codigo =(int) (Math.random()*1000+9999);
    return codigo;
    }
    
    private void formapago(){
    if(this.Efectivo.isSelected()){
     this.elijatarjeta.setVisible(false);
     this.tarjetas.setVisible(false);
        
    }else if(this.Tarjeta.isSelected()){
    this.elijatarjeta.setVisible(true);
     this.tarjetas.setVisible(true);

   
          String [] x = new String [regtarjetas.getRegtarjetas().size()];
          
             for (int i = 0; i <  regtarjetas.getRegtarjetas().size() ; i++) {
              
                 String numero = regtarjetas.getRegtarjetas().get(i).getDato2();
            char a = numero.charAt(14);
            char b = numero.charAt(13);
            char c = numero.charAt(12);
            char d = numero.charAt(11);
            String oculto = "----------" + d + c + b+ a;
                 
                 
                 x [i]= regtarjetas.getRegtarjetas().get(i).getDato1() 
                         + oculto;
             }

             this.tarjetas.setModel(new DefaultComboBoxModel(x));
    
    }
    }
    
    
    private void enviarahistorial(){
        
        //nombre de usuario
    String nombreusuario= usuarios.getUsuarioactual();    
        
        //Codigo de paquete
    int codigopaquete = codigounico();
       //Datos de facturacion
    String datofac = this.Datosfac.getSelectedItem().toString();
       //Tipo de servicio
    String servicio = interfaz.servicio() ; 
       // direcciones
    String Origen = interfaz.dirorigen(); 
    String Destino = interfaz.direntrega();
    
    //informacion del paquete
    double peso = interfaz.getpeso();
    double cant = interfaz.getcant();
    
    String tipodepago = "";
    
    int tam = this.tarjetas.getItemCount();
    
    if(this.Efectivo.isSelected()){
     tipodepago= "Efectivo";
    }else {
//        if(tam == 0){
//        JOptionPane.showMessageDialog(null,
//                "No se ha registrado ninguna tarjeta" + "\n" + 
//                        "Registrar targeta en el apartado datos de compra");
//        
//        }else{
        tipodepago= "Tarjeta con datos: " + this.tarjetas.getSelectedItem().toString();

//        }
    }
    
     double Total = interfaz.preciototal();
    
    //nombres
    String nombreor= this.nombreorigen.getText();
    String nombredest = this.nombredestino.getText();
    
    Datosenvios datos = new Datosenvios(nombreusuario,Integer.toString(codigopaquete),
                                        datofac, servicio,nombreor, 
                                        Origen, nombredest, Destino, Double.toString(peso),
                                         Double.toString(cant), tipodepago, 
                                         Double.toString(Total));
    
    envios.agregardatos(datos);
    }
    
    
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Compra().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> Datos;
    private javax.swing.JComboBox<String> Datosfac;
    private javax.swing.JCheckBox Efectivo;
    private javax.swing.JButton Realizarenvio;
    private javax.swing.JCheckBox Tarjeta;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JLabel elijatarjeta;
    private javax.swing.JTextField exacta1;
    private javax.swing.JTextField exacta2;
    private javax.swing.JTextField fecharecoleccion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField nombredestino;
    private javax.swing.JTextField nombreorigen;
    private javax.swing.JComboBox<String> tarjetas;
    // End of variables declaration//GEN-END:variables
}

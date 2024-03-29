
package Ventanas;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import proyecto1.Envios;
import proyecto1.Facturacion;
import proyecto1.Kioscos;
import proyecto1.Precios;
import proyecto1.Regiones;
import proyecto1.RegistroTarjetas;
import proyecto1.Usuarios;
import proyecto1.UsuariosDatos;


public class Loggin extends javax.swing.JFrame {

    
    private RegistroUsuarios registrousuarios;
    public static InterfazUsuario interfazusuario = new InterfazUsuario();;
    private Administrador administrador;
    private UsuariosDatos usuariodatos;
    
    public Precios PreciosReg = proyecto1.Proyecto1.PreciosReg;
    public Kioscos Kioscos = proyecto1.Proyecto1.Kioscos;
    public Regiones datosregiones = proyecto1.Proyecto1.datosreg;
    public RegistroTarjetas regtarjetas = proyecto1.Proyecto1.regtarjeta;
    public Facturacion facturacion = proyecto1.Proyecto1.facturacion;
    public Envios envios = proyecto1.Proyecto1.envios;
    public Usuarios usuarios= proyecto1.Proyecto1.usuarios;
    
   
    ArrayList <String> registros = new ArrayList();
    public Loggin() {
        tema();
        initComponents();
        setLocationRelativeTo(null);
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        usuarioLog = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Acceder = new javax.swing.JButton();
        Registro = new javax.swing.JButton();
        passLog = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Loggin");

        jLabel1.setText("Usuario");

        jLabel2.setText("Contraseña");

        Acceder.setText("Acceder");
        Acceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccederActionPerformed(evt);
            }
        });

        Registro.setText("Registrarse");
        Registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Registro, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Acceder, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(usuarioLog)
                            .addComponent(jLabel2)
                            .addComponent(passLog, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE))))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(usuarioLog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(passLog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(Acceder, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Registro)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistroActionPerformed
        
        
        usuariodatos = new UsuariosDatos (usuarioLog.getText(), passLog.getText());
        if(registrousuarios != null){
            registrousuarios.setVisible(true);
           
        }else{
        registrousuarios = new RegistroUsuarios(usuariodatos);
        registrousuarios.setVisible(true);
        }
    }//GEN-LAST:event_RegistroActionPerformed

    private void AccederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccederActionPerformed
        
        String usuario = this.usuarioLog.getText();
        String pass = this.passLog.getText();
        String agregar2 = usuario+" "+pass;
        Boolean entrar = false;
  
        
        if(registrousuarios != null){
            UsuariosDatos p = registrousuarios.getDatos();
            String usuarioregistro = p.getCorreo();
            String passregistro = p.getContra();
            String agregar = usuarioregistro + " " + passregistro;
            registros.add(agregar);    
           
        }else{
        
             registros.add(" ");
        }
        

        if (!usuario.equals("")|| !pass.equals("") ){
            
            
            
             if(registros.contains(agregar2)){
              entrar = true;
         } else {
                  }
 
             if (!usuario.equals("ipc1_201801521@ipc1delivery.com")|| !pass.equals("201801521")){
               if(entrar){
                   //interfazusuario = new InterfazUsuario();
                   interfazusuario.setVisible(true);
               
               }else {JOptionPane.showMessageDialog(null, "Usuario incorrecto");
               }
               

             }else{
               
                 administrador = new Administrador();
               administrador.setVisible(true);
               PreciosReg.agregardatos();
               administrador.precios();
               datosregiones.agregarcontador();
               }
  
            
            
        }else {
           JOptionPane.showMessageDialog(null, "Es necesario llenar todos los datos"); 
        }
        
         enviarusuario();
         
    }//GEN-LAST:event_AccederActionPerformed

    
    public void enviarusuario(){
        usuarios.setUsuarioactual(usuarioactual());
    }
    
    public String usuarioactual(){
    String usuario = this.usuarioLog.getText();
    return usuario;
    }
    
    public String contraactual(){
    String pass = this.passLog.getText();
    return pass;
    }
    
    
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
//                if ("Windows".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Loggin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Loggin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Loggin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Loggin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
////                new Loggin().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Acceder;
    private javax.swing.JButton Registro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField passLog;
    private javax.swing.JTextField usuarioLog;
    // End of variables declaration//GEN-END:variables
}

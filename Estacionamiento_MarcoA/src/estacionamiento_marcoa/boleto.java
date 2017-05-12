
package estacionamiento_marcoa;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.filechooser.FileNameExtensionFilter; //librerias necesarias
import javax.swing.text.Document;


public class boleto extends javax.swing.JFrame {

    
    public boleto() {
        initComponents();
        
        this.setLocationRelativeTo(null);//nos aparecera enmedio la ventana
        
        tfecha.setText(fechaActual());//imprime la hora en el jlabel
        
        Calendar cal=Calendar.getInstance(); //para poner hora en jlabel
        String hora=cal.get(cal.HOUR_OF_DAY)+":"+cal.get(cal.MINUTE)+":"+cal.get(cal.SECOND);
        this.thora.setText(hora);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tConsulta = new javax.swing.JTextField();
        tConsulta2 = new javax.swing.JTextField();
        tfecha = new javax.swing.JTextField();
        thora = new javax.swing.JTextField();
        guardar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        datos = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MENU DE BOLETO");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("BUSCAR DOCUMENTO Y MOSTRAR DATOS DE BOLETO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 71, -1, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MENU BOLETO Y DATOS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 914, 22));

        tConsulta.setEditable(false);
        tConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tConsultaActionPerformed(evt);
            }
        });
        getContentPane().add(tConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 96, 914, -1));

        tConsulta2.setEditable(false);
        getContentPane().add(tConsulta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 134, 669, -1));

        tfecha.setEditable(false);
        getContentPane().add(tfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(812, 134, 97, -1));

        thora.setEditable(false);
        getContentPane().add(thora, new org.netbeans.lib.awtextra.AbsoluteConstraints(705, 134, 97, -1));

        guardar.setText("guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        getContentPane().add(guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        jButton2.setText("datos completos de boleto");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 339, -1, -1));

        datos.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        getContentPane().add(datos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 376, 914, 12));

        jLabel2.setText("boleto,    nombre acom.  marca    modelo        color                  placas       estado de vehiculo       piso       cajon");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 164, 669, -1));

        jLabel3.setText("boleto,    nombre acom.  marca    modelo        color                  placas                   estado de vehiculo       piso       cajon        hora                fecha");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 399, 914, -1));

        jLabel4.setText("Presionar guardar para agregar fecha y hora al boleto.");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 258, -1, -1));

        jLabel5.setText("presionar");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 339, -1, -1));

        jLabel6.setText("para mostrar boleto.");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, 150, -1));

        jLabel7.setText("BUSQUE LA INFORMACION CAPTURADA RECUERDE LA CARPETA");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 71, -1, -1));

        jLabel8.setText("HORA");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(733, 164, -1, -1));

        jLabel9.setText("FECHA");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 164, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //metodo para buscar el archivo
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos de texto", "txt");
        JFileChooser fileChooserCargar = new JFileChooser();
        fileChooserCargar.setFileFilter(filtro);
        fileChooserCargar.setDialogTitle("Abrir");
        

       int seleccion = fileChooserCargar.showOpenDialog(this);
       if (seleccion == JFileChooser.APPROVE_OPTION) {
            File file = fileChooserCargar.getSelectedFile();
            tConsulta.setText(fileChooserCargar.getSelectedFile().getPath());
            
            
          
         try{
          
          FileReader fr = new FileReader(tConsulta.getText());//archivo que va a ser leido
          BufferedReader br = new BufferedReader(fr);//leer el archivo
          String texto;
          
          while ((texto=br.readLine())!=null){
              
              tConsulta2.setText(texto);
              
                }  
        }catch(Exception ex){}
              
              
             
                
        
            
    }//GEN-LAST:event_jButton1ActionPerformed
    /**
     * @param args the command line arguments
     */
    
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(boleto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(boleto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(boleto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(boleto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
    
    }
    private void tConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tConsultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tConsultaActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        BufferedWriter writer;
        
        
        
    try {
        JFileChooser archivo = new JFileChooser(System.getProperty("user.dir"));
        archivo.showSaveDialog(this);
             
            
            if (archivo.getSelectedFile() != null) {
                
               
                try (FileWriter guardado = new FileWriter(archivo.getSelectedFile()+ ".txt")) {
                    
                    
                    guardado.write(tConsulta2.getText()+" "); //ponemos los espacios de separacion del archivo
                    guardado.write(tfecha.getText()+"        ");
                    
                    guardado.write(thora.getText()+"         "+ "\n" );
                   
                    JOptionPane.showMessageDialog(rootPane, "El archivo fue guardado con éxito en la ruta establecida");
                }
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_guardarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try{
          JFileChooser fileChooserCargar = new JFileChooser();
          FileReader fr = new FileReader(tConsulta.getText());//archivo que va a ser leido
          BufferedReader br = new BufferedReader(fr);//leer el archivo
          String texto;
          
          while ((texto=br.readLine())!=null){
              
              datos.setText(texto);
              this.datos.setText(fileChooserCargar.getSelectedFile().getPath());
                }  
        }catch(Exception ex){}
    }//GEN-LAST:event_jButton2ActionPerformed

    public static String fechaActual(){ //para imprimir fecha
        Date fecha=new Date();
        Calendar cal=Calendar.getInstance();
        SimpleDateFormat formatoFecha=new SimpleDateFormat("dd/MM/YYYY");
        return formatoFecha.format(fecha);
        }



    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel datos;
    private javax.swing.JButton guardar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField tConsulta;
    private javax.swing.JTextField tConsulta2;
    private javax.swing.JTextField tfecha;
    private javax.swing.JTextField thora;
    // End of variables declaration//GEN-END:variables
}

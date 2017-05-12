
package estacionamiento_marcoa;

import java.awt.Color;
import static java.lang.Thread.sleep; //librerias que utlzaremos
import javax.swing.*;

public class cajon extends javax.swing.JFrame {
        public cajon() {
        initComponents();
        this.setLocationRelativeTo(null);//nos aparecera enmedio la ventana
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        libre1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        led1 = new javax.swing.JLabel();
        ocupado1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        libre2 = new javax.swing.JButton();
        led2 = new javax.swing.JLabel();
        ocupado2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        ocupado3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        libre3 = new javax.swing.JButton();
        led3 = new javax.swing.JLabel();
        ocupado4 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        libre4 = new javax.swing.JButton();
        led4 = new javax.swing.JLabel();
        ocupado5 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        libre5 = new javax.swing.JButton();
        led5 = new javax.swing.JLabel();
        ocupado6 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        libre6 = new javax.swing.JButton();
        led6 = new javax.swing.JLabel();
        ocupado7 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        libre7 = new javax.swing.JButton();
        led7 = new javax.swing.JLabel();
        ocupado8 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        libre8 = new javax.swing.JButton();
        led8 = new javax.swing.JLabel();
        ocupado9 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        libre9 = new javax.swing.JButton();
        led9 = new javax.swing.JLabel();
        ocupado10 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        libre10 = new javax.swing.JButton();
        led10 = new javax.swing.JLabel();
        ocupado11 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        libre11 = new javax.swing.JButton();
        led11 = new javax.swing.JLabel();
        ocupado12 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        libre12 = new javax.swing.JButton();
        led12 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ocupado13 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        libre13 = new javax.swing.JButton();
        led13 = new javax.swing.JLabel();
        ocupado14 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        libre14 = new javax.swing.JButton();
        led14 = new javax.swing.JLabel();
        ocupado15 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        libre15 = new javax.swing.JButton();
        led15 = new javax.swing.JLabel();
        ocupado16 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        libre16 = new javax.swing.JButton();
        led16 = new javax.swing.JLabel();
        ocupado17 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        libre17 = new javax.swing.JButton();
        led17 = new javax.swing.JLabel();
        ocupado18 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        libre18 = new javax.swing.JButton();
        led18 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        botonverde = new javax.swing.JButton();
        activar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CONTROL DE CAJONES");

        libre1.setText("libre");
        libre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                libre1ActionPerformed(evt);
            }
        });

        led1.setIcon(new javax.swing.ImageIcon("C:\\Users\\trevo\\Documents\\NetBeansProjects\\Estacionamiento_MarcoA\\src\\images\\off.png")); // NOI18N

        ocupado1.setText("ocupado");
        ocupado1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ocupado1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("control de cajones");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("cajon 1");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("piso 1");

        libre2.setText("libre");
        libre2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                libre2ActionPerformed(evt);
            }
        });

        led2.setIcon(new javax.swing.ImageIcon("C:\\Users\\trevo\\Documents\\NetBeansProjects\\Estacionamiento_MarcoA\\src\\images\\off.png")); // NOI18N

        ocupado2.setText("ocupado");
        ocupado2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ocupado2ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("cajon 2");

        ocupado3.setText("ocupado");
        ocupado3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ocupado3ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("cajon 3");

        libre3.setText("libre");
        libre3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                libre3ActionPerformed(evt);
            }
        });

        led3.setIcon(new javax.swing.ImageIcon("C:\\Users\\trevo\\Documents\\NetBeansProjects\\Estacionamiento_MarcoA\\src\\images\\off.png")); // NOI18N

        ocupado4.setText("ocupado");
        ocupado4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ocupado4ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("cajon 4");

        libre4.setText("libre");
        libre4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                libre4ActionPerformed(evt);
            }
        });

        led4.setIcon(new javax.swing.ImageIcon("C:\\Users\\trevo\\Documents\\NetBeansProjects\\Estacionamiento_MarcoA\\src\\images\\off.png")); // NOI18N

        ocupado5.setText("ocupado");
        ocupado5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ocupado5ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("cajon 5");

        libre5.setText("libre");
        libre5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                libre5ActionPerformed(evt);
            }
        });

        led5.setIcon(new javax.swing.ImageIcon("C:\\Users\\trevo\\Documents\\NetBeansProjects\\Estacionamiento_MarcoA\\src\\images\\off.png")); // NOI18N

        ocupado6.setText("ocupado");
        ocupado6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ocupado6ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("cajon 6");

        libre6.setText("libre");
        libre6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                libre6ActionPerformed(evt);
            }
        });

        led6.setIcon(new javax.swing.ImageIcon("C:\\Users\\trevo\\Documents\\NetBeansProjects\\Estacionamiento_MarcoA\\src\\images\\off.png")); // NOI18N

        ocupado7.setText("ocupado");
        ocupado7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ocupado7ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("cajon 7");

        libre7.setText("libre");
        libre7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                libre7ActionPerformed(evt);
            }
        });

        led7.setIcon(new javax.swing.ImageIcon("C:\\Users\\trevo\\Documents\\NetBeansProjects\\Estacionamiento_MarcoA\\src\\images\\off.png")); // NOI18N

        ocupado8.setText("ocupado");
        ocupado8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ocupado8ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("cajon 8");

        libre8.setText("libre");
        libre8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                libre8ActionPerformed(evt);
            }
        });

        led8.setIcon(new javax.swing.ImageIcon("C:\\Users\\trevo\\Documents\\NetBeansProjects\\Estacionamiento_MarcoA\\src\\images\\off.png")); // NOI18N

        ocupado9.setText("ocupado");
        ocupado9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ocupado9ActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setText("cajon 9");

        libre9.setText("libre");
        libre9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                libre9ActionPerformed(evt);
            }
        });

        led9.setIcon(new javax.swing.ImageIcon("C:\\Users\\trevo\\Documents\\NetBeansProjects\\Estacionamiento_MarcoA\\src\\images\\off.png")); // NOI18N

        ocupado10.setText("ocupado");
        ocupado10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ocupado10ActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setText("cajon 1");

        libre10.setText("libre");
        libre10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                libre10ActionPerformed(evt);
            }
        });

        led10.setIcon(new javax.swing.ImageIcon("C:\\Users\\trevo\\Documents\\NetBeansProjects\\Estacionamiento_MarcoA\\src\\images\\off.png")); // NOI18N

        ocupado11.setText("ocupado");
        ocupado11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ocupado11ActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setText("cajon 2");

        libre11.setText("libre");
        libre11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                libre11ActionPerformed(evt);
            }
        });

        led11.setIcon(new javax.swing.ImageIcon("C:\\Users\\trevo\\Documents\\NetBeansProjects\\Estacionamiento_MarcoA\\src\\images\\off.png")); // NOI18N

        ocupado12.setText("ocupado");
        ocupado12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ocupado12ActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setText("cajon 3");

        libre12.setText("libre");
        libre12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                libre12ActionPerformed(evt);
            }
        });

        led12.setIcon(new javax.swing.ImageIcon("C:\\Users\\trevo\\Documents\\NetBeansProjects\\Estacionamiento_MarcoA\\src\\images\\off.png")); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("piso 2");

        ocupado13.setText("ocupado");
        ocupado13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ocupado13ActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel19.setText("cajon 4");

        libre13.setText("libre");
        libre13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                libre13ActionPerformed(evt);
            }
        });

        led13.setIcon(new javax.swing.ImageIcon("C:\\Users\\trevo\\Documents\\NetBeansProjects\\Estacionamiento_MarcoA\\src\\images\\off.png")); // NOI18N

        ocupado14.setText("ocupado");
        ocupado14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ocupado14ActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel20.setText("cajon 5");

        libre14.setText("libre");
        libre14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                libre14ActionPerformed(evt);
            }
        });

        led14.setIcon(new javax.swing.ImageIcon("C:\\Users\\trevo\\Documents\\NetBeansProjects\\Estacionamiento_MarcoA\\src\\images\\off.png")); // NOI18N

        ocupado15.setText("ocupado");
        ocupado15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ocupado15ActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel21.setText("cajon 6");

        libre15.setText("libre");
        libre15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                libre15ActionPerformed(evt);
            }
        });

        led15.setIcon(new javax.swing.ImageIcon("C:\\Users\\trevo\\Documents\\NetBeansProjects\\Estacionamiento_MarcoA\\src\\images\\off.png")); // NOI18N

        ocupado16.setText("ocupado");
        ocupado16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ocupado16ActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel22.setText("cajon 7");

        libre16.setText("libre");
        libre16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                libre16ActionPerformed(evt);
            }
        });

        led16.setIcon(new javax.swing.ImageIcon("C:\\Users\\trevo\\Documents\\NetBeansProjects\\Estacionamiento_MarcoA\\src\\images\\off.png")); // NOI18N

        ocupado17.setText("ocupado");
        ocupado17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ocupado17ActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel23.setText("cajon 8");

        libre17.setText("libre");
        libre17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                libre17ActionPerformed(evt);
            }
        });

        led17.setIcon(new javax.swing.ImageIcon("C:\\Users\\trevo\\Documents\\NetBeansProjects\\Estacionamiento_MarcoA\\src\\images\\off.png")); // NOI18N

        ocupado18.setText("ocupado");
        ocupado18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ocupado18ActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel24.setText("cajon 9");

        libre18.setText("libre");
        libre18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                libre18ActionPerformed(evt);
            }
        });

        led18.setIcon(new javax.swing.ImageIcon("C:\\Users\\trevo\\Documents\\NetBeansProjects\\Estacionamiento_MarcoA\\src\\images\\off.png")); // NOI18N

        jLabel8.setText("bienvenido al sistema de control de lugares en estacionamiento.");

        jLabel9.setText("para ocuar un lugar preione el boton ocupado y el led cambiara a rojo indicando que el lugar se encuentra ocupado.");

        jLabel25.setText("para liberar un lugar precione el boton libre y el led cambiara a verde indicando que ese lugar se encuentra disponible.");

        botonverde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonverdeActionPerformed(evt);
            }
        });

        activar.setText("activar sistema");
        activar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(activar, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonverde, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(288, 288, 288)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(25, 25, 25)
                                .addComponent(libre4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ocupado4)
                                .addGap(18, 18, 18)
                                .addComponent(led4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel11)
                                .addGap(25, 25, 25)
                                .addComponent(libre5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ocupado5)
                                .addGap(18, 18, 18)
                                .addComponent(led5)
                                .addGap(20, 20, 20)
                                .addComponent(jLabel12)
                                .addGap(25, 25, 25)
                                .addComponent(libre6, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ocupado6)
                                .addGap(18, 18, 18)
                                .addComponent(led6))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(25, 25, 25)
                                .addComponent(libre1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ocupado1)
                                .addGap(18, 18, 18)
                                .addComponent(led1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5)
                                .addGap(25, 25, 25)
                                .addComponent(libre2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ocupado2)
                                .addGap(18, 18, 18)
                                .addComponent(led2)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addGap(25, 25, 25)
                                .addComponent(libre3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ocupado3)
                                .addGap(18, 18, 18)
                                .addComponent(led3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(25, 25, 25)
                                .addComponent(libre7, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ocupado7)
                                .addGap(18, 18, 18)
                                .addComponent(led7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel14)
                                .addGap(25, 25, 25)
                                .addComponent(libre8, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ocupado8)
                                .addGap(18, 18, 18)
                                .addComponent(led8)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel15)
                                .addGap(25, 25, 25)
                                .addComponent(libre9, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ocupado9)
                                .addGap(18, 18, 18)
                                .addComponent(led9))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(25, 25, 25)
                                .addComponent(libre10, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ocupado10)
                                .addGap(18, 18, 18)
                                .addComponent(led10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel17)
                                .addGap(25, 25, 25)
                                .addComponent(libre11, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ocupado11)
                                .addGap(18, 18, 18)
                                .addComponent(led11)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel18)
                                .addGap(25, 25, 25)
                                .addComponent(libre12, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ocupado12)
                                .addGap(18, 18, 18)
                                .addComponent(led12))
                            .addComponent(jLabel7)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addGap(25, 25, 25)
                                .addComponent(libre13, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ocupado13)
                                .addGap(18, 18, 18)
                                .addComponent(led13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel20)
                                .addGap(25, 25, 25)
                                .addComponent(libre14, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ocupado14)
                                .addGap(18, 18, 18)
                                .addComponent(led14)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel21)
                                .addGap(25, 25, 25)
                                .addComponent(libre15, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ocupado15)
                                .addGap(18, 18, 18)
                                .addComponent(led15))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addGap(25, 25, 25)
                                .addComponent(libre16, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ocupado16)
                                .addGap(18, 18, 18)
                                .addComponent(led16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel23)
                                .addGap(25, 25, 25)
                                .addComponent(libre17, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ocupado17)
                                .addGap(18, 18, 18)
                                .addComponent(led17)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel24)
                                .addGap(25, 25, 25)
                                .addComponent(libre18, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ocupado18)
                                .addGap(18, 18, 18)
                                .addComponent(led18)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ocupado1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(libre1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addComponent(led1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ocupado2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(libre2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addComponent(led2, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ocupado3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(libre3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6))
                    .addComponent(led3, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(ocupado4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(libre4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10))
                            .addComponent(led4, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ocupado6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(libre6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12))
                    .addComponent(led6, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(ocupado5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(libre5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11))
                            .addComponent(led5, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ocupado7, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(libre7, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13))
                    .addComponent(led7, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ocupado8, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(libre8, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14))
                    .addComponent(led8, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ocupado9, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(libre9, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15))
                    .addComponent(led9, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ocupado10, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(libre10, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel16))
                    .addComponent(led10, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ocupado11, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(libre11, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel17))
                    .addComponent(led11, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ocupado12, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(libre12, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel18))
                    .addComponent(led12, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ocupado13, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(libre13, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel19))
                    .addComponent(led13, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ocupado14, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(libre14, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel20))
                    .addComponent(led14, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ocupado15, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(libre15, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel21))
                    .addComponent(led15, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ocupado16, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(libre16, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel22))
                    .addComponent(led16, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ocupado17, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(libre17, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel23))
                    .addComponent(led17, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ocupado18, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(libre18, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel24))
                    .addComponent(led18, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonverde, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(activar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//configuramos los botones para que muestren el color correspondiente
    private void libre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_libre1ActionPerformed
        led1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/green.png")));
    }//GEN-LAST:event_libre1ActionPerformed

    private void ocupado1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ocupado1ActionPerformed
        led1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/red.png")));
    }//GEN-LAST:event_ocupado1ActionPerformed

    private void libre2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_libre2ActionPerformed
        led2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/green.png")));    }//GEN-LAST:event_libre2ActionPerformed

    private void ocupado2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ocupado2ActionPerformed
        led2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/red.png")));
    }//GEN-LAST:event_ocupado2ActionPerformed

    private void ocupado3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ocupado3ActionPerformed
        led3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/red.png")));
    }//GEN-LAST:event_ocupado3ActionPerformed

    private void libre3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_libre3ActionPerformed
        led3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/green.png")));    }//GEN-LAST:event_libre3ActionPerformed

    private void ocupado4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ocupado4ActionPerformed
        led4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/red.png")));    }//GEN-LAST:event_ocupado4ActionPerformed

    private void libre4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_libre4ActionPerformed
        led4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/green.png")));
    }//GEN-LAST:event_libre4ActionPerformed

    private void ocupado5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ocupado5ActionPerformed
        led5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/red.png")));
    }//GEN-LAST:event_ocupado5ActionPerformed

    private void libre5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_libre5ActionPerformed
        led5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/green.png")));
    }//GEN-LAST:event_libre5ActionPerformed

    private void ocupado6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ocupado6ActionPerformed
        led6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/red.png")));
    }//GEN-LAST:event_ocupado6ActionPerformed

    private void libre6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_libre6ActionPerformed
        led6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/green.png")));
    }//GEN-LAST:event_libre6ActionPerformed

    private void ocupado7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ocupado7ActionPerformed
        led7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/red.png")));
    }//GEN-LAST:event_ocupado7ActionPerformed

    private void libre7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_libre7ActionPerformed
        led7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/green.png")));
    }//GEN-LAST:event_libre7ActionPerformed

    private void ocupado8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ocupado8ActionPerformed
        led8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/red.png")));
    }//GEN-LAST:event_ocupado8ActionPerformed

    private void libre8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_libre8ActionPerformed
        led8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/green.png")));
    }//GEN-LAST:event_libre8ActionPerformed

    private void ocupado9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ocupado9ActionPerformed
        led9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/red.png")));
    }//GEN-LAST:event_ocupado9ActionPerformed

    private void libre9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_libre9ActionPerformed
        led9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/green.png")));
    }//GEN-LAST:event_libre9ActionPerformed

    private void ocupado10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ocupado10ActionPerformed
        led10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/red.png")));
    }//GEN-LAST:event_ocupado10ActionPerformed

    private void libre10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_libre10ActionPerformed
        led10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/green.png")));
    }//GEN-LAST:event_libre10ActionPerformed

    private void ocupado11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ocupado11ActionPerformed
        led11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/red.png")));
    }//GEN-LAST:event_ocupado11ActionPerformed

    private void libre11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_libre11ActionPerformed
        led11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/green.png")));
    }//GEN-LAST:event_libre11ActionPerformed

    private void ocupado12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ocupado12ActionPerformed
        led12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/red.png")));
    }//GEN-LAST:event_ocupado12ActionPerformed

    private void libre12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_libre12ActionPerformed
        led12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/green.png")));
    }//GEN-LAST:event_libre12ActionPerformed

    private void ocupado13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ocupado13ActionPerformed
        led13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/red.png")));
    }//GEN-LAST:event_ocupado13ActionPerformed

    private void libre13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_libre13ActionPerformed
        led13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/green.png")));
    }//GEN-LAST:event_libre13ActionPerformed

    private void ocupado14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ocupado14ActionPerformed
        led14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/red.png")));
    }//GEN-LAST:event_ocupado14ActionPerformed

    private void libre14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_libre14ActionPerformed
        led14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/green.png")));
    }//GEN-LAST:event_libre14ActionPerformed

    private void ocupado15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ocupado15ActionPerformed
        led15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/red.png")));
    }//GEN-LAST:event_ocupado15ActionPerformed

    private void libre15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_libre15ActionPerformed
        led15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/green.png")));
    }//GEN-LAST:event_libre15ActionPerformed

    private void ocupado16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ocupado16ActionPerformed
        led16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/red.png")));
    }//GEN-LAST:event_ocupado16ActionPerformed

    private void libre16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_libre16ActionPerformed
        led16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/green.png")));
    }//GEN-LAST:event_libre16ActionPerformed

    private void ocupado17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ocupado17ActionPerformed
        led17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/red.png")));
    }//GEN-LAST:event_ocupado17ActionPerformed

    private void libre17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_libre17ActionPerformed
        led17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/green.png")));
    }//GEN-LAST:event_libre17ActionPerformed

    private void ocupado18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ocupado18ActionPerformed
       led18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/red.png")));
    }//GEN-LAST:event_ocupado18ActionPerformed

    private void libre18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_libre18ActionPerformed
        led18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/green.png")));
    }//GEN-LAST:event_libre18ActionPerformed

    private void activarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_activarActionPerformed
        proceso objeto = new proceso(botonverde);
        objeto.start();
    }//GEN-LAST:event_activarActionPerformed

    private void botonverdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonverdeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonverdeActionPerformed

    public class proceso implements Runnable {
    
    JButton botonverde;
    int contador=0,temp=0;
    
    public proceso(JButton entrada1){
        this.botonverde=entrada1;
       }

        
    @Override
    public void run() {
         
        while(true){
            
            contador++;
             
            if(contador>=1 && contador<=2){
                temp++;
                }
           
            if(contador==1){
                
                botonverde.setBackground(Color.blue);
            }
            
            
            if(contador>=2 && contador<=3){
                temp++;
                }
          if(contador==2){
              
              botonverde.setBackground(Color.green);   
            }
            
          if(contador==2){
                contador=0;
                temp=0;
                
               }
            
            try {
                sleep(1000);
            } catch (Exception e) {
            }
            
        }
        
    }
    
    public void start() {
        new Thread(this).start();
    }  
    }

    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(cajon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cajon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cajon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cajon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cajon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton activar;
    private javax.swing.JButton botonverde;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel led1;
    private javax.swing.JLabel led10;
    private javax.swing.JLabel led11;
    private javax.swing.JLabel led12;
    private javax.swing.JLabel led13;
    private javax.swing.JLabel led14;
    private javax.swing.JLabel led15;
    private javax.swing.JLabel led16;
    private javax.swing.JLabel led17;
    private javax.swing.JLabel led18;
    private javax.swing.JLabel led2;
    private javax.swing.JLabel led3;
    private javax.swing.JLabel led4;
    private javax.swing.JLabel led5;
    private javax.swing.JLabel led6;
    private javax.swing.JLabel led7;
    private javax.swing.JLabel led8;
    private javax.swing.JLabel led9;
    private javax.swing.JButton libre1;
    private javax.swing.JButton libre10;
    private javax.swing.JButton libre11;
    private javax.swing.JButton libre12;
    private javax.swing.JButton libre13;
    private javax.swing.JButton libre14;
    private javax.swing.JButton libre15;
    private javax.swing.JButton libre16;
    private javax.swing.JButton libre17;
    private javax.swing.JButton libre18;
    private javax.swing.JButton libre2;
    private javax.swing.JButton libre3;
    private javax.swing.JButton libre4;
    private javax.swing.JButton libre5;
    private javax.swing.JButton libre6;
    private javax.swing.JButton libre7;
    private javax.swing.JButton libre8;
    private javax.swing.JButton libre9;
    private javax.swing.JButton ocupado1;
    private javax.swing.JButton ocupado10;
    private javax.swing.JButton ocupado11;
    private javax.swing.JButton ocupado12;
    private javax.swing.JButton ocupado13;
    private javax.swing.JButton ocupado14;
    private javax.swing.JButton ocupado15;
    private javax.swing.JButton ocupado16;
    private javax.swing.JButton ocupado17;
    private javax.swing.JButton ocupado18;
    private javax.swing.JButton ocupado2;
    private javax.swing.JButton ocupado3;
    private javax.swing.JButton ocupado4;
    private javax.swing.JButton ocupado5;
    private javax.swing.JButton ocupado6;
    private javax.swing.JButton ocupado7;
    private javax.swing.JButton ocupado8;
    private javax.swing.JButton ocupado9;
    // End of variables declaration//GEN-END:variables
}

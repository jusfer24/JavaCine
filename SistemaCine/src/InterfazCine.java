import SistemaCine.src.Fecha;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.Date;


public class InterfazCine extends javax.swing.JFrame implements Runnable{
    Thread hilo;
    Fecha dat;
    public InterfazCine() {
        initComponents(); // Método autogenerado por NetBeans
        dat= new Fecha();
        
        hilo= new Thread(this);
        hilo.start();
        tx_fecha.setText(dat.date());
                
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // Botones para seleccionar funciones
    }

    public void run(){
         Thread current=Thread.currentThread();
                while(current==hilo){
                    dat.hour();
                tx_hora.setText(dat.hour());
        }
    }
    
    public InterfazCine(String prueba) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        icon_cine = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        parentPanel = new javax.swing.JPanel();
        cartelera = new javax.swing.JPanel();
        inception_c = new javax.swing.JLabel();
        interestelar_c = new javax.swing.JLabel();
        mufasa_c = new javax.swing.JLabel();
        boletos = new javax.swing.JPanel();
        perfil = new javax.swing.JPanel();
        reloj = new javax.swing.JPanel();
        tx_fecha = new javax.swing.JLabel();
        tx_hora = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        cartelera_b = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        boletos_b = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        dulceria_b = new javax.swing.JMenu();
        promos_b = new javax.swing.JMenu();
        perfil_b = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        icon_cine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Logo.png"))); // NOI18N
        icon_cine.setText("jLabel1");

        jLabel2.setFont(new java.awt.Font("Roboto", 3, 12)); // NOI18N
        jLabel2.setText("Prueba nustras funciones disponibles");

        jLabel10.setFont(new java.awt.Font("Roboto Black", 3, 24)); // NOI18N
        jLabel10.setText("CINE ANDINO");

        parentPanel.setBackground(new java.awt.Color(51, 0, 204));
        parentPanel.setLayout(new java.awt.CardLayout());

        cartelera.setBackground(new java.awt.Color(0, 51, 153));
        cartelera.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));

        inception_c.setBackground(new java.awt.Color(0, 153, 153));
        inception_c.setFont(new java.awt.Font("Artifakt Element Heavy", 2, 12)); // NOI18N
        inception_c.setForeground(new java.awt.Color(204, 204, 0));
        inception_c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/inception.png"))); // NOI18N
        inception_c.setText("   Inception");
        inception_c.setAutoscrolls(true);
        inception_c.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.yellow, java.awt.Color.yellow, java.awt.Color.lightGray, java.awt.Color.lightGray));
        inception_c.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        inception_c.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inception_cMouseClicked(evt);
            }
        });

        interestelar_c.setFont(new java.awt.Font("Artifakt Element Heavy", 2, 12)); // NOI18N
        interestelar_c.setForeground(new java.awt.Color(204, 204, 0));
        interestelar_c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/interstellar.jpg"))); // NOI18N
        interestelar_c.setText("       Interestelar");
        interestelar_c.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 0), new java.awt.Color(204, 204, 0), java.awt.Color.lightGray, java.awt.Color.white));
        interestelar_c.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        interestelar_c.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                interestelar_cMouseClicked(evt);
            }
        });

        mufasa_c.setFont(new java.awt.Font("Artifakt Element Heavy", 2, 12)); // NOI18N
        mufasa_c.setForeground(new java.awt.Color(204, 204, 0));
        mufasa_c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/m.jpeg"))); // NOI18N
        mufasa_c.setText("   Mufasa");
        mufasa_c.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        mufasa_c.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 0), new java.awt.Color(204, 204, 0), java.awt.Color.white, java.awt.Color.lightGray));
        mufasa_c.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mufasa_c.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mufasa_cMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout carteleraLayout = new javax.swing.GroupLayout(cartelera);
        cartelera.setLayout(carteleraLayout);
        carteleraLayout.setHorizontalGroup(
            carteleraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(carteleraLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(carteleraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(mufasa_c, javax.swing.GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE)
                    .addComponent(inception_c, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(interestelar_c, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        carteleraLayout.setVerticalGroup(
            carteleraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(carteleraLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(mufasa_c, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(inception_c, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(interestelar_c, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        inception_c.getAccessibleContext().setAccessibleName("");

        parentPanel.add(cartelera, "card3");

        boletos.setBackground(new java.awt.Color(0, 0, 153));
        boletos.setPreferredSize(new java.awt.Dimension(550, 1673));

        javax.swing.GroupLayout boletosLayout = new javax.swing.GroupLayout(boletos);
        boletos.setLayout(boletosLayout);
        boletosLayout.setHorizontalGroup(
            boletosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 605, Short.MAX_VALUE)
        );
        boletosLayout.setVerticalGroup(
            boletosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1673, Short.MAX_VALUE)
        );

        parentPanel.add(boletos, "card4");

        perfil.setBackground(new java.awt.Color(0, 0, 153));

        javax.swing.GroupLayout perfilLayout = new javax.swing.GroupLayout(perfil);
        perfil.setLayout(perfilLayout);
        perfilLayout.setHorizontalGroup(
            perfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 605, Short.MAX_VALUE)
        );
        perfilLayout.setVerticalGroup(
            perfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1673, Short.MAX_VALUE)
        );

        parentPanel.add(perfil, "card2");

        reloj.setBackground(new java.awt.Color(0, 51, 102));

        tx_fecha.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tx_fecha.setForeground(new java.awt.Color(255, 255, 0));
        tx_fecha.setText("DM/MM/YYYY");

        tx_hora.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tx_hora.setForeground(new java.awt.Color(255, 255, 0));
        tx_hora.setText("00:00:00");

        javax.swing.GroupLayout relojLayout = new javax.swing.GroupLayout(reloj);
        reloj.setLayout(relojLayout);
        relojLayout.setHorizontalGroup(
            relojLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(relojLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(tx_fecha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tx_hora)
                .addGap(40, 40, 40))
        );
        relojLayout.setVerticalGroup(
            relojLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, relojLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(relojLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tx_fecha)
                    .addComponent(tx_hora))
                .addGap(25, 25, 25))
        );

        jMenuBar1.setBackground(new java.awt.Color(204, 204, 0));
        jMenuBar1.setForeground(new java.awt.Color(0, 0, 0));
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuBar1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jMenuBar1.setFont(new java.awt.Font("Roboto", 3, 12)); // NOI18N
        jMenuBar1.setMargin(new java.awt.Insets(0, 40, 0, 0));
        jMenuBar1.setName(""); // NOI18N

        cartelera_b.setBackground(new java.awt.Color(204, 204, 0));
        cartelera_b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/favicon.png"))); // NOI18N
        cartelera_b.setText("Cartelera");
        cartelera_b.setFont(new java.awt.Font("Roboto", 3, 12)); // NOI18N
        cartelera_b.setMargin(new java.awt.Insets(10, 10, 10, 10));
        cartelera_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartelera_bActionPerformed(evt);
            }
        });

        jMenuItem1.setFont(new java.awt.Font("Roboto", 3, 12)); // NOI18N
        jMenuItem1.setText("Cartelera");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        cartelera_b.add(jMenuItem1);

        jMenuBar1.add(cartelera_b);

        boletos_b.setFont(new java.awt.Font("Roboto", 3, 12)); // NOI18N
        boletos_b.setLabel("Boletos");
        boletos_b.setMargin(new java.awt.Insets(10, 10, 10, 10));
        boletos_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boletos_bActionPerformed(evt);
            }
        });

        jMenuItem2.setText("Boletos");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        boletos_b.add(jMenuItem2);

        jMenuBar1.add(boletos_b);

        dulceria_b.setText("Dulceria");
        dulceria_b.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jMenuBar1.add(dulceria_b);

        promos_b.setText("Promos");
        promos_b.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jMenuBar1.add(promos_b);

        perfil_b.setText("Perfil");
        perfil_b.setFont(new java.awt.Font("Roboto", 3, 12)); // NOI18N
        perfil_b.setMargin(new java.awt.Insets(10, 10, 10, 10));
        perfil_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perfil_bActionPerformed(evt);
            }
        });

        jMenuItem3.setText("Perfil");
        jMenuItem3.setToolTipText("");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        perfil_b.add(jMenuItem3);

        jMenuBar1.add(perfil_b);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(parentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icon_cine, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(76, 76, 76))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(reloj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(icon_cine)
                                .addComponent(jLabel10))
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(reloj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(parentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void cartelera_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartelera_bActionPerformed
       
    }//GEN-LAST:event_cartelera_bActionPerformed

    private void boletos_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boletos_bActionPerformed
        
    }//GEN-LAST:event_boletos_bActionPerformed

    private void perfil_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perfil_bActionPerformed
   
    }//GEN-LAST:event_perfil_bActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        parentPanel.removeAll();
        parentPanel.add(cartelera);
        parentPanel.repaint();
        parentPanel.revalidate();
        System.out.println("Hola n=mundo");
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        parentPanel.removeAll();
        parentPanel.add(boletos);
        parentPanel.repaint();
        parentPanel.revalidate();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        parentPanel.removeAll();
        parentPanel.add(perfil);
        parentPanel.repaint();
        parentPanel.revalidate();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void inception_cMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inception_cMouseClicked
        System.out.println("Hola mundo");
        parentPanel.removeAll();
        parentPanel.add(boletos);
        parentPanel.repaint();
        parentPanel.revalidate();
    }//GEN-LAST:event_inception_cMouseClicked

    private void interestelar_cMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_interestelar_cMouseClicked
        System.out.println("Hola");
        parentPanel.removeAll();
        parentPanel.add(boletos);
        parentPanel.repaint();
        parentPanel.revalidate();
    }//GEN-LAST:event_interestelar_cMouseClicked

    private void mufasa_cMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mufasa_cMouseClicked
        System.out.println("Hi");
        parentPanel.removeAll();
        parentPanel.add(boletos);
        parentPanel.repaint();
        parentPanel.revalidate();
    }//GEN-LAST:event_mufasa_cMouseClicked
    
     
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
            java.util.logging.Logger.getLogger(InterfazCine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazCine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazCine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazCine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                java.awt.EventQueue.invokeLater(() -> new InterfazCine().setVisible(true));
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel boletos;
    private javax.swing.JMenu boletos_b;
    private javax.swing.JPanel cartelera;
    private javax.swing.JMenu cartelera_b;
    private javax.swing.JMenu dulceria_b;
    private javax.swing.JLabel icon_cine;
    private javax.swing.JLabel inception_c;
    private javax.swing.JLabel interestelar_c;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JLabel mufasa_c;
    private javax.swing.JPanel parentPanel;
    private javax.swing.JPanel perfil;
    private javax.swing.JMenu perfil_b;
    private javax.swing.JMenu promos_b;
    private javax.swing.JPanel reloj;
    private javax.swing.JLabel tx_fecha;
    private javax.swing.JLabel tx_hora;
    // End of variables declaration//GEN-END:variables

}

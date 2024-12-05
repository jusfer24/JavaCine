package componenteInterfaz;

import sistemacine.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import sistemacine.ListaUsuario;

public class InterfazCine extends javax.swing.JFrame {
    private Eventos eventos;
    private ListaEventos eventoSeleccionado;
    private ListaUsuario listaUsuario; 
    
    public InterfazCine() {
        this.eventos = new Eventos(); // Inicializar las funciones de cine.
        this.listaUsuario = new ListaUsuario();
        initComponents(); // Método autogenerado por NetBeans
        poblarComboBox(); // Llenar los JComboBox con los datos de ListaEventos
        JButton jButton1 = new JButton();
        JLabel jLabel1 = new JLabel();
        JLabel jLabel2 = new JLabel();
        JLabel jLabel3 = new JLabel();
        JScrollPane jScrollPane1 = new JScrollPane();
        JTextPane jTextPaneNombre = new JTextPane();
        JLabel jLabel4 = new JLabel();
        JLabel jLabel5 = new JLabel();
        JScrollPane jScrollPane2 = new JScrollPane();
        JTextPane jTextPaneCuenta = new JTextPane();
        JLabel jLabel6 = new JLabel();
        JScrollPane jScrollPane3 = new JScrollPane();
        JTextPane jTextPaneBoletos = new JTextPane();
        JTextArea jTextAreaFactura = new JTextArea();
        jComboBox1 = new javax.swing.JComboBox<>();
        
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>());
        
   
        // Botones para seleccionar funciones
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane3 = new javax.swing.JTextPane();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextPane4 = new javax.swing.JTextPane();
        jLabel10 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Logo.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel2.setFont(new java.awt.Font("Roboto", 3, 12)); // NOI18N
        jLabel2.setText("Prueba nustras funciones disponibles");

        jLabel3.setText("Que funcion desea?:");

        jScrollPane1.setViewportView(jTextPane1);

        jLabel4.setText("Ingrese su nombre:");

        jLabel5.setText("Ingrese el número de cuenta : ");

        jScrollPane2.setViewportView(jTextPane2);

        jLabel6.setText("Cuantos Boletos:  ");

        jScrollPane3.setViewportView(jTextPane3);

        jLabel7.setText("Primero ingrese sus datos, por favor:");

        jLabel9.setText("Ingrese su Cedula:");

        jScrollPane5.setViewportView(jTextPane4);

        jLabel10.setFont(new java.awt.Font("Roboto Black", 3, 24)); // NOI18N
        jLabel10.setText("CINE ANDINO");

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButton1.setText("Enviar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel10))
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(7, 7, 7)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        eventoNombre = (String) jComboBox1.getSelectedItem(); 
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      // Obtener el nombre seleccionado en el ComboBox
         eventoSeleccionado = eventos.getFunciones().get(2);
  
        // Obtener datos del cliente
        String nombre = jTextPane1.getText().trim();
        String cedulaTexto = jTextPane4.getText().trim();
        String cuentaTexto = jTextPane2.getText().trim();
        String boletosTexto = jTextPane3.getText().trim();
    
        
        if (nombre.isEmpty() || cuentaTexto.isEmpty() || boletosTexto.isEmpty() || cedulaTexto.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor complete todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        boolean usuarioAgregado = listaUsuario.agregarUsuario(nombre, cedulaTexto);
            if (!usuarioAgregado) {
            JOptionPane.showMessageDialog(this, "La cédula ya existe. No se puede agregar el usuario.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
        }
            
        try {
            int numeroCuenta = Integer.parseInt(cuentaTexto);
            int cantidadBoletos = Integer.parseInt(boletosTexto);

            if (cantidadBoletos <= 0 || cantidadBoletos > 5) {
                JOptionPane.showMessageDialog(null, "La cantidad de boletos debe estar entre 1 y 5.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if(validarcedula(cedulaTexto)==false){
               JOptionPane.showMessageDialog(null, "La cedula esta mal ingresada", "Error", JOptionPane.ERROR_MESSAGE);
              return;
            }
            if (!eventoSeleccionado.validarAsientos(cantidadBoletos)) {
                JOptionPane.showMessageDialog(this, "No hay suficientes asientos disponibles para el evento seleccionado.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            // Calculo del precio total
            double precioTotal = cantidadBoletos * eventoSeleccionado.getPrecio();
            eventoSeleccionado.reducirAsientos(cantidadBoletos);
            // Calculo del boleto y factura
          
            Boleto boleto = new Boleto(nombre, numeroCuenta, precioTotal, cantidadBoletos);
            VentaFinal factura = new VentaFinal(boleto, eventoSeleccionado);
 
            // Impresion en un JOptionPane para la factura 
             JOptionPane.showMessageDialog(this,
                "Factura generada correctamente.\n" +
                        "Evento: " + eventoSeleccionado.getNombre() + "\n" +
                        "Cliente: " + nombre + "\n" +
                        "Cedula: " + cedulaTexto + "\n" +        
                        "Cuenta: " + numeroCuenta + "\n" +
                        "Boletos: " + cantidadBoletos + "\n" +
                        "Total a pagar: $" + precioTotal + "\n" +
                        "Asientos restantes: " + eventoSeleccionado.getCapacidad(),
                "Éxito",
                JOptionPane.INFORMATION_MESSAGE);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "Por favor, ingrese números válidos para cuenta y boletos.", "Error", JOptionPane.ERROR_MESSAGE);
            }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            StringBuilder usuariosInfo = new StringBuilder();
        ArrayList<Usuario> usuarios = listaUsuario.getListaUsuarios(); // Necesitamos agregar un método getter

        if (usuarios.isEmpty()) {
        usuariosInfo.append("No hay usuarios registrados.");
         } else {
        for (Usuario usuario : usuarios) {
            usuariosInfo.append(usuario.toString()).append("\n");
        }
        }

    JOptionPane.showMessageDialog(this, usuariosInfo.toString(), "Usuarios Registrados", JOptionPane.INFORMATION_MESSAGE);
        
    }//GEN-LAST:event_jButton2ActionPerformed
    
    private void poblarComboBox() {
         // Poblar el ComboBox con las instancias de ListaEventos
        for (ListaEventos evento : ListaEventos.values()) {
            jComboBox1.addItem(evento.getNombre()); // Puedes usar evento directamente si el ComboBox almacena objetos.
        }

        // Agregar ActionListener para manejar la selección del ComboBox
        jComboBox1.addActionListener(e -> {
            int selectedIndex = jComboBox1.getSelectedIndex(); // Obtener el índice seleccionado
            if (selectedIndex >= 0) {
                eventoSeleccionado = ListaEventos.values()[selectedIndex]; // Obtener el evento seleccionado
                asienInfo = "Capacidad Disponible: " + eventoSeleccionado.getCapacidad() + " asientos.";
                JOptionPane.showMessageDialog(this,
                        "Seleccionaste:\n" + eventoSeleccionado.toString() + "\n" + asienInfo,
                        "Evento Seleccionado",
                        JOptionPane.INFORMATION_MESSAGE);
            }
            });
    }
    
    private boolean validarcedula(String cedulaTexto){
                // La cédula debe tener exactamente 10 caracteres
                if (cedulaTexto.length() != 10) {
                    return false;
                }

                // Verificar que todos los caracteres sean dígitos
                if (!cedulaTexto.matches("\\d+")) {
                    return false;
                }

                // Verificar que los dos primeros dígitos estén en el rango válido de provincias (00 a 24)
                int provincia = Integer.parseInt(cedulaTexto.substring(0, 2));
                if (provincia < 0 || provincia > 24) {
                    return false;
                }

                // Verificar que el tercer dígito sea menor a 6
                int tercerDigito = Character.getNumericValue(cedulaTexto.charAt(2));
                if (tercerDigito < 0 || tercerDigito > 5) {
                    return false;
                }

                // Coeficientes de verificación
                int[] coeficientes = {2, 1, 2, 1, 2, 1, 2, 1, 2};
                int suma = 0;

                // Calcular la suma con los coeficientes
                for (int i = 0; i < 9; i++) {
                    int digito = Character.getNumericValue(cedulaTexto.charAt(i));
                    int producto = digito * coeficientes[i];
                    if (producto > 9) {
                        producto -= 9;
                    }
                    suma += producto;
                }

                // Obtener el siguiente múltiplo de 10
                int siguienteMultiplo10 = ((suma + 9) / 10) * 10;
                int digitoVerificador = siguienteMultiplo10 - suma;

                // Verificar que el último dígito sea igual al dígito verificador
                int ultimoDigito = Character.getNumericValue(cedulaTexto.charAt(9));
                return digitoVerificador == ultimoDigito;

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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JTextPane jTextPane3;
    private javax.swing.JTextPane jTextPane4;
    // End of variables declaration//GEN-END:variables
    private int indice;
    private String eventoNombre;
    private String asienInfo;
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package la.tiendita;

import java.util.ArrayList;
import javax.swing.*;
import javax.swing.JOptionPane;
import javax.swing.UIManager;


/**
 *
 * @author dieez
 */
public class Pago extends javax.swing.JFrame {

    //Listas con los datos de la factura dependiendo del metodo de pago
    ArrayList<Factura> facturaEfectivo = new ArrayList<Factura>();
    ArrayList<Factura> facturaCheque = new ArrayList<Factura>();
    ArrayList<Factura> facturaCredito = new ArrayList<Factura>();
    
    //Envia los datos a la lista de efectivo
    public void DatosAEfectivo(){
        facturaEfectivo.add(new Factura(txtNombreProducto.getText(), 
                Integer.parseInt(txtCantidad.getText()),
                Float.parseFloat(txtPrecioIndividual.getText()),
                txtCliente.getText(),
                txtNit.getText(),
                Float.parseFloat(txtTotalPagar.getText())
        ));
    }
    
    //Envia los datos a la lista de credito
    public void DatosACredito(){
        facturaCredito.add(new Factura(txtNombreProducto.getText(), 
                Integer.parseInt(txtCantidad.getText()),
                Float.parseFloat(txtPrecioIndividual.getText()),
                txtCliente.getText(),
                txtNit.getText(),
                Float.parseFloat(txtTotalPagar.getText())
        ));
    }
    
    //Envia los datos a la lista de efectivo Cheque
    public void DatosACheque(){
        facturaCheque.add(new Factura(txtNombreProducto.getText(), 
                Integer.parseInt(txtCantidad.getText()),
                Float.parseFloat(txtPrecioIndividual.getText()),
                txtCliente.getText(),
                txtNit.getText(),
                Float.parseFloat(txtTotalPagar.getText())
        ));
    }
    /**
     * Creates new form Pago
     */
    public Pago() {
        initComponents();
        //Coloca la Aplicacion al centro de la pantalla
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FormaDePago = new javax.swing.ButtonGroup();
        jScrollBar1 = new javax.swing.JScrollBar();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCliente = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        txtFecha = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        txtNit = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtNombreProducto = new javax.swing.JTextField();
        txtTotalPagar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtPrecioIndividual = new javax.swing.JTextField();
        btnAceptar1 = new javax.swing.JButton();
        btnResetear = new javax.swing.JButton();
        jRadioEfectivo = new javax.swing.JRadioButton();
        jRadioCheque = new javax.swing.JRadioButton();
        jRadioCredito = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();

        jLabel8.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel8.setText("Factura");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Nombre del Cliente");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Total a pagar");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Nit");

        txtCliente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Fecha");

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel11.setText("Q.");

        txtNit.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtNit.setText("C/F");
        txtNit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNitActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Nombre del producto: ");

        txtTotalPagar.setText("0");
        txtTotalPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalPagarActionPerformed(evt);
            }
        });

        jLabel2.setText("Seleccione forma de pago: ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Cantidad:");

        txtCantidad.setText("0");
        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Precio Individual: ");

        jLabel13.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel13.setText("Q.");

        txtPrecioIndividual.setText("0");

        btnAceptar1.setText("Aceptar");
        btnAceptar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptar1ActionPerformed(evt);
            }
        });

        btnResetear.setText("Resetear");
        btnResetear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetearActionPerformed(evt);
            }
        });

        jRadioEfectivo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioEfectivo.setSelected(true);
        jRadioEfectivo.setText("Efectivo");
        jRadioEfectivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioEfectivoActionPerformed(evt);
            }
        });

        jRadioCheque.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioCheque.setText("Cheque*");
        jRadioCheque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioChequeActionPerformed(evt);
            }
        });

        jRadioCredito.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioCredito.setText("Crédito");
        jRadioCredito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioCreditoActionPerformed(evt);
            }
        });

        jButton1.setText("Cerrar Caja");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jRadioEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioCheque))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnResetear, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAceptar1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(70, 70, 70)
                                .addComponent(jRadioCredito)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(txtTotalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtPrecioIndividual, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtNit, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(64, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecioIndividual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addComponent(jLabel2)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioEfectivo)
                    .addComponent(jRadioCheque)
                    .addComponent(jRadioCredito))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnResetear)
                    .addComponent(btnAceptar1)
                    .addComponent(btnSalir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private JFrame frame;
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
       
         frame = new JFrame("Salir");
        if(JOptionPane.showConfirmDialog(frame,"Desea salir?","La Tiendita",
                JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
       System.exit(0);
    }
        
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClienteActionPerformed

    private void txtNitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNitActionPerformed

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadActionPerformed

    private void btnAceptar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptar1ActionPerformed
        // TODO add your handling code here:
        if (jRadioEfectivo.isSelected()){DatosAEfectivo();}
        else if (jRadioCredito.isSelected()){DatosACredito();}
        else if (jRadioCheque.isSelected()){DatosACheque();} 
        limpiarCasillas();
    }//GEN-LAST:event_btnAceptar1ActionPerformed

    private void limpiarCasillas(){
        //Los valores ingresaron serán reseteados para poder ingresar una nueva orden
        
        txtNombreProducto.setText(null);
        txtFecha.setDate(null);
        txtCantidad.setText("0");
        txtPrecioIndividual.setText("0");
        txtCliente.setText(null);
        txtNit.setText("C/F");
        txtTotalPagar.setText("0");        
        jRadioCheque.setSelected(false);
        jRadioCredito.setSelected(false);
        jRadioEfectivo.setSelected(true);
    }
    
    private void btnResetearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetearActionPerformed
           limpiarCasillas();
    }//GEN-LAST:event_btnResetearActionPerformed

    private void jRadioEfectivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioEfectivoActionPerformed
        
        if (jRadioEfectivo.isSelected())
            jRadioCheque.setSelected(false);
            jRadioCredito.setSelected(false); 
    }//GEN-LAST:event_jRadioEfectivoActionPerformed

    private void jRadioChequeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioChequeActionPerformed
        
         if(jRadioCheque.isSelected())
           jRadioCredito.setSelected(false);  
           jRadioEfectivo.setSelected(false); 
    }//GEN-LAST:event_jRadioChequeActionPerformed

    private void jRadioCreditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioCreditoActionPerformed
        
            if(jRadioCredito.isSelected())
           jRadioCheque.setSelected(false);
           jRadioEfectivo.setSelected(false);
    }//GEN-LAST:event_jRadioCreditoActionPerformed

    private void txtTotalPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalPagarActionPerformed
        
       
    }//GEN-LAST:event_txtTotalPagarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Cierre c = new Cierre();
        c.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pago().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup FormaDePago;
    private javax.swing.JButton btnAceptar1;
    private javax.swing.JButton btnResetear;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioCheque;
    private javax.swing.JRadioButton jRadioCredito;
    private javax.swing.JRadioButton jRadioEfectivo;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCliente;
    private com.toedter.calendar.JDateChooser txtFecha;
    private javax.swing.JTextField txtNit;
    private javax.swing.JTextField txtNombreProducto;
    private javax.swing.JTextField txtPrecioIndividual;
    private javax.swing.JTextField txtTotalPagar;
    // End of variables declaration//GEN-END:variables
}

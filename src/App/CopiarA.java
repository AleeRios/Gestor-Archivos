/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import java.awt.*;
import javax.swing.*;
import java.nio.file.*;
import java.io.*;

/**
 *
 * @author alebe
 */
public class CopiarA extends javax.swing.JFrame {

    /**
     * Creates new form CopiarA
     */
    public CopiarA() {
        super.setTitle("Copiar Archivo");
        super.getContentPane().setBackground(new Color(0,240,240));
        super.setResizable(false);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setVisible(true);
        initComponents();
        super.setLocationRelativeTo(null);
    }
    
    public void exit(){
        int x=JOptionPane.showConfirmDialog(null,"¿Desea salir?","Atencion",
        JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(x==0){
            this.dispose();
        }
    }
    
    public void regresa(){
        this.dispose();
        Panel p1=new Panel();
    }
    
    public void copiarArchivo(){
        if(txtRuta.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Seleccione Archivo");
        }else if(txtMov.getText().equals("")){
           JOptionPane.showMessageDialog(null,"Ingresa la ruta de copia"); 
        }else{
            Path ruta=Path.of(txtRuta.getText());
            Path copia=Path.of(txtMov.getText());
            try {
                Path copiar=Files.copy(ruta,copia.resolve(ruta.getFileName()),StandardCopyOption.REPLACE_EXISTING);
                JOptionPane.showMessageDialog(null,"Archivo copiado");
            } catch (IOException ex){JOptionPane.showMessageDialog(null,"Error al copiar");}
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbMov = new javax.swing.JLabel();
        txtMov = new javax.swing.JTextField();
        lbRuta = new javax.swing.JLabel();
        txtRuta = new javax.swing.JTextField();
        btnChoo = new javax.swing.JButton();
        btnReg = new javax.swing.JButton();
        btnSal = new javax.swing.JButton();
        btnAcep = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbMov.setText("Nueva ruta:");

        txtMov.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMovActionPerformed(evt);
            }
        });

        lbRuta.setText("Nombre/Ruta:");

        btnChoo.setText("...");
        btnChoo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChooActionPerformed(evt);
            }
        });

        btnReg.setText("Regresar");
        btnReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegActionPerformed(evt);
            }
        });

        btnSal.setText("Salir");
        btnSal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalActionPerformed(evt);
            }
        });

        btnAcep.setText("Aceptar");
        btnAcep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcepActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btnReg)
                        .addGap(96, 96, 96)
                        .addComponent(btnAcep, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSal, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lbMov)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtMov, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lbRuta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(btnChoo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbRuta)
                    .addComponent(txtRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnChoo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMov)
                    .addComponent(txtMov, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReg)
                    .addComponent(btnSal)
                    .addComponent(btnAcep))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMovActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMovActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMovActionPerformed

    private void btnChooActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChooActionPerformed
        // TODO add your handling code here:
        JFileChooser fc=new JFileChooser();
        int sel=fc.showOpenDialog(this);

        if(sel==JFileChooser.APPROVE_OPTION && txtRuta.getText().equals("")){
            File f1=fc.getSelectedFile();
            txtRuta.setText(f1.getAbsolutePath());
        }else{
            File f2=fc.getCurrentDirectory();
            txtMov.setText(f2.getAbsolutePath());
        }
    }//GEN-LAST:event_btnChooActionPerformed

    private void btnRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegActionPerformed
        // TODO add your handling code here:
        regresa();
    }//GEN-LAST:event_btnRegActionPerformed

    private void btnSalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalActionPerformed
        // TODO add your handling code here:
        exit();
    }//GEN-LAST:event_btnSalActionPerformed

    private void btnAcepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcepActionPerformed
        // TODO add your handling code here:
        copiarArchivo();
    }//GEN-LAST:event_btnAcepActionPerformed

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
            java.util.logging.Logger.getLogger(CopiarA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CopiarA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CopiarA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CopiarA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CopiarA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcep;
    private javax.swing.JButton btnChoo;
    private javax.swing.JButton btnReg;
    private javax.swing.JButton btnSal;
    private javax.swing.JLabel lbMov;
    private javax.swing.JLabel lbRuta;
    private javax.swing.JTextField txtMov;
    private javax.swing.JTextField txtRuta;
    // End of variables declaration//GEN-END:variables
}

 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.raiyugi.patientmanagementupdate2.view;

import com.raiyugi.patientmanagementupdate2.controller.PatientManagementApp;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author HS
 */
public class PatientManagerView extends javax.swing.JFrame {

    /**
     * Creates new form PatientManager
     */
    public PatientManagerView() {
        initComponents();
        jPanel2.setVisible(false);
        jPanel3.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        paymentDone = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        payFeesP = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        unpaidP = new javax.swing.JLabel();
        closePayment = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        conP = new javax.swing.JTextField();
        newOrderDone = new javax.swing.JButton();
        closeOrder = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        oderButton = new javax.swing.JButton();
        informationButton = new javax.swing.JButton();
        payment = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Patient Management App - To Bich Phuong - DE160476");
        setPreferredSize(new java.awt.Dimension(735, 450));
        setResizable(false);

        jButton4.setText("LOG OUT");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jPanel3.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel3.setDoubleBuffered(false);

        paymentDone.setText("Done!");
        paymentDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentDoneActionPerformed(evt);
            }
        });

        jLabel2.setText("PAYMENT");

        jLabel3.setText("Unpaid:");

        closePayment.setText("Close!");
        closePayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closePaymentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 28, Short.MAX_VALUE)
                        .addComponent(payFeesP, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(unpaidP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(closePayment)
                        .addGap(18, 18, 18)
                        .addComponent(paymentDone)
                        .addGap(20, 20, 20)))
                .addGap(33, 33, 33))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(117, 117, 117))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                    .addComponent(unpaidP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(payFeesP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(paymentDone)
                    .addComponent(closePayment))
                .addGap(21, 21, 21))
        );

        jPanel2.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.setName(""); // NOI18N

        jLabel1.setText("Condition:");

        newOrderDone.setText("Done!");
        newOrderDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newOrderDoneActionPerformed(evt);
            }
        });

        closeOrder.setText("Close!");
        closeOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeOrderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(closeOrder)
                        .addGap(18, 18, 18)
                        .addComponent(newOrderDone)))
                .addGap(55, 55, 55))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(conP, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(conP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newOrderDone)
                    .addComponent(closeOrder))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        oderButton.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        oderButton.setText("ORDER");
        oderButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        oderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oderButtonActionPerformed(evt);
            }
        });
        jLayeredPane1.add(oderButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 16, 255, 86));

        informationButton.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        informationButton.setText("INFORMATION");
        informationButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        informationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                informationButtonActionPerformed(evt);
            }
        });
        jLayeredPane1.add(informationButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(278, 16, 255, 86));

        payment.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        payment.setText("PAYMENT");
        payment.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        payment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentActionPerformed(evt);
            }
        });
        jLayeredPane1.add(payment, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 114, 255, 88));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(551, 551, 551)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jPanel2, jPanel3});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void oderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oderButtonActionPerformed
        if (PatientManagementApp.getP().getMedicalDiary().get(PatientManagementApp.getP().sMD()).isStt())
            jPanel2.setVisible(true);
        else JOptionPane.showMessageDialog(null,"Your Order: "+PatientManagementApp.getP().getMedicalDiary().get(PatientManagementApp.getP().sMD()).getNo());
    }//GEN-LAST:event_oderButtonActionPerformed

    private void informationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_informationButtonActionPerformed
        ShowInformationView information = new ShowInformationView();
        information.pack();
        information.setLocationRelativeTo(null);
        information.setVisible(true);
    }//GEN-LAST:event_informationButtonActionPerformed

    private void paymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentActionPerformed
        jPanel3.setVisible(true);
        unpaidP.setText(String.valueOf(PatientManagementApp.getP().getMedicalDiary().get(PatientManagementApp.getP().sMD()).getUnpaid()));
    }//GEN-LAST:event_paymentActionPerformed

    private void paymentDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentDoneActionPerformed
        int pos = PatientManagementApp.getP().sMD();
        if (payFeesP.getText().isEmpty() || !payFeesP.getText().matches("[0-9]+") || Long.parseLong(payFeesP.getText())> PatientManagementApp.getP().getMedicalDiary().get(pos).getUnpaid() || Long.parseLong(payFeesP.getText())<=0) 
            JOptionPane.showMessageDialog(null,"Input invalid. Please complete information!!!","Error",JOptionPane.ERROR_MESSAGE);
        else{
            PatientManagementApp.getP().getMedicalDiary().get(pos).setUnpaid(PatientManagementApp.getP().getMedicalDiary().get(pos).getUnpaid()-Long.parseLong(payFeesP.getText()));
            try {
                PatientManagementApp.getP().update(PatientManagementApp.getPatients());
            } catch (IOException ex) {
                Logger.getLogger(PatientManagerView.class.getName()).log(Level.SEVERE, null, ex);
            }
            jPanel3.setVisible(false);
        }
    }//GEN-LAST:event_paymentDoneActionPerformed

    private void closePaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closePaymentActionPerformed
        jPanel3.setVisible(false);
    }//GEN-LAST:event_closePaymentActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        LoginView loginFrame = new LoginView();
        loginFrame.pack();
        loginFrame.setLocationRelativeTo(null);
        loginFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void closeOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeOrderActionPerformed
        jPanel2.setVisible(false);
    }//GEN-LAST:event_closeOrderActionPerformed

    private void newOrderDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newOrderDoneActionPerformed
        if (conP.getText().equals("") || !conP.getText().matches("^[\\.a-zA-Z0-9,!? ]*$")) 
            JOptionPane.showMessageDialog(null,"Input invalid. Please complete information!!!","Error",JOptionPane.ERROR_MESSAGE);
        else {
            try {
                int no = PatientManagementApp.getP().newOrder(conP.getText());
                JOptionPane.showMessageDialog(null,"Your new order: "+no,"Success",JOptionPane.INFORMATION_MESSAGE);
            } catch (IOException ex) {
                Logger.getLogger(PatientManagerView.class.getName()).log(Level.SEVERE, null, ex);
            }
            jPanel2.setVisible(false);
        }     
    }//GEN-LAST:event_newOrderDoneActionPerformed

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
            java.util.logging.Logger.getLogger(PatientManagerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientManagerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientManagerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientManagerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
            
        //</editor-fold>

        //</editor-fold>

        //</editor-fold>

        //</editor-fold>

        //</editor-fold>

        //</editor-fold>

        //</editor-fold>

        //</editor-fold>

        //</editor-fold>

        //</editor-fold>

        //</editor-fold>

        //</editor-fold>

        //</editor-fold>

        //</editor-fold>

        //</editor-fold>

        //</editor-fold>

        //</editor-fold>

        //</editor-fold>

        //</editor-fold>

        //</editor-fold>

        //</editor-fold>

        //</editor-fold>

        //</editor-fold>

        //</editor-fold>

        //</editor-fold>

        //</editor-fold>

        //</editor-fold>

        //</editor-fold>

        //</editor-fold>

        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeOrder;
    private javax.swing.JButton closePayment;
    private javax.swing.JTextField conP;
    private javax.swing.JButton informationButton;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton newOrderDone;
    private javax.swing.JButton oderButton;
    private javax.swing.JTextField payFeesP;
    private javax.swing.JButton payment;
    private javax.swing.JButton paymentDone;
    private javax.swing.JLabel unpaidP;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.raiyugi.patientmanagementupdate2.view;

import com.raiyugi.patientmanagementupdate2.controller.PatientManagementApp;
import com.raiyugi.patientmanagementupdate2.model.Medicine;
import com.raiyugi.patientmanagementupdate2.model.Prescription;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author HS
 */
public class EditView extends javax.swing.JFrame {
    
    /**
     * Creates new form Edit
     */
    public EditView() {
        initComponents();
        List.showListMedicine(PatientManagementApp.getD().getMedicines());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jScrollPane3 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        complete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        medicineListP = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        diagnose = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        presListP = new javax.swing.JList<>();
        medicineAmountP = new javax.swing.JTextField();
        addM = new javax.swing.JButton();
        removeM = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        close = new javax.swing.JButton();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jMenuItem1.setText("jMenuItem1");

        jScrollPane3.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Patient Management App");
        setResizable(false);

        complete.setText("Complete");
        complete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                completeActionPerformed(evt);
            }
        });

        medicineListP.setModel(com.raiyugi.patientmanagementupdate2.view.List.model1);
        medicineListP.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        medicineListP.setToolTipText("");
        jScrollPane1.setViewportView(medicineListP);

        jLabel5.setText("Diagnose:");

        jLabel6.setText("Prescription:");

        diagnose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diagnoseActionPerformed(evt);
            }
        });

        presListP.setModel(com.raiyugi.patientmanagementupdate2.view.List.model2);
        presListP.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        presListP.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                presListPComponentHidden(evt);
            }
        });
        jScrollPane2.setViewportView(presListP);

        addM.setText("ADD");
        addM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMActionPerformed(evt);
            }
        });

        removeM.setText("REMOVE");
        removeM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeMActionPerformed(evt);
            }
        });

        jLabel3.setText("Amount:");

        close.setText("Close");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(medicineAmountP, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(removeM, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                            .addComponent(addM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(32, 32, 32)
                        .addComponent(diagnose, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(complete, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(198, 198, 198))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {diagnose, jScrollPane2});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(diagnose, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(addM)
                        .addComponent(medicineAmountP, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(removeM)
                        .addGap(0, 102, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(complete)
                    .addComponent(close))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void completeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_completeActionPerformed
        if (!diagnose.getText().matches("^[\\.a-zA-Z0-9,!? ]*$") || diagnose.getText().isEmpty() || PatientManagementApp.getmTemp().size() == 0)
             JOptionPane.showMessageDialog(null,"Input invalid. Please complete information!!!","Error",JOptionPane.ERROR_MESSAGE);
         else {
            try {
                
                PatientManagementApp.getD().updateMedicine();
            } catch (IOException ex) {
                Logger.getLogger(EditView.class.getName()).log(Level.SEVERE, null, ex);
            }
             this.dispose();
             
            try {
                PatientManagementApp.getD().updateMedicalDiaryP(diagnose.getText(), PatientManagementApp.getmTemp());
            } catch (IOException ex) {
                Logger.getLogger(EditView.class.getName()).log(Level.SEVERE, null, ex);
            }
             JOptionPane.showMessageDialog(null,"Success!!!");
         }
    }//GEN-LAST:event_completeActionPerformed

    private void presListPComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_presListPComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_presListPComponentHidden

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        try {
            PatientManagementApp.getD().listMedicines();
        } catch (RuntimeException ex) {
            Logger.getLogger(EditView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EditView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EditView.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_closeActionPerformed

    private void addMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMActionPerformed
        Medicine m = new Medicine();
        int amount = Integer.parseInt(medicineAmountP.getText());
        int selected=medicineListP.getSelectedIndex();
        if (selected <0 || medicineAmountP.getText().isEmpty() || amount<=0) 
            JOptionPane.showMessageDialog(null,"Invalid Input!!!","Error",JOptionPane.ERROR_MESSAGE);
        else if (PatientManagementApp.getD().getMedicines().get(selected).getVolume() < amount){
            JOptionPane.showMessageDialog(null,"The amount of medicine is not enough!!!","Error",JOptionPane.ERROR_MESSAGE);
        }
        else {
            PatientManagementApp.getD().editUpdatePrescription(m, selected, amount);
        }
    }//GEN-LAST:event_addMActionPerformed

    private void removeMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeMActionPerformed
        int x = presListP.getSelectedIndex();
        PatientManagementApp.getP().removeMedicineForPrescriptionP(x);
        PatientManagementApp.getmTemp().remove(x);
    }//GEN-LAST:event_removeMActionPerformed

    private void diagnoseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diagnoseActionPerformed

    }//GEN-LAST:event_diagnoseActionPerformed
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
            java.util.logging.Logger.getLogger(EditView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
    private javax.swing.JButton addM;
    private javax.swing.JButton close;
    private javax.swing.JButton complete;
    private javax.swing.JTextField diagnose;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField medicineAmountP;
    private javax.swing.JList<String> medicineListP;
    private javax.swing.JList<String> presListP;
    private javax.swing.JButton removeM;
    // End of variables declaration//GEN-END:variables
}

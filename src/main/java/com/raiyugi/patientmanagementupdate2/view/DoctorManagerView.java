/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.raiyugi.patientmanagementupdate2.view;

import com.raiyugi.patientmanagementupdate2.controller.PatientManagementApp;
import com.raiyugi.patientmanagementupdate2.model.Doctor;
import com.raiyugi.patientmanagementupdate2.model.Medicine;
import com.raiyugi.patientmanagementupdate2.model.Patient;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author HS
 */
public class DoctorManagerView extends javax.swing.JFrame {
    
    /**
     * Creates new form DoctorManager
     */
    public DoctorManagerView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        editButton = new javax.swing.JButton();
        reloadButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        addNewMedicine = new javax.swing.JButton();
        showInfo = new javax.swing.JButton();
        logOut = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        search = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Patient Management App - To Bich Phuong - DE160476");
        setResizable(false);

        editButton.setText("EDIT");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        reloadButton.setText("RELOAD");
        reloadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reloadButtonActionPerformed(evt);
            }
        });

        saveButton.setText("SAVE");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        addNewMedicine.setText("ADD NEW MEDICINE");
        addNewMedicine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewMedicineActionPerformed(evt);
            }
        });

        showInfo.setText("SHOW INFORMATION");
        showInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showInfoActionPerformed(evt);
            }
        });

        logOut.setText("LOG OUT");
        logOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(logOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(showInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(saveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(reloadButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addNewMedicine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(editButton)
                .addGap(46, 46, 46)
                .addComponent(addNewMedicine)
                .addGap(50, 50, 50)
                .addComponent(reloadButton)
                .addGap(50, 50, 50)
                .addComponent(saveButton)
                .addGap(50, 50, 50)
                .addComponent(showInfo)
                .addGap(50, 50, 50)
                .addComponent(logOut)
                .addGap(36, 36, 36))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {editButton, reloadButton, saveButton});

        jTable1.setModel(com.raiyugi.patientmanagementupdate2.view.Table.model);
        jScrollPane2.setViewportView(jTable1);

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(914, 914, 914)
                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchButton))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(910, 910, 910))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(search)
                    .addComponent(searchButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void reloadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reloadButtonActionPerformed
        try {
            Table.tbDoctorManager();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DoctorManagerView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_reloadButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        try {
            PatientManagementApp.getD().updatePatients();
        } catch (IOException ex) {
            Logger.getLogger(DoctorManagerView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        if (jTable1.getSelectedRowCount()==1){
            if (PatientManagementApp.getD().getPatients().get(jTable1.getSelectedRow()).getMedicalDiary().get(PatientManagementApp.getD().getPatients().get(jTable1.getSelectedRow()).sMD()).isStt()) 
                JOptionPane.showMessageDialog(null,"Patient information has been edited");
            else{
                try {
                PatientManagementApp.setmTemp(new ArrayList<Medicine>());
            } catch (RuntimeException ex) {
                Logger.getLogger(DoctorManagerView.class.getName()).log(Level.SEVERE, null, ex);
            }
            List.model1.clear();
            List.model2.clear();
            EditView editPatient = new EditView();
            editPatient.pack();
            editPatient.setLocationRelativeTo(null);
            editPatient.setVisible(true);
            PatientManagementApp.setPosP(jTable1.getSelectedRow());
            Table.setSelectRow(jTable1.getSelectedRow());
                }
        }
        else JOptionPane.showMessageDialog(null,"Press a row to edit!"); 
    }//GEN-LAST:event_editButtonActionPerformed

    private void addNewMedicineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewMedicineActionPerformed
        AddNewMedicineView addNewMedicine = new AddNewMedicineView();
        addNewMedicine.pack();
        addNewMedicine.setLocationRelativeTo(null);
        addNewMedicine.setVisible(true);
    }//GEN-LAST:event_addNewMedicineActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        ArrayList<Patient> p = new ArrayList();
        p = Doctor.search(search.getText());
        if (p.size()>0){
            try {
                SearchView searchPatient = new SearchView();
                searchPatient.pack();
                searchPatient.setLocationRelativeTo(null);
                searchPatient.setVisible(true);
                try {
                    Table.tbInformationInDoctorManager(p);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(DoctorManagerView.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(DoctorManagerView.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else JOptionPane.showMessageDialog(null,"Not Found!!","Invalid",JOptionPane.ERROR_MESSAGE);
        
    }//GEN-LAST:event_searchButtonActionPerformed

    private void showInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showInfoActionPerformed
        if (jTable1.getSelectedRowCount() == 1){
            PatientManagementApp.setPosP(jTable1.getSelectedRow());
            ShowInformationView information = new ShowInformationView();
            information.pack();
            information.setLocationRelativeTo(null);
            information.setVisible(true);
        }
        else JOptionPane.showMessageDialog(null,"Press a row to show information!");
    }//GEN-LAST:event_showInfoActionPerformed

    private void logOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutActionPerformed
        LoginView loginFrame = new LoginView();
        loginFrame.pack();
        loginFrame.setLocationRelativeTo(null);
        loginFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logOutActionPerformed

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
            java.util.logging.Logger.getLogger(DoctorManagerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoctorManagerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoctorManagerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoctorManagerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JButton addNewMedicine;
    private javax.swing.JButton editButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton logOut;
    private javax.swing.JButton reloadButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField search;
    private javax.swing.JButton searchButton;
    private javax.swing.JButton showInfo;
    // End of variables declaration//GEN-END:variables
}
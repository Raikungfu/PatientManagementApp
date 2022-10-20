/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raiyugi.patientmanagementupdate2.view;


import com.raiyugi.patientmanagementupdate2.controller.PatientManagementApp;
import com.raiyugi.patientmanagementupdate2.model.Patient;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HS
 */
public class Table extends AbstractTableModel{
    private String[] columns;
    private Object[][] rows;
    public static DefaultTableModel model = new DefaultTableModel();
    public static DefaultTableModel model1 = new DefaultTableModel();
    private static int selectRow;
    public static void showResult(Patient p, DefaultTableModel modelTemp){
        int pos = p.sMD();
        if (p.getMedicalDiary().get(pos).isStt()){
            modelTemp.addRow(new Object[]{
            p.getMedicalDiary().get(pos).getNo(), p.getName(), p.getSex(), p.getDateOfBirthStr(), p.getMedicalDiary().get(pos).getCondition(), p.getMedicalDiary().get(pos).getDiagnose(), p.getMedicalDiary().get(pos).getPrescription(), p.getInsuranceNo(), p.getMedicalDiary().get(pos), p.getMedicalDiary().get(pos).getUnpaid(), p.getMedicalDiary().get(pos).isStt()
        });
        }else{
            modelTemp.addRow(new Object[]{
            p.getMedicalDiary().get(pos).getNo(), p.getName(), p.getSex(), p.getDateOfBirthStr(), p.getMedicalDiary().get(pos).getCondition(), "", "", p.getInsuranceNo(), p.getMedicalDiary().get(pos).toString(), p.getMedicalDiary().get(pos).getUnpaid(), p.getMedicalDiary().get(pos).isStt()
        });
        }
    }
    public static void createTable(ArrayList<Patient> p, DefaultTableModel modelTemp) throws FileNotFoundException{
        modelTemp.setColumnIdentifiers(new Object[]{
             "No.", "NAME", "SEX", "DATE OF BIRTH", "CONDITION", "DIAGNOSE", "PRESCRIPTION","INSURANCE NUMBER", "MEDICAL DIARY", "UNPAID FEES", "STT"
        });
        for (int i=0; i<p.size(); i++){
            showResult(p.get(i), modelTemp);
        }
    }
    public static void tbDoctorManager() throws FileNotFoundException{
        model.setRowCount(0);
        createTable(PatientManagementApp.getD().getPatients(),model);
    }
    public static void tbInformationInDoctorManager(ArrayList<Patient> p) throws FileNotFoundException{
        model1.setRowCount(0);
        createTable(p, model1);
    }
    @Override
    public int getRowCount() {
        return this.rows.length;
    }
    @Override
    public int getColumnCount() {
        return this.columns.length;
    }

    public static int getSelectRow() {
        return selectRow;
    }

    public static void setSelectRow(int selectRow) {
        Table.selectRow = selectRow;
    }
    
    @Override
    public Object[] getValueAt(int rowIndex, int columnIndex) {
        return this.rows[rowIndex];
    }
    
}

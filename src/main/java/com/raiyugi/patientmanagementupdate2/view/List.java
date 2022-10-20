/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raiyugi.patientmanagementupdate2.view;

import com.raiyugi.patientmanagementupdate2.controller.PatientManagementApp;
import com.raiyugi.patientmanagementupdate2.model.MedicalDiary;
import com.raiyugi.patientmanagementupdate2.model.Medicine;
import com.raiyugi.patientmanagementupdate2.model.Patient;
import java.util.ArrayList;
import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;

/**
 *
 * @author HS
 */
public class List {
    public static DefaultListModel model1 = new DefaultListModel();
    public static DefaultListModel model2 = new DefaultListModel();
    public static DefaultListModel model3 = new DefaultListModel();
    private static ArrayList<Medicine> mL;
    public static void showListM(ArrayList<Medicine> mL, DefaultListModel modelTemp){
        if (mL!=null){
            for (int i=0; i<mL.size();i++)
            modelTemp.addElement(i+1+". "+mL.get(i));
        }
        
    }
    public static void showListMD(ArrayList<MedicalDiary> mdL, DefaultListModel modelTemp){
        for (int i=0; i<mdL.size();i++)
            modelTemp.addElement(i+1+". "+mdL.get(i));
    }
    public static void showInfoPresP(Patient p, int pos){
        model1.clear();
        showListM(p.getMedicalDiary().get(pos).getPrescription().getPrescription(),model1);
    }
    public static void showInfoMDP(Patient p){
        model2.clear();
        showListMD(p.getMedicalDiary(),model2);
    }
    public static void showListMedicine(ArrayList<Medicine> mL){
        model1.clear();
        showListM(mL,model1);
    }
    public static void showListMedicinePatient(ArrayList<Medicine> mP){
        model2.clear();
        showListM(mP,model2);
    }
}

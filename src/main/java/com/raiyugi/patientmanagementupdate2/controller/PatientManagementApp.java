/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raiyugi.patientmanagementupdate2.controller;

import com.raiyugi.patientmanagementupdate2.model.*;
import com.raiyugi.patientmanagementupdate2.view.LoginView;
import java.util.ArrayList;

/**
 *
 * @author HS
 */
public class PatientManagementApp {
    private static Doctor d, temp;
    private static ArrayList<Patient> patients;
    private static int posP;
    private static ArrayList<Medicine> mTemp;
    public static Patient getP() {
        return patients.get(posP);
    }

    public static Doctor getD() {
        return d;
    }

    public static void setD(Doctor d) {
        PatientManagementApp.d = d;
    }

    public static ArrayList<Patient> getPatients() {
        return patients;
    }

    public static void setPatients(ArrayList<Patient> patients) {
        PatientManagementApp.patients = patients;
    }

    public static int getPosP() {
        return posP;
    }

    public static void setPosP(int posP) {
        PatientManagementApp.posP = posP;
    }

    public static Doctor getTemp() {
        return temp;
    }

    public static void setTemp(Doctor temp) {
        PatientManagementApp.temp = temp;
    }

    public static ArrayList<Medicine> getmTemp() {
        return mTemp;
    }

    public static void setmTemp(ArrayList<Medicine> mTemp) {
        PatientManagementApp.mTemp = mTemp;
    }
    
    public static void main(String[] args) {
        LoginView loginFrame = new LoginView();
        loginFrame.pack();
        loginFrame.setLocationRelativeTo(null);
        loginFrame.setVisible(true);
    }

}

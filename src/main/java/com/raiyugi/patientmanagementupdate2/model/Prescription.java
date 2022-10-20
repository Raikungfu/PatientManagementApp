/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raiyugi.patientmanagementupdate2.model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author HS
 */
public class Prescription implements Serializable{
    private ArrayList<Medicine> prescription;
    private long fees;
    private static final long serialVersionUID = 2208202140779L;

    public Prescription() {
        setPrescription(new ArrayList<Medicine>());
    }
    
    @Override
    public String toString() {
        String s = "";
        if (prescription!=null){
            for (int i=0; i<prescription.size(); i++)
                s += (i+1)+". "+prescription.get(i).toString()+", ";
        s += ". Sum fees: "+ String.valueOf(fees);
        return s;
        }
        else return "No data yet"; 
    }
    
    public ArrayList<Medicine> getPrescription() {
        return prescription;
    }

    public void setPrescription(ArrayList<Medicine> prescription) {
        this.prescription = prescription;
    }

    public long getFees() {
        return fees;
    }

    public void setFees(long fees) {
        this.fees = fees;
    }
    
    public void calFees(Patient p){
        long sum=0;
        if (getPrescription()!=null){
            for (int i=0; i<getPrescription().size(); i++){
                sum += getPrescription().get(i).getCost()*getPrescription().get(i).getVolume();
            }
            if (p.getInsuranceNo()!=null)
                sum = sum*20/100;
            setFees(sum);
            return;
        }
        else setFees(sum); 
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raiyugi.patientmanagementupdate2.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;  
import java.util.Date;

/**
 *
 * @author HS
 */
public class MedicalDiary extends Patient implements Serializable{
    private int no;
    private String nameOfDoctor, specOfDoctor;
    private Date dateAndTime;
    private String  condition, diagnose;
    private Prescription prescription;
    private long unpaid;
    private boolean stt;
    private static final long serialVersionUID = 2208202140779L;
    public MedicalDiary() {
    }

    public MedicalDiary(String condition, boolean stt) {
        setPrescription(new Prescription());
        this.condition = condition;
        this.stt = stt;
    }
    
    public MedicalDiary(int no, String condition, boolean stt, long unpaid) {
        setPrescription(new Prescription());
        this.condition = condition;
        this.no = no;
        this.stt = stt;
        this.unpaid = unpaid;
    }

    @Override
    public String toString() {
        this.getPrescription().calFees(this);
        return dateAndTime + ": " + "Doctor:" + nameOfDoctor + "-" + specOfDoctor + ", condition: " + condition + ", diagnose: " + diagnose + ", prescription: " + prescription + ", stt: " + stt;
    }
    
    
    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getDiagnose() {
        return diagnose;
    }

    public void setDiagnose(String diagnose) {
        this.diagnose = diagnose;
    }

    public boolean isStt() {
        return stt;
    }

    public void setStt(boolean stt) {
        this.stt = stt;
    }

    public String getNameOfDoctor() {
        return nameOfDoctor;
    }

    public void setNameOfDoctor(String nameOfDoctor) {
        this.nameOfDoctor = nameOfDoctor;
    }

    public String getSpecOfDoctor() {
        return specOfDoctor;
    }

    public void setSpecOfDoctor(String specOfDoctor) {
        this.specOfDoctor = specOfDoctor;
    }

    public Date getDateAndTime() {
        return new java.util.Date();
    }

    public void setDateAndTime(Date dateAndTime) {
        this.dateAndTime = dateAndTime;
    }

    public Prescription getPrescription() {
        return prescription;
    }
    
    

    public void setPrescription(Prescription prescription) {
        this.prescription = prescription;
    }

    public long getUnpaid() {
        return unpaid;
    }

    public void setUnpaid(long unpaid) {
        this.unpaid = unpaid;
    }
    
}

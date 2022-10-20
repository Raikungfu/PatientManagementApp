/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raiyugi.patientmanagementupdate2.model;

import com.raiyugi.patientmanagementupdate2.controller.PatientManagementApp;
import com.raiyugi.patientmanagementupdate2.view.Table;
import com.raiyugi.patientmanagementupdate2.view.List;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.*;

/**
 *
 * @author HS
 */
public class Doctor extends Person<Doctor> implements FileData, Serializable{
    private String name, spec;
    transient private static ArrayList<Patient> patients;
    transient private static ArrayList<Medicine> medicines;
    private static final long serialVersionUID = 2208202140779L;
    
    public Doctor() {
    }
    
    public Doctor(String id, String pw, String name, String spec){
        this.id = id;
        this.pw = pw;
        setName(name);
        setSpec(spec);
    }
    
    public Doctor(Doctor d){
        this.id = d.id;
        this.pw = d.pw;
        this.name = d.name;
        this.spec = d.spec;
    }
    public Doctor(String[] p) {
    }
    
    public static void editUpdatePrescription(Medicine m, int selected, int amount){
        int x = PatientManagementApp.getD().getMedicines().get(selected).search();
            PatientManagementApp.getD().getMedicines().get(selected).setVolume(PatientManagementApp.getD().getMedicines().get(selected).getVolume() - amount);  
            List.showListMedicine(PatientManagementApp.getD().getMedicines());
            if (x<0){
                m = new Medicine( PatientManagementApp.getD().getMedicines().get(selected));
                m.setVolume(amount);
                PatientManagementApp.getmTemp().add(m);
                PatientManagementApp.getP().addNewMedicineForPrescriptionP(m);
            }
            else{
                PatientManagementApp.getmTemp().get(x).setVolume(PatientManagementApp.getmTemp().get(x).getVolume() + amount);
                List.showListMedicinePatient(PatientManagementApp.getmTemp());
            }
    }
    public static ArrayList<Patient> search(String s){
        ArrayList<Patient> result = new ArrayList<Patient>();
        patients.forEach(p -> {
            if (p.getId().equals(s) || p.getTel().equals(s) || p.getName().equals(s) || p.getInsuranceNo().equals(s)){
                result.add(p);
            }
        });
        return result;
    }
    
    public void sort(){
        patients.sort((p1, p2) -> {
        if (p1.getMedicalDiary().get(p1.sMD()).isStt() != p2.getMedicalDiary().get(p2.sMD()).isStt()){
            if (p1.getMedicalDiary().get(p1.sMD()).isStt() ) return 1;
            else return -1;
        } else {
            return p1.getMedicalDiary().get(p1.sMD()).getNo() > p2.getMedicalDiary().get(p2.sMD()).getNo() ? 1 : -1;
        }});
    }
    
    public void listMedicines() throws RuntimeException, IOException, ClassNotFoundException{
        FileInputStream fis = new FileInputStream(PathMedicine);
        ObjectInputStream input;
        ArrayList<Medicine> d = new ArrayList<>();
        while (true) {
            try {
                input = new ObjectInputStream(fis);
                Medicine obj = (Medicine) input.readObject();
                d.add(obj);
                } catch (EOFException e) {
                fis.close();
                medicines = d;
                medicines.sort((m1, m2)-> m1.getName().compareTo(m2.getName()));
                return;
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public static void updatePatients() throws IOException{
        new Patient().update(getPatients());
    }
    public void addNewMedicine(Medicine m) throws IOException{
        medicines.add(m);
        saveNewMedicine(m);
    }
    public void saveNewMedicine(Medicine m) throws IOException{
        Person.AppendObjectOutputStream fos = new Person.AppendObjectOutputStream(Medicine); 
        fos.writeObject(m);
        fos.flush();
        fos.close();
    }
    public void updateMedicine() throws IOException{
        File f = new File(PathMedicine);
        f.delete();
        f.createNewFile();
        for (int i=0; i<getMedicines().size(); i++){
            saveNewMedicine(getMedicines().get(i));
        }
    }
    
    public static ArrayList<Patient> getPatients() {
        return patients;
    }

    public static void setPatients(ArrayList<Patient> patients) {
        Doctor.patients = patients;
    }
    
    public static void reloadPatients() throws RuntimeException, IOException, ClassNotFoundException{
        Doctor.patients = new Patient().readFile();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }
    
    public static ArrayList<com.raiyugi.patientmanagementupdate2.model.Medicine> getMedicines() {
        return medicines;
    }

    public static void setMedicines(ArrayList<com.raiyugi.patientmanagementupdate2.model.Medicine> medicines) {
        Doctor.medicines = medicines;
    }
    

    @Override
    public ArrayList<Doctor> readFile() throws RuntimeException, IOException, ClassNotFoundException{
        FileInputStream fis = new FileInputStream(PathLoginDoctor);
        ObjectInputStream input;
        ArrayList<Doctor> d = new ArrayList<>();
        boolean cont = true;
        while (cont) {
            try {
                input = new ObjectInputStream(fis);
                Doctor obj = (Doctor) input.readObject();
                d.add(obj);
                } catch (EOFException e) {
                fis.close();
                return d;
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
        return d;
    }

    @Override
    public void saveAppendFile() throws RuntimeException, IOException{
        AppendObjectOutputStream fos = new AppendObjectOutputStream(LoginDoctor); 
        fos.writeObject(this);
        fos.flush();
        fos.close();
    }


    @Override
    public boolean login() throws FileNotFoundException, RuntimeException, IOException, ClassNotFoundException{
        ArrayList<Doctor> doctors = new Doctor().readFile();
        for (int i=0; i<doctors.size(); i++){
            if (doctors.get(i).getId().equals(this.id) && doctors.get(i).getPw().equals(this.pw)){
                setName(doctors.get(i).getName());
                setSpec(doctors.get(i).getSpec());
                setPatients(new Patient().readFile());
                this.sort();
                this.listMedicines();
                return true;
            }
        }
        return false;
    }
    public void updateMedicalDiaryP(String diagnose, ArrayList<Medicine> m) throws IOException{
        Patient p = PatientManagementApp.getD().getPatients().get(PatientManagementApp.getPosP());
        p.getMedicalDiary().get(p.sMD()).setDiagnose(diagnose);
        p.getMedicalDiary().get(p.sMD()).getPrescription().setPrescription(m);
        p.getMedicalDiary().get(p.sMD()).setNameOfDoctor(this.getName());
        p.getMedicalDiary().get(p.sMD()).setSpecOfDoctor(this.getSpec());
        p.getMedicalDiary().get(p.sMD()).setDateAndTime(p.getMedicalDiary().get(p.sMD()).getDateAndTime());
        p.getMedicalDiary().get(p.sMD()).setStt(true);
        p.getMedicalDiary().get(p.sMD()).getPrescription().calFees(p);
        if (p.sMD()>0)
            p.getMedicalDiary().get(p.sMD()).setUnpaid(p.getMedicalDiary().get(p.sMD()-1).getUnpaid()+p.getMedicalDiary().get(p.sMD()).getPrescription().getFees());
        else
            p.getMedicalDiary().get(p.sMD()).setUnpaid(p.getMedicalDiary().get(p.sMD()).getPrescription().getFees());
        PatientManagementApp.getD().getPatients().add(p);
        PatientManagementApp.getD().getPatients().remove(PatientManagementApp.getPosP());
        this.updatePatients();
        Table.tbDoctorManager();
    }   
    @Override
    public void overWriteFile() throws IOException {
        
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raiyugi.patientmanagementupdate2.model;
/**
 *
 * @author HS
 */

import com.raiyugi.patientmanagementupdate2.controller.PatientManagementApp;
import com.raiyugi.patientmanagementupdate2.view.List;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Patient extends Person<Patient> implements FileData, Serializable{
    private String name, sex;
    private String tel;
    private Date dateOfBirth;
    private String insuranceNo;
    private ArrayList<MedicalDiary> medicalDiary;
    private static final long serialVersionUID = 2208202140779L;
    public Patient (){
    }

    public Patient(Patient p) {
        this.name = p.name;
        this.sex = p.sex;
        this.tel = p.tel;
        this.dateOfBirth = p.dateOfBirth;
        this.insuranceNo = p.insuranceNo;
        this.medicalDiary = p.medicalDiary;
    }
    
    public Patient (String id, String tel){
        this.id = id;
        this.tel = tel;
    }
    
    public Patient (String id, String pw, String name, String sex, String tel, String dateOfBirth, String con, String insNo) throws ParseException{
        setId(id);
        setPw(pw);
        setName(name);
        setSex(sex);
        setTel(tel);
        setDateOfBirth(dateOfBirth);
        setInsuranceNo(insNo);
        MedicalDiary m = new MedicalDiary(con, false);
        setMedicalDiary(new ArrayList<MedicalDiary>());
        getMedicalDiary().add(m);
    }
    
    public static int getNoNewOrder() throws FileNotFoundException{
        Scanner sc = new Scanner(NumberOfPatient);
        int no = sc.nextInt();
        return no+1;
    }
    public String order() throws IOException{
        int temp;
        if (getMedicalDiary().get(sMD()).isStt()){
            temp = getNoNewOrder();
            saveNoOfPatient(NumberOfPatient,String.valueOf(temp));
            getMedicalDiary().get(sMD()).setNo(temp);
            getMedicalDiary().get(sMD()).setStt(false);
            update(PatientManagementApp.getPatients());
        } else {
            temp = getMedicalDiary().get(sMD()).getNo();
        }
        return "Your number in queue:"+String.valueOf(temp);
    }
    
    public void register() throws FileNotFoundException, IOException{
        int no = getNoNewOrder();
        getMedicalDiary().get(0).setNo(no);
        saveNoOfPatient(NumberOfPatient, String.valueOf(no));
        saveAppendFile();
    }
    public int sMD(){
        return getMedicalDiary().size()-1;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getDateOfBirthStr() {
        SimpleDateFormat form = new SimpleDateFormat("MM/dd/yyyy");  
        String strDate = form.format(getDateOfBirth());  
        return strDate;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    
    public void setDateOfBirth(String s) throws ParseException{
        SimpleDateFormat form=new SimpleDateFormat("dd/MMM/yyyy");
        this.dateOfBirth = form.parse(s);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getInsuranceNo() {
        return insuranceNo;
    }

    public void setInsuranceNo(String insuranceNo) {
        this.insuranceNo = insuranceNo;
    }

    public ArrayList<MedicalDiary> getMedicalDiary() {
        return medicalDiary;
    }

    public void setMedicalDiary(ArrayList<MedicalDiary> medicalDiary) {
        this.medicalDiary = medicalDiary;
    }
    @Override
    public ArrayList<Patient> readFile() throws RuntimeException, IOException, ClassNotFoundException{
        FileInputStream fis = new FileInputStream(PathManagePatient);
        ObjectInputStream input;
        ArrayList<Patient> d = new ArrayList<>();
        boolean cont = true;
        while (cont) {
            try {
                input = new ObjectInputStream(fis);
                Patient obj = (Patient) input.readObject();
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
        AppendObjectOutputStream fos = new AppendObjectOutputStream(ManagePatient); 
        fos.writeObject(this);
        fos.flush();
        fos.close();
    }

    @Override
    public void overWriteFile() throws IOException{
        File f = new File(PathManagePatient);
        f.delete();
        f.createNewFile();
    }
    static void saveNoOfPatient(File f, String a) throws IOException{
        FileWriter file = new FileWriter(f.getAbsoluteFile(),false);
        file.write(a);
        file.flush();
        file.close();
    }

    @Override
    public boolean login() throws FileNotFoundException, RuntimeException, IOException, ClassNotFoundException {
        ArrayList<Patient> patients = new Patient().readFile();
        for (int i=0; i<patients.size(); i++){
            if (patients.get(i).getId().equals(this.id) && patients.get(i).getPw().equals(this.pw)){
                PatientManagementApp.setPatients(patients);
                PatientManagementApp.setPosP(i);
                setName(patients.get(i).getName());
                setSex(patients.get(i).getSex());
                setTel(patients.get(i).getTel());
                setDateOfBirth(patients.get(i).getDateOfBirth());
                setMedicalDiary(patients.get(i).getMedicalDiary());
                setInsuranceNo(patients.get(i).getInsuranceNo());
                return true;
            }
        }
        return false;
    }
    public static void update(ArrayList<Patient> patients) throws IOException{
        if (patients.size()>0){
            patients.get(0).overWriteFile();
            for (int i=0; i<patients.size(); i++){
                patients.get(i).saveAppendFile();
            }
        }
        
    }
    public void forgotPW() throws RuntimeException, IOException, ClassNotFoundException{
        ArrayList<Patient> patients = this.readFile(); 
        patients.forEach(e -> {
            if (e.getId().equals(this.getId()) && e.getTel().equals(this.getTel())){
                this.setPw(e.getPw());
                return;
            }
        });
    }
    public String check(){
        String s = "";
        if (id.equals("") || (!id.matches("[0-9]{9,12}"))) s+="Invalid ID! Must be 9-12 character 0-9\n";
        if (pw.equals("") || (!pw.matches("[0-9_|a-zA-Z]{7,29}")))  s+="Invalid Password! Only a-z, A-Z or 0-9 (7-29)\n";
        if (getMedicalDiary().get(this.sMD()).getCondition().equals("") || (!getMedicalDiary().get(0).getCondition().matches("^[\\.a-zA-Z0-9,!? ]*$"))) s+="Invalid Condition!\n";
        if (insuranceNo.equals("") || !insuranceNo.matches("[A-Z0-9]{15}")) s+="Invalid Insurance Number! Must be 15 character only A-Z and 0-9\n";
        if (name.equals("") || (!name.matches("^[a-zA-Z ]*$"))) s+="Invalid Name!\n";
        if (tel.equals("") || (!tel.matches("[0-9_]{9,12}"))) s+="Invalid Tel! Only digit only range 9-12 char\n";
        if (sex.equals("")) s+="Invalid Sex! Must be selected!\n";
        return s;
    }
    public void removeMedicineForPrescriptionP(int i){
        List.model2.remove(i);
    }
    
    public void addNewMedicineForPrescriptionP(Medicine m){
        List.model2.add(List.model2.size(), m);
    }
    public int newOrder(String condition) throws IOException{
        int no = getNoNewOrder();
        saveNoOfPatient(NumberOfPatient, String.valueOf(no));
        saveAppendFile();
        MedicalDiary md = new MedicalDiary(no, condition, false,getMedicalDiary().get(sMD()).getUnpaid());
        getMedicalDiary().add(md);
        update(PatientManagementApp.getPatients());
        return no;
    }
}

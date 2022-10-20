/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raiyugi.patientmanagementupdate2.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author HS
 */
public abstract class Person<T> implements FileData, Serializable{
    protected String id, pw;
    private static final long serialVersionUID = 2208202140779L;

    public Person() {
    }
    
    public Person(String id, String pw) {
        id = id;
        pw = pw;
    }
    
    public abstract boolean login() throws FileNotFoundException, RuntimeException, IOException, ClassNotFoundException;
    
    public boolean checkInput(String id, String pw){
        setId(id);
        setPw(pw);
        if (getId().equals("") || !getId().matches("[A-Z0-9]{9,12}") || getPw().equals("")|| !getPw().matches("[0-9_|a-zA-Z]+")) return false;
        return true;
    }
    
    public abstract void overWriteFile()  throws IOException;
    
    public abstract void saveAppendFile() throws RuntimeException, IOException;
    
    public abstract ArrayList<T> readFile() throws RuntimeException, IOException, ClassNotFoundException;
    
    public static class AppendObjectOutputStream extends ObjectOutputStream {
        public static File file;

        public AppendObjectOutputStream(File file) throws IOException{
            super(new FileOutputStream(file,true));
        }
        @Override
        public void writeStreamHeader() throws IOException{
            if(file != null){
                if(file.length() == 0){
                    super.writeStreamHeader();
                }else{
                    this.reset();
                }
            }else{            
                super.writeStreamHeader();
            }
        }
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
}

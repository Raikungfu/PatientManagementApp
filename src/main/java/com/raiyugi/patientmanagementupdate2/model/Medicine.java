/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raiyugi.patientmanagementupdate2.model;

import com.raiyugi.patientmanagementupdate2.controller.PatientManagementApp;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author HS
 */
public class Medicine implements FileData, Serializable{
    String name, howToUse, unit;
    int cost, volume;
    private static final long serialVersionUID = 2208202140779L;
    public Medicine() {
    }
    
    public Medicine(String name, String unit, int cost, int volume, String howToUse) {
        this.name = name;
        this.unit = unit;
        this.cost = cost;
        this.volume = volume;
        this.howToUse = howToUse;
    }
    
    public Medicine(Medicine m){
        this.cost = m.cost;
        this.howToUse = m.howToUse;
        this.name = m.name;
        this.unit = m.unit;
        this.volume = m.volume;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getHowToUse() {
        return howToUse;
    }

    public void setHowToUse(String howToUse) {
        this.howToUse = howToUse;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
    
    @Override
    public String toString() {
        return  name +'('+unit +')'+": cost = " + cost + ", volume = " + volume + ", "+howToUse + '\n';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.name);
        hash = 71 * hash + Objects.hashCode(this.unit);
        hash = 71 * hash + this.cost;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        if  (this.hashCode() != obj.hashCode()){
        return false;
        }
        final Medicine other = (Medicine) obj;
        return Objects.equals(this.name, other.name);
    }
    
    public int search(){
        for (int i = 0; i<PatientManagementApp.getmTemp().size(); i++){
            if (PatientManagementApp.getmTemp().get(i).equals(this))
                return i;
        }
        return -1;
    }
}

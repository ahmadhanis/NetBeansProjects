/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplicationexample;

/**
 *
 * @author user
 */
public class Dkg {
 private String dkgname;
 private int seatnumber;
 
    Dkg(String d, int s){
        dkgname = d;
        seatnumber = s;
    }
    
    void setDkgname(String d){
        dkgname = d;
    }
    
    void setSeatnum(int s){
        seatnumber = s;
    }
    String getDkgName(){
        return dkgname;
    }
    
    int getSetNum(){
        return seatnumber;
    }
}

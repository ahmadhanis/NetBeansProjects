/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicgui;

/**
 *
 * @author user
 */
public class Student {
    private String name,phone;
    final private String matric;
    
    Student(String name,String matric,String phone){
        this.name = name;
        this.matric = matric;
        this.phone = phone;
    }
    void setName(String name){
        this.name = name;
    }
    void setPhone(String phone){
        this.phone = phone;
    }
    String getName(){
        return name;
    }
    String getMatric(){
        return matric;
    }
    String getPhone(){
        return phone;
    }
}

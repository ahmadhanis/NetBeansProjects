/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentregistrationsystem;

/**
 *
 * @author user
 */
public class Student {
    private String matric_no;
    private String name;
    
    Student(String matric_no,String name){
        this.matric_no = matric_no;
        this.name = name;
    }
    
    String getName(){
        return this.name;
    }
    String getMatric(){
        return this.matric_no;
    }
    
    void setName(String name){
        this.name = name;
    }  
}

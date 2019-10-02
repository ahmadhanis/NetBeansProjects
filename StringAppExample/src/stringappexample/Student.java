package stringappexample;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Student {
    private String name,matric;
    
    Student(String name,String matric){
        this.name = name;
        this.matric = matric;
    }
    String getName(){
        return name;
    }
    String getMatric(){
        return matric;
    }
}

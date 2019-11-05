/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uumsystem;

/**
 *
 * @author user
 */
public class Person {
    String ic,name,phone,email,address;
    
    Person(String ic,String name,String phone,String email,String address){
        this.ic = ic;
        this.name = name;
        this.phone = phone;
        this.email =email;
        this.address = address;
    }
    
    void myMethod(){
        System.out.println("This is your parent!!!!");
    }
    
    
}

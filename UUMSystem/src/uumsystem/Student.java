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
public class Student extends Person{
    String matric, course;

    public Student(String ic, String name, String phone, String email, String address, String matric) {
        super(ic, name, phone, email, address);
        this.matric = matric;
    }
    
    @Override
    void myMethod(){
        System.out.println("This is your child!!!!");
        super.myMethod();
    }
}

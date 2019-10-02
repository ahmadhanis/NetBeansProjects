/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentregistrationsystem;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class StudentRegistrationSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Student Matric:");
        String matric = scan.nextLine();
        System.out.println("Enter Student Name:");
        String name = scan.nextLine();
        
        Student stud1 = new Student(matric,name);
        
        System.out.println("Name:"+stud1.getName());
        System.out.println("Matric:"+stud1.getMatric());
        
        System.out.println("Re-set Name");
        System.out.println("Enter Student Name:");
        name = scan.nextLine();
        stud1.setName(name);
        
        System.out.println("Name:"+stud1.getName());
        System.out.println("Matric:"+stud1.getMatric());
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringappexample;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class StringAppExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        ArrayList<Student> student = new ArrayList<Student>();
        boolean act = true;
        while(act){
            System.out.println("Enter name:");
            String name = scan.nextLine();
            System.out.println("Enter Matric:");
            String matric = scan.nextLine();
            student.add(new Student(name,matric));
            System.out.println("Type false to quit");
            act = scan2.nextBoolean();
        }
        
        for (int i=0;i<student.size();i++){
            System.out.println("Names:"+student.get(i).getName());
            System.out.println("Matric:"+student.get(i).getMatric());            
        }
        
    }
    
}

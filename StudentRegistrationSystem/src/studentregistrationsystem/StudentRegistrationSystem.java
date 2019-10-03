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
        Scanner scanstr = new Scanner(System.in);

        System.out.print("How many student:");
        int num = scan.nextInt();
        Student stud[] = new Student[num];

        for (int i = 0; i < num; i++) {
            System.out.print("Enter name:");
            String name = scanstr.nextLine();
            System.out.print("Enter Matric:");
            String matric = scanstr.nextLine();
            stud[i] = new Student(matric, name);
        }
        System.out.println("Insert data success");
        System.out.println("Your Data");
        System.out.println("Name \t Matric");
        for (int i = 0; i < num; i++) {
            System.out.print(stud[i].getName() + "\t|");
            System.out.println(stud[i].getMatric());
        }

    }

}

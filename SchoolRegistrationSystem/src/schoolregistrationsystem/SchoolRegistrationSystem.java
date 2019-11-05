/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolregistrationsystem;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class SchoolRegistrationSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        School[] school = new School[3];
        for (int i = 0; i < school.length; i++) {
            System.out.print("Enter School Id:");
            String scid = scan.nextLine();
            System.out.print("Enter School name:");
            String scname = scan.nextLine();
            System.out.print("Enter School address:");
            String scadd = scan.nextLine();
            System.out.print("Enter Num of Student:");
            int numstud = scan.nextInt();
            scan.nextLine();
            school[i] = new School(scid, scname, scadd,numstud);
        }

        System.out.println("#######################################");

        for (int i = 0; i < school.length; i++) {
            System.out.println("School ID:" + school[i].getScId());
            System.out.println("School name:" + school[i].getScName());
            System.out.println("School Add:" + school[i].getScAdd());
        }

    }

}

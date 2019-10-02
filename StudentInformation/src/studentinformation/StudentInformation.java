/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentinformation;
/**
 *
 * @author user
 */
public class StudentInformation {
    public String a;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lecturer lecturer = new Lecturer();
        System.out.println(lecturer.toString());
        Lecturer lecturer1 = new Lecturer();
        System.out.println(lecturer1.toString());
        
    }
   
}

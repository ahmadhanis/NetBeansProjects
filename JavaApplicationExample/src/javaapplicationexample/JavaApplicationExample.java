/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplicationexample;
import studentinformation.*;

/**
 *
 * @author user
 */
public class JavaApplicationExample {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
       Book booka = new Book("TEST");
       booka.myMethod("", "");
       booka.myMethod(5, "");
       Lecturer lecturer =new Lecturer();
       Student student = new Student();
    }

}

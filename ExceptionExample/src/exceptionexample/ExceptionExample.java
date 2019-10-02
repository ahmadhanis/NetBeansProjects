/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionexample;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class ExceptionExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
         mymethod(); 
         mymethoda();
        }catch(Exception e){
            System.out.println(e.toString());
        }
         
    }
    
    static void mymethod() throws Exception{
        Scanner scan = new Scanner(System.in);
        System.out.println("Input int");
        int a = scan.nextInt(); 
        
    }
    static void mymethoda() throws Exception{
        Scanner scan = new Scanner(System.in);
        System.out.println("Input int");
        int a = scan.nextInt(); 
        
    }
    
}

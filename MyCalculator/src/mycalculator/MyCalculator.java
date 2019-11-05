/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycalculator;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class MyCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyCalculator obj =  new MyCalculator();
        try{
            System.out.println(obj.division(5,0));
        }catch(Exception e){
            System.out.println(e.toString());
        }
        
    }
    
   int division(int a, int b) throws Exception{  
	int t = a/b;
	return t;
   } 
   

}

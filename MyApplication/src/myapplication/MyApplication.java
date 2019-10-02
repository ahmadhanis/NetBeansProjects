/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapplication;


import java.util.*;

/**
 *
 * @author user
 */
public class MyApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        Scanner scannernumber = new Scanner(System.in);
        double total=0.0;
        Inventory invetory[] = new Inventory[3];
            
        for (int i = 0; i< 2;i++){
            invetory[i] = new Inventory();
            System.out.println("Enter Type:");
            invetory[i].type = scanner.nextLine();
            System.out.println("Enter Serial no:");
            invetory[i].serialno = scanner.nextLine();
            System.out.println("Enter Date:");
            invetory[i].date = scanner.nextLine();
            System.out.println("Enter price:");
            invetory[i].price = scannernumber.nextDouble();  
        }
        System.out.println("########################################");
        
        for (int i = 0; i< 2;i++){
            System.out.println("Type:"+invetory[i].type);
            System.out.println("Serial No:"+invetory[i].serialno);
            System.out.println("Date:"+invetory[i].date);
            System.out.println("Price:"+invetory[i].price);
            total = total + invetory[i].price;
        }
        System.out.println("Total Inventory price:"+total);
   }

}

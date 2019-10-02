/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookApp;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class BookApp {
   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.print("Number of book:");
        int num = scan.nextInt();
        scan.nextLine();
        Book[] book = new Book[num];
        for (int i =0;i<num;i++){
            System.out.println("Enter Book "+(i+1));
            System.out.print("Book ID:");
            String id = scan.nextLine();    
            System.out.print("Book Title:");
            String title =  scan.nextLine();
            System.out.print("Price:");
            double price = scan.nextDouble();
            System.out.print("Quantity:");
            int quantity = scan.nextInt();
            scan.nextLine();
            book[i] = new Book(id, title, price, quantity);
            System.out.println("");
        }
        
        System.out.println("################# Record #######################");
        System.out.println("ID\tTITLE\tPRICE\tQUANTITY");
        for (int i=0;i<num;i++){
            System.out.println(book[i].getId()+"\t"+book[i].getTitle()+"\t"+book[i].getPrice()+"\t"+book[i].getQuantity());
        }
        System.out.println("################ End Record ####################");   
    }
   
    
}

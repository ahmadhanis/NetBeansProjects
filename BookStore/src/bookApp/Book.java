/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookApp;

/**
 *
 * @author user
 */
public class Book {
    private String id,title;
    private double price;
    private int quantity;
    
     Book(String id,String title,double price,int quantity){
       this.id = id;
       this.title = title;
       this.price = price;
       this.quantity = quantity;
    } 
     String getId(){
         return id;
     }
     
     String getTitle(){
         return title;
     }
     
     double getPrice(){
         return price;
     }
     
     int getQuantity(){
         return quantity;
     }
    
}

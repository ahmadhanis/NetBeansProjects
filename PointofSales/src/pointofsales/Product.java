/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pointofsales;

/**
 *
 * @author user
 */
public class Product {
    private String pid;
    private String pname;
    double price;
    
    Product(String pid,String pname,double price){
        this.pid = pid;
        this.pname = pname;
        this.price = price;
    }
    String getid(){
        return pid;
    }
    String getName(){
        return pname;
    }
    double getPrice(){
        return price;
    }
}
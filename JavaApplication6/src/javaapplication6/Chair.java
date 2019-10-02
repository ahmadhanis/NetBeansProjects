/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

/**
 *
 * @author user
 */
public class Chair {
    private String chairid;
    private String chairtype;
    private String chaircolor;
    
    
    void displayChairInfo(){
        System.out.println("Chair ID:"+chairid);
        System.out.println("Chair Type:"+chairtype);
        System.out.println("Chair Color:"+chaircolor);
    }
    
    Chair(String a, String b, String c){
        chairid = a;
        chairtype = b;
        chaircolor = c;
    }
}

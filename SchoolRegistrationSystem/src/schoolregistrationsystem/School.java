/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolregistrationsystem;

/**
 *
 * @author user
 */
public class School {
   private final String sc_id;
   private String sc_name;
   private String sc_add;
   private int numstud;
   
   School(String sc_id, String sc_name, String sc_add, int numstud){
       this.sc_id = sc_id;
       this.sc_name = sc_name;
       this.sc_add = sc_add;
       this.numstud = numstud;
   }
   String getScId(){
       return sc_id;
   }
   String getScName(){
       return sc_name;
   }
   String getScAdd(){
       return sc_add;
   }
   void setScName(String sc_name){
       this.sc_name = sc_name;
   }
   void setScAdd(String sc_add){
       this.sc_add = sc_add;
   }
}


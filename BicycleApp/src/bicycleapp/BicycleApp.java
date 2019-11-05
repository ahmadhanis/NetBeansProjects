/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bicycleapp;

/**
 *
 * @author user
 */
public class BicycleApp {

    /**
     * @param args the command line arguments
     */
   

    public static void main(String[] args) {
        // TODO code application logic here
        Bicycle bicycle = new Bicycle("123456", "Mountain Bike", "Blue");
        System.out.println("Bike Serial NO:" + bicycle.getSerial());
 
    }
    
   
}

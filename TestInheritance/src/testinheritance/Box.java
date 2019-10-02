/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testinheritance;

/**
 *
 * @author user
 */
public class Box extends Rectangle{
    private double height;

    Box(double L, double W, double H) {
        super(L,W);
        height = H;
        super.printInfo();
    }
    
    void getArea(){
        double area = getLength() * getWidth() * height; 
        
    }
    
    @Override
    public void printInfo(){
        System.out.println("Hello I'm a Box child");
        super.Draw();
    }
    
}

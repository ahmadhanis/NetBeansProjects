/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplicationexample;

/**
 *
 * @author user
 */
public class Circle {
    
   private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    double getArea(){//getter method
        return radius * radius * 3.14159;
    }
    
}


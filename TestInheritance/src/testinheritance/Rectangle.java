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
public class Rectangle {

    private double length, width;

    Rectangle(double L, double W) {
        length = L;
        width = W;
    }

    double getLength() {
        return length;
    }

    double getWidth() {
        return width;
    }

    public void printInfo() {
        System.out.println("Hello I'm a Rectangle Parent");
    }

    public void Draw() {
        for (int row = 0; row < length; row++) {
            for (int column = 0; column < width; column++) {
                System.out.print('#');
            }
            System.out.println();
        }
    }

}

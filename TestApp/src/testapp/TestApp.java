/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testapp;

/**
 *
 * @author user
 */
public class TestApp {

    public static void main(String[] args) {
        // TODO code application logic here
        Student student = new Student();
        Lecturer lecturer = new Lecturer();
    }
}
class Student extends Person {

    String matric;
}

class Lecturer extends Person {

    String id;
}

class Person {

    String name;
}

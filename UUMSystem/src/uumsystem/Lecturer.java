/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uumsystem;

/**
 *
 * @author user
 */
public class Lecturer extends Person{
    String id,school;

    public Lecturer(String ic, String name, String phone, String email, String address) {
        super(ic, name, phone, email, address);
    }
}

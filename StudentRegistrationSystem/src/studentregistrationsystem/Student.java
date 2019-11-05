/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentregistrationsystem;

/**
 *
 * @author user
 */
public class Student {

    private final String matric_no;
    private String name, phone;

    Student(String matric_no, String name, String phone) {
        this.matric_no = matric_no;
        this.name = name;
        this.phone = phone;
    }

    String getName() {
        return this.name;
    }

    String getMatric() {
        return this.matric_no;
    }

    String getPhone() {
        return this.phone;
    }

    void setName(String name) {
        this.name = name;
    }

    void setPhone(String phone) {
        this.phone = phone;
    }
}

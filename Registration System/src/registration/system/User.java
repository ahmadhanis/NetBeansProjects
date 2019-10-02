/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registration.system;

/**
 *
 * @author user
 */
public class User {
    private String name,icnum;
    User(){
        
    }
    User(String name,String icnum){
        this.name = name;
        this.icnum = icnum;
    }
    void setName(String name){
        this.name = name;
    }
    String getName(){
        return name;
    }
    String getIC(){
        return icnum;
    }
}

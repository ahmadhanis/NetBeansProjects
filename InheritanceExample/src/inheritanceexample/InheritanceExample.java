/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritanceexample;

/**
 *
 * @author user
 */
public class InheritanceExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Classa classa = new Classa();
        classa.methoda();
        classa.ca = 10;
        classa.cb = 12;
        classa.methodb();
    }
    
}

class Classa extends Classb{
    int ca;
    void methoda(){
        
    }
}

class Classb{
    int cb;
    void methodb(){
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registration.system;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class RegistrationSystem {
static int i = 0;   
static int a ;  
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        User[] user = new User[10];
        String namelist = "";
       // DefaultTableModel dtm;
        String header[] = new String[]{"Name", "IC Number"};
        //dtm = new DefaultTableModel(header,0);
        // TODO code application logic here
        JFrame frame = new JFrame("User Registration System");//creating instance of JFrame  
        JTextField jtf1 =  new JTextField();
        JTextField jtf2 =  new JTextField();
        JLabel jl1 = new JLabel("Name");
        JLabel jl2 = new JLabel("IC Number");
        Button btn1 = new Button("Register");
        Button btnleft = new Button("<-");
        Button btnrigth = new Button("->");
        //JTable jtable = new JTable();
        
        jtf1.setBounds(100,20,200,20);
        jtf2.setBounds(100,40,200,20);
        jl1.setBounds(20, 20, 100, 20);
        jl2.setBounds(20, 40, 100, 20);
        btn1.setBounds(100, 70, 80, 20);
        btnleft.setBounds(100, 100, 80, 20);
        btnrigth.setBounds(180, 100, 80, 20);
        //jtable.setBounds(100, 100, 200, 100);
        
        frame.add(jtf1);
        frame.add(jtf2);
        frame.add(jl1);
        frame.add(jl2);
        frame.add(btn1);
        frame.add(btnleft);
        frame.add(btnrigth);
        //frame.add(jtable);
        
        frame.setSize(400,500);//400 width and 500 height  
        frame.setLayout(null);//using no layout managers  
        frame.setVisible(true);//making the frame visible  
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //jtable.setModel(dtm);
        //dtm.setRowCount(0);
        //user[0] = new User("Hanis ","3434");
        
        btn1.addActionListener((ActionEvent ae) -> {
            String name = jtf1.getText();
            String ic =jtf2.getText();
            
            if (i<user.length){
                user[i] = new User(name,ic);
                a=i;
            }else{
                JOptionPane.showMessageDialog(frame,"Array out of size!!!");
            }
            
            i++;
            
            //JOptionPane.showMessageDialog(frame,"Welcome "+user.getName());
            //Object[] objs = {user.getName(),user.getIC()};
            //dtm.addRow(objs);
        });
        
        btnleft.addActionListener((ActionEvent ae) -> {
            if ((a>=0) && (a<10)){
                jtf1.setText(user[a].getName());
                jtf2.setText(user[a].getIC());
                if (a<0){
                    a= 0;
                }else{
                    a = a-1;
                }
            }
        });
        
        btnrigth.addActionListener((ActionEvent ae) -> {
            
            if ((a>=0) && (a<10)){
                jtf1.setText(user[a].getName());
                jtf2.setText(user[a].getIC());
                a = a+1;
            }
        });
        
        
    }
}

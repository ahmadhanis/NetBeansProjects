/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentregistrationsystem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author user
 */
public class StudentRegistrationSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student student[] = new Student[5];
        
        JFrame frame = new JFrame("Student Registration System");
        frame.setSize(350, 300);
        frame.setLayout(null);
        
        JLabel labelname = new JLabel("Name:");
        labelname.setBounds(10, 10, 100, 20);
        frame.add(labelname);
        
        JLabel labelmatric = new JLabel("Matric:");
        labelmatric.setBounds(10, 30, 100, 20);
        frame.add(labelmatric);
        
        JLabel labelphone = new JLabel("Phone:");
        labelphone.setBounds(10, 50, 100, 20);
        frame.add(labelphone);
        
        JTextField jtextfield1name = new JTextField();
        jtextfield1name.setBounds(100, 10, 200, 20);
        frame.add(jtextfield1name);
        
        JTextField jtextfield1matric = new JTextField();
        jtextfield1matric.setBounds(100, 30, 200, 20);
        frame.add(jtextfield1matric);
        
        JTextField jtextfield1phone = new JTextField();
        jtextfield1phone.setBounds(100, 50, 200, 20);
        frame.add(jtextfield1phone);
        
        JLabel labeloutput = new JLabel("Output:");
        labeloutput.setBounds(100, 100, 150, 20);
        frame.add(labeloutput);
        
        JButton jButton = new JButton("Insert");
        jButton.setBounds(100,80,200,20);
        frame.add(jButton);
        
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String name = jtextfield1name.getText();
                String matric = jtextfield1matric.getText();
                String phone = jtextfield1phone.getText();
            }
        });
                
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}

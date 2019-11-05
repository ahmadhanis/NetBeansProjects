/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguiexample;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author user
 */
public class MainApp {
    
     MainApp(){
        JFrame frame = new JFrame("Main App");
        frame.setSize(500, 400);
        frame.setLayout(null);
        
        JLabel label = new JLabel("Name");
        label.setBounds(10, 10, 70, 20);
        JTextField jtextfield1 = new JTextField();
        jtextfield1.setBounds(100, 10, 170, 20);
        JLabel labe12 = new JLabel("Matric");
        labe12.setBounds(10, 30, 70, 20);
        JTextField jtextfield2 = new JTextField();
        jtextfield2.setBounds(100, 30, 170, 20);
        JButton btnAdd = new JButton("Add");
        btnAdd.setBounds(100, 60, 150, 20);
        
        frame.add(label);
        frame.add(jtextfield1);
        frame.add(labe12);
        frame.add(jtextfield2);
        frame.add(btnAdd);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     }
}

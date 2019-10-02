/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.graphical.app;

import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author user
 */
public class SampleGraphicalApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame("Calculator Application");//creating instance of JFrame 
        
        JLabel jlbtitle = new JLabel("Hanis Calculator");
        jlbtitle.setBounds(50,5,100,10);
        
        JTextField jtf = new JTextField();
        jtf.setBounds(20,20,140,20);

        JTextField jtf2 = new JTextField();
        jtf2.setBounds(20,40,140,20);
        
        
        JLabel jlb = new JLabel("Output Here");
        jlb.setBounds(50,160,100,40);

        JButton btn1 = new JButton("+");
        btn1.setBounds(20,70,60,40);
        btn1.addActionListener((ActionEvent ae) -> {
            int a = Integer.parseInt(jtf.getText());
            int b = Integer.parseInt(jtf2.getText());
            int result = a + b;
            jlb.setText("Result:"+result);
        });
        
        JButton btn2 = new JButton("-");
        btn2.setBounds(100,70,60,40);
        btn2.addActionListener((ActionEvent ae) -> {
            int a = Integer.parseInt(jtf.getText());
            int b = Integer.parseInt(jtf2.getText());
            int result = a - b;
            jlb.setText("Result:"+result);
        });
        
        JButton btn3 = new JButton("*");
        btn3.setBounds(20,110,60,40);
        btn3.addActionListener((ActionEvent ae) -> {
            int a = Integer.parseInt(jtf.getText());
            int b = Integer.parseInt(jtf2.getText());
            int result = a * b;
            jlb.setText("Result:"+result);
        });

        JButton btn4 = new JButton("/");
        btn4.setBounds(100,110,60,40);
        btn4.addActionListener((ActionEvent ae) -> {
            float a = Float.parseFloat(jtf.getText());
            float b = Float.parseFloat(jtf2.getText());
            float result = a / b;
            jlb.setText("Result:"+result);
        });
        
        frame.add(jtf);
        frame.add(jtf2);
        frame.add(btn1);
        frame.add(btn2);
        frame.add(btn3);
        frame.add(btn4);
        frame.add(jlb);
        frame.add(jlbtitle);
        
        frame.setSize(190,250);//400 width and 500 height
        frame.setLayout(null);//using no layout managers
        frame.setVisible(true);//making the frame visible 
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    }
}

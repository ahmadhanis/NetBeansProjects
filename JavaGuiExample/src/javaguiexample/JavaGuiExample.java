/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguiexample;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author user
 */
public class JavaGuiExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame("Login");
        frame.setSize(300, 150);
        frame.setLayout(null);

        JLabel label = new JLabel("Username");
        label.setBounds(10, 10, 70, 20);
        JTextField jtextfield1 = new JTextField();
        jtextfield1.setBounds(100, 10, 170, 20);
        JLabel labe12 = new JLabel("Password");
        labe12.setBounds(10, 30, 70, 20);
        JTextField jtextfield2 = new JTextField();
        jtextfield2.setBounds(100, 30, 170, 20);
        JButton btnLogin = new JButton("Login");
        btnLogin.setBounds(100, 60, 170, 20);
        frame.add(label);
        frame.add(jtextfield1);
        frame.add(labe12);
        frame.add(jtextfield2);
        frame.add(btnLogin);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String name = jtextfield1.getText();
                String pass = jtextfield2.getText();
                if (name.equals("hanis") && pass.equals("12345")) {
                    new MainApp();
                    frame.setVisible(false);
                    frame.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect login data");
                }
            }
        });

    }

}

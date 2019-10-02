/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package charity.house;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author user
 */
public class CharityHouse extends JFrame {

    ArrayList<Children> arrayListChildrens;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CharityHouse charityHouse = new CharityHouse();
    }

    public CharityHouse() {
        arrayListChildrens = new ArrayList<>();
        JFrame frame = new JFrame("Charity House Registration");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        JLabel label = new JLabel("Name:");
        label.setBounds(20, 25, 200, 20);
        JTextField textField = new JTextField();
        textField.setBounds(80, 25, 200, 20);

        JLabel label1 = new JLabel("IC:");
        label1.setBounds(20, 50, 100, 20);
        JTextField textField1 = new JTextField();
        textField1.setBounds(80, 50, 200, 20);

        JLabel label2 = new JLabel("Age:");
        label2.setBounds(20, 75, 100, 20);
        JTextField textField2 = new JTextField();
        textField2.setBounds(80, 75, 50, 20);

        JLabel label3 = new JLabel("Address:");
        label3.setBounds(20, 100, 100, 20);
        JTextArea textArea1 = new JTextArea();
        textArea1.setBounds(80, 100, 200, 50);

        JButton jButton = new JButton("Save");
        jButton.setBounds(80, 160, 200, 40);

        JLabel label4 = new JLabel("Number of record:");
        label4.setBounds(20, 210, 260, 40);

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String name = textField.getText();
                String id = textField1.getText();
                int age = Integer.parseInt(textField2.getText());
                String address = textArea1.getText();
                Children children = new Children(name, id, address, age);
                arrayListChildrens.add(children);
                label4.setText("Number of record:" + arrayListChildrens.size());
            }
        });

        frame.add(label);frame.add(textField);
        frame.add(label1);frame.add(textField1);
        frame.add(label2);frame.add(textField2);
        frame.add(label3);frame.add(textArea1);
        frame.add(jButton);frame.add(label4);
        frame.setSize(320, 300);
        frame.setVisible(true);
    }

}

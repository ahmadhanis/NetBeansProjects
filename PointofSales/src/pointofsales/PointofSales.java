/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pointofsales;

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
public class PointofSales {
    public static void main(String[] args) {
        ArrayList<Product> product = new ArrayList<>();
        
        // TODO code application logic here
        JFrame frame = new JFrame("Point of Sales");
        frame.setSize(300, 400);
        frame.setLayout(null);

        JLabel label = new JLabel("POINT OF SALE SYSTEM");
        JLabel label1 = new JLabel("Product ID");
        JTextField jtextfield1 = new JTextField();
        JTextField jtextfield2 = new JTextField();
        JTextField jtextfield3 = new JTextField();
        JLabel label2 = new JLabel("Product Name");
        JLabel label3 = new JLabel("Product Price");
        JLabel label4 = new JLabel("Total RM:");
        JButton button = new JButton("Insert into Cart");
        JTextArea jtextarea = new JTextArea("");
        
        label.setBounds(80, 10, 200, 20);
        label1.setBounds(10, 40, 100, 20);
        jtextfield1.setBounds(100, 40, 100, 20);
        label2.setBounds(10, 60, 150, 20);
        jtextfield2.setBounds(100, 60, 150, 20);
        label3.setBounds(10, 80, 150, 20);
        jtextfield3.setBounds(100, 80, 150, 20);
        button.setBounds(100, 100, 150, 20);
        jtextarea.setBounds(20, 125, 250, 150);
        label4.setBounds(10, 280, 150, 20);
                
        frame.add(label);frame.add(label1);
        frame.add(jtextfield1); frame.add(label2);
        frame.add(jtextfield2);frame.add(label3);
        frame.add(jtextfield3);frame.add(button);
        frame.add(jtextarea);frame.add(label4);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String pid = jtextfield1.getText();
                String pname = jtextfield2.getText();
                double price = Double.parseDouble(jtextfield3.getText());
                product.add(new Product(pid, pname, price));
                jtextarea.setText("");
                jtextarea.setText("Pr ID\t| Pr Name\t| Price\n");
                double total = 0.0;
                for (int i = 0;i<product.size();i++){
                    jtextarea.append(product.get(i).getid()+"\t| "
                            +product.get(i).getName()+"\t| "
                            +product.get(i).getPrice()+"\n");
                    total = total + product.get(i).getPrice();
                }
                label4.setText("Total RM:"+total);
            }
        });
    }
}

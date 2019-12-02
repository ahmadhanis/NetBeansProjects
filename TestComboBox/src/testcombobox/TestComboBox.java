/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcombobox;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import static java.time.Instant.now;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class TestComboBox {

    /**
     * @param args the command line arguments
     */
    TestComboBox(){
        JFrame frame = new JFrame("Test Interface");
        frame.setSize(300, 450);
        
        String count[]={"1","2","3","4","5"};
        JComboBox jcombo = new JComboBox(count);
        jcombo.setBounds(10, 10, 60, 20);
        frame.add(jcombo);
        
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
        Date date = new Date();  
        System.out.println(formatter.format(date)); 
    
        JLabel jlabela = new JLabel("Date:");
        jlabela.setBounds(100, 10, 200, 20);
        jlabela.setText(formatter.format(date));
        frame.add(jlabela);
        
        JButton jbutton = new JButton("TEST");
        jbutton.setBounds(200, 10, 90, 20);
        frame.add(jbutton);
        
        jbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String currtime = jlabela.getText();
                String val = jcombo.getSelectedItem().toString();
                JOptionPane.showMessageDialog(frame, "Curretn date selected is:"+currtime);
            }
        });
        
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        new TestComboBox();
    }
    
}

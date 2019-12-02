/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filetextexample;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author user
 */
public class FileTextExample {

    FileTextExample() {
        JFrame frame = new JFrame("READ N WRITE (TEXT)");
        frame.setSize(470, 240);
        frame.setResizable(false);

        JLabel jlabel = new JLabel("TEXT FILE");
        jlabel.setBounds(10, 10, 450, 20);
        frame.add(jlabel);

        JLabel jlabel2 = new JLabel("");
        jlabel2.setBounds(10, 150, 450, 60);
        frame.add(jlabel2);

        JButton jbbinwrite = new JButton("WRITE TEXT DATA");
        jbbinwrite.setBounds(220, 60, 150, 20);
        frame.add(jbbinwrite);

        JButton jbbinread = new JButton("READ TEXT DATA");
        jbbinread.setBounds(220, 90, 150, 20);
        frame.add(jbbinread);

        JTextArea jTextArea = new JTextArea();
        jTextArea.setBounds(10, 40, 200, 100);
        frame.add(jTextArea);

        //Button for read binary data in a file
        jbbinread.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                File inFile = new File("textdata.txt");
                jTextArea.setText("");
                try {
                    FileReader fileReader = new FileReader(inFile);
                    BufferedReader bufReader = new BufferedReader(fileReader);
                    String str;
                    str = bufReader.readLine();
                    jTextArea.setText(str);
                    jlabel2.setText(inFile.getAbsolutePath());
                    JOptionPane.showMessageDialog(frame, "Success!!!");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(frame, "File not found!!!");
                }
            }
        });
        //Button for write binary data in a file
        jbbinwrite.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String mydata = jTextArea.getText();
                File outFile = new File("textdata.txt");
                try {
                    outFile.createNewFile();
                    FileWriter outFileStream = new FileWriter(outFile);
                    PrintWriter outStream = new PrintWriter(outFileStream);
                    jlabel2.setText(outFile.getAbsolutePath());
                    outStream.println(mydata);
                    outStream.close();
                    JOptionPane.showMessageDialog(frame, "Success!!!");
                    jTextArea.setText("");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(frame, "File not found!!!");
                }
            }
        });

        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new FileTextExample();
    }

}

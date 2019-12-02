/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileiosampleapp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author user
 */
public class FileIOSampleApp {

    FileIOSampleApp() {
        JFrame frame = new JFrame("READ N WRITE (BINARY)");
        frame.setSize(470, 240);
        frame.setResizable(false);

        JLabel jlabel = new JLabel("BINARY FILE");
        jlabel.setBounds(10, 10, 450, 20);
        frame.add(jlabel);

        JLabel jlabel2 = new JLabel("");
        jlabel2.setBounds(10, 150, 450, 60);
        frame.add(jlabel2);

        JButton jbbinwrite = new JButton("WRITE BINARY DATA");
        jbbinwrite.setBounds(220, 60, 150, 20);
        frame.add(jbbinwrite);

        JButton jbbinread = new JButton("READ BINARY DATA");
        jbbinread.setBounds(220, 90, 150, 20);
        frame.add(jbbinread);

        JTextArea jTextArea = new JTextArea();
        jTextArea.setBounds(10, 40, 200, 100);
        frame.add(jTextArea);

        //Button for read binary data in a file
        jbbinread.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                File inFile = new File("binarydata.data");
                try {
                    FileInputStream inStream = new FileInputStream(inFile);
                    int fileSize = (int) inFile.length();
                    byte[] byteArray = new byte[fileSize];
                    inStream.read(byteArray);
                    jTextArea.setText("");
                    for (int i = 0; i < fileSize; i++) {
                        jTextArea.append(byteArray[i] + " ");
                    }
                    inStream.close();
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
                File outFile = new File("binarydata.data");
                try {
                    outFile.createNewFile();
                    FileOutputStream outStream = new FileOutputStream(outFile);
                    byte[] byteArray = mydata.getBytes();
                    outStream.write(byteArray);
                    outStream.close();
                    jlabel2.setText(outFile.getAbsolutePath());
                    jTextArea.setText("");
                    JOptionPane.showMessageDialog(frame, "Success!!!");
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
        new FileIOSampleApp();
    }

}

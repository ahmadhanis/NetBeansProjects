/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testprintwriter;

import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author user
 */
public class TestPrintWriter {
public static JTextField jtf,jtf2;
static Student stud1;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        JFrame frame = new JFrame("File Reader Application");//creating instance of JFrame 
        
        JLabel jlb1 = new JLabel("Name:");
        jlb1.setBounds(20, 20, 140, 20);
        
        jtf = new JTextField();
        jtf.setBounds(100, 20, 140, 20);

        JLabel jlb2 = new JLabel("Matric No:");
        jlb2.setBounds(20, 40, 140, 20);
        
        jtf2 = new JTextField();
        jtf2.setBounds(100, 40, 140, 20);

        JButton btn1 = new JButton("Save");
        btn1.setBounds(100, 70, 100, 40);
        JButton btn2 = new JButton("Load");
        btn2.setBounds(200, 70, 100, 40);
        
        frame.add(jtf);
        frame.add(jtf2);
        frame.add(btn1);
        frame.add(btn2);
        frame.add(jlb1);
        frame.add(jlb2);
        

        frame.setSize(400, 500);//400 width and 500 height
        frame.setLayout(null);//using no layout managers
        frame.setVisible(true);//making the frame visible 
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btn1.addActionListener((ActionEvent ae) -> {
            String str1, str2;
            str1 = jtf.getText();
            str2 = jtf2.getText();
            stud1 = new Student(str1, str2);
            File outFile = new File("sample1.txt");
            try {
                FileWriter outFileStream
                    = new FileWriter(outFile);
                PrintWriter outStream = new PrintWriter(outFileStream);
                outStream.println(str1);
                outStream.println(str2);
                outStream.close();
            }catch(Exception e){}
        });
        
        btn2.addActionListener((ActionEvent ae) -> {
            loadData();
        });
        //loadData();
    }

    private static void loadData() {
        String a, b; 
        try{
            File inFile = new File("sample1.txt");
            Scanner scan = new Scanner(inFile);
            a = scan.nextLine();
            b = scan.nextLine();
            jtf.setText(a);
            jtf2.setText(b);
        }catch(Exception e){}     
    }
}

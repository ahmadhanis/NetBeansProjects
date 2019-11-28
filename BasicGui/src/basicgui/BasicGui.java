/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicgui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class BasicGui {

    ArrayList<Student> studentlist = new ArrayList<Student>();
    String header[] = new String[]{"Matric", "Name", "Phone"};
    DefaultTableModel dtm = new DefaultTableModel(header, 1);

    BasicGui() {

        JFrame frame = new JFrame("Student Information System");
        frame.setSize(300, 450);

        JLabel jlabel = new JLabel("Name");
        jlabel.setBounds(10, 10, 60, 20);
        frame.add(jlabel);

        JLabel jlabela = new JLabel("Matric No");
        jlabela.setBounds(10, 30, 60, 20);
        frame.add(jlabela);

        JLabel jlabelb = new JLabel("Phone");
        jlabelb.setBounds(10, 50, 60, 20);
        frame.add(jlabelb);

        JTextField jtfname = new JTextField();
        jtfname.setBounds(80, 10, 200, 20);
        frame.add(jtfname);

        JTextField jtfmatric = new JTextField();
        jtfmatric.setBounds(80, 30, 100, 20);
        frame.add(jtfmatric);

        JTextField jtfphone = new JTextField();
        jtfphone.setBounds(80, 50, 150, 20);
        frame.add(jtfphone);

        JButton jbuttoninsert = new JButton("INSERT");
        jbuttoninsert.setBounds(80, 80, 90, 20);
        frame.add(jbuttoninsert);

        JButton jbuttondelete = new JButton("DELETE");
        jbuttondelete.setBounds(180, 80, 90, 20);
        frame.add(jbuttondelete);

        JButton jbuttonsearch = new JButton("SEARCH");
        jbuttonsearch.setBounds(80, 110, 90, 20);
        frame.add(jbuttonsearch);

        JButton jbuttonupdate = new JButton("UPDATE");
        jbuttonupdate.setBounds(180, 110, 90, 20);
        frame.add(jbuttonupdate);

        JButton jbuttonexit = new JButton("EXIT");
        jbuttonexit.setBounds(180, 390, 90, 20);
        frame.add(jbuttonexit);

        //table creation
        JTable jtable = new JTable();
        jtable.setBounds(20, 140, 250, 250);
        frame.add(jtable);
        jtable.setModel(dtm);
        JScrollPane scrollPane = new JScrollPane(jtable);
        scrollPane.setBounds(20, 140, 250, 250);
        frame.add(scrollPane);
        jtable.getColumnModel().getColumn(0).setPreferredWidth(70);
        jtable.getColumnModel().getColumn(1).setPreferredWidth(150);
        jtable.getColumnModel().getColumn(2).setPreferredWidth(100);

        jbuttoninsert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String name = jtfname.getText().toUpperCase();
                String matric = jtfmatric.getText();
                String phone = jtfphone.getText();
                if (name.length() < 5) {
                    JOptionPane.showMessageDialog(frame, "Name should contain more than 5 char!!!");
                    return;
                }
                if (!isInteger(matric)) {
                    JOptionPane.showMessageDialog(frame, "Matric should only contain integer!!!");
                    return;
                }

                Student student = new Student(name, matric, phone);
                studentlist.add(student);//create object list array
                writeData();
            }
        });

        jbuttondelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String matric = JOptionPane.showInputDialog("Matric number to delete?");
                if (matric != null) {
                    System.out.println("not null");
                    for (int i = 0; i < studentlist.size(); i++) {
                        if (studentlist.get(i).getMatric().equalsIgnoreCase(matric)) {
                            studentlist.remove(i);
                        }
                    }
                    writeData();
                }
            }
        });

        jbuttonsearch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String matric = JOptionPane.showInputDialog("Enter Matric Number?");
                if (matric != null) {
                    for (int i = 0; i < studentlist.size(); i++) {
                        if (studentlist.get(i).getMatric().equalsIgnoreCase(matric)) {
                            JOptionPane.showMessageDialog(frame, "Found!!!");
                            jtfmatric.setText(studentlist.get(i).getMatric());
                            jtfname.setText(studentlist.get(i).getName());
                            jtfphone.setText(studentlist.get(i).getPhone());
                            return;
                        }
                    }
                    JOptionPane.showMessageDialog(frame, "Not Found!!!");
                }
            }
        });

        jbuttonupdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String matric = jtfmatric.getText();
                String name = jtfname.getText();
                String phone = jtfphone.getText();

                if (matric != null) {
                    for (int i = 0; i < studentlist.size(); i++) {
                        if (studentlist.get(i).getMatric().equalsIgnoreCase(matric)) {
                            studentlist.get(i).setName(name);
                            studentlist.get(i).setPhone(phone);
                            JOptionPane.showMessageDialog(frame, "Updated!!!");
                        }
                    }
                }
                writeData();
            }
        });
        jbuttonexit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                frame.setVisible(false); //you can't see me!
                frame.dispose();
            }
        });

        readData();
        jtable.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int row = jtable.getSelectedRow();
                jtfmatric.setText(dtm.getValueAt(row, 0).toString());
                jtfname.setText(dtm.getValueAt(row, 1).toString());
                jtfphone.setText(dtm.getValueAt(row, 2).toString());
            }
        });

        frame.setResizable(false);
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
        BasicGui basicgui = new BasicGui();

    }

    void readData() { //read data from "data.txt" and display on table
        try {
            File file = new File("data.txt"); //create file
            file.createNewFile();//if not exit
            FileReader f = new FileReader("data.txt");
            StringBuffer sb = new StringBuffer();
            while (f.ready()) {
                char c = (char) f.read();
                if (c == '-') {
                    System.out.println(sb);
                    String studentarray[] = sb.toString().split(",");
                    Student student = new Student(studentarray[0], studentarray[1], studentarray[2]);
                    studentlist.add(student);
                    sb = new StringBuffer();
                } else {
                    sb.append(c);
                }
            }
            dtm.setRowCount(0); //update table
            for (int i = 0; i < studentlist.size(); i++) {//populate table using object list
                Object[] objs = {studentlist.get(i).getMatric(), studentlist.get(i).getName(), studentlist.get(i).getPhone()};
                dtm.addRow(objs);
            }
        } catch (IOException e) {
        }
    }

    private void writeData() { //write data to file "data.txt"
        try (FileWriter f = new FileWriter("data.txt")) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < studentlist.size(); i++) {
                sb.append(studentlist.get(i).getName() + "," + studentlist.get(i).getMatric() + "," + studentlist.get(i).getPhone() + "-");
            }
            f.write(sb.toString());
            f.close();
        } catch (IOException e) {
            return;
        }
        dtm.setRowCount(0); //update table content
        for (int i = 0; i < studentlist.size(); i++) {//populate table using object list
            Object[] objs = {studentlist.get(i).getMatric(), studentlist.get(i).getName(), studentlist.get(i).getPhone()};
            dtm.addRow(objs);
        }
    }

    public boolean isInteger(String str) {
        if (str == null) {
            return false;
        }
        int length = str.length();
        if (length == 0) {
            return false;
        }
        int i = 0;
        if (str.charAt(0) == '-') {
            if (length == 1) {
                return false;
            }
            i = 1;
        }
        for (; i < length; i++) {
            char c = str.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }
}

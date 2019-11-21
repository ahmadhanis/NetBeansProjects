/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicgui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Student> studentlist = new ArrayList<Student>();

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
        jbuttoninsert.setBounds(80, 80, 80, 20);
        frame.add(jbuttoninsert);

        JButton jbuttondelete = new JButton("DELETE");
        jbuttondelete.setBounds(165, 80, 80, 20);
        frame.add(jbuttondelete);

        //table creation
        String header[] = new String[]{"Matric", "Name", "Phone"};
        DefaultTableModel dtm = new DefaultTableModel(header, 1);
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
                String name = jtfname.getText();
                String matric = jtfmatric.getText();
                String phone = jtfphone.getText();
                studentlist.add(new Student(name, matric, phone));//create object list array
                dtm.setRowCount(0);//reset table
                for (int i = 0; i < studentlist.size(); i++) {//populate table using object list
                    Object[] objs = {studentlist.get(i).getMatric(), studentlist.get(i).getName(), studentlist.get(i).getPhone()};
                    dtm.addRow(objs);
                }
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
                    dtm.setRowCount(0);
                    for (int i = 0; i < studentlist.size(); i++) {//populate table using object list
                        Object[] objs = {studentlist.get(i).getMatric(), studentlist.get(i).getName(), studentlist.get(i).getPhone()};
                        dtm.addRow(objs);
                    }
                }
            }
        });

        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

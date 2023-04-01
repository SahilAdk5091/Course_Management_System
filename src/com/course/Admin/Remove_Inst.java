package com.course.Admin;
import com.course.Conn;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Remove_Inst extends JFrame implements ActionListener {
    JLabel l1,l2;
    JPanel panel1;
    JTextField t1;
    JButton button1;
    private String StudentID;
    Remove_Inst(){
        super("Courses");
        setBounds(250, 50, 930, 475);
        panel1 = new JPanel();
        panel1.setBackground(new Color(0, 28, 73, 84));
        panel1.setLayout(null);
        setContentPane(panel1);
        l1 = new JLabel("Remove Instructor");
        l1.setBounds(320,30,500,50);
        l1.setFont(new Font("serif",Font.ITALIC,25));
        panel1.add(l1);
        l2 = new JLabel("Enter Teacher_ID:");
        l2.setBounds(50,150,200,30);
        l2.setFont(new Font("serif",Font.BOLD,20));
        panel1.add(l2);
        t1 = new JTextField();
        t1.setBounds(239,150,150,30);
        panel1.add(t1);
        button1 = new JButton("Delete");
        button1.setBounds(60,250,150,50);
        button1.setBackground(Color.black);
        button1.setForeground(Color.WHITE);
        button1.addActionListener(this);
        panel1.add(button1);

        setVisible(true);

    }

    Conn c3 = new Conn();
    void removeInstructor(){
        try {
            StudentID = t1.getText();
            String q = "delete from instructor where Teacherno = '"+StudentID+"'";
            c3.s.executeUpdate(q);
            JOptionPane.showMessageDialog(null, "Instructor deleted Successfully");


        }
        catch (Exception e1){
            System.out.println(e1);
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        removeInstructor();

    }

    public static void main(String[] args) {
        new Remove_Inst();

    }
}

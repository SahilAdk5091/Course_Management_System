package com.course.Instructor;
import com.course.Conn;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Marking_stud extends JFrame implements ActionListener {
    JLabel l1, l2, l3, l4;
    JTextField t1, t2, t3, t4, t5, t6, t7;
    JButton b1;
    private  String subject,marks;
    Marking_stud() {
        setSize(500, 550);
        setLocation(400, 200);
        setLayout(null);

        l1 = new JLabel("Enter marks of Student");
        l1.setFont(new Font("serif", Font.BOLD, 30));
        l1.setBounds(50, 0, 500, 80);
        add(l1);

        l2 = new JLabel("Enter Student Number");
        l2.setBounds(50, 70, 200, 40);
        add(l2);

        t1 = new JTextField();
        t1.setBounds(180, 80, 200, 20);
        add(t1);

        l3 = new JLabel("Enter Subject");
        l3.setBounds(50, 150, 200, 40);
        add(l3);

        l4 = new JLabel("Enter Marks");
        l4.setBounds(250, 150, 200, 40);
        add(l4);

        t2 = new JTextField();
        t2.setBounds(50, 200, 200, 20);
        add(t2);

        t3 = new JTextField();
        t3.setBounds(250, 200, 200, 20);
        add(t3);

        t4 = new JTextField();
        t4.setBounds(50, 230, 200, 20);
        add(t4);

        t5 = new JTextField();
        t5.setBounds(250, 230, 200, 20);
        add(t5);

        t6 = new JTextField();
        t6.setBounds(50, 260, 200, 20);
        add(t6);

        t7 = new JTextField();
        t7.setBounds(250, 260, 200, 20);
        add(t7);


        b1 = new JButton("Submit");
        b1.setBounds(50, 360, 100, 30);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        add(b1);

        b1.addActionListener(this);

    }
    Conn c1 = new Conn();
    public  void subjectval(){
        try {
            subject = "insert into subject values('" + t1.getText() + "','" + t2.getText() + "','" + t4.getText() + "','" + t6.getText() + "')";
            c1.s.executeUpdate(subject);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public  void markval(){
        try {
            marks = "insert into marks values('"+t1.getText()+"','"+t3.getText()+"','"+t5.getText()+"','"+t7.getText()+"')";
            c1.s.executeUpdate(marks);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
            if(e.getSource() == b1){
                subjectval();
                markval();
                JOptionPane.showMessageDialog(null,"Marks Inserted Successfully");
                this.setVisible(false);
            }
    }

public static void main(String[] args){
        new Marking_stud().setVisible(true);
        }
}

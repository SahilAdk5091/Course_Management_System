package com.course.Student;
import com.course.Conn;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Enroll extends JFrame implements ActionListener {
    JButton but1,but2;
    JTextField field,field1;
    JLabel lab,lab1,lab2,lab3,lab4,lab5;
    JPanel pan;
    Choice ch1,ch2 ,ch3,ch4;
    String a;
    Enroll(){
        super("Choose Course");
        setBounds(150, 50, 900, 575);
        pan = new JPanel();
        pan.setBackground(new Color(0, 28, 73, 84));
        setContentPane(pan);
        pan.setLayout(null);
        ch1 = new Choice();
        ch2 = new Choice();
        ch3 = new Choice();
        ch4 = new Choice();
        Conn c = new Conn();
        try {
            ResultSet rs = c.s.executeQuery("select * from module1");
            while (rs.next()) {
                ch1.add(rs.getString("first"));
            }
            ResultSet rs1 = c.s.executeQuery("select * from module2");
            while (rs1.next()) {
                ch2.add(rs1.getString("second"));
            }
            ResultSet rs2 = c.s.executeQuery("select * from module3");
            while (rs2.next()) {
                ch3.add(rs2.getString("third"));
            }
            ResultSet rs3 = c.s.executeQuery("select * from courses");
            while (rs3.next()) {
                ch4.add(rs3.getString("cname"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


        field = new JTextField();
        field.setBounds(189, 89, 150, 30);
        pan.add(field);
        lab = new JLabel("Student Name:");
        lab.setBounds(75,89,357,33);
        lab.setFont(new Font("serif",Font.BOLD,17));
        pan.add(lab);
        field1 = new JTextField();
        field1.setBounds(500, 90, 150, 30);
        pan.add(field1);
        lab1 = new JLabel("Student No:");
        lab1.setBounds(400, 90, 200, 30);
        lab1.setFont(new Font("serif",Font.BOLD,17));
        pan.add(lab1);

        ch4.setBounds(189, 140, 220, 30);
        pan.add(ch4);
        lab2 = new JLabel("Courses:");
        lab2.setBounds(75,140,357,33);
        lab2.setFont(new Font("serif",Font.BOLD,17));
        pan.add(lab2);


        ch1.setBounds(500, 140, 220, 400);
        pan.add(ch1);
        lab3 = new JLabel("Module 1:");
        lab3.setBounds(400, 140, 200, 30);
        lab3.setFont(new Font("serif",Font.BOLD,17));
        pan.add(lab3);


        ch2.setBounds(189, 190, 220, 30);
        pan.add(ch2);
        lab4 = new JLabel("Module 2:");
        lab4.setBounds(75,190,357,33);
        lab4.setFont(new Font("serif",Font.BOLD,17));
        pan.add(lab4);


        ch3.setBounds(500, 190, 220, 30);
        pan.add(ch3);
        lab5 = new JLabel("Module 3:");
        lab5.setBounds(400, 190, 200, 30);
        lab5.setFont(new Font("serif",Font.BOLD,17));
        pan.add(lab5);

        but1 = new JButton("Submit");
        but1.setBounds(200, 300, 150, 40);
        but1.setBackground(Color.black);
        but1.setForeground(Color.WHITE);
        but1.addActionListener(this);
        pan.add(but1);

        but2 = new JButton("Cancel");
        but2.setBounds(400, 300, 150, 40);
        but2.setBackground(Color.black);
        but2.setForeground(Color.WHITE);
        but2.addActionListener(this);
        pan.add(but2);

    }
    void enrollStud(){
        try {
            Conn c7 = new Conn();
            String q = "insert into student_course values('" + field.getText() + "','" + field1.getText() + "','" + ch4.getSelectedItem() + "','" + ch1.getSelectedItem() + "','" + ch2.getSelectedItem()  + "','" + ch3.getSelectedItem()+ "')";
            c7.s.executeUpdate(q);
            JOptionPane.showMessageDialog(null, "Sucessfully enrolled");
        }
        catch (Exception p){
            System.out.println(p);
        }
        setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == but1) {
            enrollStud();

        }
        else if(e.getSource()==but2){
            setVisible(false);
        }


    }

    public static void main(String[] args) {
        new Enroll().enrollStud();

    }
}

package com.course.Student;
import com.course.Conn;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class Registration extends JFrame implements ActionListener {
    JLabel id, id1, id2, id3, id4, id5, id6, id7, id8, id9, id10;
    JTextField  t1, t2, t3, t4, t5, t6, t7, t8, t9;
    JButton b, b1;

    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) + 1000L;//First four numbers
    long positive = Math.abs(first4);//Only positive values

    public Registration() {

        super("AddStudent");
        setBackground(Color.WHITE);
        setLayout(null);
        id = new JLabel();
        id.setBounds(0, 0, 900, 700);
        id.setLayout(null);
        ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("com/course/icons/Photo1.jpg"));
        Image i3 = img.getImage().getScaledInstance(1120, 700, Image.SCALE_DEFAULT);
        ImageIcon icc3 = new ImageIcon(i3);
        id.setIcon(icc3);
        id8 = new JLabel("New Student Details");
        id8.setBounds(320, 30, 500, 50);
        id8.setFont(new Font("serif", Font.ITALIC, 25));
        id8.setForeground(Color.black);
        id.add(id8);
        add(id);


        id1 = new JLabel("First Name");
        id1.setBounds(50, 150, 100, 30);
        id1.setFont(new Font("serif", Font.BOLD, 20));
        id1.setForeground(Color.white);
        id.add(id1);

        t1 = new JTextField();
        t1.setBounds(200, 150, 150, 30);
        id.add(t1);

        id2 = new JLabel("Last Name");
        id2.setBounds(400, 150, 200, 30);
        id2.setFont(new Font("serif", Font.BOLD, 20));
        id2.setForeground(Color.white);
        id.add(id2);

        t2 = new JTextField();
        t2.setBounds(600, 150, 150, 30);
        id.add(t2);

        id3 = new JLabel("Age");
        id3.setBounds(50, 200, 100, 30);
        id3.setFont(new Font("serif", Font.BOLD, 20));
        id3.setForeground(Color.white);
        id.add(id3);

        t3 = new JTextField();
        t3.setBounds(200, 200, 150, 30);
        id.add(t3);

        id4 = new JLabel("DOB (yyy/mm/dd)");
        id4.setBounds(400, 200, 200, 30);
        id4.setFont(new Font("serif", Font.BOLD, 20));
        id4.setForeground(Color.white);
        id.add(id4);

        t4 = new JTextField();
        t4.setBounds(600, 200, 150, 30);
        id.add(t4);

        id5 = new JLabel("Address");
        id5.setBounds(50, 250, 100, 30);
        id5.setFont(new Font("serif", Font.BOLD, 20));
        id5.setForeground(Color.white);
        id.add(id5);

        t5 = new JTextField();
        t5.setBounds(200, 250, 150, 30);
        id.add(t5);

        id6 = new JLabel("Phone");
        id6.setBounds(400, 250, 100, 30);
        id6.setFont(new Font("serif", Font.BOLD, 20));
        id6.setForeground(Color.white);
        id.add(id6);

        t6 = new JTextField();
        t6.setBounds(600, 250, 150, 30);
        id.add(t6);

        id7 = new JLabel("Email Id");
        id7.setBounds(50, 300, 100, 30);
        id7.setFont(new Font("serif", Font.BOLD, 20));
        id7.setForeground(Color.white);
        id.add(id7);

        t7 = new JTextField();
        t7.setBounds(200, 300, 150, 30);
        id.add(t7);

        id9 = new JLabel("Course");
        id9.setBounds(400, 300, 130, 30);
        id9.setFont(new Font("serif", Font.BOLD, 20));
        id9.setForeground(Color.white);
        id.add(id9);

        t8 = new JTextField();
        t8.setBounds(600, 300, 150, 30);
        id.add(t8);

        id10 = new JLabel("Student No");
        id10.setBounds(50, 350, 130, 30);
        id10.setFont(new Font("serif", Font.BOLD, 20));
        id10.setForeground(Color.white);
        id.add(id10);

        t9 = new JTextField();
        t9.setBounds(200, 350, 150, 30);
        t9.setText("206"+positive);
        id.add(t9);


        b = new JButton("Submit");
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        b.setBounds(250, 550, 150, 40);

        id.add(b);

        b1 = new JButton("Cancel");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(450, 550, 150, 40);

        id.add(b1);

        b.addActionListener(this);
        b1.addActionListener(this);

        setVisible(true);
        setSize(900, 700);
        setLocation(200, 50);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b) {
            try {
                Conn cc = new Conn();
                String q = "insert into student values('" + t1.getText() + "','" + t2.getText() + "','" + t3.getText() + "','" + t4.getText() + "','" + t5.getText() + "','" + t6.getText() + "','" + t7.getText() + "','" + t8.getText() + "','" + t9.getText() + "')";
                cc.s.executeUpdate(q);
                String det = "insert into student_details values('" + t1.getText() + "','" + t2.getText() + "','" + t9.getText() + "')";
                cc.s.executeUpdate(det);
                JOptionPane.showMessageDialog(null, "Student Details Inserted Successfully");
                setVisible(false);
            } catch (Exception ee) {
                System.out.println("The error is:" + ee);
            }
        } else if (e.getSource() == b1) {
            setVisible(false);
            new StudentMain().setVisible(true);
        }
    }
    public static void main(String[] args) {
        new Registration();
    }
}

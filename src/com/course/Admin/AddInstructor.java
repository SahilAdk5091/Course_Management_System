package com.course.Admin;
import com.course.Conn;
import java.awt.*;
import java.awt.event.*;

import java.util.Random;
import javax.swing.*;

public class AddInstructor extends JFrame implements ActionListener {
    JLabel id1, id2, id3,id5, id6, id7, id8,id15;
    JTextField t1, t2, t3, t4, t5, t6, t7;
    JButton b, b1;
    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) + 1000L;
    long positive1 = Math.abs(first4);

    AddInstructor() {

        super("AddInstructor");
        setBackground(Color.WHITE);
        setLayout(null);
        id15 = new JLabel();
        id15.setBounds(0, 0, 900, 700);
        id15.setLayout(null);
        ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("com/course/icons/red.jpg"));
        Image i3 = img.getImage().getScaledInstance(900, 780, Image.SCALE_DEFAULT);
        ImageIcon icc3 = new ImageIcon(i3);
        id15.setIcon(icc3);
        id8 = new JLabel("New Instructor Details");
        id8.setBounds(320, 30, 500, 50);
        id8.setFont(new Font("serif", Font.ITALIC, 25));
        id8.setForeground(Color.white);
        id15.add(id8);
        add(id15);


        id1 = new JLabel("First Name");
        id1.setBounds(50, 150, 100, 30);
        id1.setFont(new Font("serif", Font.BOLD, 20));
        id1.setForeground(Color.white);
        id15.add(id1);

        t1 = new JTextField();
        t1.setBounds(200, 150, 150, 30);
        id15.add(t1);

        id2 = new JLabel("Last Name");
        id2.setBounds(400, 150, 200, 30);
        id2.setFont(new Font("serif", Font.BOLD, 20));
        id2.setForeground(Color.white);
        id15.add(id2);

        t2 = new JTextField();
        t2.setBounds(600, 150, 150, 30);
        id15.add(t2);

        id3 = new JLabel("Course");
        id3.setBounds(50, 200, 100, 30);
        id3.setFont(new Font("serif", Font.BOLD, 20));
        id3.setForeground(Color.white);
        id15.add(id3);

        t3 = new JTextField();
        t3.setBounds(200, 200, 150, 30);
        id15.add(t3);

        id5 = new JLabel("Teacher no");
        id5.setBounds(400, 200, 100, 30);
        id5.setFont(new Font("serif", Font.BOLD, 20));
        id5.setForeground(Color.white);
        id15.add(id5);

        t4 = new JTextField();
        t4.setBounds(600, 200, 150, 30);
        t4.setText("300" + positive1);
        id15.add(t4);

        id6 = new JLabel("Level4");
        id6.setBounds(50, 250, 100, 30);
        id6.setFont(new Font("serif", Font.BOLD, 20));
        id6.setForeground(Color.white);
        id15.add(id6);

        t5 = new JTextField();
        t5.setBounds(200, 250, 150, 30);
        id15.add(t5);


        id7 = new JLabel("Level5");
        id7.setBounds(400, 250, 100, 30);
        id7.setFont(new Font("serif", Font.BOLD, 20));
        id7.setForeground(Color.white);
        id15.add(id7);

        t6 = new JTextField();
        t6.setBounds(600, 250, 150, 30);
        id15.add(t6);


        id8 = new JLabel("Level6");
        id8.setBounds(50, 300, 130, 30);
        id8.setFont(new Font("serif", Font.BOLD, 20));
        id8.setForeground(Color.white);
        id15.add(id8);

        t7 = new JTextField();
        t7.setBounds(200, 300, 150, 30);
        id15.add(t7);


        b = new JButton("Submit");
        b.setBackground(Color.white);
        b.setForeground(Color.black);
        b.setBounds(300, 400, 150, 40);

        id15.add(b);

        b1 = new JButton("Cancel");
        b1.setBackground(Color.white);
        b1.setForeground(Color.black);
        b1.setBounds(500, 400, 150, 40);

        id15.add(b1);

        b.addActionListener(this);
        b1.addActionListener(this);

        setSize(900, 700);
        setLocation(250, 20);
        setVisible(true);

    }
    private void addinstructor(){
            try {
                Conn cc = new Conn();
                String q = "insert into instructor values('" + t1.getText() + "','" + t2.getText() + "','" + t3.getText() + "','" + t4.getText() + "','" + t5.getText() + "','" + t6.getText() + "','" + t7.getText() + "')";
                cc.s.executeUpdate(q);
                JOptionPane.showMessageDialog(null, "Student Details Inserted Successfully");
                setVisible(false);
            }
            catch (Exception ee) {
                System.out.println("The error is:" + ee);
            }


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b) {
            addinstructor();
        }
    }
    public static void main(String[] args) {
      new AddInstructor();
    }
}


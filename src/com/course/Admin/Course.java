package com.course.Admin;
import com.course.Conn;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Course extends JFrame implements ActionListener {
    JLabel lab,lab1,lab2,lab3,lab4,lab5;
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;
    JButton b1,b2,b3;
    private String a;

    Course() {
        super("Courses");
        setLayout(null);
        setBackground(Color.white);
        lab = new JLabel();
        lab.setBounds(0, 0, 900, 700);
        lab.setLayout(null);
        ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("com/course/icons/red.jpg"));
        Image i3 = img.getImage().getScaledInstance(1220, 850, Image.SCALE_DEFAULT);
        ImageIcon icc3 = new ImageIcon(i3);
        lab.setIcon(icc3);
        lab1 = new JLabel("Courses");
        lab1.setBounds(320, 30, 500, 50);
        lab1.setFont(new Font("serif", Font.ITALIC, 25));
        lab1.setForeground(Color.WHITE);
        lab.add(lab1);
        lab2 = new JLabel("Course Name:");
        lab2.setBounds(50, 150, 200, 30);
        lab2.setFont(new Font("serif", Font.BOLD, 20));
        lab2.setForeground(Color.white);
        lab.add(lab2);
        t1 = new JTextField();
        t1.setBounds(239, 150, 150, 30);
        lab.add(t1);
        lab3 = new JLabel("Level4:");
        lab3.setBounds(50, 200, 200, 30);
        lab3.setFont(new Font("serif", Font.BOLD, 20));
        lab3.setForeground(Color.white);
        lab.add(lab3);
        t2 = new JTextField();
        t2.setBounds(239, 200, 150, 30);
        t3 = new JTextField();
        t3.setBounds(400, 200, 150, 30);
        t4 = new JTextField();
        t4.setBounds(570, 200, 150, 30);
        lab.add(t2);
        lab.add(t3);
        lab.add(t4);
        lab4 = new JLabel("Level5:");
        lab4.setBounds(50, 250, 200, 30);
        lab4.setFont(new Font("serif", Font.BOLD, 20));
        lab4.setForeground(Color.white);
        lab.add(lab4);
        t5 = new JTextField();
        t5.setBounds(239, 250, 150, 30);
        t6 = new JTextField();
        t6.setBounds(400, 250, 150, 30);
        t7 = new JTextField();
        t7.setBounds(570, 250, 150, 30);
        lab.add(t5);
        lab.add(t6);
        lab.add(t7);
        lab5 = new JLabel("Level6:");
        lab5.setBounds(50, 300, 200, 30);
        lab5.setFont(new Font("serif", Font.BOLD, 20));
        lab5.setForeground(Color.white);
        lab.add(lab5);
        t8 = new JTextField();
        t8.setBounds(239, 300, 150, 30);
        t9 = new JTextField();
        t9.setBounds(400, 300, 150, 30);
        t10 = new JTextField();
        t10.setBounds(570, 300, 150, 30);
        lab.add(t8);
        lab.add(t9);
        lab.add(t10);
        b1 = new JButton("Add Course");
        b1.setBounds(50, 400, 150, 40);
        b1.addActionListener(this);
        lab.add(b1);
        b2 = new JButton("Delete Course");
        b2.setBounds(300, 400, 150, 40);
        b2.addActionListener(this);
        lab.add(b2);
        b3 = new JButton("Update Course");
        b3.setBounds(500, 400, 150, 40);
        b3.addActionListener(this);
        lab.add(b3);

        add(lab);
        setBounds(250, 30, 900, 650);
        setVisible(true);
    }
        Conn c1 = new Conn();

        public void addcourse(){
                try {
                    String cou = "insert into courses values('" + t1.getText() + "','" + t2.getText() + "','" + t3.getText() + "','" + t4.getText() + "','" + t5.getText() + "','" + t6.getText() + "','" + t7.getText() + "','" + t8.getText() + "','" + t9.getText() + "','" + t10.getText() + "')";
                    c1.s.executeUpdate(cou);
                    String first1 = "insert into module1 values('" + t2.getText() +  "')";
                    String first2 = "insert into module1 values('" + t5.getText() +  "')";
                    String first3 = "insert into module1 values('" + t8.getText() +  "')";
                    c1.s.executeUpdate(first1);
                    c1.s.executeUpdate(first2);
                    c1.s.executeUpdate(first3);
                    String second1 = "insert into module2 values('" + t3.getText() +  "')";
                    String second2 = "insert into module2 values('" + t6.getText() +  "')";
                    String second3 = "insert into module2 values('" + t9.getText() +  "')";
                    c1.s.executeUpdate(second1);
                    c1.s.executeUpdate(second2);
                    c1.s.executeUpdate(second3);

                    String third1 = "insert into module3 values('" + t4.getText() +  "')";
                    String third2 = "insert into module3 values('" + t7.getText() +  "')";
                    String third3 = "insert into module3 values('" + t10.getText() +  "')";
                    c1.s.executeUpdate(third1);
                    c1.s.executeUpdate(third2);
                    c1.s.executeUpdate(third3);
                    JOptionPane.showMessageDialog(null, "Course data Inserted Successfully");
                } catch (Exception ee) {
                    System.out.println("The error is:" + ee);
                }
        }
        void updatecourse(){
            try {
                a = t1.getText();
                String lev4f = t2.getText();
                String lev4s = t3.getText();
                String lev4t = t4.getText();
                String lev5f = t5.getText();
                String lev5s = t6.getText();
                String lev5t = t7.getText();
                String lev6f = t8.getText();
                String lev6s = t9.getText();
                String lev6t = t10.getText();

                String q = "Update courses Set lev4f = '"+lev4f+"',lev4s = '"+lev4s+"',lev4t = '"+lev4t+"',lev5f = '"+lev5f+"',lev5s = '"+lev5s+"',lev5t = '"+lev5t+"',lev6f = '"+lev6f+"',lev6s = '"+lev6s+"',lev6t = '"+lev6t+"' where cname = '"+a+"'";
                c1.s.executeUpdate(q);
                JOptionPane.showMessageDialog(null, "Updated Successfully");


            }
            catch (Exception r){
                System.out.println(r);
            }

        }
        void deletecourse(){
            try {
                a = t1.getText();
                String q = "delete from courses where cname = '"+a+"'";
                c1.s.executeUpdate(q);
                JOptionPane.showMessageDialog(null, "Data deleted Successfully");


            }
            catch (Exception e1){
                System.out.println(e1);
            }
        }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
            addcourse();

        }
        else if (e.getSource()==b2){
            deletecourse();
        }
        else if(e.getSource()==b3){
            updatecourse();
        }

    }

    public static void main(String[] args) {
        new Course();

    }


}

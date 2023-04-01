package com.course.Student;
import com.course.Admin.Exam_detail;
import com.course.Admin.Teacher_Detail;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentMain extends JFrame implements ActionListener {
    public StudentMain() {
        super("Course Management System");

        setSize(1820, 1030);//Frame size.

        ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("com/course/icons/green.jpg"));
        Image i3 = img.getImage().getScaledInstance(1300, 650, Image.SCALE_DEFAULT);//Width and
        ImageIcon image_icon = new ImageIcon(i3);
        JLabel l1 = new JLabel(image_icon);

        add(l1);

        JMenuBar mb = new JMenuBar();
        JMenu fill = new JMenu("Register");
        JMenuItem m1 = new JMenuItem("Register Form");
        fill.setForeground(Color.BLACK);


        m1.setFont(new Font("monospaced", Font.BOLD, 16));
        m1.setBackground(Color.WHITE);

        m1.addActionListener(this);

        JMenuBar enroll = new JMenuBar();
        JMenu err = new JMenu("Enroll");
        JMenuItem m = new JMenuItem("Enroll Form");
        fill.setForeground(Color.BLACK);


        m.setFont(new Font("monospaced", Font.BOLD, 16));
        m.setBackground(Color.WHITE);

        m.addActionListener(this);


        JMenu result = new JMenu("Result");
        JMenuItem u1 = new JMenuItem("Check Result");
        result.setForeground(Color.BLACK);

        u1.setFont(new Font("monospaced", Font.BOLD, 16));
        u1.setBackground(Color.WHITE);

        u1.addActionListener(this);

        JMenu attendance = new JMenu("Module");
        JMenuItem a1 = new JMenuItem("Module Leader");
        attendance.setForeground(Color.BLACK);

        a1.setFont(new Font("monospaced", Font.BOLD, 16));
        a1.setBackground(Color.WHITE);
        attendance.add(a1);


        a1.addActionListener(this);


        JMenu exit = new JMenu("Exit");
        JMenuItem ex = new JMenuItem("Exit");
        exit.setForeground(Color.BLACK);


        ex.setFont(new Font("monospaced", Font.BOLD, 16));
        ex.setBackground(Color.WHITE);

        ex.addActionListener(this);


        fill.add(m1);
        err.add(m);
        enroll.add(err);

        result.add(u1);

        exit.add(ex);

        mb.add(fill);
        mb.add(enroll);
        mb.add(result);
        mb.add(attendance);
        mb.add(exit);




        setJMenuBar(mb);

        setFont(new Font("Sense-rif", Font.BOLD, 16));
        setLayout(new FlowLayout());
        setVisible(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String stud = e.getActionCommand();
        if(stud.equals("Register Form")){
            new Registration().setVisible(true);
        }else if(stud.equals("Enroll Form")){
            new Enroll().setVisible(true);
        }else if(stud.equals("Check Result")){
            new Exam_detail().setVisible(true);

        }else if(stud.equals("Module Leader")){
            new Teacher_Detail().setVisible(true);
        }else if(stud.equals("Exit")){
            setVisible(false);
        }

    }

    public static void main(String[] args) {
        new StudentMain().setVisible(true);
    }
}
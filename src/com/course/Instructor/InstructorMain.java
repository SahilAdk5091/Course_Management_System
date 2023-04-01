package com.course.Instructor;
import com.course.Admin.Teacher_Detail;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InstructorMain extends JFrame implements ActionListener {
    public InstructorMain() {
        super("Course Management System");

        setSize(1920, 1030);//Frame size.
        //Main image fro the background.
        ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("com/course/icons/blue.jpg"));
        //height of that image.
        Image i3 = img.getImage().getScaledInstance(1300, 950, Image.SCALE_DEFAULT);//Width and
        ImageIcon image_icon = new ImageIcon(i3);
        JLabel l1 = new JLabel(image_icon);

        add(l1);

        JMenuBar menu1 = new JMenuBar();

        JMenu Student = new JMenu("Details");
        JMenuItem u1 = new JMenuItem("Student Details");
        Student.setForeground(Color.BLACK);

        u1.setFont(new Font("monospaced", Font.BOLD, 16));
        u1.setBackground(Color.WHITE);

        u1.addActionListener(this);

        JMenu marking = new JMenu("Marking");
        JMenuItem a1 = new JMenuItem("Enter Marks");
        marking.setForeground(Color.BLACK);

        a1.setFont(new Font("monospaced", Font.BOLD, 16));
        a1.setBackground(Color.WHITE);
        marking.add(a1);

        a1.addActionListener(this);


        JMenu exit = new JMenu("Exit");
        JMenuItem ex = new JMenuItem("Exit");
        exit.setForeground(Color.BLACK);


        ex.setFont(new Font("monospaced", Font.BOLD, 16));
        ex.setBackground(Color.WHITE);

        ex.addActionListener(this);


        marking.add(a1);

        Student.add(u1);

        exit.add(ex);

        menu1.add(Student);
        menu1.add(marking);
        menu1.add(exit);

        setJMenuBar(menu1);

        setFont(new Font("Sense-rif", Font.BOLD, 16));
        setLayout(new FlowLayout());
        setVisible(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();
        if(action.equals("Student Details")){
            new Student_Course().StudCourse();

        } else if(action.equals("Enter Marks")){
            new Marking_stud().setVisible(true);

        }else if(action.equals("Exit")){
            setVisible(false);
        }

    }

    public static void main(String[] args) {
        new InstructorMain().setVisible(true);
    }
}
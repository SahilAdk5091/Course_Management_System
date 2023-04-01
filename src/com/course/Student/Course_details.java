package com.course.Student;

import javax.swing.*;
import java.awt.*;

public class Course_details extends JFrame {
    JLabel l1,l2,l3,l4;
    JLabel lev4,lev5,lev6;
    JLabel l4m1;
    Course_details(){
        setSize(1200,650);
        setLocation(40,10);
        setLayout(null);

        l1 = new JLabel("Courses Currently Available");
        l1.setBounds(400,30,400,50);
        l1.setFont(new Font("serif", Font.ITALIC, 25));
        l1.setBackground(Color.black);
        add(l1);

        l2 = new JLabel("BIT");
        l2.setBounds(50, 150, 100, 30);
        l2.setFont(new Font("serif", Font.BOLD, 20));
        add(l2);
        lev4 = new JLabel("Level4");
        lev4.setBounds(50, 180, 90, 30);
        lev4.setFont(new Font("serif",Font.BOLD,15));
        add(lev4);
        l4m1 = new JLabel("Academic Skills and Team Based Learning");
        l4m1.setBounds(50, 200, 300, 30);
        l4m1.setFont(new Font("serif",Font.BOLD,15));
        add(l4m1);
        l4m1 = new JLabel("Introductory Programming and Problem Solving");
        l4m1.setBounds(50, 220, 350, 30);
        l4m1.setFont(new Font("serif",Font.BOLD,15));
        add(l4m1);
        l4m1 = new JLabel("Fundamentals of Computing");
        l4m1.setBounds(50, 240, 300, 30);
        l4m1.setFont(new Font("serif",Font.BOLD,15));
        add(l4m1);
        l4m1 = new JLabel("Embedded System Programming");
        l4m1.setBounds(50, 260, 300, 30);
        l4m1.setFont(new Font("serif",Font.BOLD,15));
        add(l4m1);
        l4m1 = new JLabel("Internet Software Architecture");
        l4m1.setBounds(50, 280, 300, 30);
        l4m1.setFont(new Font("serif",Font.BOLD,15));
        add(l4m1);
        l4m1 = new JLabel("Computational Mathematics");
        l4m1.setBounds(50, 300, 300, 30);
        l4m1.setFont(new Font("serif",Font.BOLD,15));
        add(l4m1);

        lev5 = new JLabel("Level5");
        lev5.setBounds(50, 330, 90, 30);
        lev5.setFont(new Font("serif",Font.BOLD,15));
        add(lev5);
        l4m1 = new JLabel("Concepts and Technologies of AI");
        l4m1.setBounds(50, 350, 300, 30);
        l4m1.setFont(new Font("serif",Font.BOLD,15));
        add(l4m1);
        l4m1 = new JLabel("Object-Oriented Design and Programming");
        l4m1.setBounds(50, 370, 300, 30);
        l4m1.setFont(new Font("serif",Font.BOLD,15));
        add(l4m1);
        l4m1 = new JLabel("Numerical Methods and Concurrency");
        l4m1.setBounds(50, 390, 300, 30);
        l4m1.setFont(new Font("serif",Font.BOLD,15));
        add(l4m1);
        l4m1 = new JLabel("Distributed and Cloud System Programming");
        l4m1.setBounds(50, 410, 300, 30);
        l4m1.setFont(new Font("serif",Font.BOLD,15));
        add(l4m1);
        l4m1 = new JLabel("Collaborative Development");
        l4m1.setBounds(50, 430, 300, 30);
        l4m1.setFont(new Font("serif",Font.BOLD,15));
        add(l4m1);
        l4m1 = new JLabel("Human Computer Interaction");
        l4m1.setBounds(50, 450, 300, 30);
        l4m1.setFont(new Font("serif",Font.BOLD,15));
        add(l4m1);

        lev6 = new JLabel("Level6");
        lev6.setBounds(50, 480, 90, 30);
        lev6.setFont(new Font("serif",Font.BOLD,15));
        add(lev6);
        l4m1 = new JLabel("Complex System");
        l4m1.setBounds(50, 500, 300, 30);
        l4m1.setFont(new Font("serif",Font.BOLD,15));
        add(l4m1);
        l4m1 = new JLabel("High Performance Computing");
        l4m1.setBounds(50, 520, 300, 30);
        l4m1.setFont(new Font("serif",Font.BOLD,15));
        add(l4m1);
        l4m1 = new JLabel("Project and Professionalism");
        l4m1.setBounds(50, 540, 300, 30);
        l4m1.setFont(new Font("serif",Font.BOLD,15));
        add(l4m1);
        l4m1 = new JLabel("Artificial Intelligence and Machine Learning");
        l4m1.setBounds(50, 560, 300, 30);
        l4m1.setFont(new Font("serif",Font.BOLD,15));
        add(l4m1);
        l4m1 = new JLabel("Big Data");
        l4m1.setBounds(50, 580, 300, 30);
        l4m1.setFont(new Font("serif",Font.BOLD,15));
        add(l4m1);


        l3 = new JLabel("BBA");
        l3.setBounds(450, 150, 100, 30);
        l3.setFont(new Font("serif", Font.BOLD, 20));
        add(l3);
        lev4 = new JLabel("Level4");
        lev4.setBounds(450, 180, 90, 30);
        lev4.setFont(new Font("serif",Font.BOLD,15));
        add(lev4);
        l4m1 = new JLabel(" 21st Century Management");
        l4m1.setBounds(450, 200, 300, 30);
        l4m1.setFont(new Font("serif",Font.BOLD,15));
        add(l4m1);
        l4m1 = new JLabel("Preparing for Success at University");
        l4m1.setBounds(450, 220, 300, 30);
        l4m1.setFont(new Font("serif",Font.BOLD,15));
        add(l4m1);
        l4m1 = new JLabel("Principles of Business");
        l4m1.setBounds(450, 240, 300, 30);
        l4m1.setFont(new Font("serif",Font.BOLD,15));
        add(l4m1);
        l4m1 = new JLabel("Project Based Learning");
        l4m1.setBounds(450, 260, 300, 30);
        l4m1.setFont(new Font("serif",Font.BOLD,15));
        add(l4m1);

        lev5 = new JLabel("Level5");
        lev5.setBounds(450, 290, 90, 30);
        lev5.setFont(new Font("serif",Font.BOLD,15));
        add(lev5);
        l4m1 = new JLabel("The Responsible Business");
        l4m1.setBounds(450, 310, 300, 30);
        l4m1.setFont(new Font("serif",Font.BOLD,15));
        add(l4m1);
        l4m1 = new JLabel("The Sustainable Business");
        l4m1.setBounds(450, 330, 300, 30);
        l4m1.setFont(new Font("serif",Font.BOLD,15));
        add(l4m1);
        l4m1 = new JLabel("The Innovative Business");
        l4m1.setBounds(450, 350, 300, 30);
        l4m1.setFont(new Font("serif",Font.BOLD,15));
        add(l4m1);
        l4m1 = new JLabel("The Digital Business");
        l4m1.setBounds(450, 370, 300, 30);
        l4m1.setFont(new Font("serif",Font.BOLD,15));
        add(l4m1);

        lev6 = new JLabel("Level6");
        lev6.setBounds(450, 400, 90, 30);
        lev6.setFont(new Font("serif",Font.BOLD,15));
        add(lev6);
        l4m1 = new JLabel("The Strategic Business");
        l4m1.setBounds(450, 420, 300, 30);
        l4m1.setFont(new Font("serif",Font.BOLD,15));
        add(l4m1);
        l4m1 = new JLabel("The International HR Professional");
        l4m1.setBounds(450, 440, 300, 30);
        l4m1.setFont(new Font("serif",Font.BOLD,15));
        add(l4m1);
        l4m1 = new JLabel("Operation and Project Planning");
        l4m1.setBounds(450, 460, 300, 30);
        l4m1.setFont(new Font("serif",Font.BOLD,15));
        add(l4m1);
        l4m1 = new JLabel("Managing Finance and Accounts");
        l4m1.setBounds(450, 480, 300, 30);
        l4m1.setFont(new Font("serif",Font.BOLD,15));
        add(l4m1);

        l4 = new JLabel("Bachelors in International Business Management");
        l4.setBounds(765, 150, 500, 30);
        l4.setFont(new Font("serif", Font.BOLD, 20));
        add(l4);
        lev4 = new JLabel("Modules");
        lev4.setBounds(765, 180, 90, 30);
        lev4.setFont(new Font("serif",Font.BOLD,15));
        add(lev4);
        l4m1 = new JLabel("Financial Decision Making");
        l4m1.setBounds(765, 200, 300, 30);
        l4m1.setFont(new Font("serif",Font.BOLD,15));
        add(l4m1);
        l4m1 = new JLabel("Strategic Global Marketing");
        l4m1.setBounds(765, 220, 300, 30);
        l4m1.setFont(new Font("serif",Font.BOLD,15));
        add(l4m1);
        l4m1 = new JLabel("The Masters Research Project");
        l4m1.setBounds(765, 240, 300, 30);
        l4m1.setFont(new Font("serif",Font.BOLD,15));
        add(l4m1);
        l4m1 = new JLabel("The Masters Professional Project");
        l4m1.setBounds(765, 260, 300, 30);
        l4m1.setFont(new Font("serif",Font.BOLD,15));
        add(l4m1);
        l4m1 = new JLabel("Contemporary issues in Human Resources");
        l4m1.setBounds(765, 280, 300, 30);
        l4m1.setFont(new Font("serif",Font.BOLD,15));
        add(l4m1);
        l4m1 = new JLabel("Strategic Operations Management");
        l4m1.setBounds(765, 300, 300, 30);
        l4m1.setFont(new Font("serif",Font.BOLD,15));
        add(l4m1);



    }

    public static void main(String[] args) {
        new Course_details().setVisible(true);

    }
}

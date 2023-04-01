package com.course.Admin;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AdminMain extends JFrame implements ActionListener {
    public AdminMain() {
        super("Course Management System");

        setSize(1920, 1030);//Frame size.

        ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("com/course/icons/red.jpg"));
        Image i3 = img.getImage().getScaledInstance(1300, 950, Image.SCALE_DEFAULT);//Width and
        ImageIcon image_icon = new ImageIcon(i3);
        JLabel l1 = new JLabel(image_icon);

        add(l1);

        JMenuBar menu = new JMenuBar();
        JMenu course = new JMenu("Register Course");
        JMenuItem Add = new JMenuItem("Add Course");
        JMenuItem Del = new JMenuItem("Delete Course");
        JMenuItem upd = new JMenuItem("Update Course");
        course.setForeground(Color.BLACK);


        Add.setFont(new Font("monospaced", Font.BOLD, 16));
        Add.setBackground(Color.WHITE);

        Del.setFont(new Font("monospaced", Font.BOLD, 16));
        Del.setBackground(Color.WHITE);

        upd.setFont(new Font("monospaced", Font.BOLD, 16));
        upd.setBackground(Color.WHITE);


        Add.addActionListener(this);
        Del.addActionListener(this);
        upd.addActionListener(this);


        JMenu det = new JMenu("Details");
        JMenuItem stdet = new JMenuItem("Student Details");
        JMenuItem tedet = new JMenuItem("Teacher Details");
        det.setForeground(Color.BLACK);

        stdet.setFont(new Font("monospaced", Font.BOLD, 16));
        stdet.setBackground(Color.WHITE);

        tedet.setFont(new Font("monospaced", Font.BOLD, 16));
        tedet.setBackground(Color.WHITE);

        stdet.addActionListener(this);
        tedet.addActionListener(this);

        JMenu exam = new JMenu("Examination");
        JMenuItem c1 = new JMenuItem("Examination Details");
        exam.setForeground(Color.BLACK);

        c1.setFont(new Font("monospaced", Font.BOLD, 16));
        c1.setBackground(Color.WHITE);
        exam.add(c1);


        c1.addActionListener(this);


        JMenu report = new JMenu("Add Teacher");
        JMenuItem rt = new JMenuItem("Update Teachers");
        report.setForeground(Color.BLACK);

        rt.setFont(new Font("monospaced", Font.BOLD, 16));
        rt.setBackground(Color.WHITE);

        rt.addActionListener(this);

        JMenu exit = new JMenu("Exit");
        JMenuItem ex = new JMenuItem("Exit");
        exit.setForeground(Color.BLACK);


        ex.setFont(new Font("monospaced", Font.BOLD, 16));
        ex.setBackground(Color.WHITE);

        ex.addActionListener(this);


        course.add(Add);
        course.add(Del);
        course.add(upd);

        det.add(stdet);
        det.add(tedet);

        report.add(rt);

        exit.add(ex);
        menu.add(course);
        menu.add(det);
        menu.add(exam);
        menu.add(report);
        menu.add(exit);

        setJMenuBar(menu);

        setFont(new Font("Sense-rif", Font.BOLD, 16));
        setLayout(new FlowLayout());
        setVisible(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String msg = e.getActionCommand();
        if(msg.equals("Add Course")){
            new Course().setVisible(true);

        }else if(msg.equals("Delete Course")){
            new Course().setVisible(true);

        }else if(msg.equals("Update Course")){
            new Course().setVisible(true);

        }
        else if(msg.equals("Student Details")){
            new StudentDetail().StudDetail();
        }
        else if(msg.equals("Teacher Details")){
            new Teacher_Detail().TecDetails();
        }
        else if(msg.equals("Examination Details")){
            new Exam_detail().setVisible(true);
        }
        else if(msg.equals("Update Teachers")) {
            new AddInstructor().setVisible(true);
        }
        else if(msg.equals("Exit")){
            setVisible(false);

        }
    }

    public static void main(String[] args) {
        new AdminMain().setVisible(true);
    }
}
package com.course.Admin;
import com.course.Conn;

import java.awt.*;
import javax.swing.*;
import java.sql.*;

public class Marks extends JFrame{

    JTextArea t1;
    JPanel p1;
    Marks(String str){
        setSize(500,600);
        setLayout(new BorderLayout());

        p1 = new JPanel();

        t1 = new JTextArea(50,15);
        JScrollPane jsp = new JScrollPane(t1);
        t1.setFont(new Font("Senserif",Font.ITALIC,18));

        add(p1,"North");

        add(jsp,"Center");

        setLocation(450,200);
        mark(str);
    }

    public void mark(String s){
        try{
            Conn c = new Conn();

            t1.setText("\tResult of Examination\n\nSubject\n");

            ResultSet rs1 = c.s.executeQuery("select * from subject where student_no="+s);

            if(rs1.next()){
                t1.append("\n\t"+rs1.getString("Module1"));
                t1.append("\n\t"+rs1.getString("Module2"));
                t1.append("\n\t"+rs1.getString("Module3"));
                t1.append("\n-----------------------------------------");
                t1.append("\n");
            }

            ResultSet rs2 = c.s.executeQuery("select * from marks where student_no="+s);

            if(rs2.next()){
                int marks1 = Integer.parseInt(rs2.getString("marks1"));
                int marks2 = Integer.parseInt(rs2.getString("marks2"));
                int marks3 = Integer.parseInt(rs2.getString("marks3"));
                int total = marks1+marks2+marks3;

                t1.append("\nMarks\n\n\t"+rs2.getString("marks1"));
                t1.append("\n\t"+rs2.getString("marks2"));
                t1.append("\n\t"+rs2.getString("marks3"));
                t1.append("\n-----------------------------------------");
                t1.append("\n");
                t1.append("\nTotal Marks:     ");
                t1.append(total+"/300");
            }

        }catch(Exception e){
            e.printStackTrace();
        }

    }

    public static void main(String[] args){
    }
}

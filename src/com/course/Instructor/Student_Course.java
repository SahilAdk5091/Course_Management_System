package com.course.Instructor;
import com.course.Conn;

import javax.swing.*;
import java.sql.ResultSet;

public class Student_Course extends JFrame {
    JTable j1;
    String h[]={"Name","StudentNO","Course","Module1","Module2","Module3"};
    String d[][]=new String[23][6];
    int i=0,j=0;
    Student_Course(){
        super("Students Course Details");
        setSize(800,400);
        setLocation(250,150);


    }
    void StudCourse(){
        try{
            String q="select * from student_course";
            Conn c9=new Conn();
            ResultSet rs=c9.s.executeQuery(q);
            while(rs.next()){
                d[i][j++]=rs.getString("studentname");
                d[i][j++]=rs.getString("studentno");
                d[i][j++]=rs.getString("courses");
                d[i][j++]=rs.getString("module1");
                d[i][j++]=rs.getString("module2");
                d[i][j++]=rs.getString("module3");
                i++;
                j=0;
            }

            j1=new JTable(d,h);

        }catch(Exception e){}

        JScrollPane s4=new JScrollPane(j1);
        add(s4);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Student_Course().StudCourse();

    }


}

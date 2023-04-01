package com.course.Admin;
import com.course.Conn;

import java.sql.*;
import javax.swing.*;

public class StudentDetail extends JFrame {

    JTable j1;
    JButton b1;
    String h[]={"FirstName","LastName","StudentNO"};
    String d[][]=new String[23][4];
    int i=0,j=0;

    StudentDetail(){
        super("Students Details");
        setSize(800,300);
        setLocation(250,150);
    }
    void StudDetail(){

        try{
            String q="select * from student_details";
            Conn c1=new Conn();
            ResultSet rs=c1.s.executeQuery(q);
            while(rs.next()){
                d[i][j++]=rs.getString("fname");
                d[i][j++]=rs.getString("lname");
                d[i][j++]=rs.getString("roll");
                i++;
                j=0;
            }
            j1=new JTable(d,h);
        }catch(Exception e){}

        JScrollPane s1=new JScrollPane(j1);
        add(s1);
        setVisible(true);
    }

    public static void main(String[] args){
        new StudentDetail().StudDetail();
    }
}

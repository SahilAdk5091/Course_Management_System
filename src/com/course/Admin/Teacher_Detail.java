package com.course.Admin;
import com.course.Conn;
import javax.swing.*;

import java.sql.ResultSet;

public class Teacher_Detail extends JFrame {
    JTable j1;
    String h[]={"FirstName","LastName","Course","Teacher_id","level4","level5","level6"};
    String d[][]=new String[23][7];
    int i=0,j=0;
    public Teacher_Detail(){
        super("Teacher Details");
        setSize(700,400);
        setLocation(250,150);

        }
        void TecDetails(){
            try{
                String q="select * from instructor";
                Conn c4=new Conn();
                ResultSet rs=c4.s.executeQuery(q);
                while(rs.next()){
                    d[i][j++]=rs.getString("fname");
                    d[i][j++]=rs.getString("lname");
                    d[i][j++]=rs.getString("course");
                    d[i][j++]=rs.getString("Teacherno");
                    d[i][j++]=rs.getString("level4");
                    d[i][j++]=rs.getString("level5");
                    d[i][j++]=rs.getString("level6");
                    i++;
                    j=0;
                }

                j1=new JTable(d,h);

            }catch(Exception e){}

            JScrollPane s1=new JScrollPane(j1);
            add(s1);
            setVisible(true);

        }

    public static void main(String[] args) {
        Teacher_Detail tec = new Teacher_Detail();
        tec.TecDetails();


    }
}

package com.course;
import com.course.Admin.AdminMain;
import com.course.Instructor.InstructorMain;
import com.course.Student.StudentMain;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Login extends JFrame implements ActionListener {
    JLabel label1;
    JLabel label2;
    JTextField textField1;
    JPasswordField passField2;
    JButton button1;
    JButton button2;
    private String username; 
    private String password ; 

    Login() {
        super("Login");
        this.setBackground(Color.white);
        this.setLayout(null);
        this.label1 = new JLabel("Username");
        this.label1.setBounds(40, 20, 100, 30);
        this.add(this.label1);
        this.label2 = new JLabel("Password");
        this.label2.setBounds(40, 70, 100, 30);
        this.add(this.label2);
        this.textField1 = new JTextField();
        this.textField1.setBounds(150, 20, 150, 30);
        this.add(this.textField1);
        this.passField2 = new JPasswordField();
        this.passField2.setBounds(150, 70, 150, 30);
        this.add(this.passField2);
        this.button1 = new JButton("Login");
        this.button1.setBounds(40, 140, 120, 30);
        this.button1.setFont(new Font("serif", 1, 15));
        this.button1.addActionListener(this);
        this.button1.setBackground(Color.BLACK);
        this.button1.setForeground(Color.WHITE);
        this.add(this.button1);
        this.button2 = new JButton("Cancel");
        this.button2.setBounds(180, 140, 120, 30);
        this.button2.setFont(new Font("serif", 1, 15));
        this.button2.setBackground(Color.BLACK);
        this.button2.setForeground(Color.WHITE);
        this.add(this.button2);
        this.button2.addActionListener(this);
        this.getContentPane().setBackground(Color.WHITE);
        this.setVisible(true);
        this.setSize(600, 300);
        this.setLocation(400, 200);
    }
    public static void main(String[] arg) {
        new Login();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button1){
            username = textField1.getText();
            password = String.valueOf(passField2.getPassword());

            if(username.equals("Admin") && password.equals("admin")){
                new AdminMain().setVisible(true);
                this.setVisible(false);
            }
            else if(username.equals("Student") && password.equals("student")){
                new StudentMain().setVisible(true);
                this.setVisible(false);
            }
            else if(username.equals("Instructor") && password.equals("instructor")){
                new InstructorMain().setVisible(true);
                this.setVisible(false);
            }
            else {
                JOptionPane.showMessageDialog(null,"Invalid username or password");
            }
        }
        else if(e.getSource()==button2){
            this.setVisible(false);
        }

    }
}

package com.course.Admin;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;

public class Exam_detail extends JFrame implements ActionListener {
        private JPanel contentPane;
        private JTextField search;
        private JButton b1;
        private String ID;

        public Exam_detail() {

            setBounds(250, 150, 930, 475);
            contentPane = new JPanel();
            contentPane.setBackground(Color.WHITE);
            contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
            setContentPane(contentPane);
            contentPane.setLayout(null);

            b1 = new JButton("Result");
            b1.addActionListener(this);
            b1.setBorder(new LineBorder(new Color(255, 20, 147), 2, true));
            b1.setForeground(new Color(199, 21, 133));
            b1.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
            b1.setBounds(564, 89, 138, 33);
            contentPane.add(b1);

            search = new JTextField();
            search.setBackground(new Color(255, 240, 245));
            search.setBorder(new LineBorder(new Color(255, 105, 180), 2, true));
            search.setForeground(new Color(47, 79, 79));
            search.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 17));
            search.setBounds(189, 89, 357, 33);
            contentPane.add(search);
            search.setColumns(10);

            setVisible(true);

        }

        public void actionPerformed(ActionEvent e){
            if(e.getSource()==b1) {
                ID = search.getText();
                new Marks(ID).setVisible(true);
                setVisible(false);
          }
        }

        public static void main(String[] args){
            new Exam_detail().setVisible(true);
        }
}

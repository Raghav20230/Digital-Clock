package com.clock;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyWindow extends JFrame{
    private JLabel heading;
    private JLabel ClockLabel;
    private Font font = new Font(" ",Font.BOLD,35);
    //making constructor
    MyWindow(){
        super.setTitle("My clock");
        super.setSize(400,400);
        super.setLocation(300,50);
        this.createGUI();
         this.startClock();
        super.setVisible(true);
    }
    public void createGUI()
    {
        //gui
        heading= new JLabel("My Clock");
        ClockLabel= new JLabel("clock");
        heading.setFont(font);
        ClockLabel.setFont(font);
        this.setLayout(new GridLayout(2,1));
        this.add(heading);
        this.add(ClockLabel);
    }
    public void startClock(){
        Timer timer= new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                String dateTime = new Date().toString();
//                String dateTime = new Date().toLocaleString();
                Date d = new Date();
                SimpleDateFormat sfd = new SimpleDateFormat("hh : mm :ss a  y  ");
                 String dateTime=sfd.format(d);
                ClockLabel.setText(dateTime);
            }
        });
        timer.start();

    }
}

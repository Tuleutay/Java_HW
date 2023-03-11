package org.example.HW06;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class jPanel extends JFrame{

    public static void view() {
        JFrame frame = new JFrame("Карта волнового Алгоритма");
        frame.setSize(1000, 650);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        paintMap maPanel = new paintMap();
        frame.setContentPane(maPanel);
        frame.setVisible(true);


    }


}

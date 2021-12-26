package com.bilgeadam.rehberprj.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuForm extends JFrame {
    private JPanel jpanel1;
    private JButton ekleButton;
    private JButton button1;

    public MenuForm()
    {
        add(jpanel1);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Menu Ekrani");
        setSize(300,200);
        setLocationRelativeTo(null);


        ekleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EkleForm ekle = new EkleForm();
                ekle.setVisible(true);

            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SilForm sf = new SilForm();
                sf.setVisible(true);
            }
        });
    }
}

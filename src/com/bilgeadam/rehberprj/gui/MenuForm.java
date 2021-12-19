package com.bilgeadam.rehberprj.gui;

import javax.swing.*;

public class MenuForm extends JFrame {
    private JPanel jpanel1;
    private JButton ekleButton;

    public MenuForm()
    {
        add(jpanel1);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Menu Ekrani");
        setSize(300,200);
        setLocationRelativeTo(null);


    }
}

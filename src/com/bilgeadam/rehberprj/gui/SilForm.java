package com.bilgeadam.rehberprj.gui;

import com.bilgeadam.rehberprj.dao.KisiDAO;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class SilForm extends JFrame{
    private JTextField silTF;
    private JButton silButton;
    private JPanel jPanel1;

    public SilForm()
    {
        add(jPanel1);
        setTitle("Kisi Silme Ekrani");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(140, 150);
        setLocationRelativeTo(null);

        silButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                   int secim =  JOptionPane.showConfirmDialog(null,"Silmek istediginize emin misiniz?",
                            "Silme Onayi",JOptionPane.YES_NO_OPTION);
                   if (secim == JOptionPane.YES_OPTION)
                    {

                            boolean sonuc=  KisiDAO.sil(Integer.parseInt(silTF.getText()));
                    }
                    else
                    {

                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                } catch (ClassNotFoundException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }

}

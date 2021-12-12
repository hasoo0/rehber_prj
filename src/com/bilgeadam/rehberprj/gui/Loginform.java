package com.bilgeadam.rehberprj.gui;

import com.bilgeadam.rehberprj.dao.KullaniciDAO;
import com.bilgeadam.rehberprj.dto.KullaniciDTO;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class Loginform extends JFrame {
    private JTextField adTF;
    private JPasswordField sifrePF;
    private JButton girisButton;
    private JPanel jpanel1;

    public Loginform()
    {
        add(jpanel1);

        // Formun carpisina basildiginda programdan ciksin kodu.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


       // Ekrana gore ortala demek altdaki komut.


        setTitle("Giris Ekrani");

        setSize(300,200);

        setLocationRelativeTo(null);


        girisButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //JOptionPane.showMessageDialog(null,"Buttona Basildi");

                if (adTF.getText().length() == 0)
                {
                    JOptionPane.showMessageDialog(null, "Ad alani bos gecilemez!");

                    return;
                }
                if (String.valueOf(sifrePF.getPassword()).length()==0)
                {
                    JOptionPane.showMessageDialog(null, "sifre alani bok birakilamaz!");
                    return;
                }


                try {
                    KullaniciDTO kullanici = new KullaniciDTO();
                    kullanici.setKullaniciAdi(adTF.getText());
                    kullanici.setSifre(String.valueOf(sifrePF.getPassword()));
                    boolean sonuc = KullaniciDAO.giriseYetkilimi(kullanici);

                    if (sonuc)
                        JOptionPane.showMessageDialog(null, "Girise Yetkilidir.");
                    else
                        JOptionPane.showMessageDialog(null, "Girise Yetkili Degildir!");

                } catch (SQLException ex)
                {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Hata:" + ex.getMessage());

                } catch (ClassNotFoundException ex)
                {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Hata:" + ex.getMessage());
                }


            }


        });

    }
}

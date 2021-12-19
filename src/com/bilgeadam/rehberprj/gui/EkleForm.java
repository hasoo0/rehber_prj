package com.bilgeadam.rehberprj.gui;

import com.bilgeadam.rehberprj.dao.KisiDAO;
import com.bilgeadam.rehberprj.dto.KisiDTO;
import com.bilgeadam.rehberprj.test.KisiDAOTest;
import com.bilgeadam.rehberprj.util.CevirmeIslemleri;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.ParseException;

public class EkleForm extends JFrame {
    private JPanel jPanel1;
    private JTextField noTF;
    private JTextField adTF;
    private JTextField soyadTF;
    private JTextField maasTF;
    private JTextField dogtarTF;
    private JTextField mobilTelTF;
    private JButton ekleButton;


    public EkleForm() {
        add(jPanel1);

        setTitle("Kisi Ekle Ekrani");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setLocationRelativeTo(null);
        ekleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    KisiDTO kisi = new KisiDTO();
                    kisi.setNo(Integer.parseInt(noTF.getText()));
                    kisi.setAd(adTF.getText());
                    kisi.setSoyad(soyadTF.getText());
                    kisi.setMaas(Double.parseDouble(maasTF.getText()));
                    kisi.setMobilTel(mobilTelTF.getText());


                    boolean sonuc = KisiDAO.ekle(kisi);

                    if (sonuc) {
                        JOptionPane.showMessageDialog(null, "Kişi başarıyla eklendi");
                        temizle();
                    } else {
                        JOptionPane.showMessageDialog(null, "Kişi ekleme başarısız!!!");
                    }


                    kisi.setDogtar(CevirmeIslemleri.strToUntilDate(dogtarTF.getText()));
                } catch (SQLException ex) {
                    ex.printStackTrace();
                } catch (ClassNotFoundException ex) {
                    ex.printStackTrace();
                } catch (ParseException ex) {
                    ex.printStackTrace();
                }


            }
        });
    }

    public void temizle() {
        noTF.setText("");
        adTF.setText("");
        soyadTF.setText("");
        maasTF.setText("");
        dogtarTF.setText("");
        mobilTelTF.setText("");

    }
}








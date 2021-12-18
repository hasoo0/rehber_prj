package com.bilgeadam.rehberprj.test;

import com.bilgeadam.rehberprj.dao.KisiDAO;
import com.bilgeadam.rehberprj.dto.KisiDTO;
import com.bilgeadam.rehberprj.util.CevirmeIslemleri;

import java.sql.SQLException;
import java.text.ParseException;

public class KisiDAOTest {

    public void ekleTest() throws ParseException, SQLException, ClassNotFoundException {

        KisiDTO kisi = new KisiDTO();
        kisi.setNo(3);
        kisi.setAd("Naim");
        kisi.setSoyad("Guzel");
        kisi.setMaas(4567.85);
        kisi.setDogtar(CevirmeIslemleri.strToUntilDate("11/02/1978"));
        kisi.setMobilTel("+905321234562");

        boolean sonuc = KisiDAO.ekle(kisi);

        if (sonuc)
            System.out.println("Basariyla eklendi");
        else
            System.out.println("Eklenemedi !!!");
    }

    public static void main(String[] args) {

        try {

                KisiDAOTest kdt = new KisiDAOTest();
                kdt.ekleTest();
            }
            catch (ParseException e)
            {
                e.printStackTrace();
            }
            catch (SQLException e)
            {
                e.printStackTrace();
            }
            catch (ClassNotFoundException e)

            {
                e.printStackTrace();
            }

        }


    }

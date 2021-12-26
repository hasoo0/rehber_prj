package com.bilgeadam.rehberprj.test;

import com.bilgeadam.rehberprj.dao.KisiDAO;
import com.bilgeadam.rehberprj.dto.KisiDTO;
import com.bilgeadam.rehberprj.util.CevirmeIslemleri;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;

public class KisiDAOTest {

    public KisiDAOTest() throws SQLException, ClassNotFoundException {
    }

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

    public void guncelleTest() throws ParseException, SQLException, ClassNotFoundException {

        KisiDTO kisi = new KisiDTO();
        kisi.setNo(3);
        kisi.setAd("Nurtettin");
        kisi.setSoyad("Guzel");
        kisi.setMaas(1000);
        kisi.setDogtar(CevirmeIslemleri.strToUntilDate("11/02/2000"));
        kisi.setMobilTel("+905321277562");

        boolean sonuc = KisiDAO.ekle(kisi);

        if (sonuc)
            System.out.println("Basariyla guncellendi");
        else
            System.out.println("Guncellenmedi !!!");

    }
        public void silTest () throws SQLException, ClassNotFoundException {
            boolean sonuc = KisiDAO.sil(17);
            if (sonuc)
                System.out.println("Basariyla Silindi");
            else
                System.out.println("Silinemedi!!!");
        }


        public void listeleTest ()
                throws SQLException, ClassNotFoundException {
            List<KisiDTO> kisiler = KisiDAO.listele();

            for (KisiDTO kisi : kisiler) {
                System.out.println(kisi);
            }
        }


    public static void main(String[] args) {

        try {

                KisiDAOTest kdt = new KisiDAOTest();
               //   kdt.ekleTest();
           // kdt.listeleTest();
            //kdt.silTest();
            kdt.guncelleTest();


            }
            catch (SQLException e)
            {
                e.printStackTrace();
            }
            catch (ClassNotFoundException e)

            {
                e.printStackTrace();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }

        }


    }

